package com.qa.usingInterfaces;

public class Fruit extends Food implements Healthy{
	

	public Fruit(String name) {
		super(name);
	}

	
	public String thisHealthy() {
		String health = this.name + "s are good for you!";
		return health;
	}

	
	
}
