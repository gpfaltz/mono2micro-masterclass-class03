package com.gpfaltz.travelorder;

import java.util.List;
import java.util.stream.Collectors;

import com.gpfaltz.flight.Flight;
import com.gpfaltz.flight.FlightResource;
import com.gpfaltz.hotel.Hotel;
import com.gpfaltz.hotel.HotelResource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("travelorder")
public class TravelOrderResource {

	@Inject
	FlightResource flightResource;

	@Inject
	HotelResource hotelResource;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TravelOrderDTO> travelorders() {
		return TravelOrder
				.<TravelOrder>listAll().stream().map(order -> TravelOrderDTO.of(order,
						flightResource.findByTravelOrderId(order.id), hotelResource.findByTravelOrderId(order.id)))
				.collect(Collectors.toList());
	}

	@GET
	@Path("findById")
	public TravelOrder findById(@QueryParam("id") long id) {
		return TravelOrder.findById(id);
	}

	@Transactional
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public TravelOrder newTravelOrder(TravelOrderDTO travelOrderDto) {

		TravelOrder travelOrder = new TravelOrder();
		travelOrder.id = null;
		travelOrder.persist();

		Flight flight = new Flight();
		flight.sourceAirport = travelOrderDto.getSourceAirport();
		flight.destinyAirport = travelOrderDto.getDestinyAirport();
		flight.travelOrderId = travelOrder.id;
		flightResource.newFlight(flight);

		Hotel hotel = new Hotel();
		hotel.nights = travelOrderDto.getNights();
		hotel.travelOrderId = travelOrder.id;
		hotelResource.newHotel(hotel);

		return travelOrder;
	}
}
