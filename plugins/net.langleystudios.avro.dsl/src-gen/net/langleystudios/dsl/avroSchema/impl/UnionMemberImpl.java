/**
 */
package net.langleystudios.dsl.avroSchema.impl;

import net.langleystudios.dsl.avroSchema.AvroSchemaPackage;
import net.langleystudios.dsl.avroSchema.Record;
import net.langleystudios.dsl.avroSchema.UnionMember;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.UnionMemberImpl#getRecordRef <em>Record Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionMemberImpl extends MinimalEObjectImpl.Container implements UnionMember
{
  /**
   * The cached value of the '{@link #getRecordRef() <em>Record Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordRef()
   * @generated
   * @ordered
   */
  protected Record recordRef;

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

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Record getRecordRef()
  {
    if (recordRef != null && recordRef.eIsProxy())
    {
      InternalEObject oldRecordRef = (InternalEObject)recordRef;
      recordRef = (Record)eResolveProxy(oldRecordRef);
      if (recordRef != oldRecordRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvroSchemaPackage.UNION_MEMBER__RECORD_REF, oldRecordRef, recordRef));
      }
    }
    return recordRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Record basicGetRecordRef()
  {
    return recordRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordRef(Record newRecordRef)
  {
    Record oldRecordRef = recordRef;
    recordRef = newRecordRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.UNION_MEMBER__RECORD_REF, oldRecordRef, recordRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AvroSchemaPackage.UNION_MEMBER__RECORD_REF:
        if (resolve) return getRecordRef();
        return basicGetRecordRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AvroSchemaPackage.UNION_MEMBER__RECORD_REF:
        setRecordRef((Record)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AvroSchemaPackage.UNION_MEMBER__RECORD_REF:
        setRecordRef((Record)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AvroSchemaPackage.UNION_MEMBER__RECORD_REF:
        return recordRef != null;
    }
    return super.eIsSet(featureID);
  }

} //UnionMemberImpl
