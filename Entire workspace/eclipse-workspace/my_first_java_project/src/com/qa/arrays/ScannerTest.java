package com.qa.arrays;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		System.out.println(input());
	}
	
	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}

}
