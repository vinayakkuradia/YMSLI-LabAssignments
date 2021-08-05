package question2;

public class CurrentAccount  extends Account {
	private float minimumBalance;
	
	public CurrentAccount() {

	}

	public CurrentAccount(CurrentAccount currentAccount) {
		this();
		this.minimumBalance = currentAccount.minimumBalance;
	}

	public void input() {
		
	}

	public void print() {

	}

	float getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public String toString() {
		return "CurrentAccount [minimumBalance=" + minimumBalance + "]";
	}
}
