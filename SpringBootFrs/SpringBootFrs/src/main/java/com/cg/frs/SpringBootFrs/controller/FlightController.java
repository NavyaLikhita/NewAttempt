package com.cg.frs.SpringBootFrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.frs.SpringBootFrs.dto.Flight;
import com.cg.frs.SpringBootFrs.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	FlightService flightService;

	@PostMapping(value = "/add/flight")
	public ResponseEntity<Flight> addData(@ModelAttribute Flight flight) {
		Flight flightToBeAdded = flightService.addFlight(flight);

		if (flightToBeAdded == null) {
			return new ResponseEntity("Flight not added", HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<Flight>(flightToBeAdded, HttpStatus.OK);
		}
	}

	@GetMapping(value = "/show/data")
	public ResponseEntity<List<Flight>> getAllData() {

		List<Flight> flightList = flightService.viewAllFlight();
		if (flightList.isEmpty()) {
			return new ResponseEntity("No Data Present", HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<List<Flight>>(flightList, HttpStatus.OK);
		}
	}

	
	
	
	
}
