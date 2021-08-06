package question3;

public class Main {

	public static void main(String[] args) {
		Book [] books = {new Book("Java in depth", "Author1"), new Book("Head First Java", "Author1"), new Book("Head First Java", "Author101"), new Book("Head First Java", "Author2"), new Book("Head First Design Patterns", "Author3")};
		BookCollection bookCollection = new BookCollection("Vinayak Kuradia", books);
		System.out.println(bookCollection);
		bookCollection.sort();
		System.out.println(bookCollection);
		System.out.println(bookCollection.hasBook(new Book("Java in depth", "Author1")));
	}

}
