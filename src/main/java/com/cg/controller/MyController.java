package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/Yo")
	public String sayYO() {
		return "Hi! From Shubham...";
	}
	

}
