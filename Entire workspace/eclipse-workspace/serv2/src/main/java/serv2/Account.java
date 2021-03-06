package serv2;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Account {
	@Id
	@GeneratedValue
	
	private int id;
	private String firstName;
	private String lastName;
	private int accountNumber;
	
	public Account() {
	}
	
	public Account(int id, String firstName, String lastName, int accountNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
















