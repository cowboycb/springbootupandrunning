package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.config.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
class GreetingController {

//	@Value("${greeting-name:Mirage}")
//	private String name;

	private final Greeting greeting;

	GreetingController(Greeting greeting) {
		this.greeting = greeting;
	}


	@GetMapping
	String geetGreeting(){
		return greeting.getName();
	}
}