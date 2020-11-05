//================================================================
//
//  Copyright (c) 2020 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
//
//        Servicerobotik Ulm 
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//	  http://www.servicerobotik-ulm.de/
//
//  This file is part of the SmartDG Dependency Graph extension for SmartMDSD Toolchain.
//
//  Contributors:
//	Vineet Nagrath	   :	Vineet.Nagrath@thu.de
//	Alex Lotz	   	   :	Alex.Lotz@thu.de
//	Christian Schlegel :	Christian.Schlegel@thu.de
//
//  Licence:
//
//  BSD 3-Clause License
//  
//  Copyright (c) 2019, Servicerobotics Ulm
//  All rights reserved.
//  
//  Redistribution and use in source and binary forms, with or without
//  modification, are permitted provided that the following conditions are met:
//  
//  * Redistributions of source code must retain the above copyright notice, this
//    list of conditions and the following disclaimer.
//  
//  * Redistributions in binary form must reproduce the above copyright notice,
//    this list of conditions and the following disclaimer in the documentation
//    and/or other materials provided with the distribution.
//  
//  * Neither the name of the copyright holder nor the names of its
//    contributors may be used to endorse or promote products derived from
//    this software without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
//  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
//  FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
//  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
//  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
//  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
//  OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
//  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
//  https://opensource.org/licenses/BSD-3-Clause
//
//================================================================
package org.xtext.base.dependency.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.base.dependency.SmartDGEnvironmentHandler
import org.xtext.base.dependency.dependency.Dependency
import org.xtext.base.dependency.dependency.DependencyComponent
import org.xtext.base.dependency.dependency.DependencyObject
import org.xtext.base.dependency.dependency.Environment
import org.xtext.base.dependency.dependency.GUI
import org.xtext.base.dependency.dependency.SystemProject
import org.xtext.base.dependency.SmartDGObject
import org.xtext.base.dependency.SmartDGComponent
import org.xtext.base.dependency.SmartDGPort
import org.xtext.base.dependency.SmartDGSystemProjectHandler
import org.xtext.base.dependency.SmartDGDependency
import org.xtext.base.dependency.SmartDGGUI
import org.xtext.base.dependency.dependency.ComponentDevelopment
import org.xtext.base.dependency.dependency.DependencyPort
import org.xtext.base.dependency.SmartDGConnector
import org.xtext.base.dependency.dependency.DependencyConnectors
import org.xtext.base.dependency.dependency.BoxLocation
import org.xtext.base.dependency.SmartDGComponentDevelopmentHandler
import org.xtext.base.dependency.dependency.New
import org.xtext.base.dependency.dependency.UserName
import org.xtext.base.dependency.dependency.UserImport
import org.xtext.base.dependency.dependency.At
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort
import org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort
import org.eclipse.smartmdsd.ecore.component.componentDependencyGraphExtension.ComponentDependencyObject
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance
import java.util.Vector
import java.util.Map
import java.util.HashMap
import org.xtext.base.dependency.dependency.CIM
import org.xtext.base.dependency.SmartDGConsole

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DependencyGenerator extends AbstractGenerator {
	var SmartDGConsole SmartDGout = new SmartDGConsole("SmartDG");
	String str_SMART_ROOT_ACE = "NA";
	String str_HOME = "NA";
	Resource resource;
	SmartDGEnvironmentHandler EnvironmentHandler;
	SmartDGEnvironmentHandler UserImportEnvironmentHandler;
	boolean useUserImportEnvironmentHandler;
	SmartDGSystemProjectHandler SystemProjectHandler;
	SmartDGComponentDevelopmentHandler ComponentDevelopmentHandler;
	SmartDGObject tmpO;
	SmartDGComponent tmpC;
	SmartDGConnector tmpCon;
	SmartDGPort tmpP;
	SmartDGDependency tmpD;
	SmartDGGUI tmpG;
	boolean userfound;
	String username;
	boolean newfoundnoerrorflag;
	boolean objfound;
	boolean firstentry;
	boolean retval;
	boolean enverr;
	String importdisplaystr;
	ComponentDefinition CDef;
	boolean ComponentCallMode;
	SystemComponentArchitecture SDef;
	Vector<Vector<String>> SDep;
	Vector<Vector<String>> SCon;
	Map<String, String> CompMap = new HashMap<String, String>();
	Map<String, Map<String, String>> SystemProjectCompMap = new HashMap<String, Map<String, String>>();
	Map<String, Vector<Integer>> GUIS = new HashMap<String, Vector<Integer>>();
	boolean SystemCallMode;
	String CallModeUser;
	String CallModeEnvironment;
	String CallModeBoxPath;
	String CallModeAt;

	// Replaces non alphanumeric characters (except "_") in String in with the character "x"
	def String fix(String in) {
		return in.replaceAll("[^a-zA-Z0-9_]", "x");
	}

	// Preprocessing of Resource object before code generation for "de" model
	def Resource fix(Resource resource) {
		if (ComponentCallMode || SystemCallMode) {
			// Jump to fixCallMode in case of "do" (ComponentCallMode) and "dg" (SystemCallMode) models
			fixCallMode();
		} else {
			newfoundnoerrorflag = true;
			SmartDGout.println(
				"=|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==base.dependency.fix");
			useUserImportEnvironmentHandler = false;
			importdisplaystr = "";
			// Translating SMART_ROOT_ACE and HOME strings
			for (UserImport item : resource.allContents.toIterable.filter(UserImport)) {
				if(item.boxpath == "SMART_ROOT_ACE") item.boxpath = str_SMART_ROOT_ACE;
				if(item.boxpath == "HOME") item.boxpath = str_HOME;
			}
			for (SystemProject item : resource.allContents.toIterable.filter(SystemProject)) {
				if(item.boxpath == "SMART_ROOT_ACE") item.boxpath = str_SMART_ROOT_ACE;
				if(item.boxpath == "HOME") item.boxpath = str_HOME;
				for (BoxLocation loc : item.location) {
					if(loc.name == "SMART_ROOT_ACE") loc.name = str_SMART_ROOT_ACE;
					if(loc.name == "HOME") loc.name = str_HOME;
				}
			}
			for (ComponentDevelopment item : resource.allContents.toIterable.filter(ComponentDevelopment)) {
				if(item.boxpath == "SMART_ROOT_ACE") item.boxpath = str_SMART_ROOT_ACE;
				if(item.boxpath == "HOME") item.boxpath = str_HOME;
				for (BoxLocation loc : item.location) {
					if(loc.name == "SMART_ROOT_ACE") loc.name = str_SMART_ROOT_ACE;
					if(loc.name == "HOME") loc.name = str_HOME;
				}
			}
			for (Environment item : resource.allContents.toIterable.filter(Environment)) {
				for (At loc : item.location) {
					if(loc.name == "SMART_ROOT_ACE") loc.name = str_SMART_ROOT_ACE;
					if(loc.name == "HOME") loc.name = str_HOME;
				}
			}
			for (New item : resource.allContents.toIterable.filter(New)) {
				if(item.location.name == "SMART_ROOT_ACE") item.location.name = str_SMART_ROOT_ACE;
				if(item.location.name == "HOME") item.location.name = str_HOME;
			}
			// User import of Environment
			for (UserImport userimport : resource.allContents.toIterable.filter(UserImport)) {
				UserImportEnvironmentHandler = new SmartDGEnvironmentHandler();
				UserImportEnvironmentHandler.Read(userimport.boxpath, userimport.environment);
				useUserImportEnvironmentHandler = true;
				importdisplaystr = userimport.environment + " FROM " + userimport.boxpath;
			}
			userfound = false;
			for (UserName user : resource.allContents.toIterable.filter(UserName)) {
				userfound = true;
				username = "USER_" + user.name;
				// "New" Environment imports
				for (New n : resource.allContents.toIterable.filter(New)) {
					newfoundnoerrorflag = true;
					EnvironmentHandler = new SmartDGEnvironmentHandler();
					EnvironmentHandler.creatormode = true;
					EnvironmentHandler.DGEnvironment.Name = username;
					EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username;
					EnvironmentHandler.Read(n.location.name, username);
					if (useUserImportEnvironmentHandler) {
						EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username +
							"[+Imported Environment: " + importdisplaystr + " ]";
						for (SmartDGObject importedobject : UserImportEnvironmentHandler.DGEnvironment.DGObjects) {
							EnvironmentHandler.Fill(importedobject);
						}
						for (SmartDGComponent importedcomponent : UserImportEnvironmentHandler.DGEnvironment.
							DGComponents) {
							EnvironmentHandler.Fill(importedcomponent);
						}
						for (SmartDGConnector importedconnector : UserImportEnvironmentHandler.DGEnvironment.
							DGConnectors) {
							EnvironmentHandler.Fill(importedconnector);
						}
					}
					EnvironmentHandler.Fill(n.location.name);
					EnvironmentHandler.Save(n.location.name, username);
					EnvironmentHandler.creatormode = false;
					EnvironmentHandler.importSrc(UserImportEnvironmentHandler.EnvironmentFileLocation,
						UserImportEnvironmentHandler.EnvironmentFileName);
				}
				// "New" Dependency Objects
				for (New n : resource.allContents.toIterable.filter(New)) {
					for (DependencyObject o : n.object) {
						newfoundnoerrorflag = true;
						EnvironmentHandler = new SmartDGEnvironmentHandler();
						EnvironmentHandler.creatormode = true;
						EnvironmentHandler.DGEnvironment.Name = username;
						EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username;
						EnvironmentHandler.Read(n.location.name, username);
						o.name = fix(o.name);
						SmartDGout.println("=|==|new Object       | " + o.name + "\t@" + n.location.name);
						EnvironmentHandler.Fill(Translate(o));
						EnvironmentHandler.Save(n.location.name, username);
						EnvironmentHandler.creatormode = false;
					}
				}
				// "New" Dependency Components
				for (New n : resource.allContents.toIterable.filter(New)) {
					for (DependencyComponent c : n.component) {
						newfoundnoerrorflag = true;
						EnvironmentHandler = new SmartDGEnvironmentHandler();
						EnvironmentHandler.creatormode = true;
						EnvironmentHandler.DGEnvironment.Name = username;
						EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username;
						EnvironmentHandler.Read(n.location.name, username);
						c.name = fix(c.name);
						for (DependencyPort ip : c.inputPorts) {
							ip.name = fix(ip.name);
						}
						for (DependencyPort op : c.outputPorts) {
							op.name = fix(op.name);
						}
						EnvironmentHandler.Fill(Translate(c));
						SmartDGout.println("=|==|new Component    | " + c.name + "\t@" + n.location.name);
						retval = false;
						if (newfoundnoerrorflag) {
							SmartDGout.println("Saving to:\"" + n.location.name + "\"");
							retval = EnvironmentHandler.Save(n.location.name, username);
							EnvironmentHandler.creatormode = false;
						} else {
							SmartDGout.println("  ERROR Validating updates to user environment for " + username);
							return null;
						}
						if (retval) {
							SmartDGout.println("  Saved Successfully");
						} else {
							SmartDGout.println("  ERROR Saving");
						}
					}
				}
				// "New" Dependency Connectors
				for (New n : resource.allContents.toIterable.filter(New)) {
					for (DependencyConnectors co : n.connector) {
						newfoundnoerrorflag = true;
						EnvironmentHandler = new SmartDGEnvironmentHandler();
						EnvironmentHandler.creatormode = true;
						EnvironmentHandler.DGEnvironment.Name = username;
						EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username;
						EnvironmentHandler.Read(n.location.name, username);
						co.name = fix(co.name);
						EnvironmentHandler.Fill(Translate(co));
						SmartDGout.println("=|==|new Connector   | " + co.name + "\t@" + n.location.name);
						retval = false;
						if (newfoundnoerrorflag) {
							SmartDGout.println("Saving to:\"" + n.location.name + "\"");
							retval = EnvironmentHandler.Save(n.location.name, username);
							EnvironmentHandler.creatormode = false;
						} else {
							SmartDGout.println("  ERROR Validating updates to user environment for " + username);
							return null;
						}
						if (retval) {
							SmartDGout.println("  Saved Successfully");
						} else {
							SmartDGout.println("  ERROR Saving");
						}
					}
				}
			}
			// "New" Without user name error case
			for (New n : resource.allContents.toIterable.filter(New)) {
				if (! userfound) {
					SmartDGout.println("=|==| ERROR USING \"new\" : Undefined \"UserName\"");
				}
			}
			// Fixing names in environment entries
			for (Environment environment : resource.allContents.toIterable.filter(Environment)) {
				environment.name = fix(environment.name);
				for (DependencyObject obj : environment.objects) {
					obj.name = fix(obj.name);
				}
				for (DependencyComponent comp : environment.components) {
					comp.name = fix(comp.name);
					for (DependencyPort ip : comp.inputPorts) {
						ip.name = fix(ip.name);
					}
					for (DependencyPort op : comp.outputPorts) {
						op.name = fix(op.name);
					}
				}
				for (DependencyConnectors con : environment.connectors) {
					con.name = fix(con.name);
				}
			}
			// Fixing names in SystemProject entries
			SystemProjectCompMap.clear();
			for (SystemProject project : resource.allContents.toIterable.filter(SystemProject)) {
				project.name = fix(project.name);
				project.environment = fix(project.environment);
				var Map<String, String> tmpMap = new HashMap<String, String>();
				for (Dependency de : project.dependencies) {
					de.name = fix(de.name);
					de.fn = fix(de.fn);
					tmpMap.put(de.fn, de.fn);
					de.fp = fix(de.fp);
					de.o = fix(de.o);
					de.tn = fix(de.tn);
					tmpMap.put(de.tn, de.tn);
					de.tp = fix(de.tp);
				}
				for (GUI g : project.gui) {
					g.name = fix(g.name);
				}
				for (CIM cim : project.cims) {
					cim.name = fix(cim.name);
					cim.source = fix(cim.source);
					tmpMap.put(cim.name, cim.source);
				}
				SystemProjectCompMap.put(project.name, tmpMap);
			}
			// Fixing names in ComponentDevelopment entries
			for (ComponentDevelopment compdev : resource.allContents.toIterable.filter(ComponentDevelopment)) {
				compdev.name = fix(compdev.name);
				compdev.environment = fix(compdev.environment);
				compdev.component = fix(compdev.component);
			}
			SmartDGout.println(
				"=|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==base.dependency.fixOUT");
		}
		return resource;
	}

	// Preprocessing before code generation for "do" and "dg" models
	def fixCallMode() {
		newfoundnoerrorflag = true;
		SmartDGout.println(
			"=|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==base.dependency.fixCallMode");
		useUserImportEnvironmentHandler = false;
		importdisplaystr = "";
		// Translating SMART_ROOT_ACE and HOME strings
		if(CallModeBoxPath == "SMART_ROOT_ACE") CallModeBoxPath = str_SMART_ROOT_ACE;
		if(CallModeBoxPath == "HOME") CallModeBoxPath = str_HOME;
		if(CallModeAt == "SMART_ROOT_ACE") CallModeAt = str_SMART_ROOT_ACE;
		if(CallModeAt == "HOME") CallModeAt = str_HOME;
		// Fixing names
		CallModeEnvironment = fix(CallModeEnvironment);
		if(ComponentCallMode) CDef.name = fix(CDef.name);
		if(SystemCallMode) SDef.name = fix(SDef.name);
		// Importing User environment
		username = "USER_" + CallModeUser;
		UserImportEnvironmentHandler = new SmartDGEnvironmentHandler();
		UserImportEnvironmentHandler.Read(CallModeBoxPath, CallModeEnvironment);
		useUserImportEnvironmentHandler = true;
		importdisplaystr = CallModeEnvironment + " FROM " + CallModeBoxPath;
		newfoundnoerrorflag = true;
		EnvironmentHandler = new SmartDGEnvironmentHandler();
		EnvironmentHandler.creatormode = true;
		EnvironmentHandler.DGEnvironment.Name = username;
		EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username;
		EnvironmentHandler.Read(CallModeAt, username);
		if (useUserImportEnvironmentHandler) {
			EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username + "[+Imported Environment: " +
				importdisplaystr + " ]";
			for (SmartDGObject importedobject : UserImportEnvironmentHandler.DGEnvironment.DGObjects) {
				EnvironmentHandler.Fill(importedobject);
			}
			for (SmartDGComponent importedcomponent : UserImportEnvironmentHandler.DGEnvironment.DGComponents) {
				EnvironmentHandler.Fill(importedcomponent);
			}
			for (SmartDGConnector importedconnector : UserImportEnvironmentHandler.DGEnvironment.DGConnectors) {
				EnvironmentHandler.Fill(importedconnector);
			}
		}
		EnvironmentHandler.Fill(CallModeAt);
		EnvironmentHandler.Save(CallModeAt, username);
		EnvironmentHandler.creatormode = false;
		EnvironmentHandler.importSrc(UserImportEnvironmentHandler.EnvironmentFileLocation,
			UserImportEnvironmentHandler.EnvironmentFileName);
		// "do" model preprocessing
		if (ComponentCallMode) {
			newfoundnoerrorflag = true;
			EnvironmentHandler = new SmartDGEnvironmentHandler();
			EnvironmentHandler.creatormode = true;
			EnvironmentHandler.DGEnvironment.Name = username;
			EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username;
			EnvironmentHandler.Read(CallModeAt, username);
			CDef.name = fix(CDef.name);
			for (port : CDef.elements.filter(InputPort)) {
				port.name = fix(port.name);
				for (obj : port.extensions.filter(ComponentDependencyObject)) {
					obj.name = fix(obj.name);
				}
			}
			for (port : CDef.elements.filter(OutputPort)) {
				port.name = fix(port.name);
				for (obj : port.extensions.filter(ComponentDependencyObject)) {
					obj.name = fix(obj.name);
				}
			}
			EnvironmentHandler.FillCheck(Translate(CDef));
			SmartDGout.println("=|==|new Component    | " + CDef.name + "\t@" + CallModeAt);
			retval = false;
			if (newfoundnoerrorflag) {
				SmartDGout.println("Saving to:\"" + CallModeAt + "\"");
				retval = EnvironmentHandler.Save(CallModeAt, username);
				EnvironmentHandler.creatormode = false;
			} else {
				SmartDGout.println("  ERROR Validating updates to user environment for " + username);
				return null;
			}
			if (retval) {
				SmartDGout.println("  Saved Successfully");
			} else {
				SmartDGout.println("  ERROR Saving");
			}
		}
		// "dg" model preprocessing
		if (SystemCallMode) {
			for (con : SCon) {
				newfoundnoerrorflag = true;
				EnvironmentHandler = new SmartDGEnvironmentHandler();
				EnvironmentHandler.creatormode = true;
				EnvironmentHandler.DGEnvironment.Name = username;
				EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username;
				EnvironmentHandler.Read(CallModeAt, username);

				var Vector<String> out_dos = new Vector<String>;
				for (comp : EnvironmentHandler.DGEnvironment.DGComponents)
					if (CompMap.get(con.get(1)).equals(comp.Name))
						for (outport : comp.OutputPorts)
							if (con.get(2).equals(outport.Name))
								for (dos : outport.DGObjectCandidates)
									out_dos.add(dos);
				var Vector<String> in_dos = new Vector<String>;
				for (comp : EnvironmentHandler.DGEnvironment.DGComponents)
					if (CompMap.get(con.get(4)).equals(comp.Name))
						for (inport : comp.InputPorts)
							if (con.get(5).equals(inport.Name))
								for (dos : inport.DGObjectCandidates)
									in_dos.add(dos);
				for (dobj : out_dos) {
					if (in_dos.contains(dobj)) {
						var Vector<String> deriveddep = new Vector<String>;
						deriveddep.add(con.get(0));
						deriveddep.add(con.get(1));
						deriveddep.add(con.get(2));
						deriveddep.add(dobj);
						deriveddep.add(con.get(4));
						deriveddep.add(con.get(5));

						var boolean addit = true;
						for (already : SDep) {
							var boolean samesame = true;
							for (var int ii = 1; ii < 6; ii++)
								if (! deriveddep.get(ii).equals(already.get(ii)))
									samesame = false;
							if (samesame) {
								addit = false;
							}
						}
						if (addit) {
							SDep.add(deriveddep);
						}
					}
				}
			}
			for (dep : SDep) {
				SmartDGout.print("Dependency: ");
				for (item : dep) {
					SmartDGout.print("\t" + item);
				}
				SmartDGout.println("");
			}
			for (dep : SDep) {
				newfoundnoerrorflag = true;
				EnvironmentHandler = new SmartDGEnvironmentHandler();
				EnvironmentHandler.creatormode = true;
				EnvironmentHandler.DGEnvironment.Name = username;
				EnvironmentHandler.DGEnvironment.Wiki = "USER ENVIRONMENT FOR " + username;
				EnvironmentHandler.Read(CallModeAt, username);
				// Checking Validity for connector
				tmpCon = new SmartDGConnector();
				tmpCon.Name = dep.firstElement();
				if (! EnvironmentHandler.Check(tmpCon)) {
					SmartDGout.println("------------ERROR !! \"" + "Connector " + dep.firstElement() +
						"\" not found in Environment connector list");
					newfoundnoerrorflag = false;
					return null;
				}
				// Checking Validity for Dependency Object
				tmpO = new SmartDGObject();
				tmpO.Name(dep.get(3));
				if (! EnvironmentHandler.Check(tmpO)) {
					SmartDGout.println(
						"------------ERROR !! " + "Connector " + dep.firstElement() + " tries to handle object \"" +
							tmpO.Name + "\" which is not found in Environment object list");
					newfoundnoerrorflag = false;
					return null;
				}
				if (! EnvironmentHandler.Check(tmpCon, tmpO)) {
					SmartDGout.println(
						"------------ERROR !! " + "Connector " + dep.firstElement() + " does not handle object \"" +
							tmpO.Name);
					newfoundnoerrorflag = false;
					return null;
				}
				// Checking Validity for To and From Components, Ports, Dependency Objects
				val String FromComponentName = dep.get(1);
				val String FromComponentSourceName = CompMap.get(FromComponentName);
				val String FromPortName = dep.get(2);
				val String ToComponentName = dep.get(4);
				val String ToComponentSourceName = CompMap.get(ToComponentName);
				val String ToPortName = dep.get(5);
				val String DObject = dep.get(3);
				var boolean fromentryfound = false;
				for (comp : EnvironmentHandler.DGEnvironment.DGComponents)
					if (FromComponentSourceName.equals(comp.Name))
						for (outport : comp.OutputPorts)
							if (FromPortName.equals(outport.Name))
								for (dos : outport.DGObjectCandidates)
									if (DObject.equals(dos))
										fromentryfound = true;
				if (! fromentryfound) {
					SmartDGout.println(
						"------------ERROR !! " + "Component/OutputPort/DependencyObject Entry not found for [" +
							FromComponentSourceName + ":" + FromComponentName + "][" + FromPortName + "][" + DObject +
							"]");
					newfoundnoerrorflag = false;
					return null;
				}
				var boolean toentryfound = false;
				for (comp : EnvironmentHandler.DGEnvironment.DGComponents)
					if (ToComponentSourceName.equals(comp.Name))
						for (inport : comp.InputPorts)
							if (ToPortName.equals(inport.Name))
								for (dos : inport.DGObjectCandidates)
									if (DObject.equals(dos))
										toentryfound = true;
				if (! toentryfound) {
					SmartDGout.println(
						"------------ERROR !! " + "Component/InputPort/DependencyObject Entry not found for [" +
							ToComponentSourceName + ":" + ToComponentName + "][" + ToPortName + "][" + DObject + "]");
					newfoundnoerrorflag = false;
					return null;
				}
			}
		}
		SmartDGout.println(
			"=|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==base.dependency.fixCallModeOUT");
	}

	def SmartDGObject Translate(DependencyObject obj) {
		tmpO = new SmartDGObject();
		tmpO.Name(obj.name);
		tmpO.Wiki = obj.wiki;
		if (obj.isMulti == 'true') {
			tmpO.isMulti(true);
			SmartDGout.print("------" + obj.name + "\t[M]");
		} else {
			tmpO.isMulti(false);
			SmartDGout.print("------" + obj.name);
		}
		if (obj.wiki !== null) {
			SmartDGout.println("   Wiki:" + obj.wiki);
		} else {
			SmartDGout.println(" ");
		}
		tmpO.Type("Boolean"); // #TODO Other types to be added later
		return (tmpO);
	}

	def SmartDGComponent Translate(DependencyComponent comp) {
		tmpC = new SmartDGComponent();
		SmartDGout.println("--Component" + comp.name);
		tmpC.Name(comp.name);
		SmartDGout.print("--InputPorts:");
		for (DependencyPort ip : comp.inputPorts) {
			tmpP = new SmartDGPort();
			tmpP.Name(ip.name);
			SmartDGout.print("\t" + ip.name + "[");
			for (String oi : ip.objinstances) {
				tmpO = new SmartDGObject();
				tmpO.Name(oi);
				objfound = true;
				if (! EnvironmentHandler.Check(tmpO)) {
					objfound = false;
					if (useUserImportEnvironmentHandler) {
						if (UserImportEnvironmentHandler.Check(tmpO))
							objfound = true;
					}
				}
				if (! objfound) {
					SmartDGout.println(
						"------------ERROR !! " + "Component " + comp.name + "'s Port " + ip.name +
							" has candidate object \"" + oi + "\" which is not found in Environment object list");
					{
						newfoundnoerrorflag = false;
						return null;
					}
				}
				tmpP.DGObjectCandidates.add(oi);
				SmartDGout.print("  " + oi);
			}
			SmartDGout.print("  ]");
			tmpC.InputPorts.add(tmpP);
		}
		SmartDGout.println(" ");
		SmartDGout.print("--OutputPorts:");
		for (DependencyPort op : comp.outputPorts) {
			tmpP = new SmartDGPort();
			tmpP.Name(op.name);
			objfound = true;
			SmartDGout.print("\t" + op.name + "[");
			for (String oi : op.objinstances) {
				tmpO = new SmartDGObject();
				tmpO.Name(oi);
				if (! EnvironmentHandler.Check(tmpO)) {
					objfound = false;
					if (useUserImportEnvironmentHandler) {
						if (UserImportEnvironmentHandler.Check(tmpO))
							objfound = true;
					}
				}
				if (! objfound) {
					SmartDGout.println(
						"------------ERROR !! " + "Component " + comp.name + "'s Port " + op.name +
							" has candidate object \"" + oi + "\" which is not found in Environment object list");
					{
						newfoundnoerrorflag = false;
						return null;
					}
				}
				tmpP.DGObjectCandidates.add(oi);
				SmartDGout.print("  " + oi);
			}
			SmartDGout.print("  ]");
			tmpC.OutputPorts.add(tmpP);
		}
		tmpC.Wiki = comp.wiki;
		return (tmpC);
	}

	def SmartDGComponent Translate(ComponentDefinition compdef) {
		tmpC = new SmartDGComponent();
		SmartDGout.println("--Component" + compdef.name);
		tmpC.Name(compdef.name);
		SmartDGout.print("--InputPorts:");

		for (ip : compdef.elements.filter(InputPort)) {
			tmpP = new SmartDGPort();
			tmpP.Name(ip.name);
			SmartDGout.print("\t" + ip.name + "[");
			for (obj : ip.extensions.filter(ComponentDependencyObject)) {
				val oi = obj.name;
				tmpO = new SmartDGObject();
				tmpO.Name(oi);
				objfound = true;
				if (! EnvironmentHandler.Check(tmpO)) {
					objfound = false;
					if (useUserImportEnvironmentHandler) {
						if (UserImportEnvironmentHandler.Check(tmpO))
							objfound = true;
					}
				}
				if (! objfound) {
					SmartDGout.println(
						"------------ERROR !! " + "Component " + compdef.name + "'s Port " + ip.name +
							" has candidate object \"" + oi + "\" which is not found in Environment object list");
					{
						newfoundnoerrorflag = false;
						return null;
					}
				}
				tmpP.DGObjectCandidates.add(oi);
				SmartDGout.print("  " + oi);
			}
			SmartDGout.print("  ]");
			tmpC.InputPorts.add(tmpP);
		}
		SmartDGout.println(" ");
		SmartDGout.print("--OutputPorts:");
		for (op : compdef.elements.filter(OutputPort)) {
			tmpP = new SmartDGPort();
			tmpP.Name(op.name);
			objfound = true;
			SmartDGout.print("\t" + op.name + "[");
			for (obj : op.extensions.filter(ComponentDependencyObject)) {
				val oi = obj.name;
				tmpO = new SmartDGObject();
				tmpO.Name(oi);
				if (! EnvironmentHandler.Check(tmpO)) {
					objfound = false;
					if (useUserImportEnvironmentHandler) {
						if (UserImportEnvironmentHandler.Check(tmpO))
							objfound = true;
					}
				}
				if (! objfound) {
					SmartDGout.println(
						"------------ERROR !! " + "Component " + compdef.name + "'s Port " + op.name +
							" has candidate object \"" + oi + "\" which is not found in Environment object list");
					{
						newfoundnoerrorflag = false;
						return null;
					}
				}
				tmpP.DGObjectCandidates.add(oi);
				SmartDGout.print("  " + oi);
			}
			SmartDGout.print("  ]");
			tmpC.OutputPorts.add(tmpP);
		}
		tmpC.Wiki = "";
		return (tmpC);
	}

	def SmartDGConnector Translate(DependencyConnectors con) {
		tmpCon = new SmartDGConnector();
		tmpCon.Name = con.name;
		for (String oi : con.objinstances) {
			tmpO = new SmartDGObject();
			tmpO.Name(oi);
			objfound = true;
			if (! EnvironmentHandler.Check(tmpO)) {
				objfound = false;
				if (useUserImportEnvironmentHandler) {
					if (UserImportEnvironmentHandler.Check(tmpO))
						objfound = true;
				}
			}
			if (! objfound) {
				SmartDGout.println("------------ERROR !! " + "Connector " + con.name + " has candidate object \"" + oi +
					"\" which is not found in Environment object list");
				{
					newfoundnoerrorflag = false;
					return null;
				}
			}
			tmpCon.DGObjectCandidates.add(oi);
		}
		return tmpCon;
	}

	// "do" model doGenerate method calls this
	def doGenerateComponentCall(Resource resourceComponentCall, String user, String environment, String boxpath,
		String at, ComponentDefinition component) {
		SmartDGout.println(
			"===============================================================================base.dependency.componentCall IN");
		CDef = component;
		var boolean ComponentDependencyObjectFound = false;
		SmartDGout.println("Component: " + CDef.name);
		for (port : CDef.elements.filter(InputPort)) {
			SmartDGout.println("------Input Port: " + port.name);
			for (obj : port.extensions.filter(ComponentDependencyObject)) {
				ComponentDependencyObjectFound = true;
				SmartDGout.println("------------object: " + obj.name)
			}
		}
		for (port : CDef.elements.filter(OutputPort)) {
			SmartDGout.println("------Output Port: " + port.name);
			for (obj : port.extensions.filter(ComponentDependencyObject)) {
				ComponentDependencyObjectFound = true;
				SmartDGout.println("------------object: " + obj.name)
			}
		}
		if (ComponentDependencyObjectFound == true) {
			SmartDGout.println(
				"======================================= ComponentDependencyObjects found in component ports.");
			ComponentCallMode = true;
			SystemCallMode = false;
			CallModeUser = user;
			CallModeEnvironment = environment;
			CallModeBoxPath = boxpath;
			CallModeAt = at;
			doGenerateBase(resourceComponentCall);
		} else {
			SmartDGout.println(
				"======================================= No ComponentDependencyObjects specified in component ports.");
			SmartDGout.println(
				"===============================================================================base.dependency.componentCall OUT");
		}
	}

	// "dg" model doGenerate method calls this
	def doGenerateSystemCall(Resource resourceSystemCall, String user, String environment, String boxpath, String at,
		SystemComponentArchitecture system, Vector<Vector<String>> dependencies, Map<String, Vector<Integer>> guis) {
		SmartDGout.println(
			"===============================================================================base.dependency.systemCall IN");
		SDef = system;
		SDep = dependencies;
		SCon = new Vector<Vector<String>>;
		var boolean SystemDependencyConnectionsFound = false;
		CompMap.clear();
		GUIS.clear();
		GUIS = guis;
		SmartDGout.println("System Name: " + SDef.name);
		for (componentObj : SDef.components) {
			val component = componentObj.getComponent();
			CompMap.put(componentObj.name, component.name);
			SmartDGout.print("Component Instance: " + componentObj.name + "  instantiates: " + component.name);
			SmartDGout.println(" GUI: " + GUIS.get(componentObj.name));
		}
		for (connection : SDef.connections) {
			SystemDependencyConnectionsFound = true;
			val comp_from = connection.from.eContainer as ComponentInstance;
			val comp_to = connection.to.eContainer as ComponentInstance;
			println(
				"Connection: " + connection.getName() + "        : " + comp_from.name + "[" +
					connection.from.port.name + "] <--> " + comp_to.name + "[" + connection.to.port.name + "]"
			);
		}
		for (con : SDef.connections) {
			val String Name = "Unnamed";
			val comp_from = con.from.eContainer as ComponentInstance;
			val comp_to = con.to.eContainer as ComponentInstance;
			val String FromComponent = comp_to.name;
			val String ToComponent = comp_from.name;
			val String DObj = "AllAvailableDependencyObjects";
			val String FromPort = con.to.port.name;
			val String ToPort = con.from.port.name;
			var Vector<String> c = new Vector<String>;
			c.add(Name);
			c.add(FromComponent);
			c.add(FromPort);
			c.add(DObj);
			c.add(ToComponent);
			c.add(ToPort);
			SCon.add(c);
		}
		for (con : SCon) {
			SmartDGout.println(
				"Connection: " + con.get(0) + ": " + con.get(1) + "." + con.get(2) + "--" + con.get(3) + "-->" +
					con.get(4) + "." + con.get(5));
		}
		if (SystemDependencyConnectionsFound == true) {
			ComponentCallMode = false;
			SystemCallMode = true;
			CallModeUser = user;
			CallModeEnvironment = environment;
			CallModeBoxPath = boxpath;
			CallModeAt = at;
			doGenerateBase(resourceSystemCall);
		} else {
			SmartDGout.println(
				"======================================= No connections found in SystemComponentArchitecture");
		}
		SmartDGout.println(
			"===============================================================================base.dependency.systemCall OUT");
	}

	// "de" model doGenerate method
	override void doGenerate(Resource resourcein, IFileSystemAccess2 fsa, IGeneratorContext context) {
		ComponentCallMode = false;
		SystemCallMode = false;
		doGenerateBase(resourcein);
	}

	// All "do", "dg" and "de" model doGenerate methods calls this method after corresponding Resource object setup
	def doGenerateBase(Resource resourcein) {
		SmartDGout.println("SmartDG | doGenerateBase | IN");
		str_SMART_ROOT_ACE = System.getenv("SMART_ROOT_ACE");
		str_HOME = System.getenv("HOME");
		if (str_SMART_ROOT_ACE === null) {
			SmartDGout.println("=|==|==|==|==|==XXXX $SMART_ROOT_ACE not found");
			return;
		}
		if (str_HOME === null) {
			SmartDGout.println("=|==|==|==|==|==XXXX $HOME not found");
			return;
		}
		SmartDGout.println(
			"=|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==base.dependency.main");
		SmartDGout.println("SMART_ROOT_ACE: " + str_SMART_ROOT_ACE);
		SmartDGout.println("HOME: " + str_HOME);
		resource = fix(resourcein);
		if (! newfoundnoerrorflag) {
			SmartDGout.println("=|==|==|==|==|==XXXX ResourceFix ERROR");
			return;
		}
		SmartDGout.println(
			"=|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==|==base.dependency.main");
		firstentry = true;
		for (Environment environment : resource.allContents.toIterable.filter(Environment)) {
			EnvironmentHandler = new SmartDGEnvironmentHandler();
			EnvironmentHandler.creatormode = true;
			if(firstentry) SmartDGout.println("------------------------------------------------Environments");
			firstentry = false;
			EnvironmentHandler.DGEnvironment.Name = environment.name;
			EnvironmentHandler.DGEnvironment.Wiki = environment.wiki;
			SmartDGout.print("------------------------------------------------" + environment.name);
			if (environment.wiki !== null) {
				SmartDGout.println("   Wiki:" + environment.wiki);
			} else {
				SmartDGout.println(" ");
			}
			SmartDGout.println("------------DependencyObjects");
			for (DependencyObject obj : environment.objects) {
				EnvironmentHandler.Fill(Translate(obj));
			}
			SmartDGout.println("------------SmartDGComponents");
			for (DependencyComponent comp : environment.components) {
				EnvironmentHandler.Fill(Translate(comp));
				SmartDGout.println(" ");
			}
			SmartDGout.println("------------Connectors");
			for (DependencyConnectors con : environment.connectors) {
				EnvironmentHandler.Fill(Translate(con));
				SmartDGout.println(con.name);
			}
			SmartDGout.println("------------Box Locations");
			for (At loc : environment.location) {
				EnvironmentHandler.Fill(loc.name);
				SmartDGout.println(loc.name);
			}
			for (At loc : environment.location) {
				SmartDGout.println("\"" + loc.name + "\"");
				retval = EnvironmentHandler.Save(loc.name, environment.name);
				if (retval) {
					SmartDGout.println("  Saved Successfully");
				} else {
					SmartDGout.println("  ERROR Saving");
				}
			}
			EnvironmentHandler.creatormode = false;
		}

		firstentry = true;
		for (SystemProject project : resource.allContents.toIterable.filter(SystemProject)) {
			var Map<String, String> tmpMap = new HashMap<String, String>();
			EnvironmentHandler = new SmartDGEnvironmentHandler();
			if(firstentry) SmartDGout.println("------------------------------------------------SystemProjects");
			firstentry = false;
			SmartDGout.println("------------------------------------------------" + project.name);
			if (project.wiki !== null) {
				SmartDGout.println("------------Wiki		 :" + project.wiki);
			}
			SmartDGout.println("------------Environment  :" + "\"" + project.environment + "\"");
			SmartDGout.println("------------BoxLocation  :" + "\"" + project.boxpath + "\"");
			retval = EnvironmentHandler.Read(project.boxpath, project.environment);
			enverr = retval;
			if (!retval) {
				SmartDGout.println("------------ERROR !! Unable to Read Environment");
				return;
			}
			if (enverr) {
				SmartDGout.println("------------Dependencies");
				tmpMap = SystemProjectCompMap.get(project.name);
				for (Dependency de : project.dependencies) {
					if (de.wiki !== null) {
						SmartDGout.println(
							"------------" + de.name + " " + de.fn + "." + de.fp + "--" + de.o + "-->" + de.tn + "." +
								de.tp + " Wiki:" + de.wiki);
					} else {
						SmartDGout.println(
							"------------" + de.name + " " + de.fn + "." + de.fp + "--" + de.o + "-->" + de.tn + "." +
								de.tp);
					}
					tmpCon = new SmartDGConnector();
					tmpCon.Name(de.name);
					if (! EnvironmentHandler.Check(tmpCon)) {
						SmartDGout.println(
							"------------ERROR !! Connector \"" + de.name + "\" not found in Environment \"" +
								project.environment + "\" at \"" + project.boxpath + "\"");
						return;
					}

					tmpO = new SmartDGObject();
					tmpO.Name(de.o);
					if (! EnvironmentHandler.Check(tmpO)) {
						SmartDGout.println(
							"------------ERROR !! Object \"" + de.o + "\" not found in Environment \"" +
								project.environment + "\" at \"" + project.boxpath + "\"");
						return;
					}

					tmpC = new SmartDGComponent();
					tmpC.Name(tmpMap.get(de.fn));
					if (! EnvironmentHandler.Check(tmpC)) {
						SmartDGout.println(
							"------------ERROR !! Component \"" + de.fn + "\" not found in Environment \"" +
								project.environment + "\" at \"" + project.boxpath + "\"");
						return;
					}
					tmpP = new SmartDGPort();
					tmpP.Name(de.fp);
					tmpC.OutputPorts.add(tmpP);
					if (! EnvironmentHandler.Check(tmpC)) {
						SmartDGout.println(
							"------------ERROR !! OutputPort \"" + de.fp + "\" not found in Component \"" + de.fn +
								"\" in Environment \"" + project.environment + "\" at \"" + project.boxpath + "\"");
						return;
					}

					tmpC = new SmartDGComponent();
					tmpC.Name(tmpMap.get(de.tn));
					if (! EnvironmentHandler.Check(tmpC)) {
						SmartDGout.println(
							"------------ERROR !! Component \"" + de.tn + "\" not found in Environment \"" +
								project.environment + "\" at \"" + project.boxpath + "\"");
						return;
					}
					tmpP = new SmartDGPort();
					tmpP.Name(de.tp);
					tmpC.InputPorts.add(tmpP);
					if (! EnvironmentHandler.Check(tmpC)) {
						SmartDGout.println(
							"------------ERROR !! InputPort \"" + de.tp + "\" not found in Component \"" + de.tn +
								"\" in Environment \"" + project.environment + "\" at \"" + project.boxpath + "\"");
						return;
					}
				}
			}
			SmartDGout.println("------------GUI");
			for (GUI g : project.gui) {
				if (g.wiki !== null) {
					SmartDGout.println("------------" + g.name + " (" + g.x + ", " + g.y + ")" + " Wiki:" + g.wiki);
				} else {
					SmartDGout.println("------------" + g.name + " (" + g.x + ", " + g.y + ")");
				}
			}
			SystemProjectHandler = new SmartDGSystemProjectHandler();
			SystemProjectHandler.DGSystemProject.Name = project.name;
			SystemProjectHandler.DGSystemProject.Environment = project.environment;
			SystemProjectHandler.DGSystemProject.EnvironmentBoxLocation = project.boxpath;
			SystemProjectHandler.DGSystemProject.CIM = tmpMap;
			for (Dependency de : project.dependencies) {
				tmpD = new SmartDGDependency;
				tmpD.Name = de.name;
				tmpD.OutputNode = de.fn;
				tmpD.OutputPort = de.fp;
				tmpD.Object = de.o;
				tmpD.InputNode = de.tn;
				tmpD.InputPort = de.tp;
				SystemProjectHandler.Fill(tmpD);
			}
			for (GUI g : project.gui) {
				tmpG = new SmartDGGUI;
				tmpG.Name = g.name;
				tmpG.x = g.x;
				tmpG.y = g.y;
				SystemProjectHandler.Fill(tmpG);
			}
			SmartDGout.println("------------Box Locations");
			for (BoxLocation loc : project.location) {
				SystemProjectHandler.Fill(loc.name);
			}
			for (BoxLocation loc : project.location) {
				SmartDGout.println("\"" + loc.name + "\"");
				if (loc.launchflag == "true") {
					SystemProjectHandler.launchflag = true;
				}
				if (loc.buildflag == "true") {
					SystemProjectHandler.buildflag = true;
				}
				if (loc.importflag == "true") {
					SystemProjectHandler.importflag = true;
				}
				if (loc.detachflag == "true") {
					SystemProjectHandler.detachflag = true;
				}
				retval = SystemProjectHandler.Save(loc.name, project.name);
				SystemProjectHandler.ResetFlags();
				if (retval) {
					SmartDGout.println("  Saved Successfully");
				} else {
					SmartDGout.println("  ERROR Saving");
				}
			}
		}
		if (SystemCallMode) {
			EnvironmentHandler = new SmartDGEnvironmentHandler();
			if(firstentry) SmartDGout.println("------------------------------------------------SystemProjects");
			SmartDGout.println("------------------------------------------------" + SDef.name);
			SmartDGout.println("------------Environment  :" + "\"" + "USER_" + CallModeUser + "\"");
			SmartDGout.println("------------BoxLocation  :" + "\"" + CallModeAt + "\"");
			retval = EnvironmentHandler.Read(CallModeAt, "USER_" + CallModeUser);
			if (!retval) {
				SmartDGout.println("------------ERROR !! Unable to Read Environment");
				return;
			}
			SystemProjectHandler = new SmartDGSystemProjectHandler();
			SystemProjectHandler.DGSystemProject.Name = SDef.name;
			SystemProjectHandler.DGSystemProject.Environment = "USER_" + CallModeUser;
			SystemProjectHandler.DGSystemProject.EnvironmentBoxLocation = CallModeAt;
			SystemProjectHandler.DGSystemProject.CIM = CompMap;
			for (dep : SDep) {
				tmpD = new SmartDGDependency;
				tmpD.Name = dep.get(0);
				tmpD.OutputNode = dep.get(1);
				tmpD.OutputPort = dep.get(2);
				tmpD.Object = dep.get(3);
				tmpD.InputNode = dep.get(4);
				tmpD.InputPort = dep.get(5);
				SystemProjectHandler.Fill(tmpD);
			}
			for (Map.Entry<String, Vector<Integer>> entry : GUIS.entrySet()) {
				tmpG = new SmartDGGUI;
				tmpG.Name = entry.getKey();
				tmpG.x = entry.getValue().get(0);
				tmpG.y = entry.getValue().get(1);
				SystemProjectHandler.Fill(tmpG);
			}
			SystemProjectHandler.Fill(CallModeAt);
			SmartDGout.println("\"" + CallModeAt + "\"");
			SystemProjectHandler.importflag = true;
			SystemProjectHandler.buildflag = true;
			retval = SystemProjectHandler.Save(CallModeAt, SDef.name);
			SystemProjectHandler.ResetFlags();
			if (retval) {
				SmartDGout.println("  Saved Successfully");
			} else {
				SmartDGout.println("  ERROR Saving");
			}
		}

		firstentry = true;
		for (ComponentDevelopment compdev : resource.allContents.toIterable.filter(ComponentDevelopment)) {
			ComponentDevelopmentHandler = new SmartDGComponentDevelopmentHandler();
			ComponentDevelopmentHandler.DGComponentDevelopment.Name = compdev.name;
			ComponentDevelopmentHandler.DGComponentDevelopment.Environment = compdev.environment;
			ComponentDevelopmentHandler.DGComponentDevelopment.EnvironmentBoxLocation = compdev.boxpath;
			ComponentDevelopmentHandler.DGComponentDevelopment.Wiki = compdev.wiki;
			EnvironmentHandler = new SmartDGEnvironmentHandler();
			if(firstentry) SmartDGout.println("------------------------------------------------ComponentDevelopment");
			firstentry = false;
			SmartDGout.println("------------------------------------------------" + compdev.name);
			if (compdev.wiki !== null) {
				SmartDGout.println("------------Wiki		 :" + compdev.wiki);
			}
			SmartDGout.println("------------Environment  :" + "\"" + compdev.environment + "\"");
			SmartDGout.println("------------BoxLocation  :" + "\"" + compdev.boxpath + "\"");
			retval = EnvironmentHandler.Read(compdev.boxpath, compdev.environment);
			enverr = retval;
			if (!retval) {
				SmartDGout.println("------------ERROR !! Unable to Read Environment");
				return;
			}
			if (enverr) {
				SmartDGout.println("------------Component \"" + compdev.component + "\"");
				if (! EnvironmentHandler.isComponent(compdev.component)) {
					SmartDGout.println(
						"------------ERROR !! Component \"" + compdev.component + "\" not found in Environment \"" +
							compdev.environment + "\" at \"" + compdev.boxpath + "\"");
					return;
				} else {
					ComponentDevelopmentHandler.DGComponentDevelopment.DGComponent = EnvironmentHandler.getComponent(
						compdev.component);
					SmartDGout.println("------------Box Locations");
					for (BoxLocation loc : compdev.location) {
						ComponentDevelopmentHandler.Fill(loc.name);
					}
					for (BoxLocation loc : compdev.location) {
						SmartDGout.println("\"" + loc.name + "\"");
						if (loc.launchflag == "true") {
							ComponentDevelopmentHandler.launchflag = true;
						}
						if (loc.buildflag == "true") {
							ComponentDevelopmentHandler.buildflag = true;
						}
						if (loc.importflag == "true") {
							ComponentDevelopmentHandler.importflag = true;
						}
						if (loc.detachflag == "true") {
							ComponentDevelopmentHandler.detachflag = true;
						}
						retval = ComponentDevelopmentHandler.Save(loc.name, compdev.name);
						ComponentDevelopmentHandler.ResetFlags();
						if (retval) {
							SmartDGout.println("  Saved Successfully");
						} else {
							SmartDGout.println("  ERROR Saving");
						}
					}
				}
			}
		}
		if (ComponentCallMode) {
			ComponentDevelopmentHandler = new SmartDGComponentDevelopmentHandler();
			ComponentDevelopmentHandler.DGComponentDevelopment.Name = CDef.name;
			ComponentDevelopmentHandler.DGComponentDevelopment.Environment = "USER_" + CallModeUser;
			ComponentDevelopmentHandler.DGComponentDevelopment.EnvironmentBoxLocation = CallModeAt;
			ComponentDevelopmentHandler.DGComponentDevelopment.Wiki = "Component Call Mode Init Wiki";
			EnvironmentHandler = new SmartDGEnvironmentHandler();
			if (firstentry)
				SmartDGout.println(
					"-----------------------------------------------ComponentCallMode-ComponentDevelopment");
			SmartDGout.println("------------------------------------------------" + CDef.name);
			SmartDGout.println(
				"------------Environment  :" + "\"" + ComponentDevelopmentHandler.DGComponentDevelopment.Environment +
					"\"");
			SmartDGout.println(
				"------------BoxLocation  :" + "\"" +
					ComponentDevelopmentHandler.DGComponentDevelopment.EnvironmentBoxLocation + "\"");
			retval = EnvironmentHandler.Read(CallModeAt, "USER_" + CallModeUser);
			enverr = retval;
			if (!retval) {
				SmartDGout.println("------------ERROR !! Unable to Read Environment");
				return;
			}
			if (enverr) {
				SmartDGout.println("------------Component \"" + CDef.name + "\"");
				if (! EnvironmentHandler.isComponent(CDef.name)) {
					SmartDGout.println(
						"------------ERROR !! Component \"" + CDef.name + "\" not found in Environment \"" + "USER_" +
							CallModeUser + "\" at \"" + CallModeAt + "\"");
					return;
				} else {
					ComponentDevelopmentHandler.DGComponentDevelopment.DGComponent = EnvironmentHandler.
						getComponent(CDef.name);
					SmartDGout.println("------------Box Locations");
					ComponentDevelopmentHandler.Fill(CallModeAt);
					SmartDGout.println("\"" + CallModeAt + "\"");
					ComponentDevelopmentHandler.importflag = true;
					ComponentDevelopmentHandler.buildflag = true;
					retval = ComponentDevelopmentHandler.Save(CallModeAt, CDef.name);
					ComponentDevelopmentHandler.ResetFlags();
					if (retval) {
						SmartDGout.println("  Saved Successfully");
					} else {
						SmartDGout.println("  ERROR Saving");
					}
				}
			}
		}
	}
}
