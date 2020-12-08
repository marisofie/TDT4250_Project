# TDT4250 Semester Project - Diagram 💾

[Back to project](/README.md)

## Setup
To run this bundle and ***tdt4250.at.sirius.modelling*** you will need to install 
 - Sirius Specifier Environment
 - Ecore Diagram Editor (SDK)
 - EMF Forms SDK 
 - Acceleo Query SDK 

 To generate the different viewpoints, you go to the ***representations.aird*** file in the modelling bundle. Navigate to the representations and create new representations under the viewpoint you want to access. This does not include TravelPlannerTable, as this can be generated from the TravelPlannerDiagram. 

## Viewpoints
There are two different viewpoints chosen for the modeling.

### TravelPlanner
This viewpoint is meant for the people who has an oversight over airports and airlines around the world. There are two representations, one as a diagram and another as a table.

**Diagram view**
This view is meant to work as a platform for adding new airports and airlines to the system. It contains the airports and airlines the travel agency has access to and shows which airports a certain airline flies to. 

**Table view**
This view can be created from the diagram view if the travel planner want to get a more structured way of seeing the data. If the user wants to go back, (s)he can just right click and choose the diagram view again. 

The two views can be navigated between by right clicking outside of the elements in the diagram/table and choose ***open*** -> the other diagram. 

#### Features
**CreationTools**
 - Can create airlines
 - Can create airports with the related runways and gates
 - Can create a table view of the data to get a structured overview of the elements.

### Airline
This viewpoint is meant for the different airlines planning their flights.

#### Features
**Layers**
There are three layers chosen for the diagram:
 - Default:
   - This layer contains the flights and employees contained in the airline.
 - Airplane:
   - This layer contains the different airplanes owned by the airline.
 - Airports:
   - This layer contains the different airports with the related runways and gates that the airline flies to and from.

**Filter**
There is one filter implemented, which removes flights that have filled the minimum requirement for crew allocations. This is implemented as the diagram can become large, and by removing the already finished flights, the airline can focus on finishing flights that are not completed.

**CreationTools**
 - The tools for creating employees, flights and crew allocations are put in the Default layer.
   - In addition a tool which enables double clicking on a flight object, that sends the user to a new view which represents the flight in more detail. 
 - The tools for creating airplanes are put in the Airplane layer.
 - There are no tools in the airport layer, as the creation of these is meant for the TravelPlanner view.

 **Representations**
 - There are two representations in this view. AirlineDiagram and FlightDiagram. AirlineDiagram is the main diagram for airlines to plan flights. However, if a flight element is double-clicked the user will be sent to a new diagram for only flights, which gives the elements of the flight in more detail. If the user wants to go back it can click on the airline node in the flight diagram. 

## Properties
An additional tab is implemented for the different elements in our model. These are set up to be more easily in use for the user of the program. The new properties view can be found under the "General" tab.

Some features implemented in the properties view is:
 - Unfilled or wrong entries are colored red.
 - Only belonging elements can be selected for the selection widgets (e.g. gate must belong to selected airport).



