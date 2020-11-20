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

import com.example.demo.repository.ClanguageRepository;

import com.example.demo.services.ClanguageService;
import com.example.demo.tables.Clanguage;






@RestController
public class ClanguageController {
	
	@Autowired
	private ClanguageService clanguageService;
	
	@Autowired
	private ClanguageRepository clanguageRepository;
	
	@RequestMapping("/clanguage")
	public List<Clanguage> getAllClanguage(){
		return clanguageService.getAllClanguage();								
	}
	

	
	@GetMapping(value = "clanguage/{id}")
	public Optional<Clanguage> findBynum(@PathVariable int id) {

		Optional<Clanguage> clanguage = clanguageRepository.findById( id);
		return clanguage;
	}


	
	
	@RequestMapping(method=RequestMethod.POST, value="/clanguage")
	public void addClanguage(@RequestBody Clanguage clanguage){
		clanguageService.addClanguage(clanguage);
	}
	
	
}
