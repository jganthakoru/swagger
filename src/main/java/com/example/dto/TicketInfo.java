package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
public class TicketInfo {
	
	private String name;
	
	private String from;
	
	private String to;
	
	private String flightId;
	
	private String journeyDate;
	
	private String ticketPrice;
	
	private String ticketStatus;
	
	
	
	

}
