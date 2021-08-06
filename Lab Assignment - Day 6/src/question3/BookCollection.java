package question3;
//Using Collections
import java.util.*;

public class BookCollection {
	public static int collectionLimit = 30;
	private String ownerName;
	 ArrayList <Book> bookArray= new ArrayList<Book>(collectionLimit);
	
	BookCollection(String ownerName) {
		this.ownerName = ownerName;
	}
	
	BookCollection(String ownerName, Book [] inputBookArray) {
		this.ownerName = ownerName;
		if(inputBookArray.length<=collectionLimit) {
			for (int i=0; i<inputBookArray.length; i++) {
				bookArray.add(inputBookArray[i]);
			}
		}
				
	}
	
	public void addBook(Book book) {
		if(bookArray.size()<collectionLimit-1)
			bookArray.add(book);
	}
	
	public void addBooks(Book [] inputBookArray) {
		if(inputBookArray.length+bookArray.size()<=collectionLimit) {
			for (int i=0; i<inputBookArray.length; i++) {
				bookArray.add(inputBookArray[i]);
			}
		}
	}
	
	public boolean hasBook(Book book) {
		for(int i=0; i<bookArray.size(); i++) {
			if(bookArray.get(i).author.equals(book.author) && bookArray.get(i).title.equals(book.title))
				return true;
		}
		return false;
	}
	
	public void sort() {
		Collections.sort(bookArray, new LexicographicalComparator());
	}

	@Override
	public String toString() {
		StringBuilder outputStrBuilder=new StringBuilder();
		outputStrBuilder.append("Owner: "+ownerName +"\nCollection:\n");
		for(int i=0; i<bookArray.size(); i++) {
				outputStrBuilder.append(bookArray.get(i));
				if(i+1<bookArray.size())
					outputStrBuilder.append(",\n");
		}
		return outputStrBuilder.toString();
	}
	
}
