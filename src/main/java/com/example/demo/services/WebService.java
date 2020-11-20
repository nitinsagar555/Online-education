package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.WebRepository;
import com.example.demo.tables.Web;

@Service
public class WebService {

	@Autowired
	private WebRepository webRepository;

	public List<Web> getAllWeb() {
		List<Web> web = new ArrayList<>();
		webRepository.findAll().forEach(web::add);
		return web;
	}

	public void addWeb(Web web) {
		webRepository.save(web);

	}

}
