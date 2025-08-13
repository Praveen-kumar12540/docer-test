package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//This is simple rest api
@RestController
public class HelloWorldController {

	//Handler method
	@GetMapping("/message")
	public String getMessage() {
		return "hello-world";
	}
}
