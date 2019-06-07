package com.qa.theSevenWonders;

public class Pyramid extends Wonder implements SiteSeeing{
	public void displayWonder() {
		System.out.println("                 /\\    ");
		System.out.println("                /  \\   ");
		System.out.println("               /    \\  ");
		System.out.println("              / <()> \\");
		System.out.println("             /        \\");
		System.out.println("           _/__________\\_");
		System.out.println("          |              |");
	}

	
	public void stareAt() {
		displayWonder();
		System.out.println("");
		System.out.println("    |");
		System.out.println("    |Wow, that looks nice!");
		System.out.println("   /|");
		System.out.println("  /");
		System.out.println("_o_");
		System.out.println(" |");
		System.out.println("/ \\");
		
		
	}
}
