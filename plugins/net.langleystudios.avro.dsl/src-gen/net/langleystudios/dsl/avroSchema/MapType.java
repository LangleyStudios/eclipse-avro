/**
 */
package net.langleystudios.dsl.avroSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.MapType#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.MapType#getRecord <em>Record</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.MapType#getEtype <em>Etype</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.MapType#getAtype <em>Atype</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends UnionMember
{
  /**
   * Returns the value of the '<em><b>Primitive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive</em>' containment reference.
   * @see #setPrimitive(Primitive)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getMapType_Primitive()
   * @model containment="true"
   * @generated
   */
  Primitive getPrimitive();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.MapType#getPrimitive <em>Primitive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive</em>' containment reference.
   * @see #getPrimitive()
   * @generated
   */
  void setPrimitive(Primitive value);

  /**
   * Returns the value of the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' containment reference.
   * @see #setRecord(Record)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getMapType_Record()
   * @model containment="true"
   * @generated
   */
  Record getRecord();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.MapType#getRecord <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' containment reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(Record value);

  /**
   * Returns the value of the '<em><b>Etype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Etype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etype</em>' containment reference.
   * @see #setEtype(EnumType)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getMapType_Etype()
   * @model containment="true"
   * @generated
   */
  EnumType getEtype();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.MapType#getEtype <em>Etype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etype</em>' containment reference.
   * @see #getEtype()
   * @generated
   */
  void setEtype(EnumType value);

  /**
   * Returns the value of the '<em><b>Atype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atype</em>' containment reference.
   * @see #setAtype(ArrayType)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getMapType_Atype()
   * @model containment="true"
   * @generated
   */
  ArrayType getAtype();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.MapType#getAtype <em>Atype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atype</em>' containment reference.
   * @see #getAtype()
   * @generated
   */
  void setAtype(ArrayType value);

} // MapType
