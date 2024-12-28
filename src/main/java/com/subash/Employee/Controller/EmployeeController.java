package com.subash.Employee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@RestController
public class EmployeeController {

	@GetMapping("/")
	public String greet(HttpServletRequest req) {
		return req.getSession().getId();
	}
	
}
