/**
 */
package net.langleystudios.dsl.avroSchema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.RecordType#getName <em>Name</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.RecordType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.RecordType#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getRecordType()
 * @model
 * @generated
 */
public interface RecordType extends UnionMember
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getRecordType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.RecordType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' attribute.
   * @see #setNamespace(String)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getRecordType_Namespace()
   * @model
   * @generated
   */
  String getNamespace();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.RecordType#getNamespace <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' attribute.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link net.langleystudios.dsl.avroSchema.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getRecordType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // RecordType
