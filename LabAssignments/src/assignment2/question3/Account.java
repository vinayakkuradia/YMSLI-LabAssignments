package assignment2.question3;
import java.util.Random;

public class Account {
	String memberName, accountNumber;
	double accountBalance;
	
	Account(String memberName, double accountBalance) {
		Random rand = new Random();
		this.accountNumber = 10000 + rand.nextInt(89999) + "";
		this.memberName = memberName;
		this.accountBalance = 0.00;
	}
	
	public void deposit(double amount) {
		
	}
}
