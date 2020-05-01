/**
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Var Init Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.GlobalVarInitDeclaration#getVarList <em>Var List</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.GlobalVarInitDeclaration#getLocation <em>Location</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.GlobalVarInitDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getGlobalVarInitDeclaration()
 * @model
 * @generated
 */
public interface GlobalVarInitDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Var List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var List</em>' containment reference.
   * @see #setVarList(VarList)
   * @see su.nsk.iae.post.poST.PoSTPackage#getGlobalVarInitDeclaration_VarList()
   * @model containment="true"
   * @generated
   */
  VarList getVarList();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.GlobalVarInitDeclaration#getVarList <em>Var List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var List</em>' containment reference.
   * @see #getVarList()
   * @generated
   */
  void setVarList(VarList value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see su.nsk.iae.post.poST.PoSTPackage#getGlobalVarInitDeclaration_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.GlobalVarInitDeclaration#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see su.nsk.iae.post.poST.PoSTPackage#getGlobalVarInitDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.GlobalVarInitDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // GlobalVarInitDeclaration
