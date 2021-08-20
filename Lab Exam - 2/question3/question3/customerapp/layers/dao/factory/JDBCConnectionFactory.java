package question3.customerapp.layers.dao.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import question3.customerapp.exceptions.DataAccessException;

public class JDBCConnectionFactory {
	private static Connection connection;
	
	
	public static Connection getConnection() {
		Properties databaseProperties = new Properties();
		try {
			InputStream propertyFileStream = JDBCConnectionFactory.class.getResourceAsStream("db.properties");
			databaseProperties.load(propertyFileStream);
		}
		catch(FileNotFoundException e) {
			throw new DataAccessException(e.getMessage());
		} catch (IOException e) {
			throw new DataAccessException(e.getMessage());
		}
		
		String driver = databaseProperties.getProperty("jdbc.driver");
		String dbUrl = databaseProperties.getProperty("jdbc.dbUrl");
		String username = databaseProperties.getProperty("jdbc.username");
		String password = databaseProperties.getProperty("jdbc.password");
		
		try {
			Class.forName(driver);
			System.out.println("Mysql-Jdbc driver loaded sucessfully");
		} catch (ClassNotFoundException e) {
			throw new DataAccessException(e.getMessage());
		}
		
		try {
			connection = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("Connection to database established");
		} catch (SQLException e) {
			throw new DataAccessException(e.getMessage());
		}
		
		return connection;
	}
}
