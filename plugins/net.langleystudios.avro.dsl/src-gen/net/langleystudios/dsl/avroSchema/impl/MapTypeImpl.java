/**
 */
package net.langleystudios.dsl.avroSchema.impl;

import net.langleystudios.dsl.avroSchema.ArrayType;
import net.langleystudios.dsl.avroSchema.AvroSchemaPackage;
import net.langleystudios.dsl.avroSchema.EnumType;
import net.langleystudios.dsl.avroSchema.MapType;
import net.langleystudios.dsl.avroSchema.Primitive;
import net.langleystudios.dsl.avroSchema.RecordType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.MapTypeImpl#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.MapTypeImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.MapTypeImpl#getRecordRef <em>Record Ref</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.MapTypeImpl#getEtype <em>Etype</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.MapTypeImpl#getAtype <em>Atype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapTypeImpl extends UnionMemberImpl implements MapType
{
  /**
   * The cached value of the '{@link #getPrimitive() <em>Primitive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitive()
   * @generated
   * @ordered
   */
  protected Primitive primitive;

  /**
   * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecord()
   * @generated
   * @ordered
   */
  protected RecordType record;

  /**
   * The cached value of the '{@link #getRecordRef() <em>Record Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordRef()
   * @generated
   * @ordered
   */
  protected RecordType recordRef;

  /**
   * The cached value of the '{@link #getEtype() <em>Etype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtype()
   * @generated
   * @ordered
   */
  protected EnumType etype;

  /**
   * The cached value of the '{@link #getAtype() <em>Atype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtype()
   * @generated
   * @ordered
   */
  protected ArrayType atype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapTypeImpl()
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
    return AvroSchemaPackage.Literals.MAP_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive getPrimitive()
  {
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitive(Primitive newPrimitive, NotificationChain msgs)
  {
    Primitive oldPrimitive = primitive;
    primitive = newPrimitive;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__PRIMITIVE, oldPrimitive, newPrimitive);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitive(Primitive newPrimitive)
  {
    if (newPrimitive != primitive)
    {
      NotificationChain msgs = null;
      if (primitive != null)
        msgs = ((InternalEObject)primitive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.MAP_TYPE__PRIMITIVE, null, msgs);
      if (newPrimitive != null)
        msgs = ((InternalEObject)newPrimitive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.MAP_TYPE__PRIMITIVE, null, msgs);
      msgs = basicSetPrimitive(newPrimitive, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__PRIMITIVE, newPrimitive, newPrimitive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType getRecord()
  {
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecord(RecordType newRecord, NotificationChain msgs)
  {
    RecordType oldRecord = record;
    record = newRecord;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__RECORD, oldRecord, newRecord);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecord(RecordType newRecord)
  {
    if (newRecord != record)
    {
      NotificationChain msgs = null;
      if (record != null)
        msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.MAP_TYPE__RECORD, null, msgs);
      if (newRecord != null)
        msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.MAP_TYPE__RECORD, null, msgs);
      msgs = basicSetRecord(newRecord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__RECORD, newRecord, newRecord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType getRecordRef()
  {
    if (recordRef != null && recordRef.eIsProxy())
    {
      InternalEObject oldRecordRef = (InternalEObject)recordRef;
      recordRef = (RecordType)eResolveProxy(oldRecordRef);
      if (recordRef != oldRecordRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvroSchemaPackage.MAP_TYPE__RECORD_REF, oldRecordRef, recordRef));
      }
    }
    return recordRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType basicGetRecordRef()
  {
    return recordRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordRef(RecordType newRecordRef)
  {
    RecordType oldRecordRef = recordRef;
    recordRef = newRecordRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__RECORD_REF, oldRecordRef, recordRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType getEtype()
  {
    return etype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEtype(EnumType newEtype, NotificationChain msgs)
  {
    EnumType oldEtype = etype;
    etype = newEtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__ETYPE, oldEtype, newEtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEtype(EnumType newEtype)
  {
    if (newEtype != etype)
    {
      NotificationChain msgs = null;
      if (etype != null)
        msgs = ((InternalEObject)etype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.MAP_TYPE__ETYPE, null, msgs);
      if (newEtype != null)
        msgs = ((InternalEObject)newEtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.MAP_TYPE__ETYPE, null, msgs);
      msgs = basicSetEtype(newEtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__ETYPE, newEtype, newEtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType getAtype()
  {
    return atype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtype(ArrayType newAtype, NotificationChain msgs)
  {
    ArrayType oldAtype = atype;
    atype = newAtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__ATYPE, oldAtype, newAtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtype(ArrayType newAtype)
  {
    if (newAtype != atype)
    {
      NotificationChain msgs = null;
      if (atype != null)
        msgs = ((InternalEObject)atype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.MAP_TYPE__ATYPE, null, msgs);
      if (newAtype != null)
        msgs = ((InternalEObject)newAtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.MAP_TYPE__ATYPE, null, msgs);
      msgs = basicSetAtype(newAtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.MAP_TYPE__ATYPE, newAtype, newAtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AvroSchemaPackage.MAP_TYPE__PRIMITIVE:
        return basicSetPrimitive(null, msgs);
      case AvroSchemaPackage.MAP_TYPE__RECORD:
        return basicSetRecord(null, msgs);
      case AvroSchemaPackage.MAP_TYPE__ETYPE:
        return basicSetEtype(null, msgs);
      case AvroSchemaPackage.MAP_TYPE__ATYPE:
        return basicSetAtype(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AvroSchemaPackage.MAP_TYPE__PRIMITIVE:
        return getPrimitive();
      case AvroSchemaPackage.MAP_TYPE__RECORD:
        return getRecord();
      case AvroSchemaPackage.MAP_TYPE__RECORD_REF:
        if (resolve) return getRecordRef();
        return basicGetRecordRef();
      case AvroSchemaPackage.MAP_TYPE__ETYPE:
        return getEtype();
      case AvroSchemaPackage.MAP_TYPE__ATYPE:
        return getAtype();
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
      case AvroSchemaPackage.MAP_TYPE__PRIMITIVE:
        setPrimitive((Primitive)newValue);
        return;
      case AvroSchemaPackage.MAP_TYPE__RECORD:
        setRecord((RecordType)newValue);
        return;
      case AvroSchemaPackage.MAP_TYPE__RECORD_REF:
        setRecordRef((RecordType)newValue);
        return;
      case AvroSchemaPackage.MAP_TYPE__ETYPE:
        setEtype((EnumType)newValue);
        return;
      case AvroSchemaPackage.MAP_TYPE__ATYPE:
        setAtype((ArrayType)newValue);
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
      case AvroSchemaPackage.MAP_TYPE__PRIMITIVE:
        setPrimitive((Primitive)null);
        return;
      case AvroSchemaPackage.MAP_TYPE__RECORD:
        setRecord((RecordType)null);
        return;
      case AvroSchemaPackage.MAP_TYPE__RECORD_REF:
        setRecordRef((RecordType)null);
        return;
      case AvroSchemaPackage.MAP_TYPE__ETYPE:
        setEtype((EnumType)null);
        return;
      case AvroSchemaPackage.MAP_TYPE__ATYPE:
        setAtype((ArrayType)null);
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
      case AvroSchemaPackage.MAP_TYPE__PRIMITIVE:
        return primitive != null;
      case AvroSchemaPackage.MAP_TYPE__RECORD:
        return record != null;
      case AvroSchemaPackage.MAP_TYPE__RECORD_REF:
        return recordRef != null;
      case AvroSchemaPackage.MAP_TYPE__ETYPE:
        return etype != null;
      case AvroSchemaPackage.MAP_TYPE__ATYPE:
        return atype != null;
    }
    return super.eIsSet(featureID);
  }

} //MapTypeImpl
