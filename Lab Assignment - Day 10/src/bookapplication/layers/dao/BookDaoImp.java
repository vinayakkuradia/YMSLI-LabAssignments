package bookapplication.layers.dao;

import java.sql.*;
import java.util.*;

import bookapplication.exceptions.BookNotFoundException;
import bookapplication.exceptions.DaoException;
import bookapplication.layers.business.Book;
import bookapplication.layers.dao.jdbc.ConnectionFactory;

public class BookDaoImp implements BookDao {

	private static final String UPDATE_BOOKS = "update books set isbn=?, title=?, author=?, price=?";
	private static final String WHERE_ID = " where id=?";
	private static final String DELETE_FROM_BOOKS = "delete from books";
	private static final String INSERT_INTO_BOOKS = "insert into books(isbn, title, author, price) values(?,?,?,?)";
	private static final String SELECT_FROM_BOOKS = "select * from books";
	
	public BookDaoImp() {}
	public Connection connection = ConnectionFactory.getConnection();
	
	@Override
	public List<Book> getAllBooks() throws DaoException {
		List<Book> books = new ArrayList<>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(SELECT_FROM_BOOKS);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				books.add(new Book(resultSet.getInt("id"), resultSet.getString("isbn"), resultSet.getString("title"), resultSet.getString("author"), resultSet.getDouble("price")));
			}
		} catch (SQLException e) {
			throw new DaoException(e.toString());
		}
		return books;
	}

	@Override
	public Book addBook(Book book) throws DaoException {
		System.out.println("Performing addition operation...");
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(INSERT_INTO_BOOKS, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, book.getIsbn());
			preparedStatement.setString(2, book.getTitle());
			preparedStatement.setString(3, book.getAuthor());
			preparedStatement.setDouble(4, book.getPrice());
			int id = Statement.RETURN_GENERATED_KEYS;
			int noOfRowsAffected = preparedStatement.executeUpdate();
			book.setId(id);
			System.out.println(noOfRowsAffected+" no. of rows affected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public void deleteBook(int id) throws DaoException {
		System.out.println("Performing deletion operation...");
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(DELETE_FROM_BOOKS+WHERE_ID);
			preparedStatement.setInt(1, id);
			int noOfRowsAffected = preparedStatement.executeUpdate();
			System.out.println(noOfRowsAffected+" no. of rows affected");
		} catch (SQLException e) {
			throw new DaoException(e.toString());
		}
		
	}

	@Override
	public void updateBook(int id, Book book) throws DaoException {
		System.out.println("Performing update operation...");
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(UPDATE_BOOKS+WHERE_ID);
			preparedStatement.setString(1, book.getIsbn());
			preparedStatement.setString(2, book.getTitle());
			preparedStatement.setString(3, book.getAuthor());
			preparedStatement.setDouble(4, book.getPrice());
			preparedStatement.setInt(5, id);
			int noOfRowsAffected = preparedStatement.executeUpdate();
			System.out.println(noOfRowsAffected+" no. of rows affected");
		} catch (SQLException e) {
			throw new DaoException(e.toString());
		}
	}

	@Override
	public Book getBookById(int id) throws DaoException {
		PreparedStatement preparedStatement;
		Book requestedBook=null;
		try {
			preparedStatement = connection.prepareStatement(SELECT_FROM_BOOKS+WHERE_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				requestedBook = new Book(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getDouble(5)); 
			}
			else
				throw new BookNotFoundException("Book not found");
			
		} catch (SQLException e) {
			throw new DaoException(e.toString());
		}
		return requestedBook;
	}

}
