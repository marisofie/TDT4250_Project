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
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.impl.FlightImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getAirplane <em>Airplane</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDepartureAirport <em>Departure Airport</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDestinationAirport <em>Destination Airport</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDepartureGate <em>Departure Gate</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDestinationGate <em>Destination Gate</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getCrew <em>Crew</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getCode <em>Code</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getArrivalTime <em>Arrival Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightImpl extends MinimalEObjectImpl.Container implements Flight {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAirplane() <em>Airplane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirplane()
	 * @generated
	 * @ordered
	 */
	protected Airplane airplane;

	/**
	 * The cached value of the '{@link #getDepartureAirport() <em>Departure Airport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureAirport()
	 * @generated
	 * @ordered
	 */
	protected Airport departureAirport;

	/**
	 * The cached value of the '{@link #getDestinationAirport() <em>Destination Airport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAirport()
	 * @generated
	 * @ordered
	 */
	protected Airport destinationAirport;

	/**
	 * The cached value of the '{@link #getDepartureGate() <em>Departure Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureGate()
	 * @generated
	 * @ordered
	 */
	protected Gate departureGate;

	/**
	 * The cached value of the '{@link #getDestinationGate() <em>Destination Gate</em>}' reference.
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
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> passengers;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartureTime() <em>Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEPARTURE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartureTime() <em>Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected Date departureTime = DEPARTURE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ARRIVAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected Date arrivalTime = ARRIVAL_TIME_EDEFAULT;

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
	 * @generated NOT
	 */
	public int getDuration() {
		// Ensure that you remove @generated or mark it @generated NOT
		
		Date departure = this.getDepartureTime();
		Date arrival = this.getArrivalTime();
		
		long diff = arrival.getTime() - departure.getTime();
		
		diff = diff / (1000*60); // From ms to minutes
		
		return Math.toIntExact(diff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airplane getAirplane() {
		if (airplane != null && airplane.eIsProxy()) {
			InternalEObject oldAirplane = (InternalEObject)airplane;
			airplane = (Airplane)eResolveProxy(oldAirplane);
			if (airplane != oldAirplane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtPackage.FLIGHT__AIRPLANE, oldAirplane, airplane));
			}
		}
		return airplane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airplane basicGetAirplane() {
		return airplane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirplane(Airplane newAirplane) {
		Airplane oldAirplane = airplane;
		airplane = newAirplane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__AIRPLANE, oldAirplane, airplane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airport getDepartureAirport() {
		if (departureAirport != null && departureAirport.eIsProxy()) {
			InternalEObject oldDepartureAirport = (InternalEObject)departureAirport;
			departureAirport = (Airport)eResolveProxy(oldDepartureAirport);
			if (departureAirport != oldDepartureAirport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtPackage.FLIGHT__DEPARTURE_AIRPORT, oldDepartureAirport, departureAirport));
			}
		}
		return departureAirport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airport basicGetDepartureAirport() {
		return departureAirport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureAirport(Airport newDepartureAirport) {
		Airport oldDepartureAirport = departureAirport;
		departureAirport = newDepartureAirport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DEPARTURE_AIRPORT, oldDepartureAirport, departureAirport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airport getDestinationAirport() {
		if (destinationAirport != null && destinationAirport.eIsProxy()) {
			InternalEObject oldDestinationAirport = (InternalEObject)destinationAirport;
			destinationAirport = (Airport)eResolveProxy(oldDestinationAirport);
			if (destinationAirport != oldDestinationAirport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtPackage.FLIGHT__DESTINATION_AIRPORT, oldDestinationAirport, destinationAirport));
			}
		}
		return destinationAirport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airport basicGetDestinationAirport() {
		return destinationAirport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationAirport(Airport newDestinationAirport) {
		Airport oldDestinationAirport = destinationAirport;
		destinationAirport = newDestinationAirport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DESTINATION_AIRPORT, oldDestinationAirport, destinationAirport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getDepartureGate() {
		if (departureGate != null && departureGate.eIsProxy()) {
			InternalEObject oldDepartureGate = (InternalEObject)departureGate;
			departureGate = (Gate)eResolveProxy(oldDepartureGate);
			if (departureGate != oldDepartureGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtPackage.FLIGHT__DEPARTURE_GATE, oldDepartureGate, departureGate));
			}
		}
		return departureGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetDepartureGate() {
		return departureGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureGate(Gate newDepartureGate) {
		Gate oldDepartureGate = departureGate;
		departureGate = newDepartureGate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DEPARTURE_GATE, oldDepartureGate, departureGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getDestinationGate() {
		if (destinationGate != null && destinationGate.eIsProxy()) {
			InternalEObject oldDestinationGate = (InternalEObject)destinationGate;
			destinationGate = (Gate)eResolveProxy(oldDestinationGate);
			if (destinationGate != oldDestinationGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtPackage.FLIGHT__DESTINATION_GATE, oldDestinationGate, destinationGate));
			}
		}
		return destinationGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetDestinationGate() {
		return destinationGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationGate(Gate newDestinationGate) {
		Gate oldDestinationGate = destinationGate;
		destinationGate = newDestinationGate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DESTINATION_GATE, oldDestinationGate, destinationGate));
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
			passengers = new EObjectResolvingEList<Person>(Person.class, this, AtPackage.FLIGHT__PASSENGERS);
		}
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDepartureTime() {
		return departureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureTime(Date newDepartureTime) {
		Date oldDepartureTime = departureTime;
		departureTime = newDepartureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DEPARTURE_TIME, oldDepartureTime, departureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalTime(Date newArrivalTime) {
		Date oldArrivalTime = arrivalTime;
		arrivalTime = newArrivalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__ARRIVAL_TIME, oldArrivalTime, arrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtPackage.FLIGHT__CREW:
				return basicSetCrew(null, msgs);
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
			case AtPackage.FLIGHT__DURATION:
				return getDuration();
			case AtPackage.FLIGHT__AIRPLANE:
				if (resolve) return getAirplane();
				return basicGetAirplane();
			case AtPackage.FLIGHT__DEPARTURE_AIRPORT:
				if (resolve) return getDepartureAirport();
				return basicGetDepartureAirport();
			case AtPackage.FLIGHT__DESTINATION_AIRPORT:
				if (resolve) return getDestinationAirport();
				return basicGetDestinationAirport();
			case AtPackage.FLIGHT__DEPARTURE_GATE:
				if (resolve) return getDepartureGate();
				return basicGetDepartureGate();
			case AtPackage.FLIGHT__DESTINATION_GATE:
				if (resolve) return getDestinationGate();
				return basicGetDestinationGate();
			case AtPackage.FLIGHT__CREW:
				return getCrew();
			case AtPackage.FLIGHT__PASSENGERS:
				return getPassengers();
			case AtPackage.FLIGHT__CODE:
				return getCode();
			case AtPackage.FLIGHT__DEPARTURE_TIME:
				return getDepartureTime();
			case AtPackage.FLIGHT__ARRIVAL_TIME:
				return getArrivalTime();
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
			case AtPackage.FLIGHT__AIRPLANE:
				setAirplane((Airplane)newValue);
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
			case AtPackage.FLIGHT__CODE:
				setCode((String)newValue);
				return;
			case AtPackage.FLIGHT__DEPARTURE_TIME:
				setDepartureTime((Date)newValue);
				return;
			case AtPackage.FLIGHT__ARRIVAL_TIME:
				setArrivalTime((Date)newValue);
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
			case AtPackage.FLIGHT__AIRPLANE:
				setAirplane((Airplane)null);
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
			case AtPackage.FLIGHT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case AtPackage.FLIGHT__DEPARTURE_TIME:
				setDepartureTime(DEPARTURE_TIME_EDEFAULT);
				return;
			case AtPackage.FLIGHT__ARRIVAL_TIME:
				setArrivalTime(ARRIVAL_TIME_EDEFAULT);
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
			case AtPackage.FLIGHT__DURATION:
				return getDuration() != DURATION_EDEFAULT;
			case AtPackage.FLIGHT__AIRPLANE:
				return airplane != null;
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
			case AtPackage.FLIGHT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case AtPackage.FLIGHT__DEPARTURE_TIME:
				return DEPARTURE_TIME_EDEFAULT == null ? departureTime != null : !DEPARTURE_TIME_EDEFAULT.equals(departureTime);
			case AtPackage.FLIGHT__ARRIVAL_TIME:
				return ARRIVAL_TIME_EDEFAULT == null ? arrivalTime != null : !ARRIVAL_TIME_EDEFAULT.equals(arrivalTime);
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
		result.append(" (code: ");
		result.append(code);
		result.append(", departureTime: ");
		result.append(departureTime);
		result.append(", arrivalTime: ");
		result.append(arrivalTime);
		result.append(')');
		return result.toString();
	}

} //FlightImpl
