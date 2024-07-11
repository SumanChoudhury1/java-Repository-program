package jdbc_exp_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A {

	public static void main(String[] args) {
		
		try {
			
			//reed the data
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","admin");
			
			Statement stmnt = con.createStatement();
			ResultSet results = stmnt.executeQuery("select * from tab");
			while(results.next()) {
				System.out.println(results.getString(1));
				System.out.println(results.getString(2));
				System.out.println(results.getString(3));
			}
			con.close();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
