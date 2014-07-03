/**
 */
package net.langleystudios.dsl.avroSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.FixedType#getName <em>Name</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.FixedType#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getFixedType()
 * @model
 * @generated
 */
public interface FixedType extends UnionMember
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
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getFixedType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.FixedType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getFixedType_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.FixedType#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

} // FixedType
