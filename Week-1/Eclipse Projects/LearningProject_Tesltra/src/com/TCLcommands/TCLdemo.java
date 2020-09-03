package com.TCLcommands;
import java.sql.*;

import com.Connector.JDBClink;

public class TCLdemo {

	public static void main(String[] args) {
//		all the TCL commands are taken care by Connection object
		Connection con=null;
		
		
		try {
			con = JDBClink.link();
			
//			By Default all commands are AUTO-COMMIT, to we need to 
//			turn that off in order to check for working of
//			ROLLBACK statement
			con.setAutoCommit(false);
			Savepoint svpt1 = con.setSavepoint("Save Point-1");
			
			String querry1 = "insert into new_table values (100,'test_rollback',50);";
			String querry2 = "Select count(*) from new_table;";
			String querry3 = "Select * from new_table;";
			
			ResultSet rs = null;
			Statement st = null;
			st=con.createStatement();
			
			
			st.execute(querry1);
			
			
			//--------------------------with Select * --------------------------
			rs = st.executeQuery(querry3);
			int count =0;
			
			while(rs.next()) {
				++count;
			}
			
			//--------------------------with Select COUNT(*) ----------------------
			
			System.out.println("COUNT-");
			rs = st.executeQuery(querry2);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			
			
			System.out.println("Rows Before Rollback = "+count);
			count = 0;
			
			//--------------------------ROLLBACK------------------------------------
			con.rollback(svpt1);
			
			//--------------------------with Select * ------------------------------
			rs = st.executeQuery(querry3);
			while(rs.next()) {
				++count;
			}
			
			//--------------------------with Select COUNT(*) ------------------------------			
			System.out.println("COUNT-");
			rs = st.executeQuery(querry2);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			
			
			System.out.println("Rows After Rollback = "+count);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
