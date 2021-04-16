package com.spring.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.model.Flight;
import com.spring.cloud.repo.FlightRepository;

@RestController
public class FlightController {

	@Autowired
	private FlightRepository repo;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights(){
		return repo.findAll();
	}
}
