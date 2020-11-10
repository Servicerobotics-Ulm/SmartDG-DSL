/**
 * generated by Xtext 2.23.0
 */
package org.xtext.system.dependency.dependency;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.system.dependency.dependency.UserImport#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.xtext.system.dependency.dependency.UserImport#getBoxpath <em>Boxpath</em>}</li>
 * </ul>
 *
 * @see org.xtext.system.dependency.dependency.DependencyPackage#getUserImport()
 * @model
 * @generated
 */
public interface UserImport extends EObject
{
  /**
   * Returns the value of the '<em><b>Environment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment</em>' attribute.
   * @see #setEnvironment(String)
   * @see org.xtext.system.dependency.dependency.DependencyPackage#getUserImport_Environment()
   * @model
   * @generated
   */
  String getEnvironment();

  /**
   * Sets the value of the '{@link org.xtext.system.dependency.dependency.UserImport#getEnvironment <em>Environment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Environment</em>' attribute.
   * @see #getEnvironment()
   * @generated
   */
  void setEnvironment(String value);

  /**
   * Returns the value of the '<em><b>Boxpath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boxpath</em>' attribute.
   * @see #setBoxpath(String)
   * @see org.xtext.system.dependency.dependency.DependencyPackage#getUserImport_Boxpath()
   * @model
   * @generated
   */
  String getBoxpath();

  /**
   * Sets the value of the '{@link org.xtext.system.dependency.dependency.UserImport#getBoxpath <em>Boxpath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boxpath</em>' attribute.
   * @see #getBoxpath()
   * @generated
   */
  void setBoxpath(String value);

} // UserImport
