package com.aws.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
	@GetMapping("/data")
	public String getDate() {
return "first date";		
	}

}
