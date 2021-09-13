package com.niit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.niit.dao.ProductDao;
import com.niit.helper.DBHelper;
import com.niit.model.Product;

public class ProductDaoImpl implements ProductDao{

	private DBHelper dbHelper;
	private Connection conn;
	private Statement stmt;
	private ResultSet rset;
	private PreparedStatement prepStmt;
	
	public ProductDaoImpl() {
		dbHelper = new DBHelper();
	}
	@Override
	public List<Product> getAllProducts() {
		List<Product> allProducts = new ArrayList<Product>();
		try
		{
			conn=dbHelper.getConnectionMySql();
			stmt=conn.createStatement();
			rset=stmt.executeQuery("select * from product");
			while(rset.next())
			{
				Product prod = new Product();
				prod.setProductId(rset.getInt("productId"));
				prod.setProductName(rset.getString("name"));
				prod.setPrice(rset.getDouble("price"));
				prod.setQuantity(rset.getInt("quantity"));
				allProducts.add(prod);
			}
			return allProducts;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addProduct(Product product) {
		try
		{
			conn=dbHelper.getConnectionMySql();
			prepStmt = conn.prepareStatement("insert into product(productId,name,price,quantity) values(?,?,?,?)");
			prepStmt.setInt(1, product.getProductId());
			prepStmt.setString(2, product.getProductName());
			prepStmt.setDouble(3, product.getPrice());
			prepStmt.setInt(4, product.getQuantity());
			prepStmt.executeUpdate();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	@Override
	public List<Product> getProductByName(String name) {
		List<Product> allProducts = new ArrayList<Product>();
			try
			{
				conn=dbHelper.getConnectionMySql();
				prepStmt = conn.prepareStatement("select * from product where name=?");
				prepStmt.setString(1,name);
				rset=prepStmt.executeQuery();
				while(rset.next())
				{
					Product prod = new Product();
					prod.setProductId(rset.getInt("productId"));
					prod.setProductName(rset.getString("name"));
					prod.setPrice(rset.getDouble("price"));
					prod.setQuantity(rset.getInt("quantity"));
					allProducts.add(prod);
				}
				return allProducts;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}

}
