package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.tables.Mysql;

public interface MysqlRepository extends CrudRepository<Mysql, Integer> {

}
