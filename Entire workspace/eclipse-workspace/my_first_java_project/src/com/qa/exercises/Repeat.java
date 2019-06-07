package com.qa.exercises;

public class Repeat {
	Calculator c = new Calculator();
	
	public void repeater() {
		System.out.println("Would you like to perform another calculation, yes or no?");
		String response = c.input();
		while (response.equals("yes")) {
			c.calcs();
			System.out.println("Would you like to perform another calculation, yes or no?");
			response = c.input();
		}
		
	}
}
