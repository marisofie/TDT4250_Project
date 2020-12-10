package tdt4250.at.acceleo.html;

import java.util.Date;

public class AirFlight2TextHelper {

	
	public String flightDuration(Date departureTime, Date arrivalTime) {
		long diff = arrivalTime.getTime() - departureTime.getTime();
		
		diff = diff / (1000*60); // From ms to minutes
		
		return String.valueOf(Math.toIntExact(diff));
	}
}
