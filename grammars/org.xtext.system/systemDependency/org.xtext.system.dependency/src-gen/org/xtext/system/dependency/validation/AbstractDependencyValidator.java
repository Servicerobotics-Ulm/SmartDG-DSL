/*
 * generated by Xtext 2.23.0
 */
package org.xtext.system.dependency.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDependencyValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.system.dependency.dependency.DependencyPackage.eINSTANCE);
		return result;
	}
}
