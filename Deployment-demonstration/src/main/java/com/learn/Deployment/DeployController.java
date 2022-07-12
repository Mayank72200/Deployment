package com.learn.Deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

	@GetMapping("/")
	public String home() {
		return "this is home page";
	} 
	
	@GetMapping("/about")
	public String about() {
		return "this is about page";
	}
}
