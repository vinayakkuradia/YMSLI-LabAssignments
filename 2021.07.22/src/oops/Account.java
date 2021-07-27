package oops;

public class Account {

	private int id;
	private Customer customer;
	private double balance;
	
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public Account deposit(double amount) {
		this.balance = balance  + amount;
		return this;
	}
	
	public Account withdraw(double amount) {
		if (balance >= amount)
			this.balance = balance-amount;
		else
			System.out.println("amount withdrawn exceeds the current balance");
		
		return this;
	}
}
