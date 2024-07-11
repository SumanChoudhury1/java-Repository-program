package jdbc_advanch_java_1;

import java.sql.*;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
	
		try {
			//insert data in jdbc
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter your name : ");
			String Name=s.next();
			
			System.out.println("Enter Your email : ");
			String email=s.next();
			
			System.out.println("Enter Your phone : ");
			String phone=s.next();
			
			System.out.println("Enter Your city : ");
			String city=s.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","admin");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into tab values('"+Name+"','"+email+"','"+phone+"','"+city+"')");
			
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
