package question3;

public class Book {
	String title, author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book ["+title+ " by "+author+"]";
	}
}
