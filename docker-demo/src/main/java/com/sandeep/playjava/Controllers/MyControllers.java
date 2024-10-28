package com.sandeep.playjava.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllers {

	@GetMapping("/test-docker")
	public String getData(){
		
		System.out.println("Hello World!");
		
		return "In Docker tutorial project of Play java";
	}
}
