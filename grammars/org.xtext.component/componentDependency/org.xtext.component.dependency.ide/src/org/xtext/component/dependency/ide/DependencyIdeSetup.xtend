/*
 * generated by Xtext 2.16.0
 */
package org.xtext.component.dependency.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.component.dependency.DependencyRuntimeModule
import org.xtext.component.dependency.DependencyStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DependencyIdeSetup extends DependencyStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DependencyRuntimeModule, new DependencyIdeModule))
	}
	
}
