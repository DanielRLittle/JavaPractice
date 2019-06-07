package com.qa.usingInterfaces;

public class Chocolate extends Food implements Unhealthy{

	public Chocolate(String name) {
		super(name);
	}


	public String badHealth() {
		String unhealthy = this.name + "s are bad for you!";
		return unhealthy;
	}

}
