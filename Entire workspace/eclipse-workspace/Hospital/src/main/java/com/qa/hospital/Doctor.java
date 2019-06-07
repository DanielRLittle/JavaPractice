package com.qa.hospital;

import java.util.ArrayList;

public class Doctor extends Medical{
	TreatPlanBuilder builder = new TreatPlanBuilder();
	
	ArrayList<TreatPlan> planList = new ArrayList<TreatPlan>();
	
	public void accessRecords() {
		
		
	}
	
	public void createPlan() {

		
		TreatPlanBuilder y = new TreatPlanBuilder();
		System.out.println("Would you like to prescribe any medication");
		String yesNo = Hospital.input();
		if (yesNo.equals("Yes")) {
			System.out.println("What medication would you like to prescribe?");
			y.setMeds(Hospital.input());
			System.out.println("What dosage?");
			y.setDose(Hospital.input());
		}
		System.out.println("Would you recommend any specific exercise?");
		yesNo = Hospital.input();
		if (yesNo.equals("Yes")) {
			System.out.println("What exercise do you recommend?");
			String ex = Hospital.input();
			y.setEx(ex);
		}
		this.planList.add(y.build());
		
		
	}


	
	
}
