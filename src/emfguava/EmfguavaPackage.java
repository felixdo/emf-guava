/**
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package emfguava;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emfguava.EmfguavaFactory
 * @model kind="package"
 * @generated
 */
public interface EmfguavaPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "emfguava";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "https://github.com/felixdo/emf-guava";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "emfguava";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmfguavaPackage eINSTANCE = emfguava.impl.EmfguavaPackageImpl.init();

  /**
   * The meta object id for the '{@link com.google.common.base.Predicate <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.google.common.base.Predicate
   * @see emfguava.impl.EmfguavaPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 0;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link com.google.common.base.Function <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.google.common.base.Function
   * @see emfguava.impl.EmfguavaPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link com.google.common.base.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see com.google.common.base.Predicate
   * @model instanceClass="com.google.common.base.Predicate" typeParameters="T"
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for class '{@link com.google.common.base.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.google.common.base.Function
   * @model instanceClass="com.google.common.base.Function" typeParameters="F T"
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EmfguavaFactory getEmfguavaFactory();

} //EmfguavaPackage
