package com.gpfaltz.travelorder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

	private Long id;
	private Long travelOrderId;
	private Integer nights;
}
