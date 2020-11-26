/**
 */
package at.impl;

import at.AtPackage;
import at.CrewAllocation;
import at.Flight;
import at.Person;

import at.Role;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crew Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.impl.CrewAllocationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link at.impl.CrewAllocationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link at.impl.CrewAllocationImpl#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrewAllocationImpl extends MinimalEObjectImpl.Container implements CrewAllocation {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.PILOT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected Person member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrewAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtPackage.Literals.CREW_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.CREW_ALLOCATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getMember() {
		if (member != null && member.eIsProxy()) {
			InternalEObject oldMember = (InternalEObject)member;
			member = (Person)eResolveProxy(oldMember);
			if (member != oldMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtPackage.CREW_ALLOCATION__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(Person newMember, NotificationChain msgs) {
		Person oldMember = member;
		member = newMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtPackage.CREW_ALLOCATION__MEMBER, oldMember, newMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(Person newMember) {
		if (newMember != member) {
			NotificationChain msgs = null;
			if (member != null)
				msgs = ((InternalEObject)member).eInverseRemove(this, AtPackage.PERSON__ALLOCATIONS, Person.class, msgs);
			if (newMember != null)
				msgs = ((InternalEObject)newMember).eInverseAdd(this, AtPackage.PERSON__ALLOCATIONS, Person.class, msgs);
			msgs = basicSetMember(newMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.CREW_ALLOCATION__MEMBER, newMember, newMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flight getFlight() {
		if (eContainerFeatureID() != AtPackage.CREW_ALLOCATION__FLIGHT) return null;
		return (Flight)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlight(Flight newFlight, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlight, AtPackage.CREW_ALLOCATION__FLIGHT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlight(Flight newFlight) {
		if (newFlight != eInternalContainer() || (eContainerFeatureID() != AtPackage.CREW_ALLOCATION__FLIGHT && newFlight != null)) {
			if (EcoreUtil.isAncestor(this, newFlight))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlight != null)
				msgs = ((InternalEObject)newFlight).eInverseAdd(this, AtPackage.FLIGHT__ALLOCATIONS, Flight.class, msgs);
			msgs = basicSetFlight(newFlight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.CREW_ALLOCATION__FLIGHT, newFlight, newFlight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtPackage.CREW_ALLOCATION__MEMBER:
				if (member != null)
					msgs = ((InternalEObject)member).eInverseRemove(this, AtPackage.PERSON__ALLOCATIONS, Person.class, msgs);
				return basicSetMember((Person)otherEnd, msgs);
			case AtPackage.CREW_ALLOCATION__FLIGHT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlight((Flight)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtPackage.CREW_ALLOCATION__MEMBER:
				return basicSetMember(null, msgs);
			case AtPackage.CREW_ALLOCATION__FLIGHT:
				return basicSetFlight(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AtPackage.CREW_ALLOCATION__FLIGHT:
				return eInternalContainer().eInverseRemove(this, AtPackage.FLIGHT__ALLOCATIONS, Flight.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtPackage.CREW_ALLOCATION__ROLE:
				return getRole();
			case AtPackage.CREW_ALLOCATION__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
			case AtPackage.CREW_ALLOCATION__FLIGHT:
				return getFlight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AtPackage.CREW_ALLOCATION__ROLE:
				setRole((Role)newValue);
				return;
			case AtPackage.CREW_ALLOCATION__MEMBER:
				setMember((Person)newValue);
				return;
			case AtPackage.CREW_ALLOCATION__FLIGHT:
				setFlight((Flight)newValue);
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
			case AtPackage.CREW_ALLOCATION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case AtPackage.CREW_ALLOCATION__MEMBER:
				setMember((Person)null);
				return;
			case AtPackage.CREW_ALLOCATION__FLIGHT:
				setFlight((Flight)null);
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
			case AtPackage.CREW_ALLOCATION__ROLE:
				return role != ROLE_EDEFAULT;
			case AtPackage.CREW_ALLOCATION__MEMBER:
				return member != null;
			case AtPackage.CREW_ALLOCATION__FLIGHT:
				return getFlight() != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //CrewAllocationImpl
