/**
 */
package at;

import java.util.Date;

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
 *   <li>{@link at.Flight#getDuration <em>Duration</em>}</li>
 *   <li>{@link at.Flight#getAirplane <em>Airplane</em>}</li>
 *   <li>{@link at.Flight#getDepartureAirport <em>Departure Airport</em>}</li>
 *   <li>{@link at.Flight#getDestinationAirport <em>Destination Airport</em>}</li>
 *   <li>{@link at.Flight#getDepartureGate <em>Departure Gate</em>}</li>
 *   <li>{@link at.Flight#getDestinationGate <em>Destination Gate</em>}</li>
 *   <li>{@link at.Flight#getCrew <em>Crew</em>}</li>
 *   <li>{@link at.Flight#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link at.Flight#getCode <em>Code</em>}</li>
 *   <li>{@link at.Flight#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link at.Flight#getArrivalTime <em>Arrival Time</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getFlight()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maximumPassengers'"
 *        annotation="OCL maximumPassengers='self.passengers -&gt; size() &lt; self.airplane.numberOfSeats'"
 * @generated
 */
public interface Flight extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see at.AtPackage#getFlight_Duration()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Returns the value of the '<em><b>Airplane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airplane</em>' reference.
	 * @see #setAirplane(Airplane)
	 * @see at.AtPackage#getFlight_Airplane()
	 * @model
	 * @generated
	 */
	Airplane getAirplane();

	/**
	 * Sets the value of the '{@link at.Flight#getAirplane <em>Airplane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airplane</em>' reference.
	 * @see #getAirplane()
	 * @generated
	 */
	void setAirplane(Airplane value);

	/**
	 * Returns the value of the '<em><b>Departure Airport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Airport</em>' reference.
	 * @see #setDepartureAirport(Airport)
	 * @see at.AtPackage#getFlight_DepartureAirport()
	 * @model
	 * @generated
	 */
	Airport getDepartureAirport();

	/**
	 * Sets the value of the '{@link at.Flight#getDepartureAirport <em>Departure Airport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Airport</em>' reference.
	 * @see #getDepartureAirport()
	 * @generated
	 */
	void setDepartureAirport(Airport value);

	/**
	 * Returns the value of the '<em><b>Destination Airport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Airport</em>' reference.
	 * @see #setDestinationAirport(Airport)
	 * @see at.AtPackage#getFlight_DestinationAirport()
	 * @model
	 * @generated
	 */
	Airport getDestinationAirport();

	/**
	 * Sets the value of the '{@link at.Flight#getDestinationAirport <em>Destination Airport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Airport</em>' reference.
	 * @see #getDestinationAirport()
	 * @generated
	 */
	void setDestinationAirport(Airport value);

	/**
	 * Returns the value of the '<em><b>Departure Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Gate</em>' reference.
	 * @see #setDepartureGate(Gate)
	 * @see at.AtPackage#getFlight_DepartureGate()
	 * @model
	 * @generated
	 */
	Gate getDepartureGate();

	/**
	 * Sets the value of the '{@link at.Flight#getDepartureGate <em>Departure Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Gate</em>' reference.
	 * @see #getDepartureGate()
	 * @generated
	 */
	void setDepartureGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Destination Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Gate</em>' reference.
	 * @see #setDestinationGate(Gate)
	 * @see at.AtPackage#getFlight_DestinationGate()
	 * @model
	 * @generated
	 */
	Gate getDestinationGate();

	/**
	 * Sets the value of the '{@link at.Flight#getDestinationGate <em>Destination Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Gate</em>' reference.
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
	 * Returns the value of the '<em><b>Passengers</b></em>' reference list.
	 * The list contents are of type {@link at.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' reference list.
	 * @see at.AtPackage#getFlight_Passengers()
	 * @model
	 * @generated
	 */
	EList<Person> getPassengers();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see at.AtPackage#getFlight_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link at.Flight#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Time</em>' attribute.
	 * @see #setDepartureTime(Date)
	 * @see at.AtPackage#getFlight_DepartureTime()
	 * @model
	 * @generated
	 */
	Date getDepartureTime();

	/**
	 * Sets the value of the '{@link at.Flight#getDepartureTime <em>Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Time</em>' attribute.
	 * @see #getDepartureTime()
	 * @generated
	 */
	void setDepartureTime(Date value);

	/**
	 * Returns the value of the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Time</em>' attribute.
	 * @see #setArrivalTime(Date)
	 * @see at.AtPackage#getFlight_ArrivalTime()
	 * @model
	 * @generated
	 */
	Date getArrivalTime();

	/**
	 * Sets the value of the '{@link at.Flight#getArrivalTime <em>Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Time</em>' attribute.
	 * @see #getArrivalTime()
	 * @generated
	 */
	void setArrivalTime(Date value);

} // Flight
