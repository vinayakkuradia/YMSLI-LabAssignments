package oops;

public class AccountTest {

	public static void main(String[] args) {
		Customer cs1 = new Customer(001, "Vinayak", 'M');
		Account ac1 = new Account(001, cs1, 700000.00);
		System.out.println(ac1.getBalance());
		ac1.setBalance(8000000);
		System.out.println(ac1.getBalance());
	}

}
