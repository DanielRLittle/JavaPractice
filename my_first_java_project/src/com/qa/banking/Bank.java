package com.qa.banking;
import java.util.*;

public class Bank {
	public static void main(String [] args) {
		Bank banky = new Bank();
		banky.banking();
		
	}
	public void banking() {
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		System.out.print("Welcome to the Bank of Danny. ");
		boolean run = true;
		while(run) {
			System.out.println("What would you like to do? Please choose from 'add', 'show', 'delete' or 'exit'. Do not throw things!");
			String inputs= input();
			if (inputs.equals("add")) {
				System.out.println("Please enter a full name:");
				String inputs2 = input();
				System.out.println("Please enter a balance:");
				float inputs3 = input3();
				accounts.add(new BankAccount(inputs2, inputs3));
				System.out.println("An account for " + inputs2 + " has been created.");
			}
			else if (inputs.equals("show")) {
				if (accounts.size() == 0) {
					System.out.println("empty");
				}
				else {
					System.out.println("Please enter your full name:");
					String inny = input();
					for (BankAccount account : accounts) {
						if(account.name.equals(inny)) {
							System.out.println("Balance for " + account.name + ": " + "£" + account.balance);
						}
						else {
							System.out.println("Account does not exist");
						}
			
					}
//					System.out.println(accounts.name + accounts.balance);
				}
			}
			else if (inputs.equals("delete")) {
				System.out.println("Please enter your full name:");
				String inny2 = input();
				for(int i = 0; i < accounts.size(); i++) {
					if (accounts.get(i).name.equals(inny2)) {
						accounts.remove(i);
						System.out.println(inny2 + ", your account has been deleted. Thank you for using the Bank of Danny.");
					}
				}
			}
			else if (inputs.equals("throw things")) {
				System.out.println("We will not tolerate this behaviour, apologise immediately!");
					String inny3 = input();
					if (inny3.equals("sorry")) {
						run = true;
					}
					else {
						System.out.println("GET OUT!!!");
						run = false;
					}
			}
			else if (inputs.equals("exit")) {
				run = false;
				System.out.println("Thank you for visiting us here at the Bank of Danny, have a nice day!");
			}
		}
	
	}
	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	public float input3() {
		Scanner s = new Scanner(System.in);
		float input = s.nextFloat();
		return input;
	}
}
