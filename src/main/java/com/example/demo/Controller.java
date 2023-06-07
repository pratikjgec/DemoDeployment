package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String heath()
	{
		return "application working";
	}
	@GetMapping("/get")
	public String get()
	{
		return "Get all the Data";
	}
	@GetMapping("/post")
	public String post()
	{
		return "Data saved sucessfully";
	}
}
