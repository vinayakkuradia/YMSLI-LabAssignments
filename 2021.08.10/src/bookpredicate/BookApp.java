package bookpredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookApp {
	public static List<Book> getBookOnPredicate(List<Book> books, Predicate<Book> predicate) {
		List<Book> resultBookSet = new ArrayList<Book>();
		for(Book book : books) {
			if(predicate.test(book))
				resultBookSet.add(book);
		}
		
		return resultBookSet;
	}
}
