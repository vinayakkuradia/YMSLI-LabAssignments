package bookpredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> inputBooks = new ArrayList<>();
		inputBooks.add(new Book("ISBN1", "HeadFirst", "Author1", 750));
		inputBooks.add(new Book("ISBN2", "HeadFirst1", "Author2", 450));
		inputBooks.add(new Book("ISBN3", "HeadFirst2", "Author3", 778));
		inputBooks.add(new Book("ISBN4", "HeadFirst3", "Author4", 950));
		Predicate<Book> predicate = book->book.getPrice()>500;
		ArrayList<Book> result =(ArrayList<Book>) BookApp.getBookOnPredicate(inputBooks, predicate);
		System.out.println(result);
	}

}
