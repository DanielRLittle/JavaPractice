package com.qa.conditionals;

public class Taxes {
	public static void main(String[] args) {
		

		System.out.println(finalSalary(21000));
		
	}
	public static float perc(float salary) {
		
		float percentage = 0;
		
		if (salary < 15000) {
			percentage = 0;
			return percentage;
		}
		else if (salary >= 45000) {
			percentage = (float) ( 100 * (((salary - 45000) * 0.25) + (15000 * 0.2) + (10000 * 0.15) + (5000 * 0.1)) / salary);
			return percentage;
		}
		else if (salary >= 30000 && salary < 450000) {
			percentage = (float) ( 100 * (((salary - 30000) * 0.20) + (10000 * 0.15) + (5000 * 0.1)) / salary);
			return percentage;
		}
		else if (salary >= 20000 && salary < 300000) {
			percentage = (float) ( 100 * (((salary - 20000) * 0.15) + (5000 * 0.1)) / salary);
			return percentage;
		}
		else if (salary >= 15000 && salary < 20000) {
			percentage = (float) (100 *((salary - 15000) * 0.1) / salary);
			return percentage;
		}
		return 0;
	}
	
	public static float taxed(float salary) {
		float taxation = 0;
		
		taxation = perc(salary) * salary/100;
		return taxation;
	}
	
	public static float finalSalary(float salary) {
		float tax = taxed(salary);
		float net = salary - tax;
		return net;
	}

}
