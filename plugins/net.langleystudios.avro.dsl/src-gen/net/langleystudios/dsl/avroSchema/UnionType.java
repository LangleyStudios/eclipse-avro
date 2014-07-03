/**
 */
package net.langleystudios.dsl.avroSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.UnionType#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getUnionType()
 * @model
 * @generated
 */
public interface UnionType extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link net.langleystudios.dsl.avroSchema.UnionMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getUnionType_Types()
   * @model containment="true"
   * @generated
   */
  EList<UnionMember> getTypes();

} // UnionType
