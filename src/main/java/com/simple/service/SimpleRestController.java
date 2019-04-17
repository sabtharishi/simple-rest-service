package com.simple.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

	@Value("${simple.service.message}")
	private String message;

	@GetMapping("/greet")
	public String greet() {
		return message;
	}
}
