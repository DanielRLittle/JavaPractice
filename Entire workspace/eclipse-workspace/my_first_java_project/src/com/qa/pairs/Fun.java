package com.qa.pairs;

import java.util.Scanner;

public class Fun {
	public static void main(String[] args)
	{
		Fun f = new Fun();
		f.change();
		
	}
	public float change() {
		System.out.println("The cost is:");
		float moneyOwed = input3();
		System.out.println("How much has the customer given?");
		float moneyGvn = input3();
		
		while (moneyGvn < moneyOwed) {
			System.out.println("Please give a new amount of money:");
			moneyGvn = input3();
		}
		float change = moneyGvn - moneyOwed;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int fiftyps =0;
		float x = 0;
		float y = 0;
		float z = 0;
		float a = 0;
		float b = 0;
		if(change >= 20) {
			
			for (int i = 0; ; i++) {
				x = change - (i*20);
				if (x < 0) {
					twenties = i - 1;
					break;
				}
			}
		}
		x = change - (twenties * 20);
		if(x >= 10) {
			
			for (int i = 0; ; i++) {
				y = x - (i * 10);
				if (y < 0) {
					tens = i - 1;
					break;
				}
			}
		}
		y = x - (tens * 10);
		if(y >= 5) {
			
			for (int i = 0; ; i++) {
				z = y - (i * 5);
				if (z < 0) {
					fives = i - 1;
					z = y - (fives * 5);
					break;
				}
			}
		}
		z = y - (fives * 5);
		if(z >= 1) {
			
			for (int i = 0; ; i++) {
				a = z - (i * 1);
				if (a < 0) {
					ones = i - 1;
					
					break;
				}
			}
		}
		
		a = z - (ones * 1);
		if(a >= 0.50) {
			
			for (int i = 0; ; i++) {
				b = (float) (a - (i * 0.50));
				if (b < 0) {
					fiftyps = i - 1;
					
					break;
				}
			}
		}
		b = (float) (a - (fiftyps * 0.50));
		System.out.println(fiftyps + " £0.50ps");
		System.out.println(ones + " £1 coins");
		System.out.println(fives + " £5 notes");
		System.out.println(tens + " £10 notes");
		System.out.println(twenties + " £20 notes");
		return 0;	
		}
	
	

		
		
	
	public  float input3()
	{
		Scanner s = new Scanner(System.in);
		float input = s.nextFloat();
		return input;
	}
}

