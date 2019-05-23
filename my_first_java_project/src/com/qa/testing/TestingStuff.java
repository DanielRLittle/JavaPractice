package com.qa.testing;

import java.util.*;

public class TestingStuff {
	public static void main(String [] args) {
//		HashMap<String, String> myMap = new HashMap();
//		String s = "A bird has wings";
//		myMap.put("Bird", s);
//		System.out.println(myMap.get("Bird"));
		
		String x = null;
		String y = Optional.ofNullable(x).orElse("no value");
		System.out.println(y);
		
	}
	
}

