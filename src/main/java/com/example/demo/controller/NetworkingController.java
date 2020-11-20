package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.NetworkingRepository;
import com.example.demo.services.NetworkingService;

import com.example.demo.tables.Networking;




@RestController
public class NetworkingController {
	
	@Autowired
	private NetworkingService networkingService;
	
	@Autowired
	private NetworkingRepository repository;
	
	@RequestMapping("/networking")
	public List<Networking> getAllNetworking(){
		return networkingService.getAllNetworking();								
	}
	

	
	@GetMapping(value = "networking/{id}")
	public Optional<Networking> findBynum(@PathVariable int id) {

		Optional<Networking> network = repository.findById( id);
		return network;
	}


	
	
	@RequestMapping(method=RequestMethod.POST, value="/networking")
	public void addNetworking(@RequestBody Networking networking){
		networkingService.addNetworking(networking);
	}
	
	
}
