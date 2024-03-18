package com.sampleProject.ems.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleProject.ems.dto.EmployeeDTO;
import com.sampleProject.ems.entity.Employee;
import com.sampleProject.ems.exceptions.ResourceNotFoundException;
import com.sampleProject.ems.mapper.Mapper;
import com.sampleProject.ems.repository.EmployeeRepository;
import com.sampleProject.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub 
		Employee emp1=Mapper.mapToEmployee(emp);
		Employee savedEmployee=empRepo.save(emp1);
		return Mapper.mapToEmployeeDTO(savedEmployee);
	}

	@Override
	public EmployeeDTO getMEmployeeByID(Long empId) {
		Employee emp=empRepo.findById(empId).orElseThrow(()-> new ResourceNotFoundException("No employee present for the given id " + empId));
		return Mapper.mapToEmployeeDTO(emp);
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList=empRepo.findAll();
		return empList.stream().map((Employee)->Mapper.mapToEmployeeDTO(Employee)).collect(Collectors.toList());
		
	}

}
