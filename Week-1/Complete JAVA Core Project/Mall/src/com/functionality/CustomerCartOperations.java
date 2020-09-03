package com.functionality;
import java.util.*;
import java.sql.Connection;

import com.beans.Cart;

public interface CustomerCartOperations {

	public void addProductToCart(Connection con, Cart p);
	
	public void removeProductFromCart(Connection con, int id);
	
	public ArrayList<Cart> viewCart(Connection con);
	
	public int totalBill(Connection con);
	
}
