package assignment2.question3;
import java.util.Scanner;

public class Bank {

	public static Account account;
	public static boolean done=false, exit=false;
	
	public static void createSavingsAccount(String memberName, double initialBalance, Scanner sc) {
		double maxWithdrawLimit;
		System.out.println("Enter Withdraw limit: ");
		maxWithdrawLimit = sc.nextDouble();
		account= new SavingsAccount(memberName, initialBalance, maxWithdrawLimit);
		System.out.println("Savings account created successfully!");
		done=true;
	}
	
	public static void createCurrentAccount(String memberName, double initialBalance, Scanner sc) {
		String tradeLicenseNumber;
		System.out.println("Enter Trade License No.: ");
		tradeLicenseNumber = sc.next();
		account= new CurrentAccount(memberName, initialBalance, tradeLicenseNumber);
		System.out.println("Current account created successfully!");
		done=true;
	}
	
	public static void main(String[] args) {
		
		String memberName;
		double initialBalance;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter you name: ");
		memberName = sc.nextLine();		
		System.out.println("Enter initial amount: ");
		initialBalance = sc.nextDouble();
		
		while(!done) {
			System.out.println("Choose account type: 1.Current  2.Savings");
			switch(sc.nextInt()) {
			case 1: 
				createCurrentAccount(memberName, initialBalance, sc);
				break;
			case 2:
				createSavingsAccount(memberName, initialBalance, sc);
				break;
			default:
				System.out.println("Invalid input, try again..");
			}
		}
		
		while(!exit) {
			System.out.println("Select operation: 1.Deposit  2.Withdraw  3.Display Balance  0.Exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Please enter amount to deposit: ");
				account.deposit(sc.nextDouble());
				break;
			case 2:
				System.out.println("Please enter amount to withdraw: ");
				if (account instanceof SavingsAccount)
					((SavingsAccount) account).withdraw(sc.nextDouble());
				else if(account instanceof CurrentAccount)
					((CurrentAccount) account).withdraw(sc.nextDouble());
				break;
			case 3:
				if (account instanceof SavingsAccount)
					System.out.println(((SavingsAccount) account).getBalance());
				else if(account instanceof CurrentAccount)
					System.out.println(((CurrentAccount) account).getBalance());
				break;
			case 0:
				exit=true;
				System.out.println("Exit!");
				break;
			default:
				System.out.println("Invalid selection, please try again..");
				break;
			}
		}
		sc.close();
			
	}

}
