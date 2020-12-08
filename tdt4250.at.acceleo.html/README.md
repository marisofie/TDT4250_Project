# Model to text with Acceleo

[Back to project](/README.md)

Acceleo is a template-based techonology that allows us to automatically generate informative source code based on the `flight planner` models and the code templated defined in `AirFlight2Text.mtl` file.

We use Acceleo to specifically take the model flight data that we produce in **Sirius** to produce informative web pages. While the **Sirius diagram editor** is created for employees at a (fictive) flight planner company, the **Acceleo produced web pages** are meant for customers that want to find flights. Hence, we decided to use M2T transformation to be able to produce generic lists of flight information for the customers.

If configuration is not something you want, the project should already have produced html pages inside `tdt4250.at.acceleo.html.result`.

## Configuration

To be able to run the transformation you will need to configure it to run in Eclipse.

1. Right click the `AirFlight2Text.mtl` file
2. Select `Run As` -> `Run Configurations...` and a new config window will open.
3. Make sure that you are configuring an `Acceleo Application`
4. Give the configuration an approriate name, e.g. `AirFlight2Text`.
5. Fill in the follwing fields:
   1. Project: `tdt4250.at.acceleo.html`
   2. Main Class: `tdt4250.at.acceleo.html.AirFlight2text`
   3. Model: `/tdt4250.at.sirius.modelling/TravelPlanner.xmi`
   4. Target: `/tdt4250.at.acceleo.html/src/tdt50/at/acceleo/html/result` <-- may set to a differnt location, but this one is recommended.
6. Ensure the configuration Runner is set to `Java Application`.
7. You may now run the configuration.

Your configration should look like this:

![Image of AirFlight2Text Configuration](https://user-images.githubusercontent.com/34618612/101469217-c0321880-3944-11eb-8d29-136d3aec1fab.png)


## Interesting features

When writing in acceleo you are able to use the *acceleo query language* to do more advanced querries against the model. As an example we have written a for-loop to iterate over all flights in a collection that has a certain departure airport, but excluding all flights that has no `departureAirport` to avoid errors.

```java
[for (flight : Flight | (airline.flights -> reject(f | f.departureAirport = null) ) -> select(f | f.departureAirport.id = airport.id) )]
```

## Remarks

The `AirFlight2Text.mtl` file illustrates the strength of automatic code generation. The file is quite short, and has very simple functions. Yet it is able to create several html files with rich content. Even more, we may now add data as we wish to our domain and just run the transformation to generate all necessary data. This could for example be further utilised in a continious deployment process. On each push to a main branch you could spin up a light weight container and run the transformation automatically. You could then bundle up all the html files and deploy it to a production environment.


## Limitations

We have not emphasized design in this assignment, so excuse the styling.

The Model2Text is quite simplistic, so it would need more effort to integrate it with more advanced systems, but example a flight booking system.

