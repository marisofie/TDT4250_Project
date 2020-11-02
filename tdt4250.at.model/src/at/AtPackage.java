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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/acceleo/query/1.0' validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
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
	 * The meta object id for the '{@link at.impl.TravelPlannerImpl <em>Travel Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.TravelPlannerImpl
	 * @see at.impl.AtPackageImpl#getTravelPlanner()
	 * @generated
	 */
	int TRAVEL_PLANNER = 0;

	/**
	 * The feature id for the '<em><b>Airports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_PLANNER__AIRPORTS = 0;

	/**
	 * The feature id for the '<em><b>Airlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_PLANNER__AIRLINES = 1;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_PLANNER__PASSENGERS = 2;

	/**
	 * The number of structural features of the '<em>Travel Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_PLANNER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Travel Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_PLANNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.AirlineImpl <em>Airline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.AirlineImpl
	 * @see at.impl.AtPackageImpl#getAirline()
	 * @generated
	 */
	int AIRLINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Flights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE__FLIGHTS = 1;

	/**
	 * The feature id for the '<em><b>Airplanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE__AIRPLANES = 2;

	/**
	 * The number of structural features of the '<em>Airline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Airline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.AirplaneImpl <em>Airplane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.AirplaneImpl
	 * @see at.impl.AtPackageImpl#getAirplane()
	 * @generated
	 */
	int AIRPLANE = 2;

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
	 * The feature id for the '<em><b>Minimum Crew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__MINIMUM_CREW = 2;

	/**
	 * The feature id for the '<em><b>Required Runway Length Takeoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__REQUIRED_RUNWAY_LENGTH_TAKEOFF = 3;

	/**
	 * The feature id for the '<em><b>Required Runway Length Landing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE__REQUIRED_RUNWAY_LENGTH_LANDING = 4;

	/**
	 * The number of structural features of the '<em>Airplane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Airplane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPLANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.FlightImpl <em>Flight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.FlightImpl
	 * @see at.impl.AtPackageImpl#getFlight()
	 * @generated
	 */
	int FLIGHT = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Airplane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__AIRPLANE = 1;

	/**
	 * The feature id for the '<em><b>Departure Airport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DEPARTURE_AIRPORT = 2;

	/**
	 * The feature id for the '<em><b>Destination Airport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DESTINATION_AIRPORT = 3;

	/**
	 * The feature id for the '<em><b>Departure Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DEPARTURE_GATE = 4;

	/**
	 * The feature id for the '<em><b>Destination Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DESTINATION_GATE = 5;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__CREW = 6;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__PASSENGERS = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__CODE = 8;

	/**
	 * The feature id for the '<em><b>Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DEPARTURE_TIME = 9;

	/**
	 * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__ARRIVAL_TIME = 10;

	/**
	 * The number of structural features of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.impl.AirportImpl <em>Airport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.AirportImpl
	 * @see at.impl.AtPackageImpl#getAirport()
	 * @generated
	 */
	int AIRPORT = 4;

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
	 * The feature id for the '<em><b>Runways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__RUNWAYS = 2;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__GATES = 3;

	/**
	 * The number of structural features of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_FEATURE_COUNT = 4;

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
	int GATE = 5;

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
	int RUNWAY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNWAY__ID = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNWAY__LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Runway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNWAY_FEATURE_COUNT = 2;

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
	int PERSON = 7;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FULL_NAME = 0;

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
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 5;

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
	int CREW = 8;

	/**
	 * The feature id for the '<em><b>Crew Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW__CREW_ALLOCATIONS = 0;

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
	 * The meta object id for the '{@link at.impl.CrewAllocationImpl <em>Crew Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.impl.CrewAllocationImpl
	 * @see at.impl.AtPackageImpl#getCrewAllocation()
	 * @generated
	 */
	int CREW_ALLOCATION = 9;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_ALLOCATION__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_ALLOCATION__MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_ALLOCATION__CREW = 2;

	/**
	 * The number of structural features of the '<em>Crew Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_ALLOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Crew Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.Role
	 * @see at.impl.AtPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 10;

	/**
	 * The meta object id for the '{@link at.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.Gender
	 * @see at.impl.AtPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 11;

	/**
	 * The meta object id for the '{@link at.AirplaneType <em>Airplane Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.AirplaneType
	 * @see at.impl.AtPackageImpl#getAirplaneType()
	 * @generated
	 */
	int AIRPLANE_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link at.TravelPlanner <em>Travel Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Planner</em>'.
	 * @see at.TravelPlanner
	 * @generated
	 */
	EClass getTravelPlanner();

	/**
	 * Returns the meta object for the containment reference list '{@link at.TravelPlanner#getAirports <em>Airports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Airports</em>'.
	 * @see at.TravelPlanner#getAirports()
	 * @see #getTravelPlanner()
	 * @generated
	 */
	EReference getTravelPlanner_Airports();

	/**
	 * Returns the meta object for the containment reference list '{@link at.TravelPlanner#getAirlines <em>Airlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Airlines</em>'.
	 * @see at.TravelPlanner#getAirlines()
	 * @see #getTravelPlanner()
	 * @generated
	 */
	EReference getTravelPlanner_Airlines();

	/**
	 * Returns the meta object for the containment reference list '{@link at.TravelPlanner#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passengers</em>'.
	 * @see at.TravelPlanner#getPassengers()
	 * @see #getTravelPlanner()
	 * @generated
	 */
	EReference getTravelPlanner_Passengers();

	/**
	 * Returns the meta object for class '{@link at.Airline <em>Airline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airline</em>'.
	 * @see at.Airline
	 * @generated
	 */
	EClass getAirline();

	/**
	 * Returns the meta object for the attribute '{@link at.Airline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.Airline#getName()
	 * @see #getAirline()
	 * @generated
	 */
	EAttribute getAirline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.Airline#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flights</em>'.
	 * @see at.Airline#getFlights()
	 * @see #getAirline()
	 * @generated
	 */
	EReference getAirline_Flights();

	/**
	 * Returns the meta object for the containment reference list '{@link at.Airline#getAirplanes <em>Airplanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Airplanes</em>'.
	 * @see at.Airline#getAirplanes()
	 * @see #getAirline()
	 * @generated
	 */
	EReference getAirline_Airplanes();

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
	 * Returns the meta object for the attribute '{@link at.Airplane#getRequiredRunwayLengthTakeoff <em>Required Runway Length Takeoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Runway Length Takeoff</em>'.
	 * @see at.Airplane#getRequiredRunwayLengthTakeoff()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_RequiredRunwayLengthTakeoff();

	/**
	 * Returns the meta object for the attribute '{@link at.Airplane#getRequiredRunwayLengthLanding <em>Required Runway Length Landing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Runway Length Landing</em>'.
	 * @see at.Airplane#getRequiredRunwayLengthLanding()
	 * @see #getAirplane()
	 * @generated
	 */
	EAttribute getAirplane_RequiredRunwayLengthLanding();

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
	 * Returns the meta object for the attribute '{@link at.Flight#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see at.Flight#getDuration()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_Duration();

	/**
	 * Returns the meta object for the reference '{@link at.Flight#getAirplane <em>Airplane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Airplane</em>'.
	 * @see at.Flight#getAirplane()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Airplane();

	/**
	 * Returns the meta object for the reference '{@link at.Flight#getDepartureAirport <em>Departure Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Departure Airport</em>'.
	 * @see at.Flight#getDepartureAirport()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_DepartureAirport();

	/**
	 * Returns the meta object for the reference '{@link at.Flight#getDestinationAirport <em>Destination Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Airport</em>'.
	 * @see at.Flight#getDestinationAirport()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_DestinationAirport();

	/**
	 * Returns the meta object for the reference '{@link at.Flight#getDepartureGate <em>Departure Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Departure Gate</em>'.
	 * @see at.Flight#getDepartureGate()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_DepartureGate();

	/**
	 * Returns the meta object for the reference '{@link at.Flight#getDestinationGate <em>Destination Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Gate</em>'.
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
	 * Returns the meta object for the reference list '{@link at.Flight#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passengers</em>'.
	 * @see at.Flight#getPassengers()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link at.Flight#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see at.Flight#getCode()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_Code();

	/**
	 * Returns the meta object for the attribute '{@link at.Flight#getDepartureTime <em>Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Time</em>'.
	 * @see at.Flight#getDepartureTime()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_DepartureTime();

	/**
	 * Returns the meta object for the attribute '{@link at.Flight#getArrivalTime <em>Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Time</em>'.
	 * @see at.Flight#getArrivalTime()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_ArrivalTime();

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
	 * Returns the meta object for the containment reference list '{@link at.Airport#getRunways <em>Runways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runways</em>'.
	 * @see at.Airport#getRunways()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_Runways();

	/**
	 * Returns the meta object for the containment reference list '{@link at.Airport#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see at.Airport#getGates()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_Gates();

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
	 * Returns the meta object for the attribute '{@link at.Runway#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.Runway#getId()
	 * @see #getRunway()
	 * @generated
	 */
	EAttribute getRunway_Id();

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
	 * Returns the meta object for the attribute '{@link at.Person#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see at.Person#getFullName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FullName();

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
	 * Returns the meta object for class '{@link at.Crew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew</em>'.
	 * @see at.Crew
	 * @generated
	 */
	EClass getCrew();

	/**
	 * Returns the meta object for the containment reference list '{@link at.Crew#getCrewAllocations <em>Crew Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crew Allocations</em>'.
	 * @see at.Crew#getCrewAllocations()
	 * @see #getCrew()
	 * @generated
	 */
	EReference getCrew_CrewAllocations();

	/**
	 * Returns the meta object for class '{@link at.CrewAllocation <em>Crew Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew Allocation</em>'.
	 * @see at.CrewAllocation
	 * @generated
	 */
	EClass getCrewAllocation();

	/**
	 * Returns the meta object for the attribute '{@link at.CrewAllocation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see at.CrewAllocation#getRole()
	 * @see #getCrewAllocation()
	 * @generated
	 */
	EAttribute getCrewAllocation_Role();

	/**
	 * Returns the meta object for the reference list '{@link at.CrewAllocation#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see at.CrewAllocation#getMember()
	 * @see #getCrewAllocation()
	 * @generated
	 */
	EReference getCrewAllocation_Member();

	/**
	 * Returns the meta object for the container reference '{@link at.CrewAllocation#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Crew</em>'.
	 * @see at.CrewAllocation#getCrew()
	 * @see #getCrewAllocation()
	 * @generated
	 */
	EReference getCrewAllocation_Crew();

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
	 * Returns the meta object for enum '{@link at.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see at.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link at.AirplaneType <em>Airplane Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Airplane Type</em>'.
	 * @see at.AirplaneType
	 * @generated
	 */
	EEnum getAirplaneType();

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
		 * The meta object literal for the '{@link at.impl.TravelPlannerImpl <em>Travel Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.TravelPlannerImpl
		 * @see at.impl.AtPackageImpl#getTravelPlanner()
		 * @generated
		 */
		EClass TRAVEL_PLANNER = eINSTANCE.getTravelPlanner();

		/**
		 * The meta object literal for the '<em><b>Airports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_PLANNER__AIRPORTS = eINSTANCE.getTravelPlanner_Airports();

		/**
		 * The meta object literal for the '<em><b>Airlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_PLANNER__AIRLINES = eINSTANCE.getTravelPlanner_Airlines();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_PLANNER__PASSENGERS = eINSTANCE.getTravelPlanner_Passengers();

		/**
		 * The meta object literal for the '{@link at.impl.AirlineImpl <em>Airline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.AirlineImpl
		 * @see at.impl.AtPackageImpl#getAirline()
		 * @generated
		 */
		EClass AIRLINE = eINSTANCE.getAirline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRLINE__NAME = eINSTANCE.getAirline_Name();

		/**
		 * The meta object literal for the '<em><b>Flights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRLINE__FLIGHTS = eINSTANCE.getAirline_Flights();

		/**
		 * The meta object literal for the '<em><b>Airplanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRLINE__AIRPLANES = eINSTANCE.getAirline_Airplanes();

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
		 * The meta object literal for the '<em><b>Minimum Crew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__MINIMUM_CREW = eINSTANCE.getAirplane_MinimumCrew();

		/**
		 * The meta object literal for the '<em><b>Required Runway Length Takeoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__REQUIRED_RUNWAY_LENGTH_TAKEOFF = eINSTANCE.getAirplane_RequiredRunwayLengthTakeoff();

		/**
		 * The meta object literal for the '<em><b>Required Runway Length Landing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPLANE__REQUIRED_RUNWAY_LENGTH_LANDING = eINSTANCE.getAirplane_RequiredRunwayLengthLanding();

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
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__DURATION = eINSTANCE.getFlight_Duration();

		/**
		 * The meta object literal for the '<em><b>Airplane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__AIRPLANE = eINSTANCE.getFlight_Airplane();

		/**
		 * The meta object literal for the '<em><b>Departure Airport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DEPARTURE_AIRPORT = eINSTANCE.getFlight_DepartureAirport();

		/**
		 * The meta object literal for the '<em><b>Destination Airport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DESTINATION_AIRPORT = eINSTANCE.getFlight_DestinationAirport();

		/**
		 * The meta object literal for the '<em><b>Departure Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DEPARTURE_GATE = eINSTANCE.getFlight_DepartureGate();

		/**
		 * The meta object literal for the '<em><b>Destination Gate</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Passengers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__PASSENGERS = eINSTANCE.getFlight_Passengers();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__CODE = eINSTANCE.getFlight_Code();

		/**
		 * The meta object literal for the '<em><b>Departure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__DEPARTURE_TIME = eINSTANCE.getFlight_DepartureTime();

		/**
		 * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__ARRIVAL_TIME = eINSTANCE.getFlight_ArrivalTime();

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
		 * The meta object literal for the '<em><b>Runways</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__RUNWAYS = eINSTANCE.getAirport_Runways();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__GATES = eINSTANCE.getAirport_Gates();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNWAY__ID = eINSTANCE.getRunway_Id();

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
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FULL_NAME = eINSTANCE.getPerson_FullName();

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
		 * The meta object literal for the '{@link at.impl.CrewImpl <em>Crew</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.CrewImpl
		 * @see at.impl.AtPackageImpl#getCrew()
		 * @generated
		 */
		EClass CREW = eINSTANCE.getCrew();

		/**
		 * The meta object literal for the '<em><b>Crew Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW__CREW_ALLOCATIONS = eINSTANCE.getCrew_CrewAllocations();

		/**
		 * The meta object literal for the '{@link at.impl.CrewAllocationImpl <em>Crew Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.impl.CrewAllocationImpl
		 * @see at.impl.AtPackageImpl#getCrewAllocation()
		 * @generated
		 */
		EClass CREW_ALLOCATION = eINSTANCE.getCrewAllocation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREW_ALLOCATION__ROLE = eINSTANCE.getCrewAllocation_Role();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW_ALLOCATION__MEMBER = eINSTANCE.getCrewAllocation_Member();

		/**
		 * The meta object literal for the '<em><b>Crew</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW_ALLOCATION__CREW = eINSTANCE.getCrewAllocation_Crew();

		/**
		 * The meta object literal for the '{@link at.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.Role
		 * @see at.impl.AtPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link at.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.Gender
		 * @see at.impl.AtPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link at.AirplaneType <em>Airplane Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.AirplaneType
		 * @see at.impl.AtPackageImpl#getAirplaneType()
		 * @generated
		 */
		EEnum AIRPLANE_TYPE = eINSTANCE.getAirplaneType();

	}

} //AtPackage
