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

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DependencyStandaloneSetup extends DependencyStandaloneSetupGenerated {

	def static void doSetup() {
		new DependencyStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
