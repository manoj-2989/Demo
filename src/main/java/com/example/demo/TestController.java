package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/home")
	public String getHome()
	{
		return "<a href='http://google.co.in'>Hello World</a>";
	}
	
}
