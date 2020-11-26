/**
 */
package at;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.Airline#getName <em>Name</em>}</li>
 *   <li>{@link at.Airline#getFlights <em>Flights</em>}</li>
 *   <li>{@link at.Airline#getAirplanes <em>Airplanes</em>}</li>
 *   <li>{@link at.Airline#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @see at.AtPackage#getAirline()
 * @model
 * @generated
 */
public interface Airline extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.AtPackage#getAirline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.Airline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Flights</b></em>' containment reference list.
	 * The list contents are of type {@link at.Flight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' containment reference list.
	 * @see at.AtPackage#getAirline_Flights()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flight> getFlights();

	/**
	 * Returns the value of the '<em><b>Airplanes</b></em>' containment reference list.
	 * The list contents are of type {@link at.Airplane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airplanes</em>' containment reference list.
	 * @see at.AtPackage#getAirline_Airplanes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Airplane> getAirplanes();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link at.Person}.
	 * It is bidirectional and its opposite is '{@link at.Person#getEmployer <em>Employer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see at.AtPackage#getAirline_Employees()
	 * @see at.Person#getEmployer
	 * @model opposite="employer" containment="true"
	 * @generated
	 */
	EList<Person> getEmployees();

} // Airline
