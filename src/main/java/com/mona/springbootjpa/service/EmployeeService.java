package com.mona.springbootjpa.service;

import java.util.List;

import com.mona.springbootjpa.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

}
