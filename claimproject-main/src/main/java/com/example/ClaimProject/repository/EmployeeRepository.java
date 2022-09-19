package com.example.ClaimProject.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.ClaimProject.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class EmployeeRepository {
	
//	public EmployeeRepository() {
//		Employee emp1 = new Employee(1, "Gautham", "Developer");
//        Employee emp2 = new Employee(2,"Vijay","Tester");
//        Employee emp3 = new Employee(3,"Vishnu", "Hacker");
//        
//        employeeMap.put(emp1.getEmpId(), emp1);
//        employeeMap.put(emp2.getEmpId(), emp2);
//        employeeMap.put(emp3.getEmpId(), emp3);
//	}

	private Map<Integer,Employee> employeeMap = new HashMap<Integer, Employee>();
	
	public void createEmployee() {
	
		Employee emp1 = new Employee(1, "Gautham", "Developer");
        Employee emp2 = new Employee(2,"Vijay","Tester");
        Employee emp3 = new Employee(3,"Vishnu", "Hacker");
        
        employeeMap.put(emp1.getEmpId(), emp1);
        employeeMap.put(emp2.getEmpId(), emp2);
        employeeMap.put(emp3.getEmpId(), emp3);
    }

	public String getEmployeeById(int empId){  
		ObjectMapper mapper = new ObjectMapper();
  
		     String studentJson = null;
		     try {
		    	 studentJson = mapper.writeValueAsString(employeeMap.get(empId));
		     } catch (JsonProcessingException e) {
		    	 e.printStackTrace();
		     }
		     return studentJson;
	}
}