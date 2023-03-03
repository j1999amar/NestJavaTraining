package com.canddella.flightreservation.controllers;

import com.canddella.flightreservation.entities.Flight;
import com.canddella.flightreservation.repository.FlightRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository flightRepository;

	private static final Logger LOGGER=LoggerFactory.getLogger(FlightController.class);

	@RequestMapping("findFlights")
	public String findfFlight(@RequestParam("from")String from, @RequestParam("to") String to, 
		@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
		ModelMap modelMap){
		
		
		List<Flight> flights= flightRepository.findFlight(from,to,departureDate);
		modelMap.addAttribute("flights",flights);
		return "login/displayFlights";
		
	}
	@RequestMapping("admin/showAddFlight")
		public String showAddFlight() {
			return "addFlight";
		
	}
	
}