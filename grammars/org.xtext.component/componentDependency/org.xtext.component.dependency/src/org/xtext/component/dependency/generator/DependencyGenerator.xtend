//================================================================
//
//  Copyright (C) 2017 Vineet Nagrath, Alex Lotz
//
//        nagrath@hs-ulm.de		
//        lotz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DependencyGenerator extends AbstractGenerator {

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
			println("non-existing resource: " + xtextResourceUri)
		}
		return null
	}
}
