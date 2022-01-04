package com.euronet.util;

import com.euronet.pojo.Employee;

public class EmployeeUtil {

	// Calculate the yearly salary of employee
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getSalary() * 12;
		return yearlySalary;
	}

	// Calculate the appraisal amount of employee
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		if (employee.getSalary() < 10000) {
			appraisal = 1000;
		} else {
			appraisal = 500;
		}
		return appraisal;
	}

}
