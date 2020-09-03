package com.ResultSetsensitiveUpdatable;
import com.Connector.*;
import java.sql.*;

public class Main {

	public static void main(String[] args) {
		Connection con = null;
		
		try {
			con= JDBClink.link();
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery("select * from new_table");

//			IF we need to Update the "tCost" of fifth record
			
			//First -> Go to fifth record
			rs.absolute(5);
			rs.updateInt(3, 200);
			rs.updateRow();
			
			System.out.println(rs.getInt(3));
			
			//Adding a row
			rs.moveToInsertRow();
			rs.updateInt(1, 45);
			rs.updateString(2, "Papertowns");
			rs.updateInt(3,300);
			rs.insertRow();
			rs.moveToCurrentRow();
			
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
