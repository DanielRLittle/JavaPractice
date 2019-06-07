package serv2;

import java.util.Scanner;

public class Inputs {
	public String stringInput() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	public int intInput() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}
}
