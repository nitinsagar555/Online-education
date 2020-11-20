package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.NetworkingRepository;

import com.example.demo.tables.Networking;




@Service
public class NetworkingService {
	
	@Autowired
	private NetworkingRepository networkingRepository;


	public List<Networking> getAllNetworking(){
		List<Networking> networking = new ArrayList<>();
		networkingRepository.findAll().forEach(networking::add);
		return networking;
	}
	


	public void addNetworking(Networking networking) {
		networkingRepository.save(networking);
		
	}
	
	

	
}	
