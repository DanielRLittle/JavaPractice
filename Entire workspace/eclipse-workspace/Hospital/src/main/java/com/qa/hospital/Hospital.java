package com.qa.hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	public void admitPatient() {
		
	}
	
	
	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	public int input2() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}
	public float input3() {
		Scanner s = new Scanner(System.in);
		float input = s.nextInt();
		return input;
	}

}
