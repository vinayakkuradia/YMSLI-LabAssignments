package question2;

public class SavingAccount extends Account {
	private float interestRate;

	public SavingAccount() {
	}

	public SavingAccount(SavingAccount savingAccount) {
		this();
		this.interestRate = savingAccount.interestRate;
	}

	public void input() {
		
	}

	public void print() {
		System.out.println("Interest rate: "+interestRate);
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + "]";
	}
	
	float getInterestRate() {
		return interestRate;
	}

}
