package structural.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelFacade {
	public List getFlightsAndHotels(Date from,Date to){
		List items = new ArrayList();
		FlightBooker fl = new FlightBooker();
		items.add(fl.getFlights(from, to));
		
		HotelBooker ht = new HotelBooker();
		items.add(ht.getHotels(from, to));
		
		return items;
	}

}
