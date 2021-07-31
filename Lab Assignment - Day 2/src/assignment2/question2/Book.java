package assignment2.question2;

public class Book {

	String bookTitle, author, ISBN;
	int numOfCopies;
	
	public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}
	
	public void display() {
		System.out.println(getBookTitle()+" - "+getAuthor()+" - "+getISBN()+" - "+getNumOfCopies());
	}

	
	// Getters and Setters on demand
	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}
	
}
