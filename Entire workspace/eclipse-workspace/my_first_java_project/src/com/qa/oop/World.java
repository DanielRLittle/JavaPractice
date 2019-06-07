package com.qa.oop;

import java.util.*;


public class World {

	public static void main (String [] args) {
		Animal tunaA = new Fish(3, 6, true);
		Animal lemurA = new Monkey(3, false);
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(tunaA);
		list.add(lemurA);
		
		System.out.println(list.get(0));
		
		((Fish) list.get(0)).swim();
		
		((Fish) tunaA).swim();
		
		Fish tunaF = (Fish)tunaA;
		tunaF.swim();
		
		Cat cat1 = new Cat("Suspiciuos", "Garfield");
		Cat cat2 = new Cat("Extravagant");
		cat1.getName();
		
	}
}
