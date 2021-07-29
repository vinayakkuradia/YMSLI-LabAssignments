package assignment2.question2;

import java.util.Scanner;

public class BookStoreApp {
	public static BookStore bookStore = new BookStore();
	public static boolean loop = true;

	public static void processOrder(Scanner sc) {
		String isbn;
		int noOfCopies;
		System.out.println("Enter ISBN no.: ");
		isbn = sc.next();
		System.out.println("Enter no. of copies: ");
		noOfCopies = sc.nextInt();
		sc.nextLine();
		bookStore.order(isbn, noOfCopies, sc);
		System.out.println("Order successful!");
	}
	
	public static void processSell(Scanner sc) {
		String title;
		int noOfCopies2;
		System.out.println("Enter Title of book: ");
		title = sc.next();
		System.out.println("Enter no. of copies: ");
		noOfCopies2 = sc.nextInt();
		bookStore.sell(title, noOfCopies2);
		System.out.println("Sold!");
//		System.out.println("Sell more?(Y/N)");
//		char next = sc.next().charAt(0);
//		if (next == 'Y' || next == 'y')
//			menuSell(bookStore, sc);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (loop) {
			System.out.println("1.Display 2.Order 3.Sell 0.Exit");
			switch (sc.nextInt()) {
			case 1:
				bookStore.display();
				break;
			case 2:
				processOrder(sc);
				break;
			case 3:
				processSell(sc);
				break;
			case 0:
				loop=false;
				break;	
			default:
				System.out.println("Invalid selection, please try again...");
				break;
			}
		}
		sc.close();
	}

}
