package com.qa.hospital;

public class Patient {
	private String firstName;
	private String lastName;
	private int age;
	private String chronicMedicalProblems;
	private String location;
	
	public Patient(String firstName, String secondName, int age, String chronicMedicalProblems, String location) {
		this.firstName = firstName;
		this.lastName = secondName;
		this.age = age;
		this.chronicMedicalProblems = chronicMedicalProblems;
		this.location = location;
	}
}
