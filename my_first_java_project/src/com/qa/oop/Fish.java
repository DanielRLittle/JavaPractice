package com.qa.oop;

public class Fish extends Animal{
	private int fins;
	
	public Fish(int fins, int age, boolean offspring) {
		super(age, offspring);
		
		this.fins = fins;
		
	}
	
	public int getFins(){
		return fins;
	}
	
	public void swim() {
		System.out.println("splash!");
	}
}
