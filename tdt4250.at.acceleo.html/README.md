# Model to text with Acceleo

[Back to project](/README.md)

Acceleo is a template-based techonology that allows us to automatically generate informative source code based on the `travel planner` model and the code templated defined in the `AirFlight2Text.mtl` file. 

We use Acceleo to specifically take the model flight data that we produce in **Sirius** to produce informative web pages. While the **Sirius diagram editor** is created for employees at a (fictive) flight planner company, the **Acceleo produced web pages** are meant for customers that want to find flights, although it could be useful for employees as well. Hence, we decided to use M2T transformation to be able to produce generic lists of flight information for the customers and travel planners.

If you do not want to configure to generate yourself, you should find already generated html pages inside of `tdt4250.at.acceleo.html.result`.

## Configuration

To be able to run the transformation you will need to configure it to run in Eclipse.

1. Right click the `AirFlight2Text.mtl` file
2. Select `Run As` -> `Run Configurations...` and a new config window will open.
3. Make sure that you are configuring an `Acceleo Application`
4. Give the configuration an approriate name, e.g. `AirFlight2Text`.
5. Fill in the follwing fields:
   1. Project: `tdt4250.at.acceleo.html`
   2. Main Class: `tdt4250.at.acceleo.html.AirFlight2text`
   3. Model: `/tdt4250.at.model/TravelPlanner.xmi`
   4. Target: `/tdt4250.at.acceleo.html/src/tdt50/at/acceleo/html/result` <-- may set to a differnt location, but this one is recommended.
6. Ensure the configuration Runner is set to `Java Application`.
7. You may now run the configuration.

Your configration should look like this:

![Image of AirFlight2Text Configuration](https://user-images.githubusercontent.com/34618612/101766846-abd85200-3ae3-11eb-8d0d-cccb9aaa0d54.png)

## Selected features

When writing in acceleo you are able to use the _acceleo query language_ to do more advanced queries against the model. As an example we have written a for-loop to iterate over all flights in a collection that has a certain departure airport, but excluding all flights that has no `departureAirport` to avoid errors.

```java
[for (flight : Flight | (airline.flights -> reject(f | f.departureAirport = null) ) -> select(f | f.departureAirport.id = airport.id) )]
```

Also, to support showing flight duration, which is a derived field written in Java code on the model, we added a helper function for Acceleo to generate this, and also to show how you can use custom queries in Acceleo.

```java
[query public flightDuration(departureTime : EDate, arrivalTime: EDate) : String =
	invoke('tdt4250.at.acceleo.html.AirFlight2TextHelper', 'flightDuration(java.util.Date, java.util.Date)', Sequence{departureTime, arrivalTime})
/]
```

## Remarks

The `AirFlight2Text.mtl` file illustrates the strength of automatic code generation. The file is quite short, and has very simple functions. Yet it is able to create several html files with rich content. Even more, we may now add data as we wish to our domain instance and transform the model to text. This could for example be further utilised in a continious deployment process. On each push to a main branch you could spin up a light-weight container and run the transformation automatically. You could then bundle up all the html files and deploy it to a production environment.

## Limitations

We have not emphasized design in this assignment, so excuse the styling.

The Model2Text is quite simplistic, so it would need more effort to integrate it with more advanced systems, as for example a flight booking system. 
