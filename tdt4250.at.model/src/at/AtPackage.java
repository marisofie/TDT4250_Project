/**
 */
package at;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.AtFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface AtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "at";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.at.model/model/at.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "at";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtPackage eINSTANCE = at.impl.AtPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.impl.AirplaneImpl <em>Airplane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.AirplaneImpl
	 * @see at.impl.AtPackageImpl#getAirplane()
	 * @generated
	 */
	int AIRPLANE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__NUMBER_OF_SEATS = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Maximum Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__MAXIMUM_WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Reach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__REACH = 4;

	/**
	 * The feature id for the '<em><b>Minimum Crew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__MINIMUM_CREW = 5;

	/**
	 * The feature id for the '<em><b>Required Runway Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__REQUIRED_RUNWAY_LENGTH = 6;

	/**
	 * The number of structural features of the '<em>Airplane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Airplane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.AirportImpl <em>Airport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.AirportImpl
	 * @see at.impl.AtPackageImpl#getAirport()
	 * @generated
	 */
	int AIRPORT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__ID = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.GateImpl
	 * @see at.impl.AtPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.RunwayImpl <em>Runway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.RunwayImpl
	 * @see at.impl.AtPackageImpl#getRunway()
	 * @generated
	 */
	int RUNWAY = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNWAY__LENGTH = 0;

	/**
	 * The number of structural features of the '<em>Runway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNWAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.PersonImpl
	 * @see at.impl.AtPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FAMILY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = 3;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLE = 5;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.CrewImpl <em>Crew</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.CrewImpl
	 * @see at.impl.AtPackageImpl#getCrew()
	 * @generated
	 */
	int CREW = 5;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.FlightImpl <em>Flight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.FlightImpl
	 * @see at.impl.AtPackageImpl#getFlight()
	 * @generated
	 */
	int FLIGHT = 6;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__PLANE = 0;

	/**
	 * The feature id for the '<em><b>Departure Airport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DEPARTURE_AIRPORT = 1;

	/**
	 * The feature id for the '<em><b>Destination Airport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DESTINATION_AIRPORT = 2;

	/**
	 * The feature id for the '<em><b>Departure Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DEPARTURE_GATE = 3;

	/**
	 * The feature id for the '<em><b>Destination Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DESTINATION_GATE = 4;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__CREW = 5;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__PASSENGERS = 6;

	/**
	 * The number of structural features of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.Role
	 * @see at.impl.AtPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;


	/**
	 * Returns the meta object for class '{@link at.Airplane <em>Airplane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airplane</em>'.
	 * @see at.Airplane
	 * @generated
	 */
	EClass getAirplane();

	/**
	 * Returns the meta object for the attribute '{@link at.Airplane#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.Airplane#getType()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_Type();

	/**
	 * Returns the meta object for the attribute '{@link at.Airplane#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see at.Airplane#getNumberOfSeats()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_NumberOfSeats();

	/**
	 * Returns the meta object for the attribute '{@link at.Airplane#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see at.Airplane#getWeight()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_Weight();

	/**
	 * Returns the meta object for the attribute '{@link at.Airplane#getMaximumWeight <em>Maximum Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Weight</em>'.
	 * @see at.Airplane#getMaximumWeight()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_MaximumWeight();

	/**
	 * Returns the meta object for the attribute '{@link at.Airplane#getReach <em>Reach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reach</em>'.
	 * @see at.Airplane#getReach()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_Reach();

	/**
	 * Returns the meta object for the attribute '{@link at.Airplane#getMinimumCrew <em>Minimum Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Crew</em>'.
	 * @see at.Airplane#getMinimumCrew()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_MinimumCrew();

	/**
	 * Returns the meta object for the attribute '{@link at.Airplane#getRequiredRunwayLength <em>Required Runway Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Runway Length</em>'.
	 * @see at.Airplane#getRequiredRunwayLength()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_RequiredRunwayLength();

	/**
	 * Returns the meta object for class '{@link at.Airport <em>Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airport</em>'.
	 * @see at.Airport
	 * @generated
	 */
	EClass getAirport();

	/**
	 * Returns the meta object for the attribute '{@link at.Airport#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.Airport#getId()
	 * @see #getAirport()
	 * @generated
	 */
	EAttribute getAirport_Id();

	/**
	 * Returns the meta object for the attribute '{@link at.Airport#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see at.Airport#getLocation()
	 * @see #getAirport()
	 * @generated
	 */
	EAttribute getAirport_Location();

	/**
	 * Returns the meta object for class '{@link at.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see at.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link at.Gate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.Gate#getName()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Name();

	/**
	 * Returns the meta object for class '{@link at.Runway <em>Runway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runway</em>'.
	 * @see at.Runway
	 * @generated
	 */
	EClass getRunway();

	/**
	 * Returns the meta object for the attribute '{@link at.Runway#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see at.Runway#getLength()
	 * @see #getRunway()
	 * @generated
	 */
	EAttribute getRunway_Length();

	/**
	 * Returns the meta object for class '{@link at.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see at.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link at.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see at.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link at.Person#getFamilyName <em>Family Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family Name</em>'.
	 * @see at.Person#getFamilyName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FamilyName();

	/**
	 * Returns the meta object for the attribute '{@link at.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see at.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link at.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see at.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the attribute '{@link at.Person#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see at.Person#getRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Role();

	/**
	 * Returns the meta object for class '{@link at.Crew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew</em>'.
	 * @see at.Crew
	 * @generated
	 */
	EClass getCrew();

	/**
	 * Returns the meta object for the reference list '{@link at.Crew#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see at.Crew#getMembers()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_Members();

	/**
	 * Returns the meta object for class '{@link at.Flight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight</em>'.
	 * @see at.Flight
	 * @generated
	 */
	EClass getFlight();

	/**
	 * Returns the meta object for the containment reference '{@link at.Flight#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plane</em>'.
	 * @see at.Flight#getPlane()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Plane();

	/**
	 * Returns the meta object for the containment reference '{@link at.Flight#getDepartureAirport <em>Departure Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Airport</em>'.
	 * @see at.Flight#getDepartureAirport()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_DepartureAirport();

	/**
	 * Returns the meta object for the containment reference '{@link at.Flight#getDestinationAirport <em>Destination Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Airport</em>'.
	 * @see at.Flight#getDestinationAirport()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_DestinationAirport();

	/**
	 * Returns the meta object for the containment reference '{@link at.Flight#getDepartureGate <em>Departure Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departure Gate</em>'.
	 * @see at.Flight#getDepartureGate()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_DepartureGate();

	/**
	 * Returns the meta object for the containment reference '{@link at.Flight#getDestinationGate <em>Destination Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination Gate</em>'.
	 * @see at.Flight#getDestinationGate()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_DestinationGate();

	/**
	 * Returns the meta object for the containment reference '{@link at.Flight#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crew</em>'.
	 * @see at.Flight#getCrew()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Crew();

	/**
	 * Returns the meta object for the containment reference list '{@link at.Flight#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passengers</em>'.
	 * @see at.Flight#getPassengers()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Passengers();

	/**
	 * Returns the meta object for enum '{@link at.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see at.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtFactory getAtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.impl.AirplaneImpl <em>Airplane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.AirplaneImpl
		 * @see at.impl.AtPackageImpl#getAirplane()
		 * @generated
		 */
		EClass AIRPLANE = eINSTANCE.getAirplane();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__TYPE = eINSTANCE.getAirplane_Type();

		/**
		 * The meta object literal for the '<em><b>Number Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__NUMBER_OF_SEATS = eINSTANCE.getAirplane_NumberOfSeats();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__WEIGHT = eINSTANCE.getAirplane_Weight();

		/**
		 * The meta object literal for the '<em><b>Maximum Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__MAXIMUM_WEIGHT = eINSTANCE.getAirplane_MaximumWeight();

		/**
		 * The meta object literal for the '<em><b>Reach</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__REACH = eINSTANCE.getAirplane_Reach();

		/**
		 * The meta object literal for the '<em><b>Minimum Crew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__MINIMUM_CREW = eINSTANCE.getAirplane_MinimumCrew();

		/**
		 * The meta object literal for the '<em><b>Required Runway Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__REQUIRED_RUNWAY_LENGTH = eINSTANCE.getAirplane_RequiredRunwayLength();

		/**
		 * The meta object literal for the '{@link at.impl.AirportImpl <em>Airport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.AirportImpl
		 * @see at.impl.AtPackageImpl#getAirport()
		 * @generated
		 */
		EClass AIRPORT = eINSTANCE.getAirport();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPORT__ID = eINSTANCE.getAirport_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPORT__LOCATION = eINSTANCE.getAirport_Location();

		/**
		 * The meta object literal for the '{@link at.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.GateImpl
		 * @see at.impl.AtPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__NAME = eINSTANCE.getGate_Name();

		/**
		 * The meta object literal for the '{@link at.impl.RunwayImpl <em>Runway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.RunwayImpl
		 * @see at.impl.AtPackageImpl#getRunway()
		 * @generated
		 */
		EClass RUNWAY = eINSTANCE.getRunway();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNWAY__LENGTH = eINSTANCE.getRunway_Length();

		/**
		 * The meta object literal for the '{@link at.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.PersonImpl
		 * @see at.impl.AtPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Family Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FAMILY_NAME = eINSTANCE.getPerson_FamilyName();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ROLE = eINSTANCE.getPerson_Role();

		/**
		 * The meta object literal for the '{@link at.impl.CrewImpl <em>Crew</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.CrewImpl
		 * @see at.impl.AtPackageImpl#getCrew()
		 * @generated
		 */
		EClass CREW = eINSTANCE.getCrew();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__MEMBERS = eINSTANCE.getCrew_Members();

		/**
		 * The meta object literal for the '{@link at.impl.FlightImpl <em>Flight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.FlightImpl
		 * @see at.impl.AtPackageImpl#getFlight()
		 * @generated
		 */
		EClass FLIGHT = eINSTANCE.getFlight();

		/**
		 * The meta object literal for the '<em><b>Plane</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__PLANE = eINSTANCE.getFlight_Plane();

		/**
		 * The meta object literal for the '<em><b>Departure Airport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DEPARTURE_AIRPORT = eINSTANCE.getFlight_DepartureAirport();

		/**
		 * The meta object literal for the '<em><b>Destination Airport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DESTINATION_AIRPORT = eINSTANCE.getFlight_DestinationAirport();

		/**
		 * The meta object literal for the '<em><b>Departure Gate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DEPARTURE_GATE = eINSTANCE.getFlight_DepartureGate();

		/**
		 * The meta object literal for the '<em><b>Destination Gate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DESTINATION_GATE = eINSTANCE.getFlight_DestinationGate();

		/**
		 * The meta object literal for the '<em><b>Crew</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__CREW = eINSTANCE.getFlight_Crew();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__PASSENGERS = eINSTANCE.getFlight_Passengers();

		/**
		 * The meta object literal for the '{@link at.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.Role
		 * @see at.impl.AtPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //AtPackage
