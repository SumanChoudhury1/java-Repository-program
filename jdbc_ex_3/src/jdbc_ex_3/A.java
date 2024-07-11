package jdbc_ex_3;

import java.sql.*;

public class A {

	public static void main(String[] args) {
		try {
			
			//insert the data
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","admin");
		   Statement stmnt = con.createStatement();
		   stmnt.executeUpdate("insert into  tab values('sumn','alok@gmail.com','987456213','bangalore')");
			con.close();
			
			
		}catch(Exception e){
			System.out.println(e);
			
		}

	}

}
