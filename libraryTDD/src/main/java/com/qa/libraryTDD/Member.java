package com.qa.libraryTDD;

public class Member {
	private int ID;
	private String fName;
	private String lName;
	
	private static int counter = 1;
	
	public Member(String fName, String lName) {
		setID();
		this.fName = fName;
		this.lName = lName;
	}
	
	public int setID() {
		this.ID = counter;
		counter++;
		return this.ID;
	}

	public String getFName() {
		return fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}
	
	public int getID() {
		return ID;
	}
}
