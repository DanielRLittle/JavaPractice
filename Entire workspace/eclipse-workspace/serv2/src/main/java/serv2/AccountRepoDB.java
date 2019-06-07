package serv2;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AccountRepoDB implements AccountRepo{
	@PersistenceContext
	private EntityManager em;
	Random r = new Random();
	Inputs inputs = new Inputs();
	
	public Account addAccount(Account account) {
//		createAccount();
		em.persist(account);
		return account;
	}
//	int id = 1;
//	
//	public Account createAccount() {
//		System.out.println("Please enter a first name:");
//		String fName = inputs.stringInput();
//		System.out.println("Please enter a last name:");
//		String lName = inputs.stringInput();
//		System.out.println("An account number will be randomly generated, press enter to continue.");
//		String x = inputs.stringInput();
//		int accountNum = r.nextInt(10000);
//		System.out.println("Your account number is: " + accountNum);
//		id ++;
//		Account account56 = new Account(id, fName, lName, accountNum);
//		return account56;
//	}
}
