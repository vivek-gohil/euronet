package com.euronet.main;

import com.euronet.pojo.CalculationInterface;
import com.euronet.pojo.MyInterface;
import com.euronet.pojo.MyNewInterface;

public class LambdaExpressionMain {
	public static void main(String[] args) {
//		MyInterface myInterface = () -> System.out.println("Hello From display()");
//
//		myInterface.display();

		// CalculationInterface addition = (double num1, double num2) -> num1 + num2;
		// CalculationInterface addition = (num1, num2) -> num1 + num2;

		// int x = 10;
		// calculate(101,102,x)
		CalculationInterface addition = (n1, n2) -> n1 + n2;
		double result = addition.calculateValues(101, 103);
		System.out.println("Result is :: " + result);

		// calculateLambda(101, 102, addition);
		calculateLambda(101, 102, (n1, n2) -> n1 + n2);
		calculateLambda(101, 102, (n1, n2) -> n1 - n2);
		calculateLambda(101, 102, (n1, n2) -> n1 * n2);
		calculateLambda(101, 102, (n1, n2) -> n1 / n2);

		stringLengthLambda(s -> s.length(), "Euronet");
		stringLengthLambda(s -> s.length(), "Lambda Expression");
		
		MyNewInterface newInterface = s -> s.length();
		int length= newInterface.calculateLength("Euronet");
		System.out.println("Length is "+ length);

	}

	public static void calculateLambda(double num1, double num2, CalculationInterface calculationInterface) {
		double result = calculationInterface.calculateValues(num1, num2);
		System.out.println(result);

	}

	public static void stringLengthLambda
			(MyNewInterface newInterface, String text) {
		int length = newInterface.calculateLength(text);
		System.out.println("Length is :: " + length);
	}
}
