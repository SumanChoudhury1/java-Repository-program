package jdbc_exp_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A {

	public static void main(String[] args) {
		try {
			//update the data
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","admin");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("update tab set email='alok@gmail' where phone='8547961233'");
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
