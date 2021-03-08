package com.amoura.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amoura.entities.Employee;
import com.amoura.repo.EmployeeRepository;
import com.amoura.service.IEmployeeService;



@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void createEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}
    
	@Override
	public Employee getEmployeeById(long id) {

		Employee employee = employeeRepository.getOne(id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepository.save(employee);
	}
    
	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.deleteById(id);
	}

}
