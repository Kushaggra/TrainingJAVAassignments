package com.metaDataDemo;
import java.sql.*;

import com.Connector.JDBClink;
public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		Connection con = null;
		
		try {
			con= JDBClink.link();
			String sql = "Select * from new_table";
			PreparedStatement pst = con.prepareStatement(sql);
		
			ResultSet rs= pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Totla cols = "+rsmd.getColumnCount());
			System.out.println("Table Name = "+rsmd.getTableName(1));
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
