package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {
	
	@GetMapping(value="/")
	public String index() {
		return "Hello Git!!";
	}
}
