package com.dataLayer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataManager {
	private Connection con;
	private void link() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
		System.out.println("Connected database successfully...");
}
	public Connection getCon() {
		return con;
	}
	
	
}
