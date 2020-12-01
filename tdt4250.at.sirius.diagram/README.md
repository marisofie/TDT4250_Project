# TDT4250 Semester Project - Diagram💾

## Viewpoints
There are two different viewpoints chosen for the modeling. 

### TravelPlanner
This viewpoint is meant for the people who has an oversight over airports and airlines around the world. 

#### Features
**CreationTools**
 - Can create airlines 
 - Can create airports with the related runways and gates 


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

##CreationTools**
 - The tools for creating employees, flights and crew allocations are put in the Default layer.
 - The tools for creating airplanes are put in the Airplane layer. 
 - There are no tools in the airport layer, as the creation of these is meant for the TravelPlanner view. 

## Properties
An additional tab is implemented for the different elements in our model. These are set up to be more easily in use for the user of the program. The new properties view can be found under the "General" tab. 

Some features implemented in the properties view is:
 - Unfilled or wrong entries are colored red.
 - Only belonging elements can be selected for the selection widgets (e.g. gate must belong to selected airport). 

CREATE TABLE VIEWPOINT FOR FLIGHTS FOR AN AIRLINE; PUT INFORMATION ABOUT IMPLEMENTATION HERE
   
