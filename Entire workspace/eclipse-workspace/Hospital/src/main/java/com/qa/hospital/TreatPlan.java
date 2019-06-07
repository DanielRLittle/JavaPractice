package com.qa.hospital;

public class TreatPlan extends Hospital{
	protected String medication;
	protected String dosage;
	protected String exercises;
	protected int time;
	protected int checkUpFreq;
	
	public TreatPlan(String medication, String dosage, String exercises, int time, int checkUpFreq) {
		this.medication = medication;
		this.dosage = dosage;
		this.exercises = exercises;
		this.time = time;
		this.checkUpFreq = checkUpFreq;
		
	}
}

