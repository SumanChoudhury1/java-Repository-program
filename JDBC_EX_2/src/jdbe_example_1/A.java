package jdbe_example_1;

import java.sql.*;
//import java.sql.SQLException;

public class A {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","admin");
			System.out.println(connection);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}