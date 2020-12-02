/**
 */
package at;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airplane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.Airplane#getType <em>Type</em>}</li>
 *   <li>{@link at.Airplane#getId <em>Id</em>}</li>
 *   <li>{@link at.Airplane#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link at.Airplane#getMinimumCrew <em>Minimum Crew</em>}</li>
 *   <li>{@link at.Airplane#getRequiredRunwayLengthTakeoff <em>Required Runway Length Takeoff</em>}</li>
 *   <li>{@link at.Airplane#getRequiredRunwayLengthLanding <em>Required Runway Length Landing</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getAirplane()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validateHasUniqueId'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 validateHasUniqueId='self.eContainer().airlines.airplanes -&gt; isUnique(plane | plane.id)'"
 * @generated
 */
public interface Airplane extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see at.AtPackage#getAirplane_Id()
	 * @model unique="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link at.Airplane#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.AirplaneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see at.AirplaneType
	 * @see #setType(AirplaneType)
	 * @see at.AtPackage#getAirplane_Type()
	 * @model dataType="at.AirplaneType"
	 * @generated
	 */
	AirplaneType getType();

	/**
	 * Sets the value of the '{@link at.Airplane#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see at.AirplaneType
	 * @see #getType()
	 * @generated
	 */
	void setType(AirplaneType value);

	/**
	 * Returns the value of the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Seats</em>' attribute.
	 * @see #setNumberOfSeats(int)
	 * @see at.AtPackage#getAirplane_NumberOfSeats()
	 * @model
	 * @generated
	 */
	int getNumberOfSeats();

	/**
	 * Sets the value of the '{@link at.Airplane#getNumberOfSeats <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Seats</em>' attribute.
	 * @see #getNumberOfSeats()
	 * @generated
	 */
	void setNumberOfSeats(int value);

	/**
	 * Returns the value of the '<em><b>Minimum Crew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Crew</em>' attribute.
	 * @see #setMinimumCrew(int)
	 * @see at.AtPackage#getAirplane_MinimumCrew()
	 * @model
	 * @generated
	 */
	int getMinimumCrew();

	/**
	 * Sets the value of the '{@link at.Airplane#getMinimumCrew <em>Minimum Crew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Crew</em>' attribute.
	 * @see #getMinimumCrew()
	 * @generated
	 */
	void setMinimumCrew(int value);

	/**
	 * Returns the value of the '<em><b>Required Runway Length Takeoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Runway Length Takeoff</em>' attribute.
	 * @see #setRequiredRunwayLengthTakeoff(int)
	 * @see at.AtPackage#getAirplane_RequiredRunwayLengthTakeoff()
	 * @model
	 * @generated
	 */
	int getRequiredRunwayLengthTakeoff();

	/**
	 * Sets the value of the '{@link at.Airplane#getRequiredRunwayLengthTakeoff <em>Required Runway Length Takeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Runway Length Takeoff</em>' attribute.
	 * @see #getRequiredRunwayLengthTakeoff()
	 * @generated
	 */
	void setRequiredRunwayLengthTakeoff(int value);

	/**
	 * Returns the value of the '<em><b>Required Runway Length Landing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Runway Length Landing</em>' attribute.
	 * @see #setRequiredRunwayLengthLanding(int)
	 * @see at.AtPackage#getAirplane_RequiredRunwayLengthLanding()
	 * @model
	 * @generated
	 */
	int getRequiredRunwayLengthLanding();

	/**
	 * Sets the value of the '{@link at.Airplane#getRequiredRunwayLengthLanding <em>Required Runway Length Landing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Runway Length Landing</em>' attribute.
	 * @see #getRequiredRunwayLengthLanding()
	 * @generated
	 */
	void setRequiredRunwayLengthLanding(int value);

} // Airplane
