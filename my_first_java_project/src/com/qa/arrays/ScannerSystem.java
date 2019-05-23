package com.qa.arrays;
import java.util.*;

public class ScannerSystem {
	public static void main(String[] args) {
		System.out.println(scanning());
		
		
	}
	
	public static ArrayList<String> scanning() {
		
		ArrayList<String> listy = new ArrayList<String>();
		boolean run = true;
		
		while(run) {
			System.out.println("What would you like to do?");
			String inputs= input();
			if (inputs.equals("show")) {
				if(listy.size() == 0) {
					System.out.println("empty");
				}
				else {
					System.out.println(listy);
				}
			}
			else if (inputs.equals("add")) {
				System.out.println("What would you like to add?");
				String adding = input();
				listy.add(adding);
			}
			else if (inputs.equals("delete")) {
				System.out.println("What would you like to delete?");
//				int num = input2();
//				listy.remove(num);
				String remover = input();
				listy.remove(remover);	
			}
			else if (inputs.equals("exit")) {
				System.out.println("Program exited");
				System.out.println("The list contains:");
				run = false;
			}
	
		}
		return listy;
	}
	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	public static int input2() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}

}
