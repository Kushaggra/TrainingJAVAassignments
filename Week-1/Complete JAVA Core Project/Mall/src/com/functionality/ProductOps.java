package com.functionality;

import com.beans.Product;

public interface ProductOps {

	public void addProduct(Product p);
	
	public void deleteProduct(int id);
	
	public void showAllproducts();
	
	public void findElementByID(int ID);

}
