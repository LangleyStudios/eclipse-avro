/**
 */
package net.langleystudios.dsl.avroSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Record#getName <em>Name</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Record#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Record#getFieldList <em>Field List</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends UnionMember
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
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getRecord_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Record#getName <em>Name</em>}' attribute.
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
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getRecord_Namespace()
   * @model
   * @generated
   */
  String getNamespace();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Record#getNamespace <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' attribute.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(String value);

  /**
   * Returns the value of the '<em><b>Field List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field List</em>' containment reference.
   * @see #setFieldList(FieldList)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getRecord_FieldList()
   * @model containment="true"
   * @generated
   */
  FieldList getFieldList();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Record#getFieldList <em>Field List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field List</em>' containment reference.
   * @see #getFieldList()
   * @generated
   */
  void setFieldList(FieldList value);

} // Record
