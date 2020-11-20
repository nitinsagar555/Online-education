package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.JavaScriptRepository;
import com.example.demo.tables.JavaScript;



@Service
public class JavaScriptService {
	
	@Autowired
	private JavaScriptRepository javaScriptRepository;


	public List<JavaScript> getAllJavaScripts(){
		List<JavaScript> javaScripts = new ArrayList<>();
		javaScriptRepository.findAll().forEach(javaScripts::add);
		return javaScripts;
	}
	

	



	public void addJavaScript(JavaScript javaScript) {
		javaScriptRepository.save(javaScript);
		
	}
	
	

	
}	
