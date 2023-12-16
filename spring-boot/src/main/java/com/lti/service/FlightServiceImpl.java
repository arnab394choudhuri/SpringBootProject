//package com.lti.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.lti.entity.Flight;
//import com.lti.repo.FlightRepository;
//
//@Service
//public class FlightServiceImpl implements FlightService{
//	
//	@Autowired
//	private FlightRepository repo;
//	
//	
//	
//	public int saveFlight(Flight flight) {
//		repo.save(flight);
//		return flight.getFlightNo();
//	}
//
//	
//	public List<Flight> flightByCarrier(String carrier) {
//		return repo.findByCarrier(carrier);
//	}
//
//	
//	public List<Flight> flightByRoute(String source, String destiny) {
//		return repo.findByRoute(source, destiny);
//	}
//
//	
//	public Flight flightByNo(int fno) {
//		return repo.findById(fno).get();
//	}
//
//	
//	public void removeFlight(int fno) {
//		repo.deleteById(fno);
//	}
//
//	
//	public void updateFlight(Flight flight) {
//		repo.save(flight);
//	}
//
//
//	public List<Flight> allFlights() {
//		return repo.findAll();
//	}	
//}