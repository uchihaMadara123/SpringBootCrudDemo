package com.SpringBootCrudDemo.DAO;

import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootCrudDemo.Entity.Employee;
@Repository
@Transactional
public class EmployeeDAOimpl implements EmployeeDAO {

	private EntityManager entityManager;
	@Autowired
	public EmployeeDAOimpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}
	@Override
	public List<Employee> getAllEmployees() {
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> qurey = session.createQuery("from Employee",Employee.class);
		return qurey.getResultList();
	}
	@Override
	public Employee getEmployee(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Employee.class, id);
	}
	@Override
	public void saveEmployee(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		
	}
	@Override
	public void deleteEmployee(int id) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("Delete from Employee where id =: employeeID");
		query.setParameter("employeeID", id);
		query.executeUpdate();
	}

}
