package com.qa.firstPackage;

public class First {
	public static void main(String[] args) {
		int go1 = 13;
		int go2 = 18;
		
		if ((21 - go1) < 0 && (21 - go2) < 0) {
			System.out.println(0);
			
		}
		else if ((21 - go1) < (21 - go2)) {
			System.out.println("First person wins");
		}
		else {
			System.out.println("Second person wins");
		}
	}

}
