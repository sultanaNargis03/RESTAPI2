package com.telusko.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController
{
	
	public GreetingController() 
	{
		System.out.println("GreetingController object created");
	}
	@GetMapping("/welcome")
	public String generateGreetings()
	{
		String  body="Hello All Welcome back";
		return body;
	}
	
	@GetMapping("/welcomeDp")
	public String generateWelcomeGreetings(@RequestParam(value="name",required=false,
	defaultValue="Alien")String name)
	{
		String  body="Hello "+name+" Welcome back to DP classes";
		return body;
	}
	@GetMapping("/welcomeDSA/{name}")
	public String generateCourseMessage(@PathVariable("name")String name)
	{
		String  body="Hello "+name+" Welcome back to DP classes";
		return body;
	}
}
