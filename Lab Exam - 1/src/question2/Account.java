package question2;

public class Account {
	private Owner owner;
	private float balance;
	private String number;

	public Account() {
	}

	public Account(Owner owner, String number, float balance) {
		this.owner = owner;
		this.number = number;
		this.balance = balance;
	}

	public Account(Account account) {
		this(account.owner, account.number, account.balance);
	}

	public void input() {

	}

	public void print() {
	}

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}

	public void deposit() {

	}

	public void withdraw() {

	}

	public float getBalance() {
		return 0;
	}

}
