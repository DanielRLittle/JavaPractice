package com.qa.theSevenWonders;

public class Lighthouse extends Wonder{
	public void displayWonder() {
		System.out.println("       _/\\_");
		System.out.println("      | /\\ |");
		System.out.println("      |____|");
		System.out.println("    |__|__|__|");
		System.out.println("     |      |");
		System.out.println("    /|______|\\");
		System.out.println("    ||      ||");
		System.out.println("    ||______||");
		System.out.println("   /||      ||\\");
		System.out.println("  | ||      || |");
		System.out.println("  | ||      || |");
		System.out.println(" _|_||______||_|_");
		System.out.println("|________________|");
	}
	public static void main(String[] args) {
		Lighthouse l = new Lighthouse();
		l.displayWonder();
	}
}
