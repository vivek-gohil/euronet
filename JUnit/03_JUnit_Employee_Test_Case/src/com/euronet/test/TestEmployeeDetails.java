package com.euronet.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.euronet.pojo.Employee;
import com.euronet.util.EmployeeUtil;

public class TestEmployeeDetails {

	EmployeeUtil employeeUtil = new EmployeeUtil();
	Employee employee = new Employee();

	@Test
	public void testCalcualteYearlySalary() {
		employee.setEmployeeId(101);
		employee.setName("Test Employee");
		employee.setSalary(8000);

		double yearlySalary = employeeUtil.calculateYearlySalary(employee);
		assertEquals(95000, yearlySalary, 0.0);
	}

	@Test
	public void testCalculateAppriasal() {
		employee.setEmployeeId(101);
		employee.setName("Test Employee");
		employee.setSalary(8000);

		double appraisal = employeeUtil.calculateAppraisal(employee);
		assertEquals(1000, appraisal, 0.0);
	}
}
