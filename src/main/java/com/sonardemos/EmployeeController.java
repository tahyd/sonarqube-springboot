package com.sonardemos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping("/employee")
	public String index() {
		return "<h1> Hello World ! </h1>";
	}

}
