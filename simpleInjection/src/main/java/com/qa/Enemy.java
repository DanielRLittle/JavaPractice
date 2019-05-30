package com.qa;

import javax.enterprise.inject.Alternative;

@Alternative
public class Enemy implements Message {

	public String message() {
		return "I hate you";
	}
}
