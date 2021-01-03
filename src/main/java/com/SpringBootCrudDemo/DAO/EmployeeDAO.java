package com.SpringBootCrudDemo.DAO;

import java.util.List;

import com.SpringBootCrudDemo.Entity.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int id);
	public void saveEmployee(Employee employee);
	public void deleteEmployee(int id);

}
