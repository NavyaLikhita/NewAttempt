package com.cg.frs.SpringBootFrs.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.frs.SpringBootFrs.dto.Flight;
import com.cg.frs.SpringBootFrs.repository.FlightRepository;

@Service("flightservice")
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepository flightRepository;
	
	
	
	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.save(flight);
	}

	@Override
	public List<Flight> viewAllFlight() {
		// TODO Auto-generated method stub
		return flightRepository.viewAll();
	}

	@Override
	public Flight searchFlight(BigInteger flightId) {
		// TODO Auto-generated method stub
		return flightRepository.searchByFlightId(flightId);
	}

	@Override
	public Flight modifyFlight(BigInteger flightId) {
		// TODO Auto-generated method stub
		return flightRepository.modifyByFlightId(flightId);
	}

	@Override
	public boolean updateFlight(BigInteger flightId) {
		// TODO Auto-generated method stub
		
		Flight removedFlight=flightRepository.searchByFlightId(flightId);
		removedFlight.setFlightState(false);
		
		 flightRepository.save(removedFlight);
		 return true;
	}

	

}
