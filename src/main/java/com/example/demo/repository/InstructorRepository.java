package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.tables.Instructor;

public interface InstructorRepository extends CrudRepository<Instructor, String>  {

}
