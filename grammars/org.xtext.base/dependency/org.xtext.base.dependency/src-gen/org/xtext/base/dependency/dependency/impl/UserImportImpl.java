/**
 * generated by Xtext 2.21.0
 */
package org.xtext.base.dependency.dependency.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.base.dependency.dependency.DependencyPackage;
import org.xtext.base.dependency.dependency.UserImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.base.dependency.dependency.impl.UserImportImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.xtext.base.dependency.dependency.impl.UserImportImpl#getBoxpath <em>Boxpath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImportImpl extends MinimalEObjectImpl.Container implements UserImport
{
  /**
   * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected static final String ENVIRONMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected String environment = ENVIRONMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getBoxpath() <em>Boxpath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoxpath()
   * @generated
   * @ordered
   */
  protected static final String BOXPATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoxpath() <em>Boxpath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoxpath()
   * @generated
   * @ordered
   */
  protected String boxpath = BOXPATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserImportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DependencyPackage.Literals.USER_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEnvironment()
  {
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnvironment(String newEnvironment)
  {
    String oldEnvironment = environment;
    environment = newEnvironment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.USER_IMPORT__ENVIRONMENT, oldEnvironment, environment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBoxpath()
  {
    return boxpath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoxpath(String newBoxpath)
  {
    String oldBoxpath = boxpath;
    boxpath = newBoxpath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.USER_IMPORT__BOXPATH, oldBoxpath, boxpath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DependencyPackage.USER_IMPORT__ENVIRONMENT:
        return getEnvironment();
      case DependencyPackage.USER_IMPORT__BOXPATH:
        return getBoxpath();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DependencyPackage.USER_IMPORT__ENVIRONMENT:
        setEnvironment((String)newValue);
        return;
      case DependencyPackage.USER_IMPORT__BOXPATH:
        setBoxpath((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DependencyPackage.USER_IMPORT__ENVIRONMENT:
        setEnvironment(ENVIRONMENT_EDEFAULT);
        return;
      case DependencyPackage.USER_IMPORT__BOXPATH:
        setBoxpath(BOXPATH_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DependencyPackage.USER_IMPORT__ENVIRONMENT:
        return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
      case DependencyPackage.USER_IMPORT__BOXPATH:
        return BOXPATH_EDEFAULT == null ? boxpath != null : !BOXPATH_EDEFAULT.equals(boxpath);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (environment: ");
    result.append(environment);
    result.append(", boxpath: ");
    result.append(boxpath);
    result.append(')');
    return result.toString();
  }

} //UserImportImpl
