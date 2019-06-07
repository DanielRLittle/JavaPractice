package com.qa.oop;

public class Animal {
	private int age;
	private boolean offspring;
	
	public Animal(int age, boolean offspring) {
		this.age = age;
		this.offspring = offspring;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getOffspring() {
		return offspring;
	}
	
	
	
	public void die() {
		System.out.println("    ||    ");
		System.out.println("||||||||||");
		System.out.println("    ||    ");
		System.out.println("    ||    ");
		System.out.println("    ||    ");
	}
	public void consume() {
		System.out.println("Was that fresh?");
	}
	public void respire() {
		System.out.println("*sigh");
	}
	
}
