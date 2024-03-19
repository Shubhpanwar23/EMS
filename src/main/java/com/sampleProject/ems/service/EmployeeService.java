package com.sampleProject.ems.service;

import java.util.List;

import com.sampleProject.ems.dto.EmployeeDTO;
import com.sampleProject.ems.entity.Employee;

public interface EmployeeService {
	EmployeeDTO createEmployee(EmployeeDTO emp);	
	EmployeeDTO getMEmployeeByID(Long empId);
	List<EmployeeDTO> getAllEmployees();
	public EmployeeDTO deleteEmployee(Long empId); 
	public EmployeeDTO updateEmployee(Long emId,EmployeeDTO empDTO);
}
