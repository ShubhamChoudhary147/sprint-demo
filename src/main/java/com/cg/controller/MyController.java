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

	@GetMapping("/Amrit")
	public String sayHelloAmrit() {
		return "Hi! From Amrit...";
	}

	@GetMapping("/Tanmay")
	public String Tanmay_hello(){
		return "Hi from Tanmay";
	}
	
	@GetMapping("/Swati")
	public String Swatiyo() {
		return "Yo from Swati!";
	}

}
