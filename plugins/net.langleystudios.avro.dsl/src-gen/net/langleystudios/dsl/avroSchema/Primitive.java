/**
 */
package net.langleystudios.dsl.avroSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.Primitive#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getPrimitive()
 * @model
 * @generated
 */
public interface Primitive extends UnionMember
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getPrimitive_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.Primitive#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Primitive
