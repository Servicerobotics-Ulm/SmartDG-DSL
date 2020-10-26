/*
 * generated by Xtext 2.21.0
 */
package org.xtext.base.dependency.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.base.dependency.ui.internal.DependencyActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DependencyExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DependencyActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DependencyActivator activator = DependencyActivator.getInstance();
		return activator != null ? activator.getInjector(DependencyActivator.ORG_XTEXT_BASE_DEPENDENCY_DEPENDENCY) : null;
	}

}
