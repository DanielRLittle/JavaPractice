package com.qa.hospital;

import java.util.ArrayList;

public class Staff {
	private int id;
	private static int counter = 1;
	private String name;
	
	public Staff() {
		setID();	
	}
	
	public int getID() {
		return id;
	}
	
	public void setID() {
		this.id = this.counter;
		this.counter++;
	}
	
	public Patient createPatient() {
		PatientBuilder patient = new PatientBuilder();
		patient.build();
		return null;
		
	}
}
