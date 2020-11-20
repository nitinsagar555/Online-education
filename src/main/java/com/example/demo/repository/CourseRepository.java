package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.tables.Course;



public interface CourseRepository extends CrudRepository<Course, String> {
	
	

}
