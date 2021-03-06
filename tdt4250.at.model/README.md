# TDT4250 Semester Project - Ecore Model 💾
A diagram showing our ecore model is presented below. Underneath follows a description of the classes chosen for the model, data types and different constraints and validations implemented. 

![Image of Ecore diagram](https://user-images.githubusercontent.com/34618612/100888292-38688c00-34b6-11eb-94b0-d271e70306ae.png)

## Main Classes
- TravelPlanner
  - Root class
  - Has multiple persons, airlines and multiple airports
- Airline
  - Contains the related flights, airplanes, employees and airports it flies to and from. 
- Airport
  - Contains related runways and gates
- Airplane
  - Is now contained in Airline, but could be argued that it can exist without an airline, and be referenced by the airline instead. In this implementation we assume that an airplane cannot be shared between airlines and therefore it is contained by the airline.      
  - Does not include weight or maximum weight, as our application is designed for travel planners and not plane engineers.
  - The different airplane types and their correct attributes have been found from various web pages. Following are the links:
      - [SAS](https://nn.wikipedia.org/wiki/SAS) 
      - [Boeing 737](https://en.wikipedia.org/wiki/Boeing_737)
      - [Runway lengths required 737-800](http://krepelka.com/fsweb/learningcenter/aircraft/flightnotesboeing737-800.htm)
      - [Runway lengths required 737-600](https://skybrary.aero/index.php/B736)
      - [Runway lengths required Bombardier](https://prijet.com/performance/Bombardier%20DeHavilland%20Dash%208-100)
- Flight
  - We are modeling for domestic flights. Therefore there is not no attribute for country.
  - Flights are created by looking at flights at the airlines' web pages. By example flights contained in SAS are found at https://www.sas.no. 
- Runway
  - Runways are retrieved from the web from: 
  - Oslo (OSL): [Wikipedia](https://no.wikipedia.org/wiki/Oslo_lufthavn_(Gardermoen)#Rullebaner_og_flytrafikkontroll).
  - Trondheim (TRD): [Wikipedia](https://en.wikipedia.org/wiki/Trondheim_Airport,_Værnes).
  - Sandefjord (TRF): [Wikipedia](https://en.wikipedia.org/wiki/Sandefjord_Airport,_Torp).


## Data types
- Role
    - The different roles included were found [here](https://en.wikipedia.org/wiki/Aircrew).
    - We did not include all roles mentioned. 
- Gender
    - Male
    - Female
    - Other
- AirplaneType
    - Boeing 737-800
    - Boeing 737-700
    - Boeing 737-600
    - Bombardier DHC-8 Dash 8-100

## Constraints and derived features ✈️
_All constraints and derived features are written with OCL if not specified._
#### Airline
  - **Constraints**
    - `validateHasUniqueAirplanes`: Airline must have unique airplanes, cannot add two instances of the same airplane in the system.
      - Uses id of the airplane to check if it is unique, and is dependent on `validateHasUniqueId` in Airplane class.
#### Airplane
  - **Constraints**
    - `validateHasUniqueId`: ensure that all airplanes has unique id relative to its airline
      - We assume that all airlines own separate airplanes, and do therefore not check the id globally.
      - We could have given all airplanes unique id's by collecting all airplanes from TravelPlanner: `self.eContainer().eContainer().airlines.airplanes -> isUnique(plane | plane.id)`.
#### Flight
  - **Constraints**
    - `validateRunwayIsBusy`: Two airplanes cannot use the same runway at the same time.
      - We have different severity depending on how much time there is between the two different flights. The most pressing severity is the on that is returned to the user (Ecore, not OCL).
        - Under 2 minutes between => ERROR
        - From 2 up to 8 minutes => WARNING
        - From 8 up to 15 minutes => INFO
        - 15 minutes or longer => Validation is okay
    - `maximumPassengers`: Number of passengers cannot excede number of seats on flight.
    - `valdidateRunwayLengthTakeOff`, `validateRunwayLengthLanding`: Runway chosen must be long enough for given airplane.
    - `validateRunwayExistsTakeOff`, `validateRunwayExistsLanding`: Runway chosen belongs to the correct airport.
    - `validateGateTakeOff`, `validateGateLanding`: Only gates belonging to the selected airport can be chosen.
    - `minimumCrew`: Crew is equal to or bigger than minimumcrew for airplane.
    - `validateCrew`: Person cannot be passenger and part of crew.
    - `validateCrewHasUniqueRole`: A crew member must have a unique role on any given flight.
  - **Derived features**
    - duration: derived from arrivaltime - departuretime
      - Implemented in Java. 
#### Person
  - **Derived features**
    - fullName: derived from firstName and familyName 

## Limitations
Limitations are mostly constraints that we are aware of, but for different reasons have not implemented. Mostly, we argue that the limitations are not implemented because of limited time. 
In some cases we also argue that we have not implemented a feature or constraint because we have already made a similar validation or feature, and would like to focus on implementing different variations with the goal of learning more.

- Airlines must ensure that an airplane is at the correct airport for the chosen flight
  - Ways this can be implemented as a validation:
    - Look at flight, check the last flight that the airplane was used for and determine if it is on the airport it is needed.
- `validatePlaneAlreadyInUse` - would check if an airplane is already set to be used on a flight which overlaps with the new flight.
  - This would require some manual validation because it's dependent on the Date object, we would therefore argue that we have made a similar feature in `validateRunwayIsBusy` under `Flight`.
- `validateCrewMemberAvailable` - would check if a given employee is available for a flight.
  - Similarily as the validation above this would require manual validation because we would have to validate with regards to the date, duration and location of the flight.
- Flight must ensure that arrival time is after departure time. 
  - This has the same validation as the one above, where we would have used the date to compare and make sure that the departure occurs before the arrival. 


