package jdbc;
import java.sql.*;

public class HelloWorld {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/RDBMS_Lab_Exercises","root", "root");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from Sailors");
		
			while(resultSet.next()) {
				System.out.println(resultSet.getString("Sname"));
			};
		} catch (SQLException e) {
			e.printStackTrace();
		}
	

	}

}
