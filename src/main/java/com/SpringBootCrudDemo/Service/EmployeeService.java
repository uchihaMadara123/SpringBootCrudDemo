package com.SpringBootCrudDemo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootCrudDemo.Entity.Employee;
@Service
public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int id);
	public void saveEmployee(Employee employee);
	public void deleteEmployee(int id);

}
