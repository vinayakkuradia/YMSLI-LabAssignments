package com.day1.session2.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
//			List<Book> resultBookSet = allBooks.stream().filter(b->b.getPages()>400).collect(Collectors.toList());
//			System.out.println(resultBookSet);
//		List<Book>booksMoreThen400Pages=allBooks.stream()
//				.filter(b-> b.getPages()>400).collect(Collectors.toList());
		
		// 2. Find all books that are java books and more then 400 pages
			//allBooks.stream().filter(b->b.getPages()>400).filter(b->b.getSubject()==Subject.JAVA).forEach(System.out::println);;
		
		
		// 3. We need the top three longest books
			allBooks.stream()
			.sorted(Comparator.comparing(Book::getPages))
			.forEach(System.out::println);;
			//.sorted((o1, o2)-> Integer.compare(o1.getPages(), o2.getPages())).forEach(System.out::println);
				
				
			
		// 4. We need from the fourth to the last longest books

		// 5. We need to get all the publishing years

		// 6. We need all the authors names who have written a book		
		
		// We need all the origin countries of the authors

		// We want the most recent published book.
	
		// We want to know if all the books are written by more than one author
	
		// We want one of the books written by more than one author. (findAny)
		
		// We want the total number of pages published.

	
		// We want to know how many pages the longest book has.

	
		// We want the average number of pages of the books
	
		// We want all the titles of the books

	
		// We want the book with the higher number of authors?

	
		// We want a Map of book per year.

		

		// We want to count how many books are published per year.

	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
