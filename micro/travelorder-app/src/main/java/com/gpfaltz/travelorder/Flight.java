package com.gpfaltz.travelorder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

	private Long id;
	private Long travelOrderId;
	private String sourceAirport;
	private String destinyAirport;

}
