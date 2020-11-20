package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CourseRepository;
import com.example.demo.tables.Course;


@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;


	public List<Course> getAllCourses(){
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id){
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		Optional<Course> result= courseRepository.findById(id);
		return result.get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}
	
	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
		
	}


	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		
		courseRepository.deleteById(id);
	}


	
}	
