package bookapplication.layers.controller;

import bookapplication.layers.business.Book;
import bookapplication.layers.dao.BookDaoImp;

public class Main {

	public static void main(String[] args) {
		BookDaoImp bookDaoImp = new BookDaoImp();
		System.out.println(bookDaoImp.getAllBooks());
		bookDaoImp.addBook(new Book("ISBN124", "Java 8 in Action", "Unknown", 5300));
		System.out.println(bookDaoImp.getAllBooks());
		bookDaoImp.updateBook(4, new Book("ISBN124", "Java 8 in Action", "Raoul-Gabriel Urma", 5300));
		System.out.println(bookDaoImp.getAllBooks());
		Book searchedBook = bookDaoImp.getBookById(3);
		System.out.println(searchedBook);
		bookDaoImp.deleteBook(3);
		System.out.println(bookDaoImp.getAllBooks());
	}

}
