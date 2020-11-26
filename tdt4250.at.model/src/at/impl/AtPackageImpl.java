/**
 */
package at.impl;

import at.Airline;
import at.Airplane;
import at.AirplaneType;
import at.Airport;
import at.AtFactory;
import at.AtPackage;
import at.CrewAllocation;
import at.Flight;
import at.Gate;
import at.Gender;
import at.Person;
import at.Role;
import at.Runway;
import at.TravelPlanner;
import at.util.AtValidator;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtPackageImpl extends EPackageImpl implements AtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airplaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crewAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum airplaneTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.AtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtPackageImpl() {
		super(eNS_URI, AtFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtPackage init() {
		if (isInited) return (AtPackage)EPackage.Registry.INSTANCE.getEPackage(AtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtPackageImpl theAtPackage = registeredAtPackage instanceof AtPackageImpl ? (AtPackageImpl)registeredAtPackage : new AtPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAtPackage.createPackageContents();

		// Initialize created meta-data
		theAtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAtPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AtValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtPackage.eNS_URI, theAtPackage);
		return theAtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelPlanner() {
		return travelPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelPlanner_Airports() {
		return (EReference)travelPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelPlanner_Airlines() {
		return (EReference)travelPlannerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelPlanner_Passengers() {
		return (EReference)travelPlannerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirline() {
		return airlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirline_Name() {
		return (EAttribute)airlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirline_Flights() {
		return (EReference)airlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirline_Airplanes() {
		return (EReference)airlineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirline_Employees() {
		return (EReference)airlineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirplane() {
		return airplaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirplane_Id() {
		return (EAttribute)airplaneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirplane_Type() {
		return (EAttribute)airplaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirplane_NumberOfSeats() {
		return (EAttribute)airplaneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirplane_MinimumCrew() {
		return (EAttribute)airplaneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirplane_RequiredRunwayLengthTakeoff() {
		return (EAttribute)airplaneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirplane_RequiredRunwayLengthLanding() {
		return (EAttribute)airplaneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlight() {
		return flightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlight_Duration() {
		return (EAttribute)flightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_Airplane() {
		return (EReference)flightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_DepartureAirport() {
		return (EReference)flightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_DestinationAirport() {
		return (EReference)flightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_DepartureGate() {
		return (EReference)flightEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_DestinationGate() {
		return (EReference)flightEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_DestinationRunway() {
		return (EReference)flightEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_DepartureRunway() {
		return (EReference)flightEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_Passengers() {
		return (EReference)flightEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlight_Code() {
		return (EAttribute)flightEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlight_DepartureTime() {
		return (EAttribute)flightEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlight_ArrivalTime() {
		return (EAttribute)flightEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlight_Allocations() {
		return (EReference)flightEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirport() {
		return airportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirport_Id() {
		return (EAttribute)airportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirport_Location() {
		return (EAttribute)airportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirport_Runways() {
		return (EReference)airportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirport_Gates() {
		return (EReference)airportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGate_Name() {
		return (EAttribute)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunway() {
		return runwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunway_Id() {
		return (EAttribute)runwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunway_Name() {
		return (EAttribute)runwayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunway_Length() {
		return (EAttribute)runwayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FullName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FamilyName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Age() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Allocations() {
		return (EReference)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Employer() {
		return (EReference)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrewAllocation() {
		return crewAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrewAllocation_Role() {
		return (EAttribute)crewAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrewAllocation_Member() {
		return (EReference)crewAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrewAllocation_Flight() {
		return (EReference)crewAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAirplaneType() {
		return airplaneTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtFactory getAtFactory() {
		return (AtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		travelPlannerEClass = createEClass(TRAVEL_PLANNER);
		createEReference(travelPlannerEClass, TRAVEL_PLANNER__AIRPORTS);
		createEReference(travelPlannerEClass, TRAVEL_PLANNER__AIRLINES);
		createEReference(travelPlannerEClass, TRAVEL_PLANNER__PASSENGERS);

		airlineEClass = createEClass(AIRLINE);
		createEAttribute(airlineEClass, AIRLINE__NAME);
		createEReference(airlineEClass, AIRLINE__FLIGHTS);
		createEReference(airlineEClass, AIRLINE__AIRPLANES);
		createEReference(airlineEClass, AIRLINE__EMPLOYEES);

		airplaneEClass = createEClass(AIRPLANE);
		createEAttribute(airplaneEClass, AIRPLANE__TYPE);
		createEAttribute(airplaneEClass, AIRPLANE__ID);
		createEAttribute(airplaneEClass, AIRPLANE__NUMBER_OF_SEATS);
		createEAttribute(airplaneEClass, AIRPLANE__MINIMUM_CREW);
		createEAttribute(airplaneEClass, AIRPLANE__REQUIRED_RUNWAY_LENGTH_TAKEOFF);
		createEAttribute(airplaneEClass, AIRPLANE__REQUIRED_RUNWAY_LENGTH_LANDING);

		flightEClass = createEClass(FLIGHT);
		createEAttribute(flightEClass, FLIGHT__DURATION);
		createEReference(flightEClass, FLIGHT__AIRPLANE);
		createEReference(flightEClass, FLIGHT__DEPARTURE_AIRPORT);
		createEReference(flightEClass, FLIGHT__DESTINATION_AIRPORT);
		createEReference(flightEClass, FLIGHT__DEPARTURE_GATE);
		createEReference(flightEClass, FLIGHT__DESTINATION_GATE);
		createEReference(flightEClass, FLIGHT__DESTINATION_RUNWAY);
		createEReference(flightEClass, FLIGHT__DEPARTURE_RUNWAY);
		createEReference(flightEClass, FLIGHT__PASSENGERS);
		createEAttribute(flightEClass, FLIGHT__CODE);
		createEAttribute(flightEClass, FLIGHT__DEPARTURE_TIME);
		createEAttribute(flightEClass, FLIGHT__ARRIVAL_TIME);
		createEReference(flightEClass, FLIGHT__ALLOCATIONS);

		airportEClass = createEClass(AIRPORT);
		createEAttribute(airportEClass, AIRPORT__ID);
		createEAttribute(airportEClass, AIRPORT__LOCATION);
		createEReference(airportEClass, AIRPORT__RUNWAYS);
		createEReference(airportEClass, AIRPORT__GATES);

		gateEClass = createEClass(GATE);
		createEAttribute(gateEClass, GATE__NAME);

		runwayEClass = createEClass(RUNWAY);
		createEAttribute(runwayEClass, RUNWAY__ID);
		createEAttribute(runwayEClass, RUNWAY__NAME);
		createEAttribute(runwayEClass, RUNWAY__LENGTH);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FULL_NAME);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__FAMILY_NAME);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__AGE);
		createEReference(personEClass, PERSON__ALLOCATIONS);
		createEReference(personEClass, PERSON__EMPLOYER);

		crewAllocationEClass = createEClass(CREW_ALLOCATION);
		createEAttribute(crewAllocationEClass, CREW_ALLOCATION__ROLE);
		createEReference(crewAllocationEClass, CREW_ALLOCATION__MEMBER);
		createEReference(crewAllocationEClass, CREW_ALLOCATION__FLIGHT);

		// Create enums
		roleEEnum = createEEnum(ROLE);
		genderEEnum = createEEnum(GENDER);
		airplaneTypeEEnum = createEEnum(AIRPLANE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(travelPlannerEClass, TravelPlanner.class, "TravelPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTravelPlanner_Airports(), this.getAirport(), null, "airports", null, 0, -1, TravelPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelPlanner_Airlines(), this.getAirline(), null, "airlines", null, 0, -1, TravelPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTravelPlanner_Passengers(), this.getPerson(), null, "passengers", null, 0, -1, TravelPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(airlineEClass, Airline.class, "Airline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAirline_Name(), ecorePackage.getEString(), "name", null, 0, 1, Airline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAirline_Flights(), this.getFlight(), null, "flights", null, 0, -1, Airline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAirline_Airplanes(), this.getAirplane(), null, "airplanes", null, 0, -1, Airline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAirline_Employees(), this.getPerson(), this.getPerson_Employer(), "employees", null, 0, -1, Airline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(airplaneEClass, Airplane.class, "Airplane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAirplane_Type(), this.getAirplaneType(), "type", null, 0, 1, Airplane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAirplane_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Airplane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAirplane_NumberOfSeats(), ecorePackage.getEInt(), "numberOfSeats", null, 0, 1, Airplane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAirplane_MinimumCrew(), ecorePackage.getEInt(), "minimumCrew", null, 0, 1, Airplane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAirplane_RequiredRunwayLengthTakeoff(), ecorePackage.getEInt(), "requiredRunwayLengthTakeoff", null, 0, 1, Airplane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAirplane_RequiredRunwayLengthLanding(), ecorePackage.getEInt(), "requiredRunwayLengthLanding", null, 0, 1, Airplane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flightEClass, Flight.class, "Flight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlight_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Flight.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_Airplane(), this.getAirplane(), null, "airplane", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_DepartureAirport(), this.getAirport(), null, "departureAirport", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_DestinationAirport(), this.getAirport(), null, "destinationAirport", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_DepartureGate(), this.getGate(), null, "departureGate", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_DestinationGate(), this.getGate(), null, "destinationGate", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_DestinationRunway(), this.getRunway(), null, "destinationRunway", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_DepartureRunway(), this.getRunway(), null, "departureRunway", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_Passengers(), this.getPerson(), null, "passengers", null, 0, -1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlight_Code(), ecorePackage.getEString(), "code", null, 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlight_DepartureTime(), ecorePackage.getEDate(), "departureTime", "2000-01-01T00:00:00.000+0100", 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlight_ArrivalTime(), ecorePackage.getEDate(), "arrivalTime", "2000-01-01T00:00:00.000+0100", 0, 1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlight_Allocations(), this.getCrewAllocation(), this.getCrewAllocation_Flight(), "allocations", null, 0, -1, Flight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(airportEClass, Airport.class, "Airport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAirport_Id(), ecorePackage.getEString(), "id", null, 0, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAirport_Location(), ecorePackage.getEString(), "location", null, 0, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAirport_Runways(), this.getRunway(), null, "runways", null, 0, -1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAirport_Gates(), this.getGate(), null, "gates", null, 0, -1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runwayEClass, Runway.class, "Runway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunway_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Runway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunway_Name(), ecorePackage.getEString(), "name", null, 0, 1, Runway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunway_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Runway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Person.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FamilyName(), ecorePackage.getEString(), "familyName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), this.getGender(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Allocations(), this.getCrewAllocation(), this.getCrewAllocation_Member(), "allocations", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Employer(), this.getAirline(), this.getAirline_Employees(), "employer", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crewAllocationEClass, CrewAllocation.class, "CrewAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrewAllocation_Role(), this.getRole(), "role", null, 0, 1, CrewAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrewAllocation_Member(), this.getPerson(), this.getPerson_Allocations(), "member", null, 0, 1, CrewAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrewAllocation_Flight(), this.getFlight(), this.getFlight_Allocations(), "flight", null, 0, 1, CrewAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.PILOT);
		addEEnumLiteral(roleEEnum, Role.FIRST_OFFICER);
		addEEnumLiteral(roleEEnum, Role.SECOND_OFFICER);
		addEEnumLiteral(roleEEnum, Role.PURSER);
		addEEnumLiteral(roleEEnum, Role.FLIGHT_ATTENDANT);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.FEMALE);
		addEEnumLiteral(genderEEnum, Gender.MALE);
		addEEnumLiteral(genderEEnum, Gender.OTHER);

		initEEnum(airplaneTypeEEnum, AirplaneType.class, "AirplaneType");
		addEEnumLiteral(airplaneTypeEEnum, AirplaneType.BOEING737800);
		addEEnumLiteral(airplaneTypeEEnum, AirplaneType.BOEING737700);
		addEEnumLiteral(airplaneTypeEEnum, AirplaneType.BOEING737600);
		addEEnumLiteral(airplaneTypeEEnum, AirplaneType.BOMBARDIER_DASH8100);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "settingDelegates", "http://www.eclipse.org/acceleo/query/1.0",
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (travelPlannerEClass,
		   source,
		   new String[] {
			   "constraints", "validateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimen"
		   });
		addAnnotation
		  (flightEClass,
		   source,
		   new String[] {
			   "constraints", "maximumPassengers minimumCrew validateRunwayLengthTakeOff validateRunwayLengthLanding validateRunwayExistsTakeOff validateRunwayExistsLanding validateGateTakeOff validateGateLanding validateCrew"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (flightEClass,
		   source,
		   new String[] {
			   "maximumPassengers", "self.passengers -> size() < self.airplane.numberOfSeats",
			   "minimumCrew", "self.allocations -> size() >= self.airplane.minimumCrew",
			   "validateRunwayLengthTakeOff", "self.departureRunway.length >= self.airplane.requiredRunwayLengthTakeoff\n",
			   "validateRunwayLengthLanding", "self.destinationRunway.length >= self.airplane.requiredRunwayLengthLanding",
			   "validateRunwayExistsTakeOff", "self.departureAirport.runways -> exists(r | r = self.departureRunway) ",
			   "validateRunwayExistsLanding", "self.destinationAirport.runways -> exists(r | r = self.destinationRunway) ",
			   "validateGateTakeOff", "self.departureAirport.gates -> exists(g | g = self.departureGate)",
			   "validateGateLanding", "self.destinationAirport.gates -> exists(g | g = self.destinationGate)",
			   "validateCrew", "((self.allocations-> collect(ca |ca.member)) -> intersection(self.passengers)) -> isEmpty()"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Person/fullName/%http:%2F%2Fwww.eclipse.org%2Facceleo%2Fquery%2F1.0%")
		   });
		addAnnotation
		  (getPerson_FullName(),
		   source,
		   new String[] {
			   "derivation", "self.firstName + \'  \' + self.familyName"
		   });
	}

} //AtPackageImpl
