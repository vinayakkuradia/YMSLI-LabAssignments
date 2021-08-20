package com.day1.session2.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
			//V1-------------------------------	
				//List<Book> resultBookSet = allBooks.stream().filter(b->b.getPages()>400).collect(Collectors.toList());
				//System.out.println(resultBookSet);
		
		//Already Available--------------------	
			//List<Book>booksMoreThen400Pages=allBooks.stream().filter(b-> b.getPages()>400).collect(Collectors.toList());
		
		// 2. Find all books that are java books and more then 400 pages
			//allBooks.stream().filter(b->b.getPages()>400).filter(b->b.getSubject()==Subject.JAVA).forEach(System.out::println);;
		
		
		// 3. We need the top three longest books
			//V1-------------------------------	
				//allBooks.stream().sorted(Comparator.comparing(Book::getPages).reversed()).limit(3).forEach(System.out::println);
			
			//V2-------------------------------
				//allBooks.stream().sorted((o1, o2)-> Integer.compare(o1.getPages(), o2.getPages())).limit(3).forEach(System.out::println);
				
			
		// 4. We need the fourth longest book from to the last
			//allBooks.stream().sorted(Comparator.comparing(Book::getPages)).skip(3).limit(1).forEach(System.out::println);

		// 5. We need to get all the publishing years
			//allBooks.stream().map(Book::getYear).distinct().forEach(System.out::println);
		
		// 6. We need all the authors names who have written a book		
			//allBooks.stream().flatMap(b->b.getAuthors().stream()).distinct().forEach(System.out::println);
		
		// We need all the origin countries of the authors
			//allBooks.stream().flatMap(b->b.getAuthors().stream()).map(a->a.getCountry()).distinct().forEach(System.out::println);;
		
		// We want the most recent published book.
			//allBooks.stream().sorted(Comparator.comparing(Book::getYear).reversed()).limit(1).forEach(System.out::println);
		
		// We want to know if all the books are written by more than one author
			//System.out.println(allBooks.stream().allMatch(b->(b.getAuthors().size()>1)));
		
		// We want one of the books written by more than one author. (findAny)
			//System.out.println(allBooks.stream().filter(b->(b.getAuthors().size()>1)).findAny().orElse(null));
			
		// We want the total number of pages published.
			//System.out.println(allBooks.stream().mapToInt(Book::getPages).sum());
	
		// We want to know how many pages the longest book has.
			//System.out.println(allBooks.stream().mapToInt(Book::getPages).max().orElse(0));
	
		// We want the average number of pages of the books
			//System.out.println(allBooks.stream().mapToInt(Book::getPages).average().orElse(0));
		
		// We want all the titles of the books
			//allBooks.stream().map(Book::getTitle).forEach(System.out::println);
	
		// We want the book with the higher number of authors?
			//allBooks.stream().sorted((b1, b2)->Integer.compare(b2.getAuthors().size(), b1.getAuthors().size())).limit(1).forEach(System.out::println);;
	
		// We want a Map of book per year.
			//System.out.println(allBooks.stream().collect(Collectors.toMap(Book::getYear, Function.identity(), (existing, replacement) -> (existing))));

		// We want to count how many books are published per year.
		System.out.println(allBooks.stream().collect(Collectors.toMap(Book::getYear, b->Integer.valueOf(1), (existing, replacement) -> (existing+1))));
		
	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));
		List<Author> authors4 = Arrays.asList(new Author("Alan", "Mycroft", "us"),
				new Author("Mario", "Fusco", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));
		books.add(new Book("Java 8 in Action", authors4, 500, Subject.JAVA, 2014, "1295"));
		books.add(new Book("Java 8 in Action 2nd Edition", authors4, 550, Subject.JAVA, 2015, "1295"));

		return books;
	}

}
