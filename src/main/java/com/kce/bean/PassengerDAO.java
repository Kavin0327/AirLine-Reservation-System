package com.kce.bean;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(value=AccessLevel.PUBLIC)
@Setter
public class PassengerDAO extends FlightDAO {
	private int passengerId;
	private String passengerName;
	private String passengerAddress;
	private String date;
	public PassengerDAO(int passengerId, String passengerName, String passengerAddress, int flightId, String date) {
		super(flightId);
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAddress = passengerAddress;
		this.date = date;
	}
}