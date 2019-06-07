package com.qa.serv2Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import serv2.Account;
import serv2.AccountRepoDB;

public class AccountTest {
	Account account;
	
	@Before
	public void setup() {
		account = new Account();
	}
	
	@Test
	public void testAddAccount() {
		AccountRepoDB ar = new AccountRepoDB();
		Account a = new Account();
		ar.addAccount(a);
		String gName = a.getFirstName();
		// When it asks for first name, enter 'Danny'
		assertEquals("Couldn't retrieve first name", "Danny", gName);
	}
}
