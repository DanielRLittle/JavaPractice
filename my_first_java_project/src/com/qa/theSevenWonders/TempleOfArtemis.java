package com.qa.theSevenWonders;

public class TempleOfArtemis extends Wonder{
	public void displayWonder() {
		System.out.println("        _ -- _");
		System.out.println("    _ -        - _");
		System.out.println(" _-________________-_");
		System.out.println(" || || || || || || ||");
		System.out.println(" || || || || || || ||");
		System.out.println(" || || || || || || ||");
		System.out.println(" ||_||_||_||_||_||_||");
		System.out.println("/____________________\\");
		
	}
	public static void main(String[] args) {
		TempleOfArtemis t = new TempleOfArtemis();
		t.displayWonder();
	}

}
