package com.gpfaltz.travelorder;

import com.gpfaltz.flight.Flight;
import com.gpfaltz.hotel.Hotel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelOrderDTO {

	private String sourceAirport;
	private String destinyAirport;
	private Integer nights;
	
	public TravelOrderDTO() {
		
	}

	private TravelOrderDTO(String sourceAirport, String destinyAirport, Integer nights) {
		this.sourceAirport = sourceAirport;
		this.destinyAirport = destinyAirport;
		this.nights = nights;

	}

	public static TravelOrderDTO of(TravelOrder travelorder, Flight flight, Hotel hotel) {
		
		if (flight == null) {
			flight = new Flight();
		}
		
		if (hotel == null) {
			hotel = new Hotel();
		}
		
		return new TravelOrderDTO(flight.sourceAirport, flight.destinyAirport, hotel.nights);
	}
	
	public static TravelOrderDTO of(String sourceAirport, String destinyAirport, Integer nights) {
		return new TravelOrderDTO(sourceAirport, destinyAirport, nights);
	}
}
