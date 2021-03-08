package com.amoura.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.amoura.entities.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   
	
}
