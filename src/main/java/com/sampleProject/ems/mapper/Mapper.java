package com.sampleProject.ems.mapper;

import com.sampleProject.ems.dto.EmployeeDTO;
import com.sampleProject.ems.entity.Employee;

public class Mapper {
	public static EmployeeDTO mapToEmployeeDTO(Employee emp) {
		return new EmployeeDTO(
				emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getEmail()
				);
	}
	
	public static Employee mapToEmployee(EmployeeDTO emp) {
		return new Employee(
				emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getEmail()
				);
	}
} 
