/**
 */
package net.langleystudios.dsl.avroSchema.impl;

import net.langleystudios.dsl.avroSchema.ArrayType;
import net.langleystudios.dsl.avroSchema.AvroSchemaPackage;
import net.langleystudios.dsl.avroSchema.EnumType;
import net.langleystudios.dsl.avroSchema.Field;
import net.langleystudios.dsl.avroSchema.FixedType;
import net.langleystudios.dsl.avroSchema.MapType;
import net.langleystudios.dsl.avroSchema.Primitive;
import net.langleystudios.dsl.avroSchema.RecordType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl#getRecordRef <em>Record Ref</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl#getEtype <em>Etype</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl#getArray <em>Array</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl#getMap <em>Map</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.FieldImpl#getFixed <em>Fixed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected ArrayType array;

  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected MapType map;

  /**
   * The cached value of the '{@link #getFixed() <em>Fixed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixed()
   * @generated
   * @ordered
   */
  protected FixedType fixed;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
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
    return AvroSchemaPackage.Literals.FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__PRIMITIVE, oldPrimitive, newPrimitive);
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
        msgs = ((InternalEObject)primitive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__PRIMITIVE, null, msgs);
      if (newPrimitive != null)
        msgs = ((InternalEObject)newPrimitive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__PRIMITIVE, null, msgs);
      msgs = basicSetPrimitive(newPrimitive, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__PRIMITIVE, newPrimitive, newPrimitive));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__RECORD, oldRecord, newRecord);
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
        msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__RECORD, null, msgs);
      if (newRecord != null)
        msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__RECORD, null, msgs);
      msgs = basicSetRecord(newRecord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__RECORD, newRecord, newRecord));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AvroSchemaPackage.FIELD__RECORD_REF, oldRecordRef, recordRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__RECORD_REF, oldRecordRef, recordRef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__ETYPE, oldEtype, newEtype);
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
        msgs = ((InternalEObject)etype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__ETYPE, null, msgs);
      if (newEtype != null)
        msgs = ((InternalEObject)newEtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__ETYPE, null, msgs);
      msgs = basicSetEtype(newEtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__ETYPE, newEtype, newEtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray(ArrayType newArray, NotificationChain msgs)
  {
    ArrayType oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(ArrayType newArray)
  {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__ARRAY, newArray, newArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapType getMap()
  {
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMap(MapType newMap, NotificationChain msgs)
  {
    MapType oldMap = map;
    map = newMap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__MAP, oldMap, newMap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMap(MapType newMap)
  {
    if (newMap != map)
    {
      NotificationChain msgs = null;
      if (map != null)
        msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__MAP, null, msgs);
      if (newMap != null)
        msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__MAP, null, msgs);
      msgs = basicSetMap(newMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__MAP, newMap, newMap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixedType getFixed()
  {
    return fixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFixed(FixedType newFixed, NotificationChain msgs)
  {
    FixedType oldFixed = fixed;
    fixed = newFixed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__FIXED, oldFixed, newFixed);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixed(FixedType newFixed)
  {
    if (newFixed != fixed)
    {
      NotificationChain msgs = null;
      if (fixed != null)
        msgs = ((InternalEObject)fixed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__FIXED, null, msgs);
      if (newFixed != null)
        msgs = ((InternalEObject)newFixed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.FIELD__FIXED, null, msgs);
      msgs = basicSetFixed(newFixed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.FIELD__FIXED, newFixed, newFixed));
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
      case AvroSchemaPackage.FIELD__PRIMITIVE:
        return basicSetPrimitive(null, msgs);
      case AvroSchemaPackage.FIELD__RECORD:
        return basicSetRecord(null, msgs);
      case AvroSchemaPackage.FIELD__ETYPE:
        return basicSetEtype(null, msgs);
      case AvroSchemaPackage.FIELD__ARRAY:
        return basicSetArray(null, msgs);
      case AvroSchemaPackage.FIELD__MAP:
        return basicSetMap(null, msgs);
      case AvroSchemaPackage.FIELD__FIXED:
        return basicSetFixed(null, msgs);
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
      case AvroSchemaPackage.FIELD__NAME:
        return getName();
      case AvroSchemaPackage.FIELD__PRIMITIVE:
        return getPrimitive();
      case AvroSchemaPackage.FIELD__RECORD:
        return getRecord();
      case AvroSchemaPackage.FIELD__RECORD_REF:
        if (resolve) return getRecordRef();
        return basicGetRecordRef();
      case AvroSchemaPackage.FIELD__ETYPE:
        return getEtype();
      case AvroSchemaPackage.FIELD__ARRAY:
        return getArray();
      case AvroSchemaPackage.FIELD__MAP:
        return getMap();
      case AvroSchemaPackage.FIELD__FIXED:
        return getFixed();
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
      case AvroSchemaPackage.FIELD__NAME:
        setName((String)newValue);
        return;
      case AvroSchemaPackage.FIELD__PRIMITIVE:
        setPrimitive((Primitive)newValue);
        return;
      case AvroSchemaPackage.FIELD__RECORD:
        setRecord((RecordType)newValue);
        return;
      case AvroSchemaPackage.FIELD__RECORD_REF:
        setRecordRef((RecordType)newValue);
        return;
      case AvroSchemaPackage.FIELD__ETYPE:
        setEtype((EnumType)newValue);
        return;
      case AvroSchemaPackage.FIELD__ARRAY:
        setArray((ArrayType)newValue);
        return;
      case AvroSchemaPackage.FIELD__MAP:
        setMap((MapType)newValue);
        return;
      case AvroSchemaPackage.FIELD__FIXED:
        setFixed((FixedType)newValue);
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
      case AvroSchemaPackage.FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AvroSchemaPackage.FIELD__PRIMITIVE:
        setPrimitive((Primitive)null);
        return;
      case AvroSchemaPackage.FIELD__RECORD:
        setRecord((RecordType)null);
        return;
      case AvroSchemaPackage.FIELD__RECORD_REF:
        setRecordRef((RecordType)null);
        return;
      case AvroSchemaPackage.FIELD__ETYPE:
        setEtype((EnumType)null);
        return;
      case AvroSchemaPackage.FIELD__ARRAY:
        setArray((ArrayType)null);
        return;
      case AvroSchemaPackage.FIELD__MAP:
        setMap((MapType)null);
        return;
      case AvroSchemaPackage.FIELD__FIXED:
        setFixed((FixedType)null);
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
      case AvroSchemaPackage.FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AvroSchemaPackage.FIELD__PRIMITIVE:
        return primitive != null;
      case AvroSchemaPackage.FIELD__RECORD:
        return record != null;
      case AvroSchemaPackage.FIELD__RECORD_REF:
        return recordRef != null;
      case AvroSchemaPackage.FIELD__ETYPE:
        return etype != null;
      case AvroSchemaPackage.FIELD__ARRAY:
        return array != null;
      case AvroSchemaPackage.FIELD__MAP:
        return map != null;
      case AvroSchemaPackage.FIELD__FIXED:
        return fixed != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
