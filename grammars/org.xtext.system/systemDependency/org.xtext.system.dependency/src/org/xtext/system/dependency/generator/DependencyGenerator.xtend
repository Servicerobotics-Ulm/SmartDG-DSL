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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DependencyGenerator extends AbstractGenerator {

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
			"org.xtext.system.componentArchitecture.ComponentArchitecture");
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
			println("non-existing resource: " + xtextResourceUri)
		}
		return null
	}
}
