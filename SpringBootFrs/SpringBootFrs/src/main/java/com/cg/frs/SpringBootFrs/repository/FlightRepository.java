package com.cg.frs.SpringBootFrs.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.frs.SpringBootFrs.dto.Flight;

public interface FlightRepository extends JpaRepository<Flight, BigInteger> {

	public Flight add(Flight flight);
	
	public List<Flight> viewAll();
	
	public Flight searchByFlightId(BigInteger flightId);
	
	public Flight modifyByFlightId(BigInteger flightId);
	
	@Query("UPDATE flight f SET f.flight_state=false WHERE f.flight_id=:flightId ")
	public boolean updateFlight(@Param("flightId")BigInteger flightId);
	
	
}
