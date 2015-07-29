/**
 */
package net.langleystudios.dsl.avroSchema.impl;

import net.langleystudios.dsl.avroSchema.AvroSchemaPackage;
import net.langleystudios.dsl.avroSchema.FieldList;
import net.langleystudios.dsl.avroSchema.Record;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.RecordImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.RecordImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.langleystudios.dsl.avroSchema.impl.RecordImpl#getFieldList <em>Field List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordImpl extends UnionMemberImpl implements Record
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
   * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected String namespace = NAMESPACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFieldList() <em>Field List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldList()
   * @generated
   * @ordered
   */
  protected FieldList fieldList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordImpl()
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
    return AvroSchemaPackage.Literals.RECORD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.RECORD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(String newNamespace)
  {
    String oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.RECORD__NAMESPACE, oldNamespace, namespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldList getFieldList()
  {
    return fieldList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldList(FieldList newFieldList, NotificationChain msgs)
  {
    FieldList oldFieldList = fieldList;
    fieldList = newFieldList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.RECORD__FIELD_LIST, oldFieldList, newFieldList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldList(FieldList newFieldList)
  {
    if (newFieldList != fieldList)
    {
      NotificationChain msgs = null;
      if (fieldList != null)
        msgs = ((InternalEObject)fieldList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.RECORD__FIELD_LIST, null, msgs);
      if (newFieldList != null)
        msgs = ((InternalEObject)newFieldList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvroSchemaPackage.RECORD__FIELD_LIST, null, msgs);
      msgs = basicSetFieldList(newFieldList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AvroSchemaPackage.RECORD__FIELD_LIST, newFieldList, newFieldList));
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
      case AvroSchemaPackage.RECORD__FIELD_LIST:
        return basicSetFieldList(null, msgs);
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
      case AvroSchemaPackage.RECORD__NAME:
        return getName();
      case AvroSchemaPackage.RECORD__NAMESPACE:
        return getNamespace();
      case AvroSchemaPackage.RECORD__FIELD_LIST:
        return getFieldList();
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
      case AvroSchemaPackage.RECORD__NAME:
        setName((String)newValue);
        return;
      case AvroSchemaPackage.RECORD__NAMESPACE:
        setNamespace((String)newValue);
        return;
      case AvroSchemaPackage.RECORD__FIELD_LIST:
        setFieldList((FieldList)newValue);
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
      case AvroSchemaPackage.RECORD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AvroSchemaPackage.RECORD__NAMESPACE:
        setNamespace(NAMESPACE_EDEFAULT);
        return;
      case AvroSchemaPackage.RECORD__FIELD_LIST:
        setFieldList((FieldList)null);
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
      case AvroSchemaPackage.RECORD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AvroSchemaPackage.RECORD__NAMESPACE:
        return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
      case AvroSchemaPackage.RECORD__FIELD_LIST:
        return fieldList != null;
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
    result.append(", namespace: ");
    result.append(namespace);
    result.append(')');
    return result.toString();
  }

} //RecordImpl
