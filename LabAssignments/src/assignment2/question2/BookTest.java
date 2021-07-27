package assignment2.question2;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("Title1", "Author1", "ISBN1", 5);
		b1.display();
		b1.setNumOfCopies(3);
		b1.display();
	}

}
