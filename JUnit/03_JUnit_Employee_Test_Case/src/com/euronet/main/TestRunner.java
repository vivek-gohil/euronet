package com.euronet.main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.euronet.test.TestEmployeeDetails;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestEmployeeDetails.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}
}
