/**
 */
package at.impl;

import at.Airplane;
import at.Airport;
import at.AtPackage;
import at.CrewAllocation;
import at.Flight;
import at.Gate;
import at.Person;

import at.Runway;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link at.impl.FlightImpl#getDestinationRunway <em>Destination Runway</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDepartureRunway <em>Departure Runway</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getCode <em>Code</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link at.impl.FlightImpl#getAllocations <em>Allocations</em>}</li>
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
	 * The cached value of the '{@link #getDestinationRunway() <em>Destination Runway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationRunway()
	 * @generated
	 * @ordered
	 */
	protected Runway destinationRunway;

	/**
	 * The cached value of the '{@link #getDepartureRunway() <em>Departure Runway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureRunway()
	 * @generated
	 * @ordered
	 */
	protected Runway departureRunway;

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
	protected static final Date DEPARTURE_TIME_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2000-01-01T00:00:00.000+0100");

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
	protected static final Date ARRIVAL_TIME_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2000-01-01T00:00:00.000+0100");

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
	 * The cached value of the '{@link #getAllocations() <em>Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<CrewAllocation> allocations;

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
	public Runway getDestinationRunway() {
		if (destinationRunway != null && destinationRunway.eIsProxy()) {
			InternalEObject oldDestinationRunway = (InternalEObject)destinationRunway;
			destinationRunway = (Runway)eResolveProxy(oldDestinationRunway);
			if (destinationRunway != oldDestinationRunway) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtPackage.FLIGHT__DESTINATION_RUNWAY, oldDestinationRunway, destinationRunway));
			}
		}
		return destinationRunway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runway basicGetDestinationRunway() {
		return destinationRunway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationRunway(Runway newDestinationRunway) {
		Runway oldDestinationRunway = destinationRunway;
		destinationRunway = newDestinationRunway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DESTINATION_RUNWAY, oldDestinationRunway, destinationRunway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runway getDepartureRunway() {
		if (departureRunway != null && departureRunway.eIsProxy()) {
			InternalEObject oldDepartureRunway = (InternalEObject)departureRunway;
			departureRunway = (Runway)eResolveProxy(oldDepartureRunway);
			if (departureRunway != oldDepartureRunway) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtPackage.FLIGHT__DEPARTURE_RUNWAY, oldDepartureRunway, departureRunway));
			}
		}
		return departureRunway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runway basicGetDepartureRunway() {
		return departureRunway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureRunway(Runway newDepartureRunway) {
		Runway oldDepartureRunway = departureRunway;
		departureRunway = newDepartureRunway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.FLIGHT__DEPARTURE_RUNWAY, oldDepartureRunway, departureRunway));
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
	public EList<CrewAllocation> getAllocations() {
		if (allocations == null) {
			allocations = new EObjectContainmentWithInverseEList<CrewAllocation>(CrewAllocation.class, this, AtPackage.FLIGHT__ALLOCATIONS, AtPackage.CREW_ALLOCATION__FLIGHT);
		}
		return allocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtPackage.FLIGHT__ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocations()).basicAdd(otherEnd, msgs);
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
			case AtPackage.FLIGHT__ALLOCATIONS:
				return ((InternalEList<?>)getAllocations()).basicRemove(otherEnd, msgs);
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
			case AtPackage.FLIGHT__DESTINATION_RUNWAY:
				if (resolve) return getDestinationRunway();
				return basicGetDestinationRunway();
			case AtPackage.FLIGHT__DEPARTURE_RUNWAY:
				if (resolve) return getDepartureRunway();
				return basicGetDepartureRunway();
			case AtPackage.FLIGHT__PASSENGERS:
				return getPassengers();
			case AtPackage.FLIGHT__CODE:
				return getCode();
			case AtPackage.FLIGHT__DEPARTURE_TIME:
				return getDepartureTime();
			case AtPackage.FLIGHT__ARRIVAL_TIME:
				return getArrivalTime();
			case AtPackage.FLIGHT__ALLOCATIONS:
				return getAllocations();
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
			case AtPackage.FLIGHT__DESTINATION_RUNWAY:
				setDestinationRunway((Runway)newValue);
				return;
			case AtPackage.FLIGHT__DEPARTURE_RUNWAY:
				setDepartureRunway((Runway)newValue);
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
			case AtPackage.FLIGHT__ALLOCATIONS:
				getAllocations().clear();
				getAllocations().addAll((Collection<? extends CrewAllocation>)newValue);
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
			case AtPackage.FLIGHT__DESTINATION_RUNWAY:
				setDestinationRunway((Runway)null);
				return;
			case AtPackage.FLIGHT__DEPARTURE_RUNWAY:
				setDepartureRunway((Runway)null);
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
			case AtPackage.FLIGHT__ALLOCATIONS:
				getAllocations().clear();
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
			case AtPackage.FLIGHT__DESTINATION_RUNWAY:
				return destinationRunway != null;
			case AtPackage.FLIGHT__DEPARTURE_RUNWAY:
				return departureRunway != null;
			case AtPackage.FLIGHT__PASSENGERS:
				return passengers != null && !passengers.isEmpty();
			case AtPackage.FLIGHT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case AtPackage.FLIGHT__DEPARTURE_TIME:
				return DEPARTURE_TIME_EDEFAULT == null ? departureTime != null : !DEPARTURE_TIME_EDEFAULT.equals(departureTime);
			case AtPackage.FLIGHT__ARRIVAL_TIME:
				return ARRIVAL_TIME_EDEFAULT == null ? arrivalTime != null : !ARRIVAL_TIME_EDEFAULT.equals(arrivalTime);
			case AtPackage.FLIGHT__ALLOCATIONS:
				return allocations != null && !allocations.isEmpty();
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
	
	
	/**
	 * Number of minutes rounded down
	 * @param milis
	 * @return number of minutes rounded down
	 */
	private int convertMiliSecondsToMinutes(long milis) {
		return (int) (milis / 60000);
	}
	
	/**
	 * Measure if two departures are too close
	 * less than 2 minutes apart => DANGER
	 * between 2 and 8 minutes => MINOR WARNING
	 * between 8 and 15 minutes => INFO
	 * more than 15 minutes => OKAY
	 */
	private int getDepartureViolation(Date depTime, Date otherDepTime) {
		long milisecsBetweenDepartures = Math.abs(depTime.getTime() - otherDepTime.getTime());
		int minutesBetweenDepartures = convertMiliSecondsToMinutes(milisecsBetweenDepartures);
		
		if (minutesBetweenDepartures < 2) {
			return 3;
		} else if (minutesBetweenDepartures < 8) {
			return 2;
		} else if (minutesBetweenDepartures < 15) {
			return 1;
		}
		
		// No danger
		return 0;
	}
	
	/**
	 * Validate if some other flight will be using the same runway at the same time.
	 * @param otherFlight
	 * @return severity of traffic, 0 is no traffic and 3 is highly dangerous
	 */
	private int validateRunwayTrafficOnDeparture(Flight otherFlight) {
		// Difference between this.dep and otherFlight.dep
		int depDelta = 0;
		// Difference between this.dep and otherFlight.arr
		int arrDelta = 0;
		
		if (this.getDepartureRunway() == null || this.getDepartureTime() == null) {
			return 0;
		}
		
		if (otherFlight.getDepartureRunway() != null || otherFlight.getDepartureTime() != null) {
			if (this.getDepartureRunway().equals(otherFlight.getDepartureRunway())) {
				depDelta = getDepartureViolation(this.getDepartureTime(), otherFlight.getDepartureTime());
			}			
		}
		
		if (otherFlight.getDestinationRunway() != null || otherFlight.getArrivalTime() != null) {
			if (this.getDepartureRunway().equals(otherFlight.getDestinationRunway())) {
				arrDelta = getDepartureViolation(this.getDepartureTime(), otherFlight.getArrivalTime());
			}			
		}
		
		return Math.max(depDelta, arrDelta);
	}
	
	/**
	 * Validate if some other flight will be using the same runway at the same time.
	 * @param otherFlight
	 * @return severity of traffic, 0 is no traffic and 3 is highly dangerous
	 */
	private int validateRunwayTrafficOnArrival(Flight otherFlight) {
		// Difference between this.arrival and otherFlight.dep
		int depDelta = 0;
		// Difference between this.arrival and otherFlight.arr
		int arrDelta = 0;
		
		if (this.getDestinationRunway() == null || this.getArrivalTime() == null) {
			return 0;
		}
		
		if (otherFlight.getDepartureRunway() != null || otherFlight.getDepartureTime() != null) {
			if (this.getDestinationRunway().equals(otherFlight.getDepartureRunway())) {
				depDelta = getDepartureViolation(this.getArrivalTime(), otherFlight.getDepartureTime());
			}			
		}
		
		if (otherFlight.getDestinationRunway() != null || otherFlight.getArrivalTime() != null) {
			if (this.getDestinationRunway().equals(otherFlight.getDestinationRunway())) {
				arrDelta = getDepartureViolation(this.getArrivalTime(), otherFlight.getArrivalTime());
			}			
		}
		
		return Math.max(depDelta, arrDelta);
	}
	
	
	/**
	 * Validate if some other flight will be using the same runway at the same time.
	 */
	public int validateRunwayTraffic(Flight otherFlight) {
		return Math.max(
				validateRunwayTrafficOnDeparture(otherFlight),
				validateRunwayTrafficOnArrival(otherFlight)
		);
	}	
	
	public boolean hasDepartureTime() {
		return departureTime != null;
	}
	
	public boolean hasArrivalTime() {
		return arrivalTime != null;
	}
	
	public boolean hasDepartureRunway() {
		return departureRunway != null;
	}
	
	public boolean hasDestinationRunway() {
		return destinationRunway != null;
	}
	

} //FlightImpl
