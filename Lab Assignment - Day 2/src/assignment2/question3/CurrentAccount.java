package assignment2.question3;

public class CurrentAccount extends Account {
	
	String tradeLicenseNumber;
	
	CurrentAccount(String memberName, double accountBalance, String tradeLicenseNumber) {
		super(memberName, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	
	public double getBalance() {
		return getAccountBalance();
	}
	
	public void withdraw(double amount) {
		if (getAccountBalance()>=amount) {
			setAccountBalance(getAccountBalance()-amount);
			System.out.println("Amount withdrawn! Current balance: "+getBalance());
		}
		else
			System.out.println("Transcation not permitted!");
	}
}
