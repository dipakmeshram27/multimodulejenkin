package com.jbk.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import javax.persistence.OneToMany;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.domain.Employee;
import com.jbk.domain.Employeepojo;


@Repository
public class EmployeeDao {
	/*
	 * public List<Employeepojo> getAllEmpList(){ Employeepojo emp1=new
	 * Employeepojo(25, "Pune"); Employeepojo emp2=new Employeepojo(20, "Nagpur");
	 * Employeepojo emp3=new Employeepojo(24, "Chimur"); Employeepojo emp4=new
	 * Employeepojo(35, "Neri"); List<Employeepojo> empList=new ArrayList<>();
	 * empList.add(emp1); empList.add(emp2); empList.add(emp3); empList.add(emp4);
	 * return empList; }
	 */
	
	@Autowired
	//SessionFactory sf;
	EntityManager em;
	
	protected EmployeeDao() {
	}

	public EmployeeDao(EntityManager theEm){
		em=theEm;
	}
	
	/*public List<Employee> getAllEmployee(){
		Session session=sf.openSession();
		session.beginTransaction();
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> empList=(List<Employee>)criteria.list();
		return empList;
	}*/
	public List<Employee> getAllEmployee(){
		Session session=em.unwrap(Session.class);
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> empList=(List<Employee>)criteria.list();
		return empList;
	}

	public Employee getEmployeebyId(int empId) {
		Session session=em.unwrap(Session.class);
		
		Employee employee=session.get(Employee.class, empId);
		
		return employee;
	}

	public List<Employee> getEmployeeStatus(String status) {
		Session session=em.unwrap(Session.class);
		Query query=session.createQuery("from Employee where status=:status");
		query.setParameter("status", status);
		List<Employee> empList=query.getResultList();
		return empList;
	}

	public List<Employee> getEmployeebyName(String empName) {
		Session session=em.unwrap(Session.class);
		Query query=session.createQuery("from Employee where name=:name");
		query.setParameter("name", empName);
		List<Employee> emp=query.getResultList();
		return emp;
	}
	
	
}
