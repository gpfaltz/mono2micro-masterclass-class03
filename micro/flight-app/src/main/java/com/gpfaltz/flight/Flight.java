package com.gpfaltz.flight;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Flight extends PanacheEntity {

	public Long travelOrderId;
	public String sourceAirport;
	public String destinyAirport;
	
	public static Flight findByTravelOrderId(Long travelOrderId) {
		return find("travelOrderId", travelOrderId).firstResult();
	}

}
