/**
 */
package at.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import at.AtFactory;
import at.Flight;

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
	 * @generated
	 */
	protected Flight fixture = null;

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
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AtFactory.eINSTANCE.createFlight());
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

} //FlightTest
