/**
 */
package at.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.Diagnostician;

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
 * A test case for the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link at.Flight#getDuration() <em>Duration</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FlightTest extends TestCase {

	/**
	 * The fixture for this Flight test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Flight fixture = null;
	protected Flight flight = null;
	protected Flight otherFlight = null;
	protected TravelPlanner tp = null;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlightTest.class);
	}

	/**
	 * Constructs a new Flight test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlightTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Flight test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Flight fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Flight test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Flight getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		// Crate Flight Planner instance
		this.tp = AtFactory.eINSTANCE.createTravelPlanner();
		
		// Create two separate Airlines
		this.tp.getAirlines().add(AtFactory.eINSTANCE.createAirline());
		this.tp.getAirlines().add(AtFactory.eINSTANCE.createAirline());
		
		// Instantiate the two different flights and add them to the two different airlines
		this.flight = AtFactory.eINSTANCE.createFlight();
		this.tp.getAirlines().get(0).getFlights().add(this.flight);
		this.otherFlight = AtFactory.eINSTANCE.createFlight();
		this.tp.getAirlines().get(1).getFlights().add(this.otherFlight);
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
		this.otherFlight = null;
		this.flight = null;
		this.tp = null;
	}

	/**
	 * Tests the '{@link at.Flight#getDuration() <em>Duration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.Flight#getDuration()
	 * @generated NOT
	 */
	public void testGetDuration() {
		
		Flight flight = AtFactory.eINSTANCE.createFlight();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		try {
			flight.setDepartureTime(formatter.parse("2020-11-02T06:55:00.000+0100"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			flight.setArrivalTime(formatter.parse("2020-11-02T07:55:00.000+0100"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		assertEquals(flight.getDuration(), 60);
	}
	
	public void testValidateRunwayTrafficWithTheSameDepartureTime() {
        // 24 December 2020 at 12:00
        Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 0).getTime();
        flight.setDepartureTime(departureTime);
        otherFlight.setDepartureTime(departureTime);
        
        // Set the same runway to both departures
        Runway runway = AtFactory.eINSTANCE.createRunway();
        flight.setDepartureRunway(runway);
        otherFlight.setDepartureRunway(runway);
        
        assertFalse(
                AtValidator.INSTANCE.validateFlight_validateOnlyOneFlightOnRunway(flight, null, null)
        );
	}
	
	public void testValidateRunwayTrafficWithTwoDateObjectsWithSameDepTime() {
		// 24 December 2020 at 12:00
		Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 0).getTime();
		// 24 December 2020 at 12:00
		Date otherDepartureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 0).getTime();
		flight.setDepartureTime(departureTime);
		otherFlight.setDepartureTime(otherDepartureTime);
		
		// Set the same runway to both departures
		Runway runway = AtFactory.eINSTANCE.createRunway();
		flight.setDepartureRunway(runway);
		otherFlight.setDepartureRunway(runway);
		
		assertFalse(
				AtValidator.INSTANCE.validateFlight_validateOnlyOneFlightOnRunway(flight, null, null)
		);
	}
	
	public void testValidateRunwayTrafficSameTimeOnDifferentDates() {
		// 24 December 2020 at 12:00
		Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 0).getTime();
		// 25 December 2020 at 12:00
		Date otherDepartureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 25, 12, 0).getTime();
		flight.setDepartureTime(departureTime);
		otherFlight.setDepartureTime(otherDepartureTime);
		
		// Set the same runway to both departures
		Runway runway = AtFactory.eINSTANCE.createRunway();
		flight.setDepartureRunway(runway);
		otherFlight.setDepartureRunway(runway);
		
		assertTrue(
				AtValidator.INSTANCE.validateFlight_validateOnlyOneFlightOnRunway(flight, null, null)
		);
	}	

} //FlightTest
