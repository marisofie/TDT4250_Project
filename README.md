# TDT4250 Semester Project 💾

## Short introduction to domain
We have decided to model air flight from a flight planning view. The task will be to create a clean and systematic model of how one would plan different flights for different airlines.

We want to use Sirius to make it easy for the ones planning the flights. And we want to use transformation to text to make the flight data available for customers.

## Project overview 📢

  - tdt4250.at.acceleo.html     --> Model to Text in the form of differnt html sites. [Read more here.](./tdt4250.at.acceleo.html/README.md)
  - tdt4250.at.model            --> Ecore model.  [Read more here.](./tdt4250.at.model/README.md)
  - tdt4250.at.model.tests      --> Tests for the model.  [Read more here.](./tdt4250.at.model.tests/README.md)
  - tdt4250.at.sirius.diagram   -->
  - tdt4250.at.sirius.modelling -->

## Features 🔥

### User Features

- A presentable overview of all flights provided by an airline
- Options for different airline flight overviews

### Technical Features

- Model to Text transformation using Acceleo (tdt4250.at.accele.html)
- DSL using Sirius (?)

## Learning objectives

- Modelling a complex domain
  - Airplane travel
- Component Based Design
- Use Sirius
  - Workbench for travel planners scheduling flights
- Use Acceleo
  - M2T --> display the flights for the customers
- EMF Forms

## Constraints and derived features ✈️

#### TravelPlanner
  - **Constraints**
    - <constraintname>: A single plane cannot be on different flights, hence it must be available for the planned flight
#### Airline
  - **Constraints**
    - hasUniqueAirplanes: Airline must have unique airplanes, cannot add two instances of the same airplane in the system.
      - Uses id of the airplane to check if it is unique, and is there dependant on `validateHasUniqueId` on Airplanes.
#### Airplane
  - **Constraints**
    - validateHasUniqueId: ensure that all airplanes has unique id relative to it's airline
      - We assume that all airlines own separate airplanes, and do therefore not check the id globally.
      - We could have given all airplanes unique id's by collecting all airplanes from TravelPlanner: `self.eContainer().eContainer().airlines.airplanes -> isUnique(plane | plane.id)`.
#### Flight
  - **Constraints**
    - validateRunwayIsBusy: Two airplanes cannot use the same runway at the same time.
      - We have different severity depending on how much time there is between the two different flights. The most pressing severity is the on that is returned to the user.
        - Under 2 minutes between => ERROR
        - From 2 up to 8 minutes => WARNING
        - From 8 up to 15 minutes => INFO
        - 15 minutes or longer => OKAY
    - MaximumPassengers: Number of passengers cannot excede number of seats on flight.
    - ValdidateRunwayLengthTakeOff, ValidateRunwayLengthLanding: Runway chosen must be long enough for given airplane.
    - ValidateRunwayExistsTakeOff, ValidateRunwayExistsLanding: Runway chosen belongs to the correct airport.
    - ValidateGateTakeOff, ValidateGateLanding: Only gates belonging to the selected airport can be chosen.
    - MinimumCrew: Crew is equal to or bigger than minimumcrew for airplane.
    - ValidateCrew: Person cannot be passenger and part of crew.
    - validateCrewHasUniqueRole: A crew member must have a unique role on any given flight.
  - **Derived features**
    - duration: derived from arrivaltime - departuretime
      - Written with ecore constraint (not OCL), therefore also tested manually.
#### Airport
#### Gate
#### Runway
#### Person
  - **Derived features**
    - fullName: derived from firstName and familyName
#### Crew
  - **Constraints**
    - <constraintname>: no duplicate roles for crew members (?)
#### CrewAllocation

## Limitations

Limitations are mostly constraints that we are aware of, but for different reasons have not implemented. Mostly, we argue that the limitations are not implemented because of limited time.
In some cases we also argue that we have not implemented a feature or constraint because we have already made similar validation or feature, and would like to focus on implementing different variations with the goal of learning more.

- Travel planners must ensure that an airplane is at the correct airport for the chosen flight
  - Ways this can be implemente as a validation:
    - Look at flight, check the last flight that the airplane was used for and determine if it is on the airport it is needed.
- `validatePlaneAlreadyInUse` - would check if a plane is already set to be used on flight at the same time.
  - This would require some manual validation because it's dependant on the Date object, we would therefore argue that we have made a similar feature in `validateRunwayIsBusy` under `Flight`.

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

## Sirius
The different features implemented for the viewpoints can be found in the sirius.modeling bundle [here](tdt4250.at.sirius.diagram).

## References
Icons collected from [flavicon](https://www.flaticon.com/), made by:
- Freepik
- Those Icons
- xnimrodx
- Eucalyp

