package com.qa.exercises;

import java.util.Random;
import java.util.Scanner;

public class RPS {
	public static void main(String[] args) {
	}
	public void game() {
		Random r = new Random();
		int compR = r.nextInt(3);
		System.out.println("Let's play Rock, Paper, Scissors! You first! Pick from rock, paper or scissors:");
		String humanG = input();
		String compG = null;
		String outcome = null;
		if (compR == 0) {
			compG = "Rock";
		}
		else if (compR == 1) {
			compG = "Paper";
		}
		else if (compR == 2) {
			compG = "Scissors";
		}
		if (compG.equals("Rock")) {
			if (humanG.equals("Paper")) {
				outcome = "Player wins";
			}
			else if (humanG.equals("Scissors")) {
				outcome = "Computer wins";
			}
		}
		else if (compG.equals("Paper")) {
			if (humanG.equals("Rock")) {
				outcome = "Computer wins";
			}
			else if (humanG.equals("Scissors")) {
				outcome = "Player wins";
			}
		}
		
	}
	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
}
