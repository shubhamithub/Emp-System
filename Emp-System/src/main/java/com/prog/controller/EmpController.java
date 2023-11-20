package com.prog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
	
	@GetMapping("/")
	public String home() {
		return "index";
		
	}
	@GetMapping("/addemp")
	public String addemp() {
		return "add_emp";
	}

}
