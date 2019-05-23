package com.qa.secondpackage;

public class second {
	public static void main(String[] args) {
		
		System.out.println(blackjack(20, 11));
		
	}
	public static String blackjack(int go1,int  go2) {
		
		if ((go1 > 21 && go2 > 21) || go1 == go2) {
			return "0";
			
		}
		else if ((go1 > go2 || go2 > 21) && go1 < 22) {
			return "First person wins";
			
		}
		else {
			return "Second person wins";
			
	}
	}

}
