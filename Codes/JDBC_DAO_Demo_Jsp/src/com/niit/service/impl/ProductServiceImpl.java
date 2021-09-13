package com.niit.service.impl;

import java.util.List;

import com.niit.dao.ProductDao;
import com.niit.dao.impl.ProductDaoImpl;
import com.niit.model.Product;
import com.niit.service.ProductService;

public class ProductServiceImpl implements ProductService{

	ProductDao productDao;
	
	public ProductServiceImpl() {
		productDao = new ProductDaoImpl();
	}
	@Override
	public List<Product> getAllProducts() {
		List<Product> allProducts = productDao.getAllProducts();
		if(allProducts!=null)
		{
			return allProducts;
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public boolean addProduct(Product product) {
		boolean result = productDao.addProduct(product);
		if(result)
		{
			return result;
		}
		else
		{
			System.out.println("Error in inserting Product");
			return false;
		}
	}

	@Override
	public List<Product> getProductByName(String name) {
		List<Product> allProducts = productDao.getProductByName(name);
		if(allProducts!=null)
		{
			return allProducts;
		}
		else
		{
			return null;
		}
	}

}
