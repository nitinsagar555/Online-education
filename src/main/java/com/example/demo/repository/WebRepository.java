package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.tables.Web;

public interface WebRepository extends CrudRepository<Web, Integer> {

}
