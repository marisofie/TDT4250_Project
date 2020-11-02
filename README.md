# TDT4250_Project 💾

## Project overview 📢

    - tdt4250.at.model
    - tdt4250.at.model.tests
    - tdt4250.at.acceleo.html

## Features 🔥

### User Features

- A presentable overview of all flights provided by an airline
- Options for different airline flight overviews

### Technical Features

- Model to Text transformation using Acceleo

## Learning objectives

- Modelling a complex domain
  - Airplane travel
- Component Based Design
- Use Xtext
  - Create an environment / editor for the airplane company planners to create flights
- Use Sirius
  - Constraints
  - M2T --> display the flights for the customers
- EMF Forms

## Constraints and derived features ✈️

    - Airline

    - Airplane
    - Flight
      - NumberOfPassenger <= Plane.NumberOfSeats (OCL) - Note to self: - Hvorfor dukker denne opp i atValidator og forventer at vi skal skrive den på nytt?
      - Sjekk at person ikke både er passasjer og del av crew
      - Duration = arrivaltime – departuretime (derived)
        - Make sure that time zone is also accounted for
        - Duration given in minutes
        - _Takes timezones into account!_
        - Constraint tested by using tests in (FlightTest.java).
      - Check that takeoff and landing runway is long enough.
        - DepartureAirport has long enough runway for takeoff
        - ArrivalAirport has long enough runway for landing.
      - Make sure that only gates at the correct airport is validated when choosing gates.
      - Check that minimumcrew is validated for airplane.
    - Airport
    - Gate
    - Runway
    - Person
      - FullName – derived from firstName and familyName
    - Crew
      - Check that there are not duplicate roles for crew members?

## Classes

    - TravelPlanner

      - Top class
      - Has multiple airlines and multiple airports

    - Airline
    - Airport
    - Airplane

      - Is now contained in Airline, but could be argumented that it can exist without an airline, and be referenced by the airline instead. We have decided to keep it contained within an airline.
      - Did not include weight or maximumweight, as our application is designed for travel planners and not plane engineers.

    - Flight

      - We are modeling for domestic flights. Therefore does not have an attribute for country.

    - Runway
      - https://no.wikipedia.org/wiki/Oslo_lufthavn_(Gardermoen)#Rullebaner_og_flytrafikkontroll
      - https://no.wikipedia.org/wiki/Oslo_lufthavn_(Gardermoen)#Rullebaner_og_flytrafikkontroll

## Data types

    • Role
    	○ https://en.wikipedia.org/wiki/Aircrew
    • Gender
    	○ Male
    	○ Female
    	○ Other
    • AirplaneType
    	○ https://nn.wikipedia.org/wiki/SAS
    	○ https://en.wikipedia.org/wiki/Boeing_737#737-800
