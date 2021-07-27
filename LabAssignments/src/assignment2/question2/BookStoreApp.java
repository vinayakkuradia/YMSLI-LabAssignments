package assignment2.question2;

import java.util.Scanner;

public class BookStoreApp {

	public static boolean menu(BookStore bookStore) {
		System.out.println("1.Display 2.Order 3.Sell 0.Exit");

		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {

		case 1:
			bookStore.display();
			sc.close();
			return true;

		case 2:
			Scanner sc1 = new Scanner(System.in);
			String isbn;
			int noOfCopies1;
			System.out.println("Enter ISBN no.: ");
			isbn = sc1.nextLine();
			System.out.println("Enter no. of copies: ");
			noOfCopies1 = sc1.nextInt();
			sc1.nextLine();
			bookStore.order(isbn, noOfCopies1);
			System.out.println("Order successful!");
			sc1.close();
			return true;

		case 3:
			Scanner sc2 = new Scanner(System.in);
			String title;
			int noOfCopies2;
			System.out.println("Enter Title of book: ");
			title = sc2.nextLine();
			System.out.println("Enter no. of copies: ");
			noOfCopies2 = sc2.nextInt();
			bookStore.sell(title, noOfCopies2);
			System.out.println("Sold!");
//			System.out.println("Sell more?(Y/N)");
//			char next = sc.next().charAt(0);
//			if (next == 'Y' || next == 'y')
//				menuSell(bookStore, sc);
			sc2.close();
			return true;

		case 0:
			sc.close();
			return false;

		default:
			System.out.println("Invalid selection, please try again...");
			sc.close();
			return true;
		}
	}

	public static void main(String[] args) {
		BookStore bookStore = new BookStore();
		boolean loop = true;
		while (loop) {
			loop = menu(bookStore);
		}
	}

}
