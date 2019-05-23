package com.qa.theSevenWonders;

public class SevenWonders {
	public static void main(String [] args) {
		Wonder p = new Pyramid();
		Wonder c = new Colossus();
		
		Pyramid p2 = (Pyramid) p;
		
		p2.stareAt();
		
		

	}

	
}
