package com.bookstore.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.dao.factory.DbConnectionFactory;
import com.bookstore.entities.Book;
import com.bookstore.exceptions.DataAccessException;
import com.mysql.jdbc.Statement;

public class BookDaoImplJdbc implements BookDao {

	private static final String INSERT_INTO_BOOKS = "insert into books(isbn, title, author, price, pubDate) values (?, ?, ?, ?, ?)";
	private Connection connection;
	
	public BookDaoImplJdbc() {
		connection = DbConnectionFactory.getConnection();
	}
	
	@Override
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		Book book = null;
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("select * from books");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				book = new Book(
						rs.getString("isbn"),
						rs.getString("title"),
						rs.getString("author"),
						rs.getDouble("price"),
						rs.getDate("pubDate"));
				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book getBookById(int id) {
		Book book = null;
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("select * from books where id=?");
			pstmt.setInt(1, id);
			pstmt.executeQuery();
			
		} catch (SQLException e) {
			throw new DataAccessException(e.toString());
		}
		
		return null;
	}

	@Override
	public Book addBook(Book book) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(INSERT_INTO_BOOKS, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(1, book.getAuthor());
			pstmt.setDouble(1, book.getPrice());
			pstmt.setDate(1, new Date(book.getPubDate().getTime()));
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			book.setId(rs.getInt(0));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public void deleteBook(int id) {
		try {
			PreparedStatement pstmt= connection.prepareStatement("delete from books where id=?");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

}
