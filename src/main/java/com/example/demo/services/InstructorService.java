package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.InstructorRepository;

import com.example.demo.tables.Instructor;


@Service
public class InstructorService {
	@Autowired
	private InstructorRepository instructorRepository;


	public List<Instructor> getAllInstructors(){
		List<Instructor> instructors = new ArrayList<>();
		instructorRepository.findAll().forEach(instructors::add);
		return instructors;
	}
	
	public Instructor getInstructor(String id){
		Optional<Instructor> result= instructorRepository.findById(id);
		return result.get();
	}

	public void addInstructor(Instructor instructor) {
		instructorRepository.save(instructor);
		
	}
	
	public void updateInstructor(String id, Instructor instructor) {
		instructorRepository.save(instructor);
		
	}


	public void deleteInstructor(String id) {		
		instructorRepository.deleteById(id);
	}


	
}	
