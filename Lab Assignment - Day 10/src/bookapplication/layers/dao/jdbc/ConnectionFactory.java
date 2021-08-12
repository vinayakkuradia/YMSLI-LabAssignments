package bookapplication.layers.dao.jdbc;

import java.sql.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConnectionFactory {
	public static Connection connection = null;
	
	public static Connection getConnection() {
		InputStream inputStream = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties = new Properties();
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String driver = properties.getProperty("jdbc.driver");
		String dburl = properties.getProperty("jdbc.dburl");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
		
		try {
			Class.forName(driver);
			System.out.println("Driver loaded successfully!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(dburl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection exstablished");
		return connection;
	}
}
