package com.kce.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class FlightDAO {
	@NonNull
	private int flightId;
	private String flightName;
	private String Depature;
	private String Arrival;
	private int price;
	private int capacity;
	
	
}