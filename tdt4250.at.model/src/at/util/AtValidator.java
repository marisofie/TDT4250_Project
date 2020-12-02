/**
 */
package at.util;

import at.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see at.AtPackage
 * @generated
 */
public class AtValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AtValidator INSTANCE = new AtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "at";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AtPackage.TRAVEL_PLANNER:
				return validateTravelPlanner((TravelPlanner)value, diagnostics, context);
			case AtPackage.AIRLINE:
				return validateAirline((Airline)value, diagnostics, context);
			case AtPackage.AIRPLANE:
				return validateAirplane((Airplane)value, diagnostics, context);
			case AtPackage.FLIGHT:
				return validateFlight((Flight)value, diagnostics, context);
			case AtPackage.AIRPORT:
				return validateAirport((Airport)value, diagnostics, context);
			case AtPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case AtPackage.RUNWAY:
				return validateRunway((Runway)value, diagnostics, context);
			case AtPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case AtPackage.CREW_ALLOCATION:
				return validateCrewAllocation((CrewAllocation)value, diagnostics, context);
			case AtPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case AtPackage.GENDER:
				return validateGender((Gender)value, diagnostics, context);
			case AtPackage.AIRPLANE_TYPE:
				return validateAirplaneType((AirplaneType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelPlanner(TravelPlanner travelPlanner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(travelPlanner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirline(Airline airline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirplane(Airplane airplane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airplane, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(flight, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_maximumPassengers(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_minimumCrew(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_validateRunwayLengthTakeOff(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_validateRunwayLengthLanding(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_validateRunwayExistsTakeOff(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_validateRunwayExistsLanding(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_validateGateTakeOff(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_validateGateLanding(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_validateCrew(flight, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlight_validateOnlyOneFlightOnRunway(flight, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maximumPassengers constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__MAXIMUM_PASSENGERS__EEXPRESSION = "self.passengers -> size() < self.airplane.numberOfSeats";

	/**
	 * Validates the maximumPassengers constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_maximumPassengers(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "maximumPassengers",
				 FLIGHT__MAXIMUM_PASSENGERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minimumCrew constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__MINIMUM_CREW__EEXPRESSION = "self.allocations -> size() >= self.airplane.minimumCrew";

	/**
	 * Validates the minimumCrew constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_minimumCrew(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "minimumCrew",
				 FLIGHT__MINIMUM_CREW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateRunwayLengthTakeOff constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__VALIDATE_RUNWAY_LENGTH_TAKE_OFF__EEXPRESSION = "self.departureRunway.length >= self.airplane.requiredRunwayLengthTakeoff\n" +
		"";

	/**
	 * Validates the validateRunwayLengthTakeOff constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_validateRunwayLengthTakeOff(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validateRunwayLengthTakeOff",
				 FLIGHT__VALIDATE_RUNWAY_LENGTH_TAKE_OFF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateRunwayLengthLanding constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__VALIDATE_RUNWAY_LENGTH_LANDING__EEXPRESSION = "self.destinationRunway.length >= self.airplane.requiredRunwayLengthLanding";

	/**
	 * Validates the validateRunwayLengthLanding constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_validateRunwayLengthLanding(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validateRunwayLengthLanding",
				 FLIGHT__VALIDATE_RUNWAY_LENGTH_LANDING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateRunwayExistsTakeOff constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__VALIDATE_RUNWAY_EXISTS_TAKE_OFF__EEXPRESSION = "self.departureAirport.runways -> exists(r | r = self.departureRunway) ";

	/**
	 * Validates the validateRunwayExistsTakeOff constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_validateRunwayExistsTakeOff(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validateRunwayExistsTakeOff",
				 FLIGHT__VALIDATE_RUNWAY_EXISTS_TAKE_OFF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateRunwayExistsLanding constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__VALIDATE_RUNWAY_EXISTS_LANDING__EEXPRESSION = "self.destinationAirport.runways -> exists(r | r = self.destinationRunway) ";

	/**
	 * Validates the validateRunwayExistsLanding constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_validateRunwayExistsLanding(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validateRunwayExistsLanding",
				 FLIGHT__VALIDATE_RUNWAY_EXISTS_LANDING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateGateTakeOff constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__VALIDATE_GATE_TAKE_OFF__EEXPRESSION = "self.departureAirport.gates -> exists(g | g = self.departureGate)";

	/**
	 * Validates the validateGateTakeOff constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_validateGateTakeOff(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validateGateTakeOff",
				 FLIGHT__VALIDATE_GATE_TAKE_OFF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateGateLanding constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__VALIDATE_GATE_LANDING__EEXPRESSION = "self.destinationAirport.gates -> exists(g | g = self.destinationGate)";

	/**
	 * Validates the validateGateLanding constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_validateGateLanding(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validateGateLanding",
				 FLIGHT__VALIDATE_GATE_LANDING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateCrew constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLIGHT__VALIDATE_CREW__EEXPRESSION = "((self.allocations-> collect(ca |ca.member)) -> intersection(self.passengers)) -> isEmpty()";

	/**
	 * Validates the validateCrew constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlight_validateCrew(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AtPackage.Literals.FLIGHT,
				 flight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validateCrew",
				 FLIGHT__VALIDATE_CREW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the validateOnlyOneFlightOnRunway constraint of '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFlight_validateOnlyOneFlightOnRunway(Flight flight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		int trafficSeverity = validateRunwayTraffic(flight);
		
		if (trafficSeverity > 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(getDiagnosticSeverity(trafficSeverity),
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateOnlyOneFlightOnRunway", getObjectLabel(flight, context) },
						 new Object[] { flight },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private int getDiagnosticSeverity(int trafficSeverity) {
		switch (trafficSeverity) {
		case 1:
			return Diagnostic.INFO;
		case 2:
			return Diagnostic.ERROR;
		case 3:
			return Diagnostic.WARNING;
		default:
			return Diagnostic.OK;
		}
	}
	
	private int validateRunwayTraffic(Flight flight) {
		// Need the root to be able to iterate over all flights
		TravelPlanner tp = (TravelPlanner) flight.eContainer().eContainer();
		int trafficSeverity = 0;
		
		for (Airline airline : tp.getAirlines()) {
			for (Flight otherFlight : airline.getFlights()) {
				if (flight.equals(otherFlight)) {
					continue;
				} else {
					int tempSeverity = flight.validateRunwayTraffic(otherFlight);
					if (tempSeverity > trafficSeverity) {
						trafficSeverity = tempSeverity;
					}
					if (trafficSeverity == 3) {
						return trafficSeverity;
					}
				}
			}
		}
		return trafficSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirport(Airport airport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunway(Runway runway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrewAllocation(CrewAllocation crewAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crewAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGender(Gender gender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirplaneType(AirplaneType airplaneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AtValidator
