/**
 */
package at.tests;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import at.Airline;
import at.AtFactory;
import at.Flight;
import at.Runway;
import at.TravelPlanner;
import at.util.AtValidator;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Travel Planner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelPlannerTest extends TestCase {

	/**
	 * The fixture for this Travel Planner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelPlanner fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TravelPlannerTest.class);
	}

	/**
	 * Constructs a new Travel Planner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelPlannerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Travel Planner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TravelPlanner fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Travel Planner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelPlanner getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AtFactory.eINSTANCE.createTravelPlanner());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	public void testValidateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimen() {
		TravelPlanner tp = AtFactory.eINSTANCE.createTravelPlanner();
		Airline airline = AtFactory.eINSTANCE.createAirline();
		tp.getAirlines().add(airline);
		
		Flight flight = AtFactory.eINSTANCE.createFlight();
		airline.getFlights().add(flight);
		Flight otherFlight = AtFactory.eINSTANCE.createFlight();
		airline.getFlights().add(otherFlight);
		
		
		// 24 December 2020 at 12:00
		Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 21, 12, 0).getTime();
		flight.setDepartureTime(departureTime);
		otherFlight.setDepartureTime(departureTime);
		
		// Set the same runway to both departures
		Runway runway = AtFactory.eINSTANCE.createRunway();
		flight.setDepartureRunway(runway);
		otherFlight.setDepartureRunway(runway);
		
		
		assertFalse(
				AtValidator.INSTANCE.validateTravelPlanner_validateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimen(tp, null, null)
		);
	}
	
	public void testValidateRunwayBusyWithTwoDateObjects() {
		TravelPlanner tp = AtFactory.eINSTANCE.createTravelPlanner();
		Airline airline = AtFactory.eINSTANCE.createAirline();
		tp.getAirlines().add(airline);
		
		Flight flight = AtFactory.eINSTANCE.createFlight();
		airline.getFlights().add(flight);
		Flight otherFlight = AtFactory.eINSTANCE.createFlight();
		airline.getFlights().add(otherFlight);
		
		
		// 24 December 2020 at 12:00
		Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 21, 12, 0).getTime();
		Date otherDepartureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 21, 12, 0).getTime();
		flight.setDepartureTime(departureTime);
		otherFlight.setDepartureTime(otherDepartureTime);
		
		// Set the same runway to both departures
		Runway runway = AtFactory.eINSTANCE.createRunway();
		flight.setDepartureRunway(runway);
		otherFlight.setDepartureRunway(runway);
		
		
		assertFalse(
				AtValidator.INSTANCE.validateTravelPlanner_validateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimen(tp, null, null)
		);
	}
	
	public void testValidateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimenWithDifferentAirlines() {
		TravelPlanner tp = AtFactory.eINSTANCE.createTravelPlanner();
		
		Airline airline = AtFactory.eINSTANCE.createAirline();
		Airline otherAirline = AtFactory.eINSTANCE.createAirline();
		tp.getAirlines().add(airline);
		tp.getAirlines().add(otherAirline);
		
		Flight flight = AtFactory.eINSTANCE.createFlight();
		airline.getFlights().add(flight);
		Flight otherFlight = AtFactory.eINSTANCE.createFlight();
		otherAirline.getFlights().add(otherFlight);
		
		
		// 24 December 2020 at 12:00
		Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 21, 12, 0).getTime();
		flight.setDepartureTime(departureTime);
		otherFlight.setDepartureTime(departureTime);
		
		// Set the same runway to both departures
		Runway runway = AtFactory.eINSTANCE.createRunway();
		flight.setDepartureRunway(runway);
		otherFlight.setDepartureRunway(runway);
		
		
		assertFalse(
				AtValidator.INSTANCE.validateTravelPlanner_validateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimen(tp, null, null)
		);
	}
	
	public void testValidateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimenSuccessWhenTimeIsDifferent() {
		TravelPlanner tp = AtFactory.eINSTANCE.createTravelPlanner();
		Airline airline = AtFactory.eINSTANCE.createAirline();
		tp.getAirlines().add(airline);
		
		Flight flight = AtFactory.eINSTANCE.createFlight();
		airline.getFlights().add(flight);
		Flight otherFlight = AtFactory.eINSTANCE.createFlight();
		airline.getFlights().add(otherFlight);
		
		
		// 21 December 2020 at 12:00
		Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 21, 12, 0).getTime();
		// 24 December 2020 at 12:00
		Date otherDepartureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 0).getTime();
		flight.setDepartureTime(departureTime);
		otherFlight.setDepartureTime(otherDepartureTime);
		
		// Set the same runway to both departures
		Runway runway = AtFactory.eINSTANCE.createRunway();
		flight.setDepartureRunway(runway);
		otherFlight.setDepartureRunway(runway);
		
		
		assertTrue(
				AtValidator.INSTANCE.validateTravelPlanner_validateRunwayMayOnlyBeUsedByOneFlightAtAGivenTimen(tp, null, null)
		);
	}
	
	

} //TravelPlannerTest
