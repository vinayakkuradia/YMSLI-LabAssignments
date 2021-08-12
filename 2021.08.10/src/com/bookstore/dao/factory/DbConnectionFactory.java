package com.bookstore.dao.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DbConnectionFactory {
	private static Connection connection=null;
	
	private DbConnectionFactory() {
		
	}
	
	public static Connection getConnection() {
		InputStream is = DbConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
		
		Properties properties = new Properties();
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String driver=properties.getProperty("jdbc.driver");
		String dburl=properties.getProperty("jdbc.dburl");
		String username=properties.getProperty("jdbc.username");
		String password=properties.getProperty("jdbc.password");
		
		try {
			Class.forName(driver);
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			connection=DriverManager.getConnection(dburl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection estabished!");
		return connection;
	}
}
