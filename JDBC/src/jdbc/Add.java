package jdbc;

import java.sql.*;

public class Add {

	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into friends(name) values(?) ");
			pstmt.setString(1, "Kishan Singh");
			int noOfRowsAffected = pstmt.executeUpdate();
			System.out.println(noOfRowsAffected + " number of rows affected");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
