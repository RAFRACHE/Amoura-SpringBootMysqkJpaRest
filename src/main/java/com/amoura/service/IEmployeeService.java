package com.amoura.service;

import com.amoura.entities.Employee;

public interface IEmployeeService {

	
	public void createEmployee(Employee employee);

	public Employee getEmployeeById(long id);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(long id);


}
