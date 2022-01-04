package com.euronet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.euronet.dao.EmployeeDAO;
import com.euronet.model.Employee;

@RestController("api")
public class TestController {

	public TestController() {
		System.out.println("Rest Controller");
	}

	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public List<Employee> display() {
		System.out.println("display");
		EmployeeDAO dao = new EmployeeDAO();
		return dao.getAllEmployees();
	}
}
