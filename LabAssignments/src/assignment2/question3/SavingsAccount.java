package assignment2.question3;

public class SavingsAccount extends Account {
	
	int interest = 5;
	double maxWithdrawLimit;
	double minAccountBalance = 500;
	
	SavingsAccount(String memberName, double accountBalance, double maxWithdrawLimit) {
		super(memberName, accountBalance);
		this.maxWithdrawLimit = maxWithdrawLimit;
	}

	public double getBalance() {
		System.out.println("getBalance of Savings ");
		System.out.println(getAccountBalance()+((interest/100)*getAccountBalance()));
		return (getAccountBalance() + ((interest*getAccountBalance())/100));
	}
	
	public void withdraw(double amount) {
		if(maxWithdrawLimit>amount && (getAccountBalance()-amount)>=minAccountBalance) {
			setAccountBalance(getAccountBalance()-amount);
			System.out.println("Amount withdrawn! Current balance: "+getBalance());
		}
		else
			System.out.println("Transcation not permitted!");
	}
}
