package com.euronet.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.euronet.main.pojo.Employee;

//localhost:8080/api/employee
@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	private List<Employee> employees;

	public EmployeeController() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "Vivek", 1000));
		employees.add(new Employee(102, "Reema", 1000));
		employees.add(new Employee(103, "Seema", 1000));
	}

	// localhost:8080/api/employee/allemployees
	@RequestMapping(value = "allemployees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return employees;
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public Employee getSingleEmployee(@PathVariable int employeeId) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public boolean deleteEmployee(@PathVariable int employeeId) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public boolean addEmployee(@RequestBody Employee employee) {
		return employees.add(employee);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		for (Employee emp : employees) {
			if (emp.getEmployeeId() == employee.getEmployeeId()) {
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				return emp;
			}
		}
		return null;
	}

}
