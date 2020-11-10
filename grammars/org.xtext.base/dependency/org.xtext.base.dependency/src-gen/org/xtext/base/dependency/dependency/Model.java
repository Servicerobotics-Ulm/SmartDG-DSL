/**
 * generated by Xtext 2.23.0
 */
package org.xtext.base.dependency.dependency;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.base.dependency.dependency.Model#getUsername <em>Username</em>}</li>
 *   <li>{@link org.xtext.base.dependency.dependency.Model#getUserimport <em>Userimport</em>}</li>
 *   <li>{@link org.xtext.base.dependency.dependency.Model#getNew <em>New</em>}</li>
 *   <li>{@link org.xtext.base.dependency.dependency.Model#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link org.xtext.base.dependency.dependency.Model#getSystemProjects <em>System Projects</em>}</li>
 *   <li>{@link org.xtext.base.dependency.dependency.Model#getComponentDevelopments <em>Component Developments</em>}</li>
 * </ul>
 *
 * @see org.xtext.base.dependency.dependency.DependencyPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Username</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.base.dependency.dependency.UserName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' containment reference list.
   * @see org.xtext.base.dependency.dependency.DependencyPackage#getModel_Username()
   * @model containment="true"
   * @generated
   */
  EList<UserName> getUsername();

  /**
   * Returns the value of the '<em><b>Userimport</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.base.dependency.dependency.UserImport}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Userimport</em>' containment reference list.
   * @see org.xtext.base.dependency.dependency.DependencyPackage#getModel_Userimport()
   * @model containment="true"
   * @generated
   */
  EList<UserImport> getUserimport();

  /**
   * Returns the value of the '<em><b>New</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.base.dependency.dependency.New}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>New</em>' containment reference list.
   * @see org.xtext.base.dependency.dependency.DependencyPackage#getModel_New()
   * @model containment="true"
   * @generated
   */
  EList<New> getNew();

  /**
   * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.base.dependency.dependency.Environment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environments</em>' containment reference list.
   * @see org.xtext.base.dependency.dependency.DependencyPackage#getModel_Environments()
   * @model containment="true"
   * @generated
   */
  EList<Environment> getEnvironments();

  /**
   * Returns the value of the '<em><b>System Projects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.base.dependency.dependency.SystemProject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Projects</em>' containment reference list.
   * @see org.xtext.base.dependency.dependency.DependencyPackage#getModel_SystemProjects()
   * @model containment="true"
   * @generated
   */
  EList<SystemProject> getSystemProjects();

  /**
   * Returns the value of the '<em><b>Component Developments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.base.dependency.dependency.ComponentDevelopment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Developments</em>' containment reference list.
   * @see org.xtext.base.dependency.dependency.DependencyPackage#getModel_ComponentDevelopments()
   * @model containment="true"
   * @generated
   */
  EList<ComponentDevelopment> getComponentDevelopments();

} // Model
