/**
 */
package at.impl;

import at.Airplane;
import at.Airport;
import at.AtPackage;
import at.Crew;
import at.Flight;
import at.Gate;
import at.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.impl.FlightImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDepartureAirport <em>Departure Airport</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDestinationAirport <em>Destination Airport</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDepartureGate <em>Departure Gate</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDestinationGate <em>Destination Gate</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getCrew <em>Crew</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getPassengers <em>Passengers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightImpl extends MinimalEObjectImpl.Container implements Flight {
	/**
	 * The cached value of the '{@link #getPlane() <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlane()
	 * @generated
	 * @ordered
	 */
	protected Airplane plane;

	/**
	 * The cached value of the '{@link #getDepartureAirport() <em>Departure Airport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureAirport()
	 * @generated
	 * @ordered
	 */
	protected Airport departureAirport;

	/**
	 * The cached value of the '{@link #getDestinationAirport() <em>Destination Airport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAirport()
	 * @generated
	 * @ordered
	 */
	protected Airport destinationAirport;

	/**
	 * The cached value of the '{@link #getDepartureGate() <em>Departure Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureGate()
	 * @generated
	 * @ordered
	 */
	protected Gate departureGate;

	/**
	 * The cached value of the '{@link #getDestinationGate() <em>Destination Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationGate()
	 * @generated
	 * @ordered
	 */
	protected Gate destinationGate;

	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> passengers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtPackage.Literals.FLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airplane getPlane() {
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlane(Airplane newPlane, NotificationChain msgs) {
		Airplane oldPlane = plane;
		plane = newPlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__PLANE, oldPlane, newPlane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlane(Airplane newPlane) {
		if (newPlane != plane) {
			NotificationChain msgs = null;
			if (plane != null)
				msgs = ((InternalEObject)plane).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__PLANE, null, msgs);
			if (newPlane != null)
				msgs = ((InternalEObject)newPlane).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__PLANE, null, msgs);
			msgs = basicSetPlane(newPlane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__PLANE, newPlane, newPlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airport getDepartureAirport() {
		return departureAirport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartureAirport(Airport newDepartureAirport, NotificationChain msgs) {
		Airport oldDepartureAirport = departureAirport;
		departureAirport = newDepartureAirport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DEPARTURE_AIRPORT, oldDepartureAirport, newDepartureAirport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureAirport(Airport newDepartureAirport) {
		if (newDepartureAirport != departureAirport) {
			NotificationChain msgs = null;
			if (departureAirport != null)
				msgs = ((InternalEObject)departureAirport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__DEPARTURE_AIRPORT, null, msgs);
			if (newDepartureAirport != null)
				msgs = ((InternalEObject)newDepartureAirport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__DEPARTURE_AIRPORT, null, msgs);
			msgs = basicSetDepartureAirport(newDepartureAirport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DEPARTURE_AIRPORT, newDepartureAirport, newDepartureAirport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationAirport(Airport newDestinationAirport, NotificationChain msgs) {
		Airport oldDestinationAirport = destinationAirport;
		destinationAirport = newDestinationAirport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DESTINATION_AIRPORT, oldDestinationAirport, newDestinationAirport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationAirport(Airport newDestinationAirport) {
		if (newDestinationAirport != destinationAirport) {
			NotificationChain msgs = null;
			if (destinationAirport != null)
				msgs = ((InternalEObject)destinationAirport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__DESTINATION_AIRPORT, null, msgs);
			if (newDestinationAirport != null)
				msgs = ((InternalEObject)newDestinationAirport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__DESTINATION_AIRPORT, null, msgs);
			msgs = basicSetDestinationAirport(newDestinationAirport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DESTINATION_AIRPORT, newDestinationAirport, newDestinationAirport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getDepartureGate() {
		return departureGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartureGate(Gate newDepartureGate, NotificationChain msgs) {
		Gate oldDepartureGate = departureGate;
		departureGate = newDepartureGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DEPARTURE_GATE, oldDepartureGate, newDepartureGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureGate(Gate newDepartureGate) {
		if (newDepartureGate != departureGate) {
			NotificationChain msgs = null;
			if (departureGate != null)
				msgs = ((InternalEObject)departureGate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__DEPARTURE_GATE, null, msgs);
			if (newDepartureGate != null)
				msgs = ((InternalEObject)newDepartureGate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__DEPARTURE_GATE, null, msgs);
			msgs = basicSetDepartureGate(newDepartureGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DEPARTURE_GATE, newDepartureGate, newDepartureGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getDestinationGate() {
		return destinationGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationGate(Gate newDestinationGate, NotificationChain msgs) {
		Gate oldDestinationGate = destinationGate;
		destinationGate = newDestinationGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DESTINATION_GATE, oldDestinationGate, newDestinationGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationGate(Gate newDestinationGate) {
		if (newDestinationGate != destinationGate) {
			NotificationChain msgs = null;
			if (destinationGate != null)
				msgs = ((InternalEObject)destinationGate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__DESTINATION_GATE, null, msgs);
			if (newDestinationGate != null)
				msgs = ((InternalEObject)newDestinationGate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__DESTINATION_GATE, null, msgs);
			msgs = basicSetDestinationGate(newDestinationGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DESTINATION_GATE, newDestinationGate, newDestinationGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew getCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__CREW, oldCrew, newCrew);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__CREW, null, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtPackage.FLIGHT__CREW, null, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__CREW, newCrew, newCrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPassengers() {
		if (passengers == null) {
			passengers = new EObjectContainmentEList<Person>(Person.class, this, AtPackage.FLIGHT__PASSENGERS);
		}
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtPackage.FLIGHT__PLANE:
				return basicSetPlane(null, msgs);
			case AtPackage.FLIGHT__DEPARTURE_AIRPORT:
				return basicSetDepartureAirport(null, msgs);
			case AtPackage.FLIGHT__DESTINATION_AIRPORT:
				return basicSetDestinationAirport(null, msgs);
			case AtPackage.FLIGHT__DEPARTURE_GATE:
				return basicSetDepartureGate(null, msgs);
			case AtPackage.FLIGHT__DESTINATION_GATE:
				return basicSetDestinationGate(null, msgs);
			case AtPackage.FLIGHT__CREW:
				return basicSetCrew(null, msgs);
			case AtPackage.FLIGHT__PASSENGERS:
				return ((InternalEList<?>)getPassengers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtPackage.FLIGHT__PLANE:
				return getPlane();
			case AtPackage.FLIGHT__DEPARTURE_AIRPORT:
				return getDepartureAirport();
			case AtPackage.FLIGHT__DESTINATION_AIRPORT:
				return getDestinationAirport();
			case AtPackage.FLIGHT__DEPARTURE_GATE:
				return getDepartureGate();
			case AtPackage.FLIGHT__DESTINATION_GATE:
				return getDestinationGate();
			case AtPackage.FLIGHT__CREW:
				return getCrew();
			case AtPackage.FLIGHT__PASSENGERS:
				return getPassengers();
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
			case AtPackage.FLIGHT__PLANE:
				setPlane((Airplane)newValue);
				return;
			case AtPackage.FLIGHT__DEPARTURE_AIRPORT:
				setDepartureAirport((Airport)newValue);
				return;
			case AtPackage.FLIGHT__DESTINATION_AIRPORT:
				setDestinationAirport((Airport)newValue);
				return;
			case AtPackage.FLIGHT__DEPARTURE_GATE:
				setDepartureGate((Gate)newValue);
				return;
			case AtPackage.FLIGHT__DESTINATION_GATE:
				setDestinationGate((Gate)newValue);
				return;
			case AtPackage.FLIGHT__CREW:
				setCrew((Crew)newValue);
				return;
			case AtPackage.FLIGHT__PASSENGERS:
				getPassengers().clear();
				getPassengers().addAll((Collection<? extends Person>)newValue);
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
			case AtPackage.FLIGHT__PLANE:
				setPlane((Airplane)null);
				return;
			case AtPackage.FLIGHT__DEPARTURE_AIRPORT:
				setDepartureAirport((Airport)null);
				return;
			case AtPackage.FLIGHT__DESTINATION_AIRPORT:
				setDestinationAirport((Airport)null);
				return;
			case AtPackage.FLIGHT__DEPARTURE_GATE:
				setDepartureGate((Gate)null);
				return;
			case AtPackage.FLIGHT__DESTINATION_GATE:
				setDestinationGate((Gate)null);
				return;
			case AtPackage.FLIGHT__CREW:
				setCrew((Crew)null);
				return;
			case AtPackage.FLIGHT__PASSENGERS:
				getPassengers().clear();
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
			case AtPackage.FLIGHT__PLANE:
				return plane != null;
			case AtPackage.FLIGHT__DEPARTURE_AIRPORT:
				return departureAirport != null;
			case AtPackage.FLIGHT__DESTINATION_AIRPORT:
				return destinationAirport != null;
			case AtPackage.FLIGHT__DEPARTURE_GATE:
				return departureGate != null;
			case AtPackage.FLIGHT__DESTINATION_GATE:
				return destinationGate != null;
			case AtPackage.FLIGHT__CREW:
				return crew != null;
			case AtPackage.FLIGHT__PASSENGERS:
				return passengers != null && !passengers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlightImpl
