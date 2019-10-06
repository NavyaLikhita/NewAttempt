package com.cg.frs.SpringBootFrs.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.frs.SpringBootFrs.dto.Flight;

public interface FlightService {

	public Flight addFlight(Flight flight);

	public List<Flight> viewAllFlight();

	public Flight searchFlight(BigInteger flightId);

	public Flight modifyFlight(BigInteger flightId);

	public boolean updateFlight(BigInteger flightId);

}
