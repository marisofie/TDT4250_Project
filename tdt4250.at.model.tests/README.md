# Tests for tdt4250.at.model

[Back to project](/README.md)

## FlightTest.java

We chose to write a manual test for duration because we had to write a validation for the duration field. This is because we could not properly validate the `Date` object using OCL.

```java
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
```

Furthermore, we have tested that two flights cannot use the same runway at the same time. Once again this is due to the difficulty of validating `Date` objects using acceleo.

```java
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
```

We also tried to test that we could give different severity depending on how much time there is between the two flights.

```java
public void testValidateRunwayTrafficSeverityLessThanTwoMinutesApart() {
// 24 December 2020 at 12:00
Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 0).getTime();
flight.setDepartureTime(departureTime);
// 24 December 2020 at 12:06
Date otherDepartureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 1, 30).getTime();
otherFlight.setDepartureTime(otherDepartureTime);

// Set the same runway to both departures
Runway runway = AtFactory.eINSTANCE.createRunway();
flight.setDepartureRunway(runway);
otherFlight.setDepartureRunway(runway);

Diagnostic diagnostics = Diagnostician.INSTANCE.validate(flight);
assertEquals(Diagnostic.ERROR, findDiagnostics(diagnostics, flight, "validateOnlyOneFlightOnRunway").getSeverity());
}

public void testValidateRunwayTrafficSeverityLessThanEightMinutesApart() {
	// 24 December 2020 at 12:00
	Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 0).getTime();
	flight.setDepartureTime(departureTime);
	// 24 December 2020 at 12:06
	Date otherDepartureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 6).getTime();
	otherFlight.setDepartureTime(otherDepartureTime);

	// Set the same runway to both departures
	Runway runway = AtFactory.eINSTANCE.createRunway();
	flight.setDepartureRunway(runway);
	otherFlight.setDepartureRunway(runway);

	Diagnostic diagnostics = Diagnostician.INSTANCE.validate(flight);
	assertEquals(Diagnostic.WARNING, findDiagnostics(diagnostics, flight, "validateOnlyOneFlightOnRunway").getSeverity());
}

public void testValidateRunwayTrafficSeverityLessThanFifteenMinutesApart() {
	// 24 December 2020 at 12:00
	Date departureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 0).getTime();
	flight.setDepartureTime(departureTime);
	// 24 December 2020 at 12:06
	Date otherDepartureTime = new GregorianCalendar(2020, Calendar.DECEMBER, 24, 12, 14).getTime();
	otherFlight.setDepartureTime(otherDepartureTime);

	// Set the same runway to both departures
	Runway runway = AtFactory.eINSTANCE.createRunway();
	flight.setDepartureRunway(runway);
	otherFlight.setDepartureRunway(runway);

	Diagnostic diagnostics = Diagnostician.INSTANCE.validate(flight);
	assertEquals(Diagnostic.INFO, findDiagnostics(diagnostics, flight, "validateOnlyOneFlightOnRunway").getSeverity());
}
```