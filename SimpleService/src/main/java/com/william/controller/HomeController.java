package com.william.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String home() {
		return "Hello from Simple Service running at port: " + env.getProperty("local.server.port");
	}
		
	@GetMapping("/prueba")
	public String prueba() {
		return "This a test ";
	}
}
