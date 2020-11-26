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
 *   <li>{@link at.Flight#getDestinationRunway <em>Destination Runway</em>}</li>
 *   <li>{@link at.Flight#getDepartureRunway <em>Departure Runway</em>}</li>
 *   <li>{@link at.Flight#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link at.Flight#getCode <em>Code</em>}</li>
 *   <li>{@link at.Flight#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link at.Flight#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link at.Flight#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getFlight()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maximumPassengers minimumCrew validateRunwayLengthTakeOff validateRunwayLengthLanding validateRunwayExistsTakeOff validateRunwayExistsLanding validateGateTakeOff validateGateLanding validateCrew'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 maximumPassengers='self.passengers -&gt; size() &lt; self.airplane.numberOfSeats' minimumCrew='self.allocations -&gt; size() &gt;= self.airplane.minimumCrew' validateRunwayLengthTakeOff='self.departureRunway.length &gt;= self.airplane.requiredRunwayLengthTakeoff\n' validateRunwayLengthLanding='self.destinationRunway.length &gt;= self.airplane.requiredRunwayLengthLanding' validateRunwayExistsTakeOff='self.departureAirport.runways -&gt; exists(r | r = self.departureRunway) ' validateRunwayExistsLanding='self.destinationAirport.runways -&gt; exists(r | r = self.destinationRunway) ' validateGateTakeOff='self.departureAirport.gates -&gt; exists(g | g = self.departureGate)' validateGateLanding='self.destinationAirport.gates -&gt; exists(g | g = self.destinationGate)' validateCrew='((self.allocations-&gt; collect(ca |ca.member)) -&gt; intersection(self.passengers)) -&gt; isEmpty()'"
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
	 * Returns the value of the '<em><b>Destination Runway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Runway</em>' reference.
	 * @see #setDestinationRunway(Runway)
	 * @see at.AtPackage#getFlight_DestinationRunway()
	 * @model
	 * @generated
	 */
	Runway getDestinationRunway();

	/**
	 * Sets the value of the '{@link at.Flight#getDestinationRunway <em>Destination Runway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Runway</em>' reference.
	 * @see #getDestinationRunway()
	 * @generated
	 */
	void setDestinationRunway(Runway value);

	/**
	 * Returns the value of the '<em><b>Departure Runway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Runway</em>' reference.
	 * @see #setDepartureRunway(Runway)
	 * @see at.AtPackage#getFlight_DepartureRunway()
	 * @model
	 * @generated
	 */
	Runway getDepartureRunway();

	/**
	 * Sets the value of the '{@link at.Flight#getDepartureRunway <em>Departure Runway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Runway</em>' reference.
	 * @see #getDepartureRunway()
	 * @generated
	 */
	void setDepartureRunway(Runway value);

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
	 * @model id="true"
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
	 * The default value is <code>"2000-01-01T00:00:00.000+0100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Time</em>' attribute.
	 * @see #setDepartureTime(Date)
	 * @see at.AtPackage#getFlight_DepartureTime()
	 * @model default="2000-01-01T00:00:00.000+0100"
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
	 * The default value is <code>"2000-01-01T00:00:00.000+0100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Time</em>' attribute.
	 * @see #setArrivalTime(Date)
	 * @see at.AtPackage#getFlight_ArrivalTime()
	 * @model default="2000-01-01T00:00:00.000+0100"
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
	
	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link at.CrewAllocation}.
	 * It is bidirectional and its opposite is '{@link at.CrewAllocation#getFlight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference list.
	 * @see at.AtPackage#getFlight_Allocations()
	 * @see at.CrewAllocation#getFlight
	 * @model opposite="flight" containment="true"
	 * @generated
	 */
	EList<CrewAllocation> getAllocations();

	/**
	 * Check if other flight plan to use the same runway at the same time.
	 * @param otherFlight
	 * @return
	 */
	boolean usesSameRunwayAtTheSameTime(Flight otherFlight);
	
	boolean	hasDepartureTime();
	
	boolean hasArrivalTime();
	
	boolean hasDepartureRunway();
	
	boolean hasDestinationRunway();


} // Flight
