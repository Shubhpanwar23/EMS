package com.sampleProject.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampleProject.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
//Jpa repository already annotated with @repository and @Transactional...so need to write agian
