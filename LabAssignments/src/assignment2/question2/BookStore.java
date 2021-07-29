package assignment2.question2;

import java.util.Scanner;

public class BookStore {
	static int bookMaxLimit = 10;
	int bookArrayIndex = -1;
	Book[] books = new Book[bookMaxLimit];

	public void sell(String bookTitle, int noOfCopies) {
		int i;
		boolean available = false;
		for (i = 0; i <= bookArrayIndex; i++) {
			if (bookTitle.equals(books[i].getBookTitle())) {
				available = true;
				break;
			}
		}

		if (available) {
			int bookCount = books[i].getNumOfCopies();
			if (bookCount > noOfCopies) {
				books[i].setNumOfCopies(bookCount - noOfCopies);
				System.out.println("Book sold.");
			} else
				System.out.println("Sorry, only " + bookCount + " copies are available");
		} else {
			System.out.println("The book doesn't exist in the records");
		}
	}

	private boolean addBook(Book book) {
		if (bookArrayIndex < bookMaxLimit - 1) {
			books[++bookArrayIndex] = book;
			return true;
		}
		return false;
	}

	public void order(String isbn, int noOfCopies, Scanner sc) {
		boolean isOrderComplete = false;
		
		if (bookArrayIndex >= 0)
			for (int i = 0; i <= bookArrayIndex; i++) {
				if (books[i].getISBN() == isbn) {
					books[i].setNumOfCopies(books[i].getNumOfCopies() + noOfCopies);
					isOrderComplete = true;
					break;
				}
			}

		if (!isOrderComplete) {
			System.out.println("Enter Title of the Book: ");
			String bookTitle = sc.nextLine();
			System.out.println("Enter Author name of the Book: ");
			String bookAuthor = sc.nextLine();
			Book book = new Book(bookTitle, bookAuthor, isbn, noOfCopies);
			if (addBook(book))
				isOrderComplete = true;
		}
		
		if (isOrderComplete)
			System.out.println("Book ordered successfully");
		else
			System.out.println("Not enough space to order");
	}

	public void display() {
		if (bookArrayIndex >= 0)
			for (int i = 0; i <= bookArrayIndex; i++) {
				books[i].display();
			}
		else
			System.out.println("Sorry no books are available currently!");
	}
}
