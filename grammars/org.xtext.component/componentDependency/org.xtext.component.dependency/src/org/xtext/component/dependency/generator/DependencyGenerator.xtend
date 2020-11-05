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

package org.xtext.component.dependency.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.smartmdsd.xtext.component.componentDefinition.ui.internal.ComponentDefinitionActivator
import org.xtext.component.dependency.dependency.UserName
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
		var environment = "";
		var boxpath = "";
		var at = "";
		for (userImport : resource.allContents.toIterable.filter(
			typeof(org.xtext.component.dependency.dependency.UserImport))) {
			environment = userImport.environment;
			boxpath = userImport.boxpath;
		}
		for (tmpAt : resource.allContents.toIterable.filter(typeof(org.xtext.component.dependency.dependency.At))) {
			at = tmpAt.name;
		}
		for (user : resource.allContents.toIterable.filter(
			typeof(org.xtext.component.dependency.dependency.UserName))) {
			val component = user.componentDefinition
			dependencyBaseGenerator.doGenerateComponentCall(resource, user.name, environment, boxpath, at, component);
		}
	}

	def ComponentDefinition getComponentDefinition(UserName user) {
		// create resource-set for the ServiceDefinition grammar
		val injector = ComponentDefinitionActivator.getInstance().getInjector(
			ComponentDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_COMPONENT_COMPONENTDEFINITION_COMPONENTDEFINITION);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		// derive resource URI from the DomainModelsDatasheet model URI
		val baseUri = user.eResource.URI.trimFileExtension
		val fileExtProvider = injector.getInstance(FileExtensionProvider)
		val xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.primaryFileExtension)
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(xtextResourceUri, null)
		if (resourceExists == true) {
			// load resource
			val resource = resourceSet.getResource(xtextResourceUri, true);
			if (resource.loaded == true) {
				val root_obj = resource.contents.get(0)
				if (root_obj instanceof ComponentDefModel) {
					return root_obj.component
				}
			}
		} else {
			SmartDGout.println("non-existing resource: " + xtextResourceUri)
		}
		return null
	}
}
