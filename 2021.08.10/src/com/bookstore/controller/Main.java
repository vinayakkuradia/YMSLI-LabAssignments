package com.bookstore.controller;

import java.sql.Connection;
import java.util.Date;

import com.bookstore.dao.BookDao;
import com.bookstore.dao.BookDaoImplJdbc;
import com.bookstore.dao.factory.DbConnectionFactory;
import com.bookstore.entities.Book;

public class Main {
	public static void main(String[] args) {
		//Connection connection = DbConnectionFactory.getConnection();
		BookDao dao = new BookDaoImplJdbc();
		for(Book book: dao.getAllBooks()) {
			System.out.println(book);
		}
		dao.addBook(new Book("ISBN2", "Java 8 in Action", "Anonymous", 4200.0, new Date()));
		for(Book book: dao.getAllBooks()) {
			System.out.println(book);
		}
		
	}
}
