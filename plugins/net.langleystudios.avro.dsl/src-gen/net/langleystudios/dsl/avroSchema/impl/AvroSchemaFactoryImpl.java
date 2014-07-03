/**
 */
package net.langleystudios.dsl.avroSchema.impl;

import net.langleystudios.dsl.avroSchema.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvroSchemaFactoryImpl extends EFactoryImpl implements AvroSchemaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AvroSchemaFactory init()
  {
    try
    {
      AvroSchemaFactory theAvroSchemaFactory = (AvroSchemaFactory)EPackage.Registry.INSTANCE.getEFactory(AvroSchemaPackage.eNS_URI);
      if (theAvroSchemaFactory != null)
      {
        return theAvroSchemaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AvroSchemaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvroSchemaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AvroSchemaPackage.AVRO_SCHEMA: return createAvroSchema();
      case AvroSchemaPackage.UNION_TYPE: return createUnionType();
      case AvroSchemaPackage.UNION_MEMBER: return createUnionMember();
      case AvroSchemaPackage.JSON_TYPE: return createJsonType();
      case AvroSchemaPackage.RECORD_TYPE: return createRecordType();
      case AvroSchemaPackage.FIELD: return createField();
      case AvroSchemaPackage.ENUM_TYPE: return createEnumType();
      case AvroSchemaPackage.ARRAY_TYPE: return createArrayType();
      case AvroSchemaPackage.MAP_TYPE: return createMapType();
      case AvroSchemaPackage.FIXED_TYPE: return createFixedType();
      case AvroSchemaPackage.PRIMITIVE: return createPrimitive();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvroSchema createAvroSchema()
  {
    AvroSchemaImpl avroSchema = new AvroSchemaImpl();
    return avroSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionType createUnionType()
  {
    UnionTypeImpl unionType = new UnionTypeImpl();
    return unionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionMember createUnionMember()
  {
    UnionMemberImpl unionMember = new UnionMemberImpl();
    return unionMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonType createJsonType()
  {
    JsonTypeImpl jsonType = new JsonTypeImpl();
    return jsonType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType createRecordType()
  {
    RecordTypeImpl recordType = new RecordTypeImpl();
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapType createMapType()
  {
    MapTypeImpl mapType = new MapTypeImpl();
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixedType createFixedType()
  {
    FixedTypeImpl fixedType = new FixedTypeImpl();
    return fixedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive createPrimitive()
  {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvroSchemaPackage getAvroSchemaPackage()
  {
    return (AvroSchemaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AvroSchemaPackage getPackage()
  {
    return AvroSchemaPackage.eINSTANCE;
  }

} //AvroSchemaFactoryImpl
