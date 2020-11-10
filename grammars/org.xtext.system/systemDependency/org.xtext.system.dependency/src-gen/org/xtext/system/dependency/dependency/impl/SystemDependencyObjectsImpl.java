/**
 * generated by Xtext 2.23.0
 */
package org.xtext.system.dependency.dependency.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.system.dependency.dependency.At;
import org.xtext.system.dependency.dependency.Dependency;
import org.xtext.system.dependency.dependency.DependencyPackage;
import org.xtext.system.dependency.dependency.GUI;
import org.xtext.system.dependency.dependency.SystemDependencyObjects;
import org.xtext.system.dependency.dependency.UserImport;
import org.xtext.system.dependency.dependency.UserName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Dependency Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.system.dependency.dependency.impl.SystemDependencyObjectsImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.xtext.system.dependency.dependency.impl.SystemDependencyObjectsImpl#getUserimport <em>Userimport</em>}</li>
 *   <li>{@link org.xtext.system.dependency.dependency.impl.SystemDependencyObjectsImpl#getAt <em>At</em>}</li>
 *   <li>{@link org.xtext.system.dependency.dependency.impl.SystemDependencyObjectsImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.xtext.system.dependency.dependency.impl.SystemDependencyObjectsImpl#getGuis <em>Guis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemDependencyObjectsImpl extends MinimalEObjectImpl.Container implements SystemDependencyObjects
{
  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected UserName username;

  /**
   * The cached value of the '{@link #getUserimport() <em>Userimport</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserimport()
   * @generated
   * @ordered
   */
  protected UserImport userimport;

  /**
   * The cached value of the '{@link #getAt() <em>At</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAt()
   * @generated
   * @ordered
   */
  protected At at;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<Dependency> dependencies;

  /**
   * The cached value of the '{@link #getGuis() <em>Guis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuis()
   * @generated
   * @ordered
   */
  protected EList<GUI> guis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemDependencyObjectsImpl()
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
    return DependencyPackage.Literals.SYSTEM_DEPENDENCY_OBJECTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserName getUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUsername(UserName newUsername, NotificationChain msgs)
  {
    UserName oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME, oldUsername, newUsername);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUsername(UserName newUsername)
  {
    if (newUsername != username)
    {
      NotificationChain msgs = null;
      if (username != null)
        msgs = ((InternalEObject)username).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME, null, msgs);
      if (newUsername != null)
        msgs = ((InternalEObject)newUsername).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME, null, msgs);
      msgs = basicSetUsername(newUsername, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME, newUsername, newUsername));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserImport getUserimport()
  {
    return userimport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUserimport(UserImport newUserimport, NotificationChain msgs)
  {
    UserImport oldUserimport = userimport;
    userimport = newUserimport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT, oldUserimport, newUserimport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUserimport(UserImport newUserimport)
  {
    if (newUserimport != userimport)
    {
      NotificationChain msgs = null;
      if (userimport != null)
        msgs = ((InternalEObject)userimport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT, null, msgs);
      if (newUserimport != null)
        msgs = ((InternalEObject)newUserimport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT, null, msgs);
      msgs = basicSetUserimport(newUserimport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT, newUserimport, newUserimport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public At getAt()
  {
    return at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAt(At newAt, NotificationChain msgs)
  {
    At oldAt = at;
    at = newAt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT, oldAt, newAt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAt(At newAt)
  {
    if (newAt != at)
    {
      NotificationChain msgs = null;
      if (at != null)
        msgs = ((InternalEObject)at).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT, null, msgs);
      if (newAt != null)
        msgs = ((InternalEObject)newAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT, null, msgs);
      msgs = basicSetAt(newAt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT, newAt, newAt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Dependency> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GUI> getGuis()
  {
    if (guis == null)
    {
      guis = new EObjectContainmentEList<GUI>(GUI.class, this, DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__GUIS);
    }
    return guis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME:
        return basicSetUsername(null, msgs);
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT:
        return basicSetUserimport(null, msgs);
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT:
        return basicSetAt(null, msgs);
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__GUIS:
        return ((InternalEList<?>)getGuis()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME:
        return getUsername();
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT:
        return getUserimport();
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT:
        return getAt();
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__DEPENDENCIES:
        return getDependencies();
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__GUIS:
        return getGuis();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME:
        setUsername((UserName)newValue);
        return;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT:
        setUserimport((UserImport)newValue);
        return;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT:
        setAt((At)newValue);
        return;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Dependency>)newValue);
        return;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__GUIS:
        getGuis().clear();
        getGuis().addAll((Collection<? extends GUI>)newValue);
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
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME:
        setUsername((UserName)null);
        return;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT:
        setUserimport((UserImport)null);
        return;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT:
        setAt((At)null);
        return;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__DEPENDENCIES:
        getDependencies().clear();
        return;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__GUIS:
        getGuis().clear();
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
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERNAME:
        return username != null;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__USERIMPORT:
        return userimport != null;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__AT:
        return at != null;
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case DependencyPackage.SYSTEM_DEPENDENCY_OBJECTS__GUIS:
        return guis != null && !guis.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SystemDependencyObjectsImpl
