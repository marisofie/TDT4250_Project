/**
 */
package at;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.Flight#getPlane <em>Plane</em>}</li>
 *   <li>{@link at.Flight#getDepartureAirport <em>Departure Airport</em>}</li>
 *   <li>{@link at.Flight#getDestinationAirport <em>Destination Airport</em>}</li>
 *   <li>{@link at.Flight#getDepartureGate <em>Departure Gate</em>}</li>
 *   <li>{@link at.Flight#getDestinationGate <em>Destination Gate</em>}</li>
 *   <li>{@link at.Flight#getCrew <em>Crew</em>}</li>
 *   <li>{@link at.Flight#getPassengers <em>Passengers</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getFlight()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maximumPassengers'"
 *        annotation="OCL maximumPassengers='self.passengers -&gt; select(p|p.role = \'passenger\') -&gt; size() &lt; 10'"
 * @generated
 */
public interface Flight extends EObject {
	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference.
	 * @see #setPlane(Airplane)
	 * @see at.AtPackage#getFlight_Plane()
	 * @model containment="true"
	 * @generated
	 */
	Airplane getPlane();

	/**
	 * Sets the value of the '{@link at.Flight#getPlane <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' containment reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(Airplane value);

	/**
	 * Returns the value of the '<em><b>Departure Airport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Airport</em>' containment reference.
	 * @see #setDepartureAirport(Airport)
	 * @see at.AtPackage#getFlight_DepartureAirport()
	 * @model containment="true"
	 * @generated
	 */
	Airport getDepartureAirport();

	/**
	 * Sets the value of the '{@link at.Flight#getDepartureAirport <em>Departure Airport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Airport</em>' containment reference.
	 * @see #getDepartureAirport()
	 * @generated
	 */
	void setDepartureAirport(Airport value);

	/**
	 * Returns the value of the '<em><b>Destination Airport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Airport</em>' containment reference.
	 * @see #setDestinationAirport(Airport)
	 * @see at.AtPackage#getFlight_DestinationAirport()
	 * @model containment="true"
	 * @generated
	 */
	Airport getDestinationAirport();

	/**
	 * Sets the value of the '{@link at.Flight#getDestinationAirport <em>Destination Airport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Airport</em>' containment reference.
	 * @see #getDestinationAirport()
	 * @generated
	 */
	void setDestinationAirport(Airport value);

	/**
	 * Returns the value of the '<em><b>Departure Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Gate</em>' containment reference.
	 * @see #setDepartureGate(Gate)
	 * @see at.AtPackage#getFlight_DepartureGate()
	 * @model containment="true"
	 * @generated
	 */
	Gate getDepartureGate();

	/**
	 * Sets the value of the '{@link at.Flight#getDepartureGate <em>Departure Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Gate</em>' containment reference.
	 * @see #getDepartureGate()
	 * @generated
	 */
	void setDepartureGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Destination Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Gate</em>' containment reference.
	 * @see #setDestinationGate(Gate)
	 * @see at.AtPackage#getFlight_DestinationGate()
	 * @model containment="true"
	 * @generated
	 */
	Gate getDestinationGate();

	/**
	 * Sets the value of the '{@link at.Flight#getDestinationGate <em>Destination Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Gate</em>' containment reference.
	 * @see #getDestinationGate()
	 * @generated
	 */
	void setDestinationGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' containment reference.
	 * @see #setCrew(Crew)
	 * @see at.AtPackage#getFlight_Crew()
	 * @model containment="true"
	 * @generated
	 */
	Crew getCrew();

	/**
	 * Sets the value of the '{@link at.Flight#getCrew <em>Crew</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' containment reference.
	 * @see #getCrew()
	 * @generated
	 */
	void setCrew(Crew value);

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link at.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' containment reference list.
	 * @see at.AtPackage#getFlight_Passengers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPassengers();

} // Flight
