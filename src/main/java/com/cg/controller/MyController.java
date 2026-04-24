package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hi! From Shubham...";
	}
	@GetMapping("/bye")
	public String Bye() {
		return "Goodbye! From Kartik...";
	}
}
