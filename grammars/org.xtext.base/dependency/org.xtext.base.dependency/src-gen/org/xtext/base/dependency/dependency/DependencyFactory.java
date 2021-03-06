/**
 * generated by Xtext 2.23.0
 */
package org.xtext.base.dependency.dependency;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.base.dependency.dependency.DependencyPackage
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
  DependencyFactory eINSTANCE = org.xtext.base.dependency.dependency.impl.DependencyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>New</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New</em>'.
   * @generated
   */
  New createNew();

  /**
   * Returns a new object of class '<em>At</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At</em>'.
   * @generated
   */
  At createAt();

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
   * Returns a new object of class '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment</em>'.
   * @generated
   */
  Environment createEnvironment();

  /**
   * Returns a new object of class '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object</em>'.
   * @generated
   */
  DependencyObject createDependencyObject();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  DependencyComponent createDependencyComponent();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  DependencyPort createDependencyPort();

  /**
   * Returns a new object of class '<em>Connectors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connectors</em>'.
   * @generated
   */
  DependencyConnectors createDependencyConnectors();

  /**
   * Returns a new object of class '<em>System Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Project</em>'.
   * @generated
   */
  SystemProject createSystemProject();

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
   * Returns a new object of class '<em>CIM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CIM</em>'.
   * @generated
   */
  CIM createCIM();

  /**
   * Returns a new object of class '<em>Box Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Box Location</em>'.
   * @generated
   */
  BoxLocation createBoxLocation();

  /**
   * Returns a new object of class '<em>Component Development</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Development</em>'.
   * @generated
   */
  ComponentDevelopment createComponentDevelopment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DependencyPackage getDependencyPackage();

} //DependencyFactory
