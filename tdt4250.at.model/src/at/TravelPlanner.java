/**
 */
package at;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travel Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.TravelPlanner#getAirports <em>Airports</em>}</li>
 *   <li>{@link at.TravelPlanner#getAirlines <em>Airlines</em>}</li>
 *   <li>{@link at.TravelPlanner#getPassengers <em>Passengers</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getTravelPlanner()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimen'"
 * @generated
 */
public interface TravelPlanner extends EObject {
	/**
	 * Returns the value of the '<em><b>Airports</b></em>' containment reference list.
	 * The list contents are of type {@link at.Airport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airports</em>' containment reference list.
	 * @see at.AtPackage#getTravelPlanner_Airports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Airport> getAirports();

	/**
	 * Returns the value of the '<em><b>Airlines</b></em>' containment reference list.
	 * The list contents are of type {@link at.Airline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airlines</em>' containment reference list.
	 * @see at.AtPackage#getTravelPlanner_Airlines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Airline> getAirlines();

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link at.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' containment reference list.
	 * @see at.AtPackage#getTravelPlanner_Passengers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPassengers();

} // TravelPlanner
