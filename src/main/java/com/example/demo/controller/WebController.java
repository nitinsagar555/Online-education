package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.WebRepository;
import com.example.demo.services.WebService;
import com.example.demo.tables.Web;

@RestController
public class WebController {

	@Autowired
	private WebService webService;

	@Autowired
	private WebRepository webRepository;

	@RequestMapping("/web")
	public List<Web> getAllWeb() {
		return webService.getAllWeb();
	}

	@GetMapping(value = "web/{id}")
	public Optional<Web> findBynum(@PathVariable int id) {

		Optional<Web> web = webRepository.findById(id);
		return web;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/web")
	public void addWeb(@RequestBody Web web) {
		webService.addWeb(web);
	}

}
