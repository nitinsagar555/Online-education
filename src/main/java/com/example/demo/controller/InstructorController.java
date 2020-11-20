package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.services.InstructorService;

import com.example.demo.tables.Instructor;

@RestController
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	
	@RequestMapping("/instructors")
	public List<Instructor> getAllInstructors(){
		return instructorService.getAllInstructors();								
	}
	
	@RequestMapping("/instructors/{id}")
	public Instructor getInstructor(@PathVariable String id){
		return instructorService.getInstructor(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/instructors")
	public void addInstructor(@RequestBody Instructor instructor){
		instructorService.addInstructor(instructor);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/instructors/{id}")
	public void updateInstructor(@RequestBody Instructor instructor,@PathVariable String id){
		instructorService.updateInstructor(id, instructor);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/instructors/{id}")
	public void deleteInstructor(@PathVariable String id){
		instructorService.deleteInstructor(id);
	}
}
