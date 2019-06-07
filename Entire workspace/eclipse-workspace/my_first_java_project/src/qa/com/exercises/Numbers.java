package qa.com.exercises;

import java.util.Scanner;

public class Numbers {
	public static void main(String [] args) {
		Numbers number = new Numbers();
		number.addingTwoDigits();
		
	}
	public int addingTwoDigits() {
		System.out.println("Please choose any 2-digit number:");
		int num1 = input2();
		int num2 = 0;
		int digit1 = 0;
		int digit2 = 0;
		if (10 <= num1 && num1 <= 99) {
			for(int i = 1; i < 11; ++i) { 
				num2 = i * 10;
				if ((num1 - num2) < 0) {
					digit1 = i - 1;
					break;
				}
			}
			
			for(int j = 0; j < 10; ++j) {
				if((num1 - (digit1*10) - j) == 0) {
					digit2 = j;
					break;
				}
			}			
		}
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit1 + digit2);
		return digit1 + digit2;
	}
	
	public int numToString() {
		int num1 = input2();
		return num1;
		
	}
	
	public int input2() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}
	
}
