/**
 */
package net.langleystudios.dsl.avroSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.UnionMember#getRecordRef <em>Record Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getUnionMember()
 * @model
 * @generated
 */
public interface UnionMember extends EObject
{
  /**
   * Returns the value of the '<em><b>Record Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Ref</em>' reference.
   * @see #setRecordRef(Record)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getUnionMember_RecordRef()
   * @model
   * @generated
   */
  Record getRecordRef();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.UnionMember#getRecordRef <em>Record Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Ref</em>' reference.
   * @see #getRecordRef()
   * @generated
   */
  void setRecordRef(Record value);

} // UnionMember
