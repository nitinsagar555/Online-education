package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.repository.StudentRepository;

import com.example.demo.tables.Student;


@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;


	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public Student getStudent(String id){
		Optional<Student> result= studentRepository.findById(id);
		return result.get();
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}
	
	public void updateStudent(String id, Student student) {
		studentRepository.save(student);
		
	}


	public void deleteStudent(String id) {		
		studentRepository.deleteById(id);
	}


	
}	
