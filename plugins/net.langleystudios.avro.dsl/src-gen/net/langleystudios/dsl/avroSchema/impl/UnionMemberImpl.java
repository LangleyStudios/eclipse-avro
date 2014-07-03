/**
 */
package net.langleystudios.dsl.avroSchema.impl;

import net.langleystudios.dsl.avroSchema.AvroSchemaPackage;
import net.langleystudios.dsl.avroSchema.UnionMember;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnionMemberImpl extends MinimalEObjectImpl.Container implements UnionMember
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnionMemberImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AvroSchemaPackage.Literals.UNION_MEMBER;
  }

} //UnionMemberImpl
