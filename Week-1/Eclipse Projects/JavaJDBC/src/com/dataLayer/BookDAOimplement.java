package com.dataLayer;

import java.sql.*;
import java.util.ArrayList;

import com.JDBCdemo.JDBClink;
import com.bean.model;

public class BookDAOimplement implements BookDAOInterface {

	Connection con;
	
	public BookDAOimplement() {
		super();
		try {
			con = JDBClink.link();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void addBook(model b) {
		try {
//			Connection con = JDBClink.link();
			String sql = "insert into new_table values(?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, b.getTid());
			st.setString(2,b.getTname());
			st.setInt(3, b.getTprice());
		
			int rowsUpdated = st.executeUpdate();	//returns the number of rows updated, this func is used for DML commands - insert,update,delete
		
			if(rowsUpdated!=1) {
				System.out.println("Insertion of values failed");
			}else {
				System.out.println("Row Inserted successfully");
			}
			}//try block
			
			catch(Exception e) {
				e.printStackTrace();
			}
			
	}
	
	
	@Override
	public ArrayList<model> getAllBooks() {
		
		ArrayList<model> blist = new ArrayList<model>();
		try {
//			Connection con = JDBClink.link();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from new_table");
			while(rs.next()) {
			model m = new model(rs.getInt(1),rs.getString(2),rs.getInt(3));
			blist.add(m);
				}
			}//try block
		
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return blist;
	}


	@Override
	public boolean UpdatePrice(int bid, int bprice) {
		int rowsUpdated=0;
		String query = "UPDATE new_table SET tPrice =? WHERE tID=?;";
		try {
		PreparedStatement p = con.prepareStatement(query);
		p.setInt(1, bprice);
		p.setInt(2,bid);
		
		rowsUpdated = p.executeUpdate();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			if(rowsUpdated==1)
		
			return true;
		else
			return false;
	}


	@Override
	public model findBookByName(String bName) {
		int flag=1;
		//Alternate Approach
		model m;
		
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("Select * from new_table where tName= '"+bName+"'");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//		}
//		
		
		String query = "Select * from new_table where tBook =?";
		try {
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, bName);
		ResultSet rs = p.executeQuery();
		if(rs!=null)
		while(rs.next()) {
			return(new model(rs.getInt(1),rs.getString(2),rs.getInt(3)));
		}
		else
			flag=0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	return null;
	}
	
	

	
	
}
