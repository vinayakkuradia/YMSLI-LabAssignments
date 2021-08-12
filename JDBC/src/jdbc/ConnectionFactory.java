package jdbc;

import java.sql.*;
import java.io.*;
import java.util.Properties;

public class ConnectionFactory {
	
	private static Connection connection=null;
	
	public static Connection getConnection() {		
		InputStream inputStream =  ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties = new Properties();
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String driver = properties.getProperty("jdbc.driver");
		String dburl = properties.getProperty("jdbc.dburl1");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
	
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(dburl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
