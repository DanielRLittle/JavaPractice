package com.qa.hospital;

public class TreatPlanBuilder {
	private String medication;
	private String dosage;
	private String exercises;
	private int time;
	private int checkUpFreq;
	
	public TreatPlanBuilder() {
		
	}
	public TreatPlanBuilder setMeds(String medication) {
		this.medication = medication;
		return this;
	}
	public TreatPlanBuilder setDose(String dosage) {
		this.dosage = dosage;
		return this;
	}
	public TreatPlanBuilder setEx(String exercises) {
		this.exercises = exercises;
		return this;
	}
	public TreatPlanBuilder setTime(int time) {
		this.time = time;
		return this;
	}
	public TreatPlanBuilder setFreq(int checkUpFreq) {
		this.checkUpFreq = checkUpFreq;
		return this;
	}
	public TreatPlan build() {
		return new TreatPlan(medication, dosage, exercises, time, checkUpFreq);
	}
}
