package com.qa.objects;

public class FirstObject {
	public static void main( String[] args) {
		Task myItem = new Task("milk", "cow", 1);
		
		System.out.println(myItem.item + myItem.where + myItem.daysLeft);
		
		myItem.item = "eggs";
		myItem.where = "chicken";
		myItem.daysLeft = 3;
		
		System.out.println(myItem.item + myItem.where + myItem.daysLeft);
	}

}
