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

package org.xtext.system.dependency.generator

import java.util.Vector
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.eclipse.smartmdsd.xtext.system.componentArchitecture.ui.internal.ComponentArchitectureActivator
import org.xtext.system.dependency.dependency.At
import org.xtext.system.dependency.dependency.Dependency
import org.xtext.system.dependency.dependency.UserImport
import org.xtext.system.dependency.dependency.UserName
import java.util.Map
import java.util.HashMap
import org.xtext.system.dependency.dependency.GUI
import org.xtext.base.dependency.SmartDGConsole

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DependencyGenerator extends AbstractGenerator {

	var SmartDGConsole SmartDGout = new SmartDGConsole("SmartDG");
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val dependencyBaseGenerator = new org.xtext.base.dependency.generator.DependencyGenerator;
		var Vector<Vector<String>> dependencies = new Vector<Vector<String>>;
		var Map<String, Vector<Integer>> guis = new HashMap<String, Vector<Integer>>();
		var environment = "";
		var boxpath = "";
		var at = "";
		for (userImport : resource.allContents.toIterable.filter(typeof(UserImport))) {
			environment = userImport.environment;
			boxpath = userImport.boxpath;
		}
		for (tmpAt : resource.allContents.toIterable.filter(typeof(At))) {
			at = tmpAt.name;
		}
		for (tmpDep : resource.allContents.toIterable.filter(typeof(Dependency))) {
			var Vector<String> d = new Vector<String>;
			d.add(tmpDep.name);
			d.add(tmpDep.fn);
			d.add(tmpDep.fp);
			d.add(tmpDep.o);
			d.add(tmpDep.tn);
			d.add(tmpDep.tp);
			dependencies.add(d);
		}
		for (tmpGui : resource.allContents.toIterable.filter(typeof(GUI))) {
			var Vector<Integer> xy = new Vector<Integer>;
			xy.add(tmpGui.x);
			xy.add(tmpGui.y);
			guis.put(tmpGui.name, xy);
		}
		for (user : resource.allContents.toIterable.filter(typeof(UserName))) {
			val system = resource.systemComponentArchitecture;
			dependencyBaseGenerator.doGenerateSystemCall(resource, user.name, environment, boxpath, at, system,
				dependencies, guis);
		}
	}

	def SystemComponentArchitecture getSystemComponentArchitecture(Resource resource) {
		// create resource-set for the ServiceDefinition grammar
		val injector = ComponentArchitectureActivator.getInstance().getInjector(
			ComponentArchitectureActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SYSTEM_COMPONENTARCHITECTURE_COMPONENTARCHITECTURE);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		// derive resource URI from the DomainModelsDatasheet model URI
		val baseUri = resource.URI.trimFileExtension
		val fileExtProvider = injector.getInstance(FileExtensionProvider)
		val xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.primaryFileExtension)
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(xtextResourceUri, null)
		if (resourceExists == true) {
			// load resource
			val resourceIN = resourceSet.getResource(xtextResourceUri, true);
			if (resourceIN.loaded == true) {
				val root_obj = resourceIN.contents.get(0)
				if (root_obj instanceof SystemComponentArchitecture) {
					return root_obj
				}
			}
		} else {
			SmartDGout.println("non-existing resource: " + xtextResourceUri)
		}
		return null
	}
}
