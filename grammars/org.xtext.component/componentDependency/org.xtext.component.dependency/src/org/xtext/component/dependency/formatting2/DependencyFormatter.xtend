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
package org.xtext.component.dependency.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.component.dependency.dependency.ComponentDependencyObjects
import org.xtext.component.dependency.services.DependencyGrammarAccess

class DependencyFormatter extends AbstractFormatter2 {

	@Inject extension DependencyGrammarAccess

	def dispatch void format(ComponentDependencyObjects componentDependencyObjects,
		extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		componentDependencyObjects.username.format
		componentDependencyObjects.username.append[newLine]
		componentDependencyObjects.userimport.format
		componentDependencyObjects.userimport.append[newLine]
		componentDependencyObjects.at.format
		componentDependencyObjects.at.append[newLine]
	}

// TODO: implement for 
}
