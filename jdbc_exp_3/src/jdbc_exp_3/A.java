package jdbc_exp_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		
		try {
			//delete the data
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Your name to Delete record : ");
			String name=s.next();
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","admin");
		   Statement stmnt = con.createStatement();
		    stmnt.executeUpdate("DELETE FROM tab WHERE name='"+name+"'");
		    con.close();
		    
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
