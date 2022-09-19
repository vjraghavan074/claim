package com.example.ClaimProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ClaimProject.model.Employee;
import com.example.ClaimProject.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/claim")
public class EmployeeController {
	
//	@Autowired
//	Employee emp;
	
	@Autowired 
	EmployeeService service;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "WELCOME";
	}
	
	@GetMapping("/{empId}")
    public String getEmployeeByID(@PathVariable int empId) {
		
		String jsonData = service.getEmployeeById(empId);
		System.out.println(jsonData);
		return jsonData;
    }
	

}
