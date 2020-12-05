# TDT4250 Semester Project 💾
*Semester project in the course [TDT4250 - Advanced Software Design](https://www.ntnu.edu/studies/courses/TDT4250#tab=omEmnet) at NTNU*

*Made by: Ådne Karstad, Sigrid Marita Kvamme and Mari Sofie Lerfaldet*

## Short introduction to domain
In this project we model the planning of flights both from a travelplanner perspective and an airline perspective. The travelplanner can see an overview of all airlines, airports and their related flights. It can add new airports and airlines to their domain. The airlines can plan their flights. 

To model our domain we use Ecore modelling. We then create a DSL by using Sirius to create different viewpoints for travelplanners and airlines. The viewpoints are meant to be workbenches where travelplanners can adminstrate airports and airlines, while airlines can create flights. Lastly, we transform from model to text with Acceleo, where the user can see all the flights for the different airlines. The representation in Acceleo is meant for customers looking for a flight or travelplanners who are looking for flights to book for their clients. 


## Project overview 📢
  - tdt4250.at.acceleo.html     --> Model to Text in the form of differnt html sites. [Description](./tdt4250.at.acceleo.html/README.md)
  - tdt4250.at.model            --> Ecore model.  [Description](./tdt4250.at.model/README.md)
  - tdt4250.at.model.tests      --> Tests for the model.  [Description](./tdt4250.at.model.tests/README.md)
  - tdt4250.at.sirius.diagram   --> Descriptions of the viewpoints in Sirius. [Description](./tdt4250.at.sirius.diagram/README.md)
  - tdt4250.at.sirius.modelling --> Representations of the viewpoints in Sirius. [Description](./tdt4250.at.sirius.modelling/README.md)

## Required installations
  - Acceleo
  - Sirius
  - Ecore
**NB: sjekk her om hva som må installeres. Skriv det muligens inn for hver enkelt bundle, altså sirius under sirius.model osv...**

## Features 🔥
### User Features
- A presentable overview of all flights provided by an airline.
- Creation of flights for airlines. 
- Creation of airlines and airports to domain for travelplanners.

### Technical Features
- Modelling using Ecore
  - Constraints implemented by using both Ecore and OCL
- Model to Text transformation using Acceleo 
- DSL using Sirius, to create interactive workbenches for travelplanners and airlines.

## Learning objectives
- Modelling a complex domain
  - Airplane travel
  - EMF forms
- Component Based Design
- Create a domain specific language using Sirius
- Transforming model to text using Acceleo
  - M2T --> display the flights for the customers

## References
Icons collected from [flavicon](https://www.flaticon.com/), made by:
- Freepik
- Those Icons
- xnimrodx
- Eucalyp

