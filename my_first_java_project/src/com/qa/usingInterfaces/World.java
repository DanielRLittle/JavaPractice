package com.qa.usingInterfaces;

import java.util.ArrayList;

public class World {

	public static void main(String[] args) {
		
		Fruit f = new Fruit("banana");
		ArrayList<Fruit> fruity = new ArrayList<Fruit>();
		fruity.add(f);
				
		System.out.println(f.thisHealthy());
		
		Chocolate c = new Chocolate("Milk chocolate");
		System.out.println(c.badHealth());
	}
}
