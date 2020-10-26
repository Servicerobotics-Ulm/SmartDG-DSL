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
package org.xtext.base.dependency

class SmartDGdefaultModels {
	def static String doDefault() {
		'''
			UserName: "SmartSoft"
			import "DependencyBaseEnvironment" from "SMART_ROOT_ACE"
			Save @ "HOME"
		'''
	}

	def static String dgDefault() {
		'''
			UserName: "SmartSoft"
			import "DependencyBaseEnvironment" from "SMART_ROOT_ACE"
			Save @ "HOME"
		'''
	}
}
