/**
 */
package net.langleystudios.dsl.avroSchema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.EnumType#getName <em>Name</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.EnumType#getSymbols <em>Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends UnionMember
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
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getEnumType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.langleystudios.dsl.avroSchema.EnumType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Symbols</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbols</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbols</em>' attribute list.
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getEnumType_Symbols()
   * @model unique="false"
   * @generated
   */
  EList<String> getSymbols();

} // EnumType
