package person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PersonController {
	
	@GetMapping(value="/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping(value="/person/writeForm")
	public String writeForm() {
		
		return "/person/writeForm";
	}
	
	
}
