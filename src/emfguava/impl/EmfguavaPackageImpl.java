/**
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package emfguava.impl;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import emfguava.EmfguavaFactory;
import emfguava.EmfguavaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfguavaPackageImpl extends EPackageImpl implements EmfguavaPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see emfguava.EmfguavaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EmfguavaPackageImpl() {
    super(eNS_URI, EmfguavaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EmfguavaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EmfguavaPackage init() {
    if (isInited) return (EmfguavaPackage)EPackage.Registry.INSTANCE.getEPackage(EmfguavaPackage.eNS_URI);

    // Obtain or create and register package
    EmfguavaPackageImpl theEmfguavaPackage = (EmfguavaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfguavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmfguavaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEmfguavaPackage.createPackageContents();

    // Initialize created meta-data
    theEmfguavaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEmfguavaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EmfguavaPackage.eNS_URI, theEmfguavaPackage);
    return theEmfguavaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicate() {
    return predicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction() {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfguavaFactory getEmfguavaFactory() {
    return (EmfguavaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    predicateEClass = createEClass(PREDICATE);

    functionEClass = createEClass(FUNCTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters
    addETypeParameter(predicateEClass, "T");
    addETypeParameter(functionEClass, "F");
    addETypeParameter(functionEClass, "T");

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(predicateEClass, Predicate.class, "Predicate", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //EmfguavaPackageImpl
