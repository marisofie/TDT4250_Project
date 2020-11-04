# TDT4250 Semester Project 💾

## Short introduction to domain
We have decided to model air flight from a flight planning view. The task will be to create a clean and systematic model of how one would plan different flights for different airlines.
    
We want to use Sirius to make it easy for the ones planning the flights. And we want to use transformation to text to make the flight data available for customers.

## Project overview 📢

    - tdt4250.at.acceleo.html
    - tdt4250.at.model
    - tdt4250.at.model.tests
    - tdt4250.at.acceleo.html
    - tdt4250.at.sirius.diagram
    - tdt4250.at.sirius.modelling

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
- Use Xtext (?) -- REMOVE?
  - Create an environment / editor for the airplane company planners to create flights
- Use Sirius
  - Workbench for travel planners scheduling flights 
- Use Acceleo 
  - M2T --> display the flights for the customers
- EMF Forms

## Constraints and derived features ✈️

#### TravelPlanner
  - **Constraints**
    - <constraintname>: Two airplanes cannot use the same runway at the same time
    - <constraintname>: A single plane cannot be on different flights, hence it must be available for the planned flight
#### Airline
#### Airplane
#### Flight
  - **Constraints**
    - NumberOfPassenger: Number of passengers cannot excede number of seats on flight 
      - Q: why does this appear in atValidator class and expects us to implement it in code?
    - ValdidateRunwayLengthTakeOff: Runway chosen must be long enough for given airplane (takeoff)
    - ValidateRunwayLengthLanding: Runway chosen must be long enough for given airplane (landing)
    - <constraintname>: Only gates belonging to the selected airport can be chosen
    - <constraintname>: Crew is equal to or bigger than minimumcrew for airplane
    - <constraintname>: Person cannot be passenger and part of crew
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
