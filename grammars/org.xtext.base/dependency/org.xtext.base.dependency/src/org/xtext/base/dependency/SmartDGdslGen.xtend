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

package org.xtext.base.dependency;

import org.xtext.base.dependency.SmartDGEnvironment
import org.xtext.base.dependency.SmartDGSystemProject
import org.xtext.base.dependency.SmartDGComponentDevelopment

class SmartDGdslGen {
	def String FileHeaderText(String fullfilename) {
		'''
			//============================================================================
			// File Name        : «fullfilename»
			//
			// Code generated by the SmartDG Dependency Graph extension for SmartMDSD Toolchain.
			// The SmartSoft Toolchain has been developed by:
			//  
			// Service Robotics Research Center
			// University of Applied Sciences Ulm
			// Prittwitzstr. 10
			// 89075 Ulm (Germany)
			//
			// Information about the SmartSoft MDSD Toolchain is available at:
			// www.servicerobotik-ulm.de
			//
			// Please do not modify this file. It will be re-generated
			// running the code generator.
			//============================================================================
		'''
	}

	def String FileHeaderTextHash(String fullfilename) {
		return FileHeaderText(fullfilename).replaceAll("//", "#");
	}

	def FileName2TAG(String filename) {
		return filename.toUpperCase() + "_H_"
	}

	def FileNameStartTAG(String filename) {
		'''
			#ifndef «FileName2TAG(filename)»
			#define «FileName2TAG(filename)»
		'''
	}

	def SmartDGHeaderFileWithPath() {
		'''
			#include <SmartDG.h>
		'''
	}

	def FileNameEndTAG(String filename) {
		'''
			#endif /* «FileName2TAG(filename)» */
		'''
	}

	def GlobalData() {
		'''
			namespace SmartDG_GlobalData
			{
				map<string, map<string, SmartDG::DependencyDataPackage> > GlobalPackage;
				map<string, string > GlobalPackageLite;
				   map<string, SmartDG::DependencyDataPackage> GlobalDebug;
				   bool View2ViewFlag = SmartDG_View2ViewFlag_DEFAULT_VALUE;
				   int togglelive = 0;
			}
		'''
	}

	def gen(SmartDGEnvironment e) {
		'''
			«FileHeaderText("SmartDGEnvironment_"+e.Name+".h")»
			«IF e.Wiki !== null»/* Wiki: «e.Wiki» */«ENDIF»
			«SmartDGHeaderFileWithPath()»
			«FOR SmartDGComponent c : e.DGComponents»
				#include "SmartDGTransferFunction_Component_«c.Name».h"
			«ENDFOR»
			
			«GlobalData()»
			
			namespace SmartDG_GlobalFunction	{
					void EnvironmentGenerator(vector <string> &SmartDependencyObjects,
							map <string, bool> &isMultiSmartDependencyObjects,
							vector <string> &SmartComponents,
							SmartDG__map &TransferFunctions,
							map <string,vector<string>> &InputPorts,
							map <string,vector<string>> &OutputPorts,
							map <string,vector<string>> &InputObjectInstances,
							map <string,vector<string>> &OutputObjectInstances,
							vector <string> &SmartConnectors,
							map <string,string> &Wiki)	{
				«IF e.Wiki !== null»Wiki["Environment_«e.Name»"] = "«e.Wiki»";«ENDIF»
				// Smart Dependency Objects
				«FOR SmartDGObject o : e.DGObjects»
					SmartDependencyObjects.push_back("«o.Name»");«IF o.Wiki !== null»	Wiki["«o.Name»"] = "«o.Wiki»";«ENDIF»
				«ENDFOR»				
			
				«FOR SmartDGObject o : e.DGObjects»
				«IF o.isMulti == true»
					isMultiSmartDependencyObjects["«o.Name»"] = true;	Wiki["«o.Name»"] = "[Multi] " + Wiki["«o.Name»"];
				«ENDIF»
				«ENDFOR»
				// Smart Components
				«FOR SmartDGComponent c : e.DGComponents»
				SmartComponents.push_back("«c.Name»");«IF c.Wiki !== null»	Wiki["«c.Name»"] = "«c.Wiki»";«ENDIF»
					«FOR SmartDGPort p : c.InputPorts»
						InputPorts["«c.Name»"].push_back("«p.Name»");
							«FOR String oi : p.DGObjectCandidates»
								InputObjectInstances["«c.Name».«p.Name»"].push_back("«oi»");
							«ENDFOR»
					«ENDFOR»
					«FOR SmartDGPort p : c.OutputPorts»
						OutputPorts["«c.Name»"].push_back("«p.Name»");
							«FOR String oi : p.DGObjectCandidates»
								OutputObjectInstances["«c.Name».«p.Name»"].push_back("«oi»");
							«ENDFOR»
					«ENDFOR»
				TransferFunctions.emplace("«c.Name»", &SmartDG::TransferFunction_Component_«c.Name»::TFT);
				
				«ENDFOR»
				// Smart Connectors
				«FOR SmartDGConnector con : e.DGConnectors»
				SmartConnectors.push_back("«con.Name»");
				«ENDFOR»
			} /* function EnvironmentGenerator */
			void Makedgdatajson(string Location)	{
				string DGliteDir1 = Location+"/"+string(SmartDG_LiteFoldername);
				string DGliteDir2 = "~/."+string(SmartDG_LiteFoldername);
				std::system(string("mkdir -p "+DGliteDir1).c_str());
				std::system(string("mkdir -p "+DGliteDir2).c_str());
				ofstream LaunchServer;	LaunchServer.open (DGliteDir1+"/LaunchServer.sh",ios::trunc);
				LaunchServer << SmartDG_Lite_Server_Launch_COMMAND << endl;	LaunchServer.close();
				std::system(string("cp "+string(DGliteDir1+"/LaunchServer.sh ")+DGliteDir2).c_str());
				string DGliteJSONFile = string(DGliteDir1+"/"+SmartDG_BaseLite+".json");
				while(true){
					if(SmartDG_SyncLiteVerbose)	cout << "Makedgdatajson " << SmartDG_GlobalData::togglelive << endl;
					ofstream jsonfile;
					jsonfile.open (DGliteJSONFile);
					if ( ! jsonfile ) if(SmartDG_SyncLiteVerbose) cout << DGliteJSONFile << "  " << "Error ! Open\n" << strerror(errno) << endl;
					jsonfile << "var dgdata = [" << endl;
					jsonfile << "{\"id\":\""<<"#BLINKY"<<"\",\"val\":\""<<to_string(SmartDG_GlobalData::togglelive)<<"\"}," << endl;
					SmartDG_GlobalData::togglelive++;
					if(SmartDG_GlobalData::togglelive == 11) SmartDG_GlobalData::togglelive = 0;
					for(map <string,string> ::const_iterator it =
							SmartDG_GlobalData::GlobalPackageLite.begin();
							it != SmartDG_GlobalData::GlobalPackageLite.end(); ++it)	{
						jsonfile << "{\"id\":\""<<it->first<<"\",\"val\":\""<<it->second<<"\"}," << endl;
					}
					jsonfile << "]" << endl;
					jsonfile.close();
					if ( ! jsonfile ) if(SmartDG_SyncLiteVerbose) cout << DGliteJSONFile << "  " << "Error ! Close\n" << strerror(errno) << endl;
					std::system(string("cp "+DGliteJSONFile+" "+DGliteDir2).c_str());
					std::this_thread::sleep_for(std::chrono::milliseconds(SmartDG_SLEEP_BETWEEN_SYNLITE));
				}
			}
			} /* namespace SmartDG_GlobalFunction */
		'''
	}

	def gen(SmartDGComponent c) {
		'''
			«FileHeaderText("SmartDGTransferFunction_Component_"+c.Name+".h")»
			«FileNameStartTAG("SmartDGTransferFunction_Component_"+c.Name)»
			«SmartDGHeaderFileWithPath()»
			
			namespace SmartDG	{
			namespace TransferFunction_Component_«c.Name»{
			
				inline string Name()	{
					if(SmartDG_TFV) cout << "Name" << endl;
					return "«c.Name»";
				}
			
				inline void TF(vector<string> &Return)	{
					if(SmartDG_TFV) cout << "TF" << endl;
					Return.push_back(SmartDG_OK);
				}
			
				inline void FT(vector<string> &Return)	{
					if(SmartDG_TFV) cout << "FT" << endl;
					Return.push_back(SmartDG_OK);
				}
			
				inline void TFT(string Fun, vector<string> &Return, vector< vector<SmartDG::DependencyPort> >& DP)	{
					if(SmartDG_TFV) cout << "TransferFunction_Component_«c.Name»" <<
							"SmartComponent " << Name() << " " << Fun  << endl;
					if(Fun == "List")	{
						Return.push_back(SmartDG_OK);
						Return.push_back("List");
						Return.push_back("Name");
						Return.push_back("TF");
						Return.push_back("FT");
						return;
					}
					if(Fun == "Name")	{
						Return.push_back(SmartDG_OK);
						Return.push_back(Name());
						return;
					}
					if(Fun == "TF")	{ TF(Return);	return;	}
					if(Fun == "FT")	{ FT(Return);	return;	}
			
					Return.push_back(SmartDG_NOT_OK); // Function Not Found
					return;
				}
			} /* namespace TransferFunction_Component_«c.Name» */
			} /* namespace SmartDG */
			«FileNameEndTAG(  "SmartDGTransferFunction_Component_"+c.Name)»
		'''
	}

	def gen(SmartDGSystemProject p) {
		'''
			«FileHeaderText("SmartDGSystemProject_"+p.Name+".cpp")»
			«SmartDGHeaderFileWithPath()»
			#include "SmartDGEnvironment_«p.Environment».h"
			namespace SmartDG	{
			namespace SystemProject_«p.Name»{
			int Run(string mode, string displaymode){
				string SystemProjectName = "«p.Name»";
				cout << "Smart Dependency Graph : SmartDGSystemProject : "<< SystemProjectName << endl;
				vector<SmartDG::DependencyDescriptor> DD;
				«FOR SmartDGDependency d : p.DGDependency»
					DD.push_back(SmartDG::DependencyDescriptor("«d.Name»","«d.OutputNode»","«d.OutputPort»","«d.Object»","«d.InputNode»","«d.InputPort»"));
				«ENDFOR»
				map<string, SmartDG::GUIPoint> GUI;
				«FOR SmartDGGUI g : p.DGGUI»
					GUI["«g.Name»"] = SmartDG::GUIPoint("«g.Name»",«g.x»*(SmartDG_TAB/10),«g.y»*(SmartDG_TAB/10));
				«ENDFOR»
				map<string, string> CIM; // Component Instance Map
				«FOR cim : p.CIM.entrySet»
					CIM["«cim.getKey»"] = "«cim.getValue»";
				«ENDFOR»
				SmartDG::SmartDGGenerator DGG(SystemProjectName,DD,GUI,CIM,mode);
				DGG.Display();
				DGG.Show();
				std::thread LiteSyncThread(SmartDG_GlobalFunction::Makedgdatajson, SmartDG_LiteFolderLocation);
				return(Fl::run());
			}
			} /* namespace SystemProject_«p.Name» */
			} /* namespace SmartDG */
			
			int main()	{
				//string mode(SmartDG_OBJECT_MODE);
				//string mode(SmartDG_COMPONENT_MODE);
				string mode(SmartDG_DUAL_MODE);
				string displaymode = SmartDG_DUAL_DISPLAYMODE;
				return(SmartDG::SystemProject_«p.Name»::Run(mode, displaymode));
			}
		'''
	}

	def gen(SmartDGComponentDevelopment cd) {
		'''
			«FileHeaderText("SmartDGComponentDevelopment_"+cd.Name+".cpp")»
			«SmartDGHeaderFileWithPath()»
			#include "SmartDGEnvironment_«cd.Environment».h"
			namespace SmartDG	{
			namespace ComponentDevelopmentMode_«cd.Name»{
			int Run(string mode, string displaymode){
				cout << "Smart Dependency Graph : SmartDGComponentDevelopment : "<< "«cd.Name»" << endl;
				SmartDG::SmartDGGenerator DGG("«cd.DGComponent.Name»", mode);
				DGG.Display();
				DGG.Show();
				return(Fl::run());
			}
			} /* namespace ComponentDevelopmentMode_«cd.Name» */
			} /* namespace SmartDG */
			
			int main()	{
				string mode(SmartDG_COMPONENT_DEVELOPER_MODE);
				string displaymode = SmartDG_DUAL_DISPLAYMODE;
				return(SmartDG::ComponentDevelopmentMode_«cd.Name»::Run(mode, displaymode));
			}
		'''
	}

	def genCMAKE(String project) {
		'''
			«FileHeaderTextHash("CMakeLists.txt for project "+project)»
			cmake_minimum_required(VERSION 2.8)
			project(«project»)
			file(GLOB SRC_FILES ${CMAKE_SOURCE_DIR}/src-gen/*.cpp)
			set(CMAKE_CXX_STANDARD 11)
			
			find_package(FLTK REQUIRED NO_MODULE)
			include_directories(${FLTK_INCLUDE_DIRS})
			
			add_executable(${PROJECT_NAME} ${SRC_FILES} )
			target_link_libraries(${PROJECT_NAME} SmartDG fltk)
			target_include_directories(${PROJECT_NAME} PUBLIC "/usr/local/include/SmartDG")
		'''
	}

	def genBuildit(String assortment, String project, String path) {
		'''
			«FileHeaderTextHash("buildit.sh for project "+project)»
			cd «path»
			mkdir -p build
			rm -r build
			mkdir -p build
			echo "build/" > .gitignore
			cd build
			cmake ..
			make
			mkdir -p ../../../SmartDG_Assortment/«assortment»
			cp ./«project» ../../../SmartDG_Assortment/«assortment»
		'''
	}
}
