package assignment2.question3;
import java.util.Random;

public abstract class Account {
	String memberName, accountNumber;
	double accountBalance;
	
	Account(String memberName, double accountBalance) {
		Random rand = new Random();
		this.accountNumber = 10000 + rand.nextInt(89999) + "";
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}
	
	public void deposit(double amount) {
		setAccountBalance(Math.abs((getAccountBalance()+amount)));
		System.out.println("Amount deposited!");
	}

	double getAccountBalance() {
		return accountBalance;
	}

	void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	String getMemberName() {
		return memberName;
	}

	String getAccountNumber() {
		return accountNumber;
	}
}
