package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.domain.Employee;
import com.jbk.domain.Employeepojo;
import com.jbk.service.EmployeeService;
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	/*@RequestMapping("/emplist")
	List<Employeepojo> getAllEmpList(){
		return employeeService.getAllEmpList();
	}*/
	
	@RequestMapping("/getemployees")
	public List<Employee>getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping("/getemployee/{empId}")
	public Employee getEmployeebyId(@PathVariable int empId){
		return employeeService.getEmployeebyId(empId);
	}
	
	@RequestMapping("/getemployeestatus/{status}")
	public List<Employee>getEmployeeStatus(@PathVariable String status ){
		return employeeService.getEmployeeStatus(status);
	}
	
	@RequestMapping("/getemployeebyname/{empName}")
	public List<Employee> getEmployeebyName(@PathVariable String empName ){
		return employeeService.getEmployeebyName(empName);
	}
	
	
}
