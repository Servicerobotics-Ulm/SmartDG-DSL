/**
 * generated by Xtext 2.21.0
 */
package org.xtext.component.dependency.dependency.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.component.dependency.dependency.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyFactoryImpl extends EFactoryImpl implements DependencyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DependencyFactory init()
  {
    try
    {
      DependencyFactory theDependencyFactory = (DependencyFactory)EPackage.Registry.INSTANCE.getEFactory(DependencyPackage.eNS_URI);
      if (theDependencyFactory != null)
      {
        return theDependencyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DependencyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DependencyPackage.COMPONENT_DEPENDENCY_OBJECTS: return createComponentDependencyObjects();
      case DependencyPackage.USER_NAME: return createUserName();
      case DependencyPackage.USER_IMPORT: return createUserImport();
      case DependencyPackage.AT: return createAt();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentDependencyObjects createComponentDependencyObjects()
  {
    ComponentDependencyObjectsImpl componentDependencyObjects = new ComponentDependencyObjectsImpl();
    return componentDependencyObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserName createUserName()
  {
    UserNameImpl userName = new UserNameImpl();
    return userName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserImport createUserImport()
  {
    UserImportImpl userImport = new UserImportImpl();
    return userImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public At createAt()
  {
    AtImpl at = new AtImpl();
    return at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DependencyPackage getDependencyPackage()
  {
    return (DependencyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DependencyPackage getPackage()
  {
    return DependencyPackage.eINSTANCE;
  }

} //DependencyFactoryImpl
