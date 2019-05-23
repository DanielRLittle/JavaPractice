package com.qa.exercises;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		Full f = new Full();
		f.fullCalc();
		
	}
	public float calcs() {
		float num1;
		float num2;
		System.out.println("Pick two numbers:");
		num1 = input3();
		num2 = input3();
		System.out.println("Please pick an operation, add, multiply, divide or subtract:");
		String operate = input();
		float output = 0;
		if (operate.equals("add")) {
//			System.out.println("You want to perform the calculation: " + num1 + " + " + num2);
//			System.out.println("Is this correct?");
			output = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + output);
			return output;
		}
		else if (operate.equals("subtract")) {
			output = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + output);
			return output;
		}
		else if (operate.equals("multiply")) {
			output = num1 * num2;
			System.out.println(num1 + " x " + num2 + " = " + output);
			return output;
		}
		else if (operate.equals("divide")) {
			output = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + output);
			return output;
		}
		else {
			System.out.println("Incorrect operator entered.");
		}
		return output;

	}
	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	public float input3() {
		Scanner s = new Scanner(System.in);
		float input = s.nextFloat();
		return input;
	}
}
