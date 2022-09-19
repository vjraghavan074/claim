package com.example.ClaimProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ClaimProject.model.Employee;
import com.example.ClaimProject.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	 public String getEmployeeById(int empId) {
		 	empRepo.createEmployee();
	        return empRepo.getEmployeeById(empId);
	    }
	
	
}
