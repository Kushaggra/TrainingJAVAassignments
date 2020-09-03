package com.ResultSetINsensitiveReadOnly;
import com.Connector.*;
import java.sql.*;

public class Main {
		
	public static void main(String[] args) throws Exception {
		//RESULTSET DEMO
		
		Connection con = JDBClink.link();
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("select * from new_table");
		rs.next();
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
		
		//Direct Access to row FROM THE BEGINING OF THE TABLE
		rs.absolute(3);
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	
		//Access relative record from the current position of cursor 
		rs.relative(2);
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	
		//To move to previous record
		rs.previous();
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	
		//To move the cursor to a location that's not pointing to any record i.e. BEFORE THE FIRST RECORD
		rs.beforeFirst();
		System.out.println();
		System.out.println("Forward Traversal");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
//		System.out.println(rs.getInt(1)+" "+rs.getString(2));
		
		rs.afterLast();
		System.out.println();
		System.out.println("Backward Traverssal");
		while(rs.previous()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
	
	
	}

}
