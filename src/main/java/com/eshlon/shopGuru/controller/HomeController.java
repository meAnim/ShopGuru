package com.eshlon.shopGuru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {  
	
	@RequestMapping("/")
	public String home() {
		return "You are welcome";
	}
	
	@RequestMapping("/dashboard.user")
	public String dashboard() {
		return "You are on the dashboard ";
	}
}
