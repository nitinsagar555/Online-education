package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MysqlRepository;

import com.example.demo.tables.Mysql;

@Service
public class MysqlService {

	@Autowired
	private MysqlRepository mysqlRepository;

	public List<Mysql> getAllMysql() {
		List<Mysql> mysql = new ArrayList<>();
		mysqlRepository.findAll().forEach(mysql::add);
		return mysql;
	}

	public void addMysql(Mysql mysql) {
		mysqlRepository.save(mysql);

	}

}
