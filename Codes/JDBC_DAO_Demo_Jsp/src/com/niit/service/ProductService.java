package com.niit.service;

import java.util.List;

import com.niit.model.Product;

public interface ProductService {

	List<Product> getAllProducts();
	boolean addProduct(Product product);
	List<Product> getProductByName(String name);
}
