package com.SpringBootCrudDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootCrudDemo.Entity.Employee;
import com.SpringBootCrudDemo.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/getEmployee/{id}")
	public Employee getAllEmployee(@PathVariable int id) {
		Employee employee = employeeService.getEmployee(id);
		if (employee == null) {
			throw new RuntimeException("Employee not found " + id);
		} else {
			return employee;
		}

	}

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee theEmployee) {
		theEmployee.setId(0);
		employeeService.saveEmployee(theEmployee);
		return theEmployee;
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeService.saveEmployee(theEmployee);
		return theEmployee;
	}

	@DeleteMapping("/deleteEmployees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "Employee is deleted " +id ;
		
	}

}
