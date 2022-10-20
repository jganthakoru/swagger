package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.TicketInfo;
import com.example.model.PassengerInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("This is Air India Distributed component")
public class AirIndiaRestController {
	
	

	@ApiOperation("This is to book a ticket")
	@PostMapping("/bookTicket" )
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo info){
		TicketInfo ticketInfo = new TicketInfo();
		ticketInfo.setName(info.getFirstName());
		ticketInfo.setFlightId(info.getFlightId());
		ticketInfo.setFrom(info.getFrom());
		ticketInfo.setTo(info.getTo());
		ticketInfo.setJourneyDate(info.getJourneyDt());
		ticketInfo.setTicketPrice("50000.0");
		ticketInfo.setTicketStatus("CONFIRMED");
		return new ResponseEntity<TicketInfo>(ticketInfo, HttpStatus.CREATED);
	}
	
	
	
	
	
	

}
