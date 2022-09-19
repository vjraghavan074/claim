package com.example.ClaimProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	    private int empId;
	    private String name;
	    private String role;
		
	    public Employee(int empId, String name, String role) {
			super();
			this.empId = empId;
			this.name = name;
			this.role = role;
		}

		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
	    
	    
	    
	    
	    
	    
}
