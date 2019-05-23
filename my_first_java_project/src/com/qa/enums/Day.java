package com.qa.enums;

public enum Day {
	MONDAY ("Late start woo!"),
	TUESDAY ("alright"),
	WEDNESDAY ("Blehhh"),
	THURSDAY ("Good timez"),
	FRIDAY (" = best day"),
	SATURDAY (" = almost best day"),
	SUNDAY ("Strangely productive");
	
	private String feeling;
	
	Day(String feeling){
		this.feeling = feeling;
	}
	public String getFeeling() {
		return feeling;
	}
}
