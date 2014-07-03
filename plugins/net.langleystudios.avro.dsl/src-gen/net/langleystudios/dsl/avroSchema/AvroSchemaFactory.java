/**
 */
package net.langleystudios.dsl.avroSchema;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage
 * @generated
 */
public interface AvroSchemaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AvroSchemaFactory eINSTANCE = net.langleystudios.dsl.avroSchema.impl.AvroSchemaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Avro Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Avro Schema</em>'.
   * @generated
   */
  AvroSchema createAvroSchema();

  /**
   * Returns a new object of class '<em>Union Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union Type</em>'.
   * @generated
   */
  UnionType createUnionType();

  /**
   * Returns a new object of class '<em>Union Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union Member</em>'.
   * @generated
   */
  UnionMember createUnionMember();

  /**
   * Returns a new object of class '<em>Json Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Type</em>'.
   * @generated
   */
  JsonType createJsonType();

  /**
   * Returns a new object of class '<em>Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Type</em>'.
   * @generated
   */
  RecordType createRecordType();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type</em>'.
   * @generated
   */
  EnumType createEnumType();

  /**
   * Returns a new object of class '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type</em>'.
   * @generated
   */
  ArrayType createArrayType();

  /**
   * Returns a new object of class '<em>Map Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Type</em>'.
   * @generated
   */
  MapType createMapType();

  /**
   * Returns a new object of class '<em>Fixed Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fixed Type</em>'.
   * @generated
   */
  FixedType createFixedType();

  /**
   * Returns a new object of class '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive</em>'.
   * @generated
   */
  Primitive createPrimitive();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AvroSchemaPackage getAvroSchemaPackage();

} //AvroSchemaFactory
