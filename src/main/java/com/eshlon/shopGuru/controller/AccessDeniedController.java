package com.eshlon.shopGuru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessDeniedController {
	
	@RequestMapping("/accessdenied")
	public String accessdenied() {

		return "views/accessDenied.jsp";
	}
}
