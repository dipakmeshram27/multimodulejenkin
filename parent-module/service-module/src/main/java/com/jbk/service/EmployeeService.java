package com.jbk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmployeeDao;
import com.jbk.domain.Employee;
import com.jbk.domain.Employeepojo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	/*public List<Employeepojo>getAllEmpList(){
		return employeeDao.getAllEmpList();
	}*/
	
	public List<Employee>getAllEmployee(){
		return employeeDao.getAllEmployee();
	}

	public Employee getEmployeebyId(int empId) {
		Employee employee=employeeDao.getEmployeebyId(empId);
			
		return employee;
	}

	public List<Employee> getEmployeeStatus(String status) {
		
		return employeeDao.getEmployeeStatus(status);
	}

	public List<Employee> getEmployeebyName(String empName) {
		
		return employeeDao.getEmployeebyName(empName);
	}


}
