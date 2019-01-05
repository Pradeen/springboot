package com.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
    public String index() {
		System.out.println("Logging the information");
        return "Greetings from Spring Boot!";
    }

}
