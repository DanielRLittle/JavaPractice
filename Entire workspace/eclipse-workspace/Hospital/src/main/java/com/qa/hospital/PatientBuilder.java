package com.qa.hospital;

public class PatientBuilder {
	private String firstName;
	private String lastName;
	private int age;
	private String chronicMedicalProblems;
	private String location;
	
	public PatientBuilder() {
		
	}
	public PatientBuilder setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		return this;
	}
	
	public PatientBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public void setConditions(String chronicMedicalProblems) {
		this.chronicMedicalProblems = chronicMedicalProblems;
	}
	public PatientBuilder setLoc(String location) {
		this.location = location;
		return this;
	}
	public Patient build() {
		return new Patient(firstName, lastName, age, chronicMedicalProblems, location);
	}
	
}
