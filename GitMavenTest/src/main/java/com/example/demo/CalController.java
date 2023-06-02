package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {
	
	@GetMapping(value="/")
	public String index() {
		return "Hello Git!!";
	}
	
	@GetMapping(value="add")
	public String add() {
		return "25 + 36 = " + (25 + 36);
	}
	
	@GetMapping(value="/sub")
	public String mul() {
		return "25 - 36 = " + (25 - 36);
	}
}
