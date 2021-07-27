package assignment2.question3;

public class CurrentAccount extends Account {
	
	String tradeLicenseNumber;
	
	CurrentAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
		
	}
	
	public double getBalance() {
		return 0.00;
	}
	
	public void withdraw(double amount) {
		
	}
}
