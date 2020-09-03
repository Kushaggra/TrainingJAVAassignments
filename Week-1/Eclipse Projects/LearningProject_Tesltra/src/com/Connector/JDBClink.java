package com.Connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBClink {

	public static Connection link() throws Exception{
	
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			java.sql.Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
			System.out.println("Connected database successfully...");
	        return con;
		
	}
}
