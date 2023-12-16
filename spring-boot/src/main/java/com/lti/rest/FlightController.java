//package com.lti.rest;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lti.entity.Flight;
//import com.lti.service.FlightService;
//
//@CrossOrigin
//@RestController
//public class FlightController {
//
//	
//	@Autowired
//	private Flight flight;
//	
//	
//	@PostMapping(value="/add",consumes="application/json")
//	public String addFlight(@RequestBody Flight flight)
//	{
////		int fno=service.saveFlight(flight);
////		return "Flight add with no:"+fno;
//	}
//	
//	
//	@GetMapping(value="/bycarrier/{carrier}",produces = "application/json")
//	public List<Flight> getFlightByCarrier(@PathVariable String carrier)
//	{
////		return service.flightByCarrier(carrier);
//	}
//	
//	@GetMapping(value="/byroute")
//	public List<Flight> getFlightByRoute(@RequestParam("src") String source,@RequestParam("dst") String destiny)
//	{
////		return service.flightByRoute(source,destiny);
//	}
//	
//	@GetMapping(value="/byno/{fno}",produces="appliction/json")
//	public Flight flightByNo(@PathVariable int fno)
//	{
////	    return service.flightByNo(fno);
//		
//	}
//
//	@PutMapping(value="/updateflight",produces="appliction/json")
//	public void flightUpdate(@RequestBody Flight flight)
//	{
////		service.saveFlight(flight);
//	}
//	
//	@DeleteMapping(value="/deleteflight/{fno}",produces="appliction/json")
//	public void removeFlight(@PathVariable int fno)
//	{
////		service.removeFlight(fno);
//	}
//	
//	@GetMapping(value="/listallflights",produces="appliction/json")
//	public List <Flight> getallFlights()
//	{
////		return service.allFlights();
//	}
//	
//	
//    }
