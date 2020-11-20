package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.JavaRepository;

import com.example.demo.tables.Java;





@Service
public class JavaService {
	
	@Autowired
	private JavaRepository javaRepository;


	public List<Java> getAllJava(){
		List<Java> java = new ArrayList<>();
		javaRepository.findAll().forEach(java::add);
		return java;
	}
	


	public void addJava(Java java) {
		javaRepository.save(java);
		
	}
	
	

	
}	
