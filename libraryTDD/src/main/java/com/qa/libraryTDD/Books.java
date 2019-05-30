package com.qa.libraryTDD;

import java.util.HashMap;
import java.util.Scanner;

public class Books implements Rent{
	private String name;
	
	public Books(String name) {
		
	}
	
	public void addBook(String n) {
		String input = input();
		Books b = new Books(n);
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void checkIn() {
		
	}
	
	public void checkInBook(Books book) {
		
	}

	public void checkOut() {
		
	}
	
	public void checkOutBook(Books book) {
		
	}
	
	public String checkRecords(Books book) {
		return name;
		
	}
	
	public HashMap bookList() {
		return null;
		
	}
	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}

}
