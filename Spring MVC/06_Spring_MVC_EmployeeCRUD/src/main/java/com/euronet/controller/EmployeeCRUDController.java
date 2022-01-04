package com.euronet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.euronet.dao.EmployeeDAO;
import com.euronet.model.Employee;

@Controller
public class EmployeeCRUDController {

	@Autowired
	private EmployeeDAO employeeDAO;

	@RequestMapping("/")
	public String display() {
		employeeDAO.testConnection();
		return "index";
	}

	@RequestMapping("addnewemployee")
	public String displayAddNewEmployeePage(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "newemployee";
	}

	@RequestMapping("allemployees")
	public String displayAllEmployeePage(Model model) {
		List<Employee> employees = employeeDAO.getAllEmployees();
		model.addAttribute("employees", employees);
		return "allemployees";
	}

	@RequestMapping("saveemployee")
	public String addNewEmployeePage(@ModelAttribute Employee employee) {
		System.out.println(employee);
		employeeDAO.addEmployee(employee);
		return "redirect:/allemployees";
	}

	@RequestMapping("updateemployee/{employeeId}")
	public String updateEmployeePage(@PathVariable int employeeId, Model model) {
		System.out.println("employeeId :: " + employeeId);
		Employee employee = employeeDAO.getEmployee(employeeId);
		System.out.println(employee);
		model.addAttribute("employee", employee);
		return "updateemployee";
	}

	@RequestMapping("deleteemployee/{employeeId}")
	public String deleteEmployeePage(@PathVariable int employeeId) {
		System.out.println("employeeId :: " + employeeId);
		employeeDAO.deleteEmployee(employeeId);
		return "redirect:/allemployees";
	}

	@RequestMapping("saveupdatedemployee")
	public String saveEmployeeDetails(@ModelAttribute Employee employee) {
		employeeDAO.updateEmployee(employee);
		return "redirect:/allemployees";
	}
}
