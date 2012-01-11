/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.ros.model.ros.Publisher;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.StandardMessageType;
import org.ros.model.ros.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ros.model.ros.impl.PublisherImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PublisherImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PublisherImpl#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PublisherImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PublisherImpl#isLatch <em>Latch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublisherImpl extends EObjectImpl implements Publisher {
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
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Topic topic;

	/**
	 * The default value of the '{@link #getMsg() <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg()
	 * @generated
	 * @ordered
	 */
	protected static final StandardMessageType MSG_EDEFAULT = StandardMessageType.BOOL;

	/**
	 * The cached value of the '{@link #getMsg() <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg()
	 * @generated
	 * @ordered
	 */
	protected StandardMessageType msg = MSG_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected int queueSize = QUEUE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLatch() <em>Latch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LATCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLatch() <em>Latch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLatch()
	 * @generated
	 * @ordered
	 */
	protected boolean latch = LATCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPackage.Literals.PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PUBLISHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic() {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject)topic;
			topic = (Topic)eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosPackage.PUBLISHER__TOPIC, oldTopic, topic));
			}
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(Topic newTopic) {
		Topic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PUBLISHER__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardMessageType getMsg() {
		return msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsg(StandardMessageType newMsg) {
		StandardMessageType oldMsg = msg;
		msg = newMsg == null ? MSG_EDEFAULT : newMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PUBLISHER__MSG, oldMsg, msg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSize(int newQueueSize) {
		int oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PUBLISHER__QUEUE_SIZE, oldQueueSize, queueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLatch() {
		return latch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatch(boolean newLatch) {
		boolean oldLatch = latch;
		latch = newLatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PUBLISHER__LATCH, oldLatch, latch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RosPackage.PUBLISHER__NAME:
				return getName();
			case RosPackage.PUBLISHER__TOPIC:
				if (resolve) return getTopic();
				return basicGetTopic();
			case RosPackage.PUBLISHER__MSG:
				return getMsg();
			case RosPackage.PUBLISHER__QUEUE_SIZE:
				return getQueueSize();
			case RosPackage.PUBLISHER__LATCH:
				return isLatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RosPackage.PUBLISHER__NAME:
				setName((String)newValue);
				return;
			case RosPackage.PUBLISHER__TOPIC:
				setTopic((Topic)newValue);
				return;
			case RosPackage.PUBLISHER__MSG:
				setMsg((StandardMessageType)newValue);
				return;
			case RosPackage.PUBLISHER__QUEUE_SIZE:
				setQueueSize((Integer)newValue);
				return;
			case RosPackage.PUBLISHER__LATCH:
				setLatch((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RosPackage.PUBLISHER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosPackage.PUBLISHER__TOPIC:
				setTopic((Topic)null);
				return;
			case RosPackage.PUBLISHER__MSG:
				setMsg(MSG_EDEFAULT);
				return;
			case RosPackage.PUBLISHER__QUEUE_SIZE:
				setQueueSize(QUEUE_SIZE_EDEFAULT);
				return;
			case RosPackage.PUBLISHER__LATCH:
				setLatch(LATCH_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RosPackage.PUBLISHER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosPackage.PUBLISHER__TOPIC:
				return topic != null;
			case RosPackage.PUBLISHER__MSG:
				return msg != MSG_EDEFAULT;
			case RosPackage.PUBLISHER__QUEUE_SIZE:
				return queueSize != QUEUE_SIZE_EDEFAULT;
			case RosPackage.PUBLISHER__LATCH:
				return latch != LATCH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", msg: ");
		result.append(msg);
		result.append(", queueSize: ");
		result.append(queueSize);
		result.append(", latch: ");
		result.append(latch);
		result.append(')');
		return result.toString();
	}

} //PublisherImpl