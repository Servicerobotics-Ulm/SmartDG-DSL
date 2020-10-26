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
package org.xtext.system.dependency.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.system.dependency.dependency.SystemDependencyObjects
import org.xtext.system.dependency.services.DependencyGrammarAccess

class DependencyFormatter extends AbstractFormatter2 {

	@Inject extension DependencyGrammarAccess

	def dispatch void format(SystemDependencyObjects systemDependencyObjects, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		systemDependencyObjects.username.format
		systemDependencyObjects.username.append[newLine]
		systemDependencyObjects.userimport.format
		systemDependencyObjects.userimport.append[newLine]
		systemDependencyObjects.at.format
		systemDependencyObjects.at.append[newLine]
		for (dependency : systemDependencyObjects.dependencies) {
			dependency.format
		}
		for (gUI : systemDependencyObjects.guis) {
			gUI.format
		}
	}

// TODO: implement for 
}
