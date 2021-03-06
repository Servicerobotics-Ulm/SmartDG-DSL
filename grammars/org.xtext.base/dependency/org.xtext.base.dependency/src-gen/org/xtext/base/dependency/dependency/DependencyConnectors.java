/**
 * generated by Xtext 2.23.0
 */
package org.xtext.base.dependency.dependency;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.base.dependency.dependency.DependencyConnectors#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.base.dependency.dependency.DependencyConnectors#getObjinstances <em>Objinstances</em>}</li>
 * </ul>
 *
 * @see org.xtext.base.dependency.dependency.DependencyPackage#getDependencyConnectors()
 * @model
 * @generated
 */
public interface DependencyConnectors extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.base.dependency.dependency.DependencyPackage#getDependencyConnectors_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.base.dependency.dependency.DependencyConnectors#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Objinstances</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objinstances</em>' attribute list.
   * @see org.xtext.base.dependency.dependency.DependencyPackage#getDependencyConnectors_Objinstances()
   * @model unique="false"
   * @generated
   */
  EList<String> getObjinstances();

} // DependencyConnectors
