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

import com.example.demo.repository.JavaRepository;

import com.example.demo.services.JavaService;

import com.example.demo.tables.Java;





@RestController
public class JavaController {
	
	@Autowired
	private JavaService javaService;
	
	@Autowired
	private JavaRepository javarepository;
	
	@RequestMapping("/java")
	public List<Java> getAllJava(){
		return javaService.getAllJava();								
	}
	

	
	@GetMapping(value = "java/{id}")
	public Optional<Java> findBynum(@PathVariable int id) {

		Optional<Java> java = javarepository.findById( id);
		return java;
	}


	
	
	@RequestMapping(method=RequestMethod.POST, value="/java")
	public void addJava(@RequestBody Java java){
		javaService.addJava(java);
	}
	
	
}
