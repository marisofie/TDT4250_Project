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
 *   <li>{@link at.Airplane#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link at.Airplane#getWeight <em>Weight</em>}</li>
 *   <li>{@link at.Airplane#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link at.Airplane#getReach <em>Reach</em>}</li>
 *   <li>{@link at.Airplane#getMinimumCrew <em>Minimum Crew</em>}</li>
 *   <li>{@link at.Airplane#getRequiredRunwayLength <em>Required Runway Length</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getAirplane()
 * @model
 * @generated
 */
public interface Airplane extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see at.AtPackage#getAirplane_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link at.Airplane#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see at.AtPackage#getAirplane_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link at.Airplane#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Weight</em>' attribute.
	 * @see #setMaximumWeight(int)
	 * @see at.AtPackage#getAirplane_MaximumWeight()
	 * @model
	 * @generated
	 */
	int getMaximumWeight();

	/**
	 * Sets the value of the '{@link at.Airplane#getMaximumWeight <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Weight</em>' attribute.
	 * @see #getMaximumWeight()
	 * @generated
	 */
	void setMaximumWeight(int value);

	/**
	 * Returns the value of the '<em><b>Reach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reach</em>' attribute.
	 * @see #setReach(int)
	 * @see at.AtPackage#getAirplane_Reach()
	 * @model
	 * @generated
	 */
	int getReach();

	/**
	 * Sets the value of the '{@link at.Airplane#getReach <em>Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reach</em>' attribute.
	 * @see #getReach()
	 * @generated
	 */
	void setReach(int value);

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
	 * Returns the value of the '<em><b>Required Runway Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Runway Length</em>' attribute.
	 * @see #setRequiredRunwayLength(int)
	 * @see at.AtPackage#getAirplane_RequiredRunwayLength()
	 * @model
	 * @generated
	 */
	int getRequiredRunwayLength();

	/**
	 * Sets the value of the '{@link at.Airplane#getRequiredRunwayLength <em>Required Runway Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Runway Length</em>' attribute.
	 * @see #getRequiredRunwayLength()
	 * @generated
	 */
	void setRequiredRunwayLength(int value);

} // Airplane
