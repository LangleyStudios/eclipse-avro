/**
 */
package net.langleystudios.dsl.avroSchema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaFactory
 * @model kind="package"
 * @generated
 */
public interface AvroSchemaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "avroSchema";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.langleystudios.net/dsl/AvroSchema";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "avroSchema";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AvroSchemaPackage eINSTANCE = net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl.init();

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.AvroSchemaImpl <em>Avro Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getAvroSchema()
   * @generated
   */
  int AVRO_SCHEMA = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVRO_SCHEMA__TYPES = 0;

  /**
   * The number of structural features of the '<em>Avro Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVRO_SCHEMA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.UnionTypeImpl <em>Union Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.UnionTypeImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getUnionType()
   * @generated
   */
  int UNION_TYPE = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE__TYPES = 0;

  /**
   * The number of structural features of the '<em>Union Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.UnionMemberImpl <em>Union Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.UnionMemberImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getUnionMember()
   * @generated
   */
  int UNION_MEMBER = 2;

  /**
   * The number of structural features of the '<em>Union Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.JsonTypeImpl <em>Json Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.JsonTypeImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getJsonType()
   * @generated
   */
  int JSON_TYPE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Json Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.RecordTypeImpl <em>Record Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.RecordTypeImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getRecordType()
   * @generated
   */
  int RECORD_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__NAME = UNION_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__NAMESPACE = UNION_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__FIELDS = UNION_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Record Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = UNION_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.FieldImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getField()
   * @generated
   */
  int FIELD = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Primitive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__PRIMITIVE = 1;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__RECORD = 2;

  /**
   * The feature id for the '<em><b>Record Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__RECORD_REF = 3;

  /**
   * The feature id for the '<em><b>Etype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ETYPE = 4;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ARRAY = 5;

  /**
   * The feature id for the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__MAP = 6;

  /**
   * The feature id for the '<em><b>Fixed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FIXED = 7;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.EnumTypeImpl <em>Enum Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.EnumTypeImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__NAME = UNION_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Symbols</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__SYMBOLS = UNION_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_FEATURE_COUNT = UNION_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.ArrayTypeImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 7;

  /**
   * The feature id for the '<em><b>Primitive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__PRIMITIVE = UNION_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__RECORD = UNION_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Record Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__RECORD_REF = UNION_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Etype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__ETYPE = UNION_MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = UNION_MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.MapTypeImpl <em>Map Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.MapTypeImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getMapType()
   * @generated
   */
  int MAP_TYPE = 8;

  /**
   * The feature id for the '<em><b>Primitive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__PRIMITIVE = UNION_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__RECORD = UNION_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Record Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__RECORD_REF = UNION_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Etype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__ETYPE = UNION_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Atype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__ATYPE = UNION_MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Map Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_FEATURE_COUNT = UNION_MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.FixedTypeImpl <em>Fixed Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.FixedTypeImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getFixedType()
   * @generated
   */
  int FIXED_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_TYPE__NAME = UNION_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_TYPE__SIZE = UNION_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fixed Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_TYPE_FEATURE_COUNT = UNION_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.langleystudios.dsl.avroSchema.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.langleystudios.dsl.avroSchema.impl.PrimitiveImpl
   * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__TYPE = UNION_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_COUNT = UNION_MEMBER_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.AvroSchema <em>Avro Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Avro Schema</em>'.
   * @see net.langleystudios.dsl.avroSchema.AvroSchema
   * @generated
   */
  EClass getAvroSchema();

  /**
   * Returns the meta object for the containment reference list '{@link net.langleystudios.dsl.avroSchema.AvroSchema#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see net.langleystudios.dsl.avroSchema.AvroSchema#getTypes()
   * @see #getAvroSchema()
   * @generated
   */
  EReference getAvroSchema_Types();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.UnionType <em>Union Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.UnionType
   * @generated
   */
  EClass getUnionType();

  /**
   * Returns the meta object for the containment reference list '{@link net.langleystudios.dsl.avroSchema.UnionType#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see net.langleystudios.dsl.avroSchema.UnionType#getTypes()
   * @see #getUnionType()
   * @generated
   */
  EReference getUnionType_Types();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.UnionMember <em>Union Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union Member</em>'.
   * @see net.langleystudios.dsl.avroSchema.UnionMember
   * @generated
   */
  EClass getUnionMember();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.JsonType <em>Json Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.JsonType
   * @generated
   */
  EClass getJsonType();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.JsonType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.JsonType#getType()
   * @see #getJsonType()
   * @generated
   */
  EReference getJsonType_Type();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.RecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.RecordType
   * @generated
   */
  EClass getRecordType();

  /**
   * Returns the meta object for the attribute '{@link net.langleystudios.dsl.avroSchema.RecordType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.langleystudios.dsl.avroSchema.RecordType#getName()
   * @see #getRecordType()
   * @generated
   */
  EAttribute getRecordType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.langleystudios.dsl.avroSchema.RecordType#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see net.langleystudios.dsl.avroSchema.RecordType#getNamespace()
   * @see #getRecordType()
   * @generated
   */
  EAttribute getRecordType_Namespace();

  /**
   * Returns the meta object for the containment reference list '{@link net.langleystudios.dsl.avroSchema.RecordType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see net.langleystudios.dsl.avroSchema.RecordType#getFields()
   * @see #getRecordType()
   * @generated
   */
  EReference getRecordType_Fields();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link net.langleystudios.dsl.avroSchema.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.Field#getPrimitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitive</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field#getPrimitive()
   * @see #getField()
   * @generated
   */
  EReference getField_Primitive();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.Field#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field#getRecord()
   * @see #getField()
   * @generated
   */
  EReference getField_Record();

  /**
   * Returns the meta object for the reference '{@link net.langleystudios.dsl.avroSchema.Field#getRecordRef <em>Record Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Record Ref</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field#getRecordRef()
   * @see #getField()
   * @generated
   */
  EReference getField_RecordRef();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.Field#getEtype <em>Etype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Etype</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field#getEtype()
   * @see #getField()
   * @generated
   */
  EReference getField_Etype();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.Field#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field#getArray()
   * @see #getField()
   * @generated
   */
  EReference getField_Array();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.Field#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field#getMap()
   * @see #getField()
   * @generated
   */
  EReference getField_Map();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.Field#getFixed <em>Fixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fixed</em>'.
   * @see net.langleystudios.dsl.avroSchema.Field#getFixed()
   * @see #getField()
   * @generated
   */
  EReference getField_Fixed();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.EnumType
   * @generated
   */
  EClass getEnumType();

  /**
   * Returns the meta object for the attribute '{@link net.langleystudios.dsl.avroSchema.EnumType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.langleystudios.dsl.avroSchema.EnumType#getName()
   * @see #getEnumType()
   * @generated
   */
  EAttribute getEnumType_Name();

  /**
   * Returns the meta object for the attribute list '{@link net.langleystudios.dsl.avroSchema.EnumType#getSymbols <em>Symbols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Symbols</em>'.
   * @see net.langleystudios.dsl.avroSchema.EnumType#getSymbols()
   * @see #getEnumType()
   * @generated
   */
  EAttribute getEnumType_Symbols();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.ArrayType#getPrimitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitive</em>'.
   * @see net.langleystudios.dsl.avroSchema.ArrayType#getPrimitive()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_Primitive();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.ArrayType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see net.langleystudios.dsl.avroSchema.ArrayType#getRecord()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_Record();

  /**
   * Returns the meta object for the reference '{@link net.langleystudios.dsl.avroSchema.ArrayType#getRecordRef <em>Record Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Record Ref</em>'.
   * @see net.langleystudios.dsl.avroSchema.ArrayType#getRecordRef()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_RecordRef();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.ArrayType#getEtype <em>Etype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Etype</em>'.
   * @see net.langleystudios.dsl.avroSchema.ArrayType#getEtype()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_Etype();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.MapType <em>Map Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.MapType
   * @generated
   */
  EClass getMapType();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.MapType#getPrimitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitive</em>'.
   * @see net.langleystudios.dsl.avroSchema.MapType#getPrimitive()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_Primitive();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.MapType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see net.langleystudios.dsl.avroSchema.MapType#getRecord()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_Record();

  /**
   * Returns the meta object for the reference '{@link net.langleystudios.dsl.avroSchema.MapType#getRecordRef <em>Record Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Record Ref</em>'.
   * @see net.langleystudios.dsl.avroSchema.MapType#getRecordRef()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_RecordRef();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.MapType#getEtype <em>Etype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Etype</em>'.
   * @see net.langleystudios.dsl.avroSchema.MapType#getEtype()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_Etype();

  /**
   * Returns the meta object for the containment reference '{@link net.langleystudios.dsl.avroSchema.MapType#getAtype <em>Atype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atype</em>'.
   * @see net.langleystudios.dsl.avroSchema.MapType#getAtype()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_Atype();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.FixedType <em>Fixed Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixed Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.FixedType
   * @generated
   */
  EClass getFixedType();

  /**
   * Returns the meta object for the attribute '{@link net.langleystudios.dsl.avroSchema.FixedType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.langleystudios.dsl.avroSchema.FixedType#getName()
   * @see #getFixedType()
   * @generated
   */
  EAttribute getFixedType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.langleystudios.dsl.avroSchema.FixedType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see net.langleystudios.dsl.avroSchema.FixedType#getSize()
   * @see #getFixedType()
   * @generated
   */
  EAttribute getFixedType_Size();

  /**
   * Returns the meta object for class '{@link net.langleystudios.dsl.avroSchema.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see net.langleystudios.dsl.avroSchema.Primitive
   * @generated
   */
  EClass getPrimitive();

  /**
   * Returns the meta object for the attribute '{@link net.langleystudios.dsl.avroSchema.Primitive#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.langleystudios.dsl.avroSchema.Primitive#getType()
   * @see #getPrimitive()
   * @generated
   */
  EAttribute getPrimitive_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AvroSchemaFactory getAvroSchemaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.AvroSchemaImpl <em>Avro Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getAvroSchema()
     * @generated
     */
    EClass AVRO_SCHEMA = eINSTANCE.getAvroSchema();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVRO_SCHEMA__TYPES = eINSTANCE.getAvroSchema_Types();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.UnionTypeImpl <em>Union Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.UnionTypeImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getUnionType()
     * @generated
     */
    EClass UNION_TYPE = eINSTANCE.getUnionType();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_TYPE__TYPES = eINSTANCE.getUnionType_Types();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.UnionMemberImpl <em>Union Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.UnionMemberImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getUnionMember()
     * @generated
     */
    EClass UNION_MEMBER = eINSTANCE.getUnionMember();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.JsonTypeImpl <em>Json Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.JsonTypeImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getJsonType()
     * @generated
     */
    EClass JSON_TYPE = eINSTANCE.getJsonType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_TYPE__TYPE = eINSTANCE.getJsonType_Type();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.RecordTypeImpl <em>Record Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.RecordTypeImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getRecordType()
     * @generated
     */
    EClass RECORD_TYPE = eINSTANCE.getRecordType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_TYPE__NAME = eINSTANCE.getRecordType_Name();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_TYPE__NAMESPACE = eINSTANCE.getRecordType_Namespace();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__FIELDS = eINSTANCE.getRecordType_Fields();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.FieldImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Primitive</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__PRIMITIVE = eINSTANCE.getField_Primitive();

    /**
     * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__RECORD = eINSTANCE.getField_Record();

    /**
     * The meta object literal for the '<em><b>Record Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__RECORD_REF = eINSTANCE.getField_RecordRef();

    /**
     * The meta object literal for the '<em><b>Etype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ETYPE = eINSTANCE.getField_Etype();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ARRAY = eINSTANCE.getField_Array();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__MAP = eINSTANCE.getField_Map();

    /**
     * The meta object literal for the '<em><b>Fixed</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__FIXED = eINSTANCE.getField_Fixed();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.EnumTypeImpl <em>Enum Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.EnumTypeImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getEnumType()
     * @generated
     */
    EClass ENUM_TYPE = eINSTANCE.getEnumType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_TYPE__NAME = eINSTANCE.getEnumType_Name();

    /**
     * The meta object literal for the '<em><b>Symbols</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_TYPE__SYMBOLS = eINSTANCE.getEnumType_Symbols();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.ArrayTypeImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '<em><b>Primitive</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__PRIMITIVE = eINSTANCE.getArrayType_Primitive();

    /**
     * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__RECORD = eINSTANCE.getArrayType_Record();

    /**
     * The meta object literal for the '<em><b>Record Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__RECORD_REF = eINSTANCE.getArrayType_RecordRef();

    /**
     * The meta object literal for the '<em><b>Etype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__ETYPE = eINSTANCE.getArrayType_Etype();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.MapTypeImpl <em>Map Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.MapTypeImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getMapType()
     * @generated
     */
    EClass MAP_TYPE = eINSTANCE.getMapType();

    /**
     * The meta object literal for the '<em><b>Primitive</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__PRIMITIVE = eINSTANCE.getMapType_Primitive();

    /**
     * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__RECORD = eINSTANCE.getMapType_Record();

    /**
     * The meta object literal for the '<em><b>Record Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__RECORD_REF = eINSTANCE.getMapType_RecordRef();

    /**
     * The meta object literal for the '<em><b>Etype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__ETYPE = eINSTANCE.getMapType_Etype();

    /**
     * The meta object literal for the '<em><b>Atype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__ATYPE = eINSTANCE.getMapType_Atype();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.FixedTypeImpl <em>Fixed Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.FixedTypeImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getFixedType()
     * @generated
     */
    EClass FIXED_TYPE = eINSTANCE.getFixedType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXED_TYPE__NAME = eINSTANCE.getFixedType_Name();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXED_TYPE__SIZE = eINSTANCE.getFixedType_Size();

    /**
     * The meta object literal for the '{@link net.langleystudios.dsl.avroSchema.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.langleystudios.dsl.avroSchema.impl.PrimitiveImpl
     * @see net.langleystudios.dsl.avroSchema.impl.AvroSchemaPackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE__TYPE = eINSTANCE.getPrimitive_Type();

  }

} //AvroSchemaPackage
