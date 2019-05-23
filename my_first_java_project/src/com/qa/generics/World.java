package com.qa.generics;

import com.qa.oop.Animal;
import com.qa.oop.Cat;
import com.qa.oop.Fish;

public class World {
	public static void main(String[] args) {
		Cage<Animal> myCage = new Cage<Animal>();
		
		myCage.setItem(new Animal(5, false));
		System.out.println(myCage.getItem().getAge());
		
		Cage<Fish> cage2 = new Cage<Fish>();
		cage2.setItem(new Fish(2, 3, true));
		System.out.println(cage2.getItem().getFins());
		
	}
}
