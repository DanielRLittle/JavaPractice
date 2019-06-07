package com.qa.generics;

import com.qa.oop.Animal;

public class Cage<T extends Animal> {
	private T myItem;
//	private Ttwo mySecondItem;

	
	public T getItem() {
		return this.myItem;
	}
//	public Ttwo getItem2() {
//		return this.mySecondItem;
//	}
	public void setItem(T input) {
		this.myItem = input;
	}
//	public void setItem2(Ttwo input) {
//		this.mySecondItem = input;
//	}
}
