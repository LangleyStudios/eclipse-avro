/**
 */
package net.langleystudios.dsl.avroSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.FieldList#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getFieldList()
 * @model
 * @generated
 */
public interface FieldList extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link net.langleystudios.dsl.avroSchema.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see net.langleystudios.dsl.avroSchema.AvroSchemaPackage#getFieldList_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // FieldList
