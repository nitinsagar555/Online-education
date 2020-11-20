package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ClanguageRepository;

import com.example.demo.tables.Clanguage;






@Service
public class ClanguageService {
	
	@Autowired
	private ClanguageRepository clanguageRepository;


	public List<Clanguage> getAllClanguage(){
		List<Clanguage> clanguage = new ArrayList<>();
		clanguageRepository.findAll().forEach(clanguage::add);
		return clanguage;
	}
	


	public void addClanguage(Clanguage clanguage) {
		clanguageRepository.save(clanguage);
		
	}
	
	

	
}	
