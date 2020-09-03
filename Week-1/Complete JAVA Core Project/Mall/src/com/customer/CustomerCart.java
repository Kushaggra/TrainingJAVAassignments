package com.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import com.beans.*;
import com.functionality.CustomerCartOperations;

public class CustomerCart implements CustomerCartOperations {

	Set<Cart> slist = new TreeSet<Cart>();
	
	@Override
	public void addProductToCart(Connection con,Cart c) {
		String sql = "Select * from cart where cID = '"+c.getcID()+"';";
		Statement st;
		ResultSet rs;
		PreparedStatement pst;
		int rows=0;
		try {
		st = con.createStatement();
		rs = st.executeQuery(sql);
		
		if(rs!=null) {
			String querry = "insert into cart values(?,?,?,?,?);";
			pst = con.prepareStatement(querry);
			pst.setInt(1, c.getcID());
			pst.setString(2,c.getcName());
			pst.setInt(3, c.getcRate());
			pst.setInt(4, c.getcQuant());
			pst.setInt(5, c.getcPrice());
			
			rows = pst.executeUpdate();
			
					if(rows==1) 
						System.out.println("Record Added !");
					else 
						System.out.println("Something went wrong, please try again!");
					
		   }else 
			   System.out.println("Item with this ID already exists........");
		   
		}catch(Exception e) {
			e.getMessage();
		}
	}

	
	@Override
	public void removeProductFromCart(Connection con,int id) {
		String sql = "Select * from cart where cID = '"+id+"';";
		Statement st;
		ResultSet rs;
		int rows=0;
		
		try {
		st = con.createStatement();
		rs = st.executeQuery(sql);
		
		if(rs!=null) {
				
			sql = "DELETE from cart WHERE cID = '"+id+"';";
			rows=st.executeUpdate(sql);
			
			if(rows!=0) {
				System.out.println("Product with ID :"+id+" is deleted.");
			}else {
				System.out.println("Something went wrong, please try again!");
			}
			
	}else {
		System.out.println("No entry with ID :"+id+" exists");
	}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

	@Override
	public ArrayList<Cart> viewCart(Connection con) {
		
		ArrayList<Cart> list = new ArrayList<Cart>();
		String sql = "Select * from cart;";
		Statement st;
		ResultSet rs;
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			if(rs!=null) {
				while(rs.next()) {
					int t_id = rs.getInt(1);
					String t_name = rs.getString(2);
					int t_rate = rs.getInt(3);
					int t_quant = rs.getInt(4);
					int t_price = rs.getInt(5);
					list.add(new Cart(t_id,t_name,t_rate,t_quant,t_price));
				}
			}else {
				System.out.println("Empty List");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int totalBill(Connection con) {
		String sql = "Select * from cart;";
		Statement st;
		ResultSet rs;
		int bill=0,flag=0;
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			if(rs!=null) {
				flag=1;
				while(rs.next()) {
					bill+=rs.getInt(5);
				}
				
			}
			sql = "DELETE from cart";
			int rsi=st.executeUpdate(sql);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(flag==0)
			return 0;
		
		return bill;
		
	}
	
	

}
