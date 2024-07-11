package com.user_app_demo.models;

import java.sql.*;

public class Database {
	
	private Connection con;
	
	public Connection establishConnection() {
		
		try {
		
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_app_demo","root","admin");
			return con;
	}catch(Exception e) {
		
		e.printStackTrace();
	}
		return con;
		
	}

}
