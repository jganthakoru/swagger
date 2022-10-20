package com.example.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
public class PassengerInfo {
	
	private String firstName;
	
	private String lastName;
	
	private String from;
	
	private String to;
	
	private String flightId;
	
	private String journeyDt;
	
	

}
