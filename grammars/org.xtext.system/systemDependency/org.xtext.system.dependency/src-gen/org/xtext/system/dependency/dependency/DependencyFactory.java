/**
 * generated by Xtext 2.23.0
 */
package org.xtext.system.dependency.dependency;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.system.dependency.dependency.DependencyPackage
 * @generated
 */
public interface DependencyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DependencyFactory eINSTANCE = org.xtext.system.dependency.dependency.impl.DependencyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>System Dependency Objects</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Dependency Objects</em>'.
   * @generated
   */
  SystemDependencyObjects createSystemDependencyObjects();

  /**
   * Returns a new object of class '<em>User Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Name</em>'.
   * @generated
   */
  UserName createUserName();

  /**
   * Returns a new object of class '<em>User Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Import</em>'.
   * @generated
   */
  UserImport createUserImport();

  /**
   * Returns a new object of class '<em>At</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At</em>'.
   * @generated
   */
  At createAt();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>GUI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GUI</em>'.
   * @generated
   */
  GUI createGUI();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DependencyPackage getDependencyPackage();

} //DependencyFactory
