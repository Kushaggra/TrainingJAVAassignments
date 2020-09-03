package com.customer;
import java.sql.*;
import java.util.*;

import com.beans.Product;
import com.functionality.ProductOps;

public class ProductCollection implements ProductOps{

	public Set<Product> tp = new TreeSet<Product>();

	@Override
	public void addProduct(Connection con,Product p) {
		String sql = "Select * from products where pID = '"+p.getpID()+"';";
		Statement st;
		ResultSet rs;
		PreparedStatement pst;
		int rows=0;
		try {
		st = con.createStatement();
		rs = st.executeQuery(sql);
		
		if(rs!=null) {
			String querry = "Insert into products values(?,?,?);";
			pst = con.prepareStatement(querry);
			pst.setInt(1, p.getpID());
			pst.setString(2,p.getpName());
			pst.setInt(3, p.getpCost());
			
			rows = pst.executeUpdate();
			
			if(rows==1) {
				System.out.println("Record Added !");
			}else {
				System.out.println("Something went wrong, please try again!");
			}
		   } 
		}catch(Exception e) {
			e.getMessage();
		}
		
	}

	
	@Override
	public void deleteProduct(Connection con, int id) {
		
		String sql = "Select * from products where pID = '"+id+"';";
		Statement st;
		ResultSet rs;
		int rows=0;
		
		try {
		st = con.createStatement();
		rs = st.executeQuery(sql);
		
		if(rs!=null) {
				
			sql = "DELETE from products WHERE pID = '"+id+"';";
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
	public ArrayList<Product> showAllproducts(Connection con) {
		ArrayList<Product> list = new ArrayList<Product>();
		String sql = "Select * from products";
		Statement st;
		ResultSet rs;
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			if(rs!=null) {
				while(rs.next()) {
					int t_id = rs.getInt(1);
					String t_name = rs.getString(2);
					int t_price = rs.getInt(3);
					list.add(new Product(t_id,t_name,t_price));
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
	public Product findElementByID(Connection con, int ID) {
		Product temp=null;
		String sql = "Select * from products where pID = '"+ID+"';";
		Statement st;
		ResultSet rs;
		
		try {
		st = con.createStatement();
		rs = st.executeQuery(sql);
		
		if(rs!=null) {
			while(rs.next()) {
				int t_id = rs.getInt(1);
				String t_name = rs.getString(2);
				int t_price = rs.getInt(3);
				temp = new Product(t_id,t_name,t_price);
			}
		}else {
			System.out.println("No entry with ID :"+ID+" exists");
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return temp;
}


}
