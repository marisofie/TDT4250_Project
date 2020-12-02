/**
 */
package at.impl;

import at.Airline;
import at.Airplane;
import at.Airport;
import at.AtPackage;
import at.Flight;

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.impl.AirlineImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.impl.AirlineImpl#getFlights <em>Flights</em>}</li>
 *   <li>{@link at.impl.AirlineImpl#getAirplanes <em>Airplanes</em>}</li>
 *   <li>{@link at.impl.AirlineImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link at.impl.AirlineImpl#getAirports <em>Airports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirlineImpl extends MinimalEObjectImpl.Container implements Airline {
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
	 * The cached value of the '{@link #getFlights() <em>Flights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlights()
	 * @generated
	 * @ordered
	 */
	protected EList<Flight> flights;

	/**
	 * The cached value of the '{@link #getAirplanes() <em>Airplanes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirplanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Airplane> airplanes;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> employees;

	/**
	 * The cached value of the '{@link #getAirports() <em>Airports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirports()
	 * @generated
	 * @ordered
	 */
	protected EList<Airport> airports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtPackage.Literals.AIRLINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtPackage.AIRLINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flight> getFlights() {
		if (flights == null) {
			flights = new EObjectContainmentEList<Flight>(Flight.class, this, AtPackage.AIRLINE__FLIGHTS);
		}
		return flights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Airplane> getAirplanes() {
		if (airplanes == null) {
			airplanes = new EObjectContainmentEList<Airplane>(Airplane.class, this, AtPackage.AIRLINE__AIRPLANES);
		}
		return airplanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentWithInverseEList<Person>(Person.class, this, AtPackage.AIRLINE__EMPLOYEES, AtPackage.PERSON__EMPLOYER);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Airport> getAirports() {
		if (airports == null) {
			airports = new EObjectResolvingEList<Airport>(Airport.class, this, AtPackage.AIRLINE__AIRPORTS);
		}
		return airports;
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
			case AtPackage.AIRLINE__EMPLOYEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployees()).basicAdd(otherEnd, msgs);
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
			case AtPackage.AIRLINE__FLIGHTS:
				return ((InternalEList<?>)getFlights()).basicRemove(otherEnd, msgs);
			case AtPackage.AIRLINE__AIRPLANES:
				return ((InternalEList<?>)getAirplanes()).basicRemove(otherEnd, msgs);
			case AtPackage.AIRLINE__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
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
			case AtPackage.AIRLINE__NAME:
				return getName();
			case AtPackage.AIRLINE__FLIGHTS:
				return getFlights();
			case AtPackage.AIRLINE__AIRPLANES:
				return getAirplanes();
			case AtPackage.AIRLINE__EMPLOYEES:
				return getEmployees();
			case AtPackage.AIRLINE__AIRPORTS:
				return getAirports();
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
			case AtPackage.AIRLINE__NAME:
				setName((String)newValue);
				return;
			case AtPackage.AIRLINE__FLIGHTS:
				getFlights().clear();
				getFlights().addAll((Collection<? extends Flight>)newValue);
				return;
			case AtPackage.AIRLINE__AIRPLANES:
				getAirplanes().clear();
				getAirplanes().addAll((Collection<? extends Airplane>)newValue);
				return;
			case AtPackage.AIRLINE__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Person>)newValue);
				return;
			case AtPackage.AIRLINE__AIRPORTS:
				getAirports().clear();
				getAirports().addAll((Collection<? extends Airport>)newValue);
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
			case AtPackage.AIRLINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AtPackage.AIRLINE__FLIGHTS:
				getFlights().clear();
				return;
			case AtPackage.AIRLINE__AIRPLANES:
				getAirplanes().clear();
				return;
			case AtPackage.AIRLINE__EMPLOYEES:
				getEmployees().clear();
				return;
			case AtPackage.AIRLINE__AIRPORTS:
				getAirports().clear();
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
			case AtPackage.AIRLINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AtPackage.AIRLINE__FLIGHTS:
				return flights != null && !flights.isEmpty();
			case AtPackage.AIRLINE__AIRPLANES:
				return airplanes != null && !airplanes.isEmpty();
			case AtPackage.AIRLINE__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case AtPackage.AIRLINE__AIRPORTS:
				return airports != null && !airports.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AirlineImpl
