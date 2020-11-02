/**
 */
package at.impl;

import at.Airline;
import at.Airport;
import at.AtPackage;
import at.Person;
import at.TravelPlanner;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Travel Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.impl.TravelPlannerImpl#getAirports <em>Airports</em>}</li>
 *   <li>{@link at.impl.TravelPlannerImpl#getAirlines <em>Airlines</em>}</li>
 *   <li>{@link at.impl.TravelPlannerImpl#getPassengers <em>Passengers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TravelPlannerImpl extends MinimalEObjectImpl.Container implements TravelPlanner {
	/**
	 * The cached value of the '{@link #getAirports() <em>Airports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirports()
	 * @generated
	 * @ordered
	 */
	protected EList<Airport> airports;

	/**
	 * The cached value of the '{@link #getAirlines() <em>Airlines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirlines()
	 * @generated
	 * @ordered
	 */
	protected EList<Airline> airlines;

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
	protected TravelPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtPackage.Literals.TRAVEL_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Airport> getAirports() {
		if (airports == null) {
			airports = new EObjectContainmentEList<Airport>(Airport.class, this, AtPackage.TRAVEL_PLANNER__AIRPORTS);
		}
		return airports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Airline> getAirlines() {
		if (airlines == null) {
			airlines = new EObjectContainmentEList<Airline>(Airline.class, this, AtPackage.TRAVEL_PLANNER__AIRLINES);
		}
		return airlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPassengers() {
		if (passengers == null) {
			passengers = new EObjectContainmentEList<Person>(Person.class, this, AtPackage.TRAVEL_PLANNER__PASSENGERS);
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
			case AtPackage.TRAVEL_PLANNER__AIRPORTS:
				return ((InternalEList<?>)getAirports()).basicRemove(otherEnd, msgs);
			case AtPackage.TRAVEL_PLANNER__AIRLINES:
				return ((InternalEList<?>)getAirlines()).basicRemove(otherEnd, msgs);
			case AtPackage.TRAVEL_PLANNER__PASSENGERS:
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
			case AtPackage.TRAVEL_PLANNER__AIRPORTS:
				return getAirports();
			case AtPackage.TRAVEL_PLANNER__AIRLINES:
				return getAirlines();
			case AtPackage.TRAVEL_PLANNER__PASSENGERS:
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
			case AtPackage.TRAVEL_PLANNER__AIRPORTS:
				getAirports().clear();
				getAirports().addAll((Collection<? extends Airport>)newValue);
				return;
			case AtPackage.TRAVEL_PLANNER__AIRLINES:
				getAirlines().clear();
				getAirlines().addAll((Collection<? extends Airline>)newValue);
				return;
			case AtPackage.TRAVEL_PLANNER__PASSENGERS:
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
			case AtPackage.TRAVEL_PLANNER__AIRPORTS:
				getAirports().clear();
				return;
			case AtPackage.TRAVEL_PLANNER__AIRLINES:
				getAirlines().clear();
				return;
			case AtPackage.TRAVEL_PLANNER__PASSENGERS:
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
			case AtPackage.TRAVEL_PLANNER__AIRPORTS:
				return airports != null && !airports.isEmpty();
			case AtPackage.TRAVEL_PLANNER__AIRLINES:
				return airlines != null && !airlines.isEmpty();
			case AtPackage.TRAVEL_PLANNER__PASSENGERS:
				return passengers != null && !passengers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TravelPlannerImpl
