package com.SpringBootCrudDemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootCrudDemo.DAO.EmployeeDAO;
import com.SpringBootCrudDemo.Entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO employeeDao;
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDao) {
		employeeDao = theEmployeeDao;
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(id);
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
		
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
		
	}

}
