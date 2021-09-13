package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {

	List<Product> getAllProducts();
	boolean addProduct(Product product);
	List<Product> getProductByName(String name);
}
