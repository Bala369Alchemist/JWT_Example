package com.example.jwt_demo_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		return "WELCOME";
	}
	
}
