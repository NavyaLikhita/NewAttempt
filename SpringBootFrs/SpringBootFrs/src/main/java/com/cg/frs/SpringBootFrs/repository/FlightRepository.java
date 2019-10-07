package com.cg.frs.SpringBootFrs.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.cg.frs.SpringBootFrs.dto.Flight;

public interface FlightRepository extends JpaRepository<Flight, BigInteger> {

	public Flight add(Flight flight);
	
	@Query("FROM Flight WHERE flightState=true")
	public List<Flight> viewAll();
	
	public Flight searchByFlightId(BigInteger flightId);
	
	public Flight modifyByFlightId(BigInteger flightId);
	
	

	
	
}
