/**
 */
package net.langleystudios.dsl.avroSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getName <em>Name</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getRecord <em>Record</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getRecordRef <em>Record Ref</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getEtype <em>Etype</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getArray <em>Array</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getMap <em>Map</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getFixed <em>Fixed</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Field#getUnion <em>Union</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
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
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_Primitive()
   * @model containment="true"
   * @generated
   */
  Primitive getPrimitive();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getPrimitive <em>Primitive</em>}' containment reference.
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
   * @see #setRecord(RecordType)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_Record()
   * @model containment="true"
   * @generated
   */
  RecordType getRecord();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getRecord <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' containment reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(RecordType value);

  /**
   * Returns the value of the '<em><b>Record Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Ref</em>' reference.
   * @see #setRecordRef(RecordType)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_RecordRef()
   * @model
   * @generated
   */
  RecordType getRecordRef();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getRecordRef <em>Record Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Ref</em>' reference.
   * @see #getRecordRef()
   * @generated
   */
  void setRecordRef(RecordType value);

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
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_Etype()
   * @model containment="true"
   * @generated
   */
  EnumType getEtype();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getEtype <em>Etype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etype</em>' containment reference.
   * @see #getEtype()
   * @generated
   */
  void setEtype(EnumType value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(ArrayType)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_Array()
   * @model containment="true"
   * @generated
   */
  ArrayType getArray();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(ArrayType value);

  /**
   * Returns the value of the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' containment reference.
   * @see #setMap(MapType)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_Map()
   * @model containment="true"
   * @generated
   */
  MapType getMap();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getMap <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map</em>' containment reference.
   * @see #getMap()
   * @generated
   */
  void setMap(MapType value);

  /**
   * Returns the value of the '<em><b>Fixed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed</em>' containment reference.
   * @see #setFixed(FixedType)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_Fixed()
   * @model containment="true"
   * @generated
   */
  FixedType getFixed();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getFixed <em>Fixed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed</em>' containment reference.
   * @see #getFixed()
   * @generated
   */
  void setFixed(FixedType value);

  /**
   * Returns the value of the '<em><b>Union</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Union</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Union</em>' containment reference.
   * @see #setUnion(UnionType)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getField_Union()
   * @model containment="true"
   * @generated
   */
  UnionType getUnion();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Field#getUnion <em>Union</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Union</em>' containment reference.
   * @see #getUnion()
   * @generated
   */
  void setUnion(UnionType value);

} // Field
