# Test project for the tdt.4250.at.model

[Back to project](/README.md)

## FlightTest.java

We chose to write a manual test for duration because had to write a validation for the duration field. This is because we could not properly validate the `Date` object using acceleo.

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
