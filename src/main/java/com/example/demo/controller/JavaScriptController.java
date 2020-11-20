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

import com.example.demo.repository.JavaScriptRepository;
import com.example.demo.services.JavaScriptService;
import com.example.demo.tables.JavaScript;



@RestController
public class JavaScriptController {
	
	@Autowired
	private JavaScriptService javaScriptService;
	
	@Autowired
	private JavaScriptRepository javaScriptrepository;
	
	@RequestMapping("/javaScripts")
	public List<JavaScript> getAllJavaScripts(){
		return javaScriptService.getAllJavaScripts();								
	}
	
//	@RequestMapping("/javaScripts/{id}")
//	public JavaScript getJavaScript(@PathVariable String id){
//		return javaScriptService.getJavaScript(id);
//	}
	
	@GetMapping(value = "javaScripts/{id}")
	public Optional<JavaScript> findBynum(@PathVariable int id) {

		Optional<JavaScript> javaScript = javaScriptrepository.findById( id);
		return javaScript;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/javaScripts")
	public void addJavaScript(@RequestBody JavaScript javaScript){
		javaScriptService.addJavaScript(javaScript);
	}
	
	
}
