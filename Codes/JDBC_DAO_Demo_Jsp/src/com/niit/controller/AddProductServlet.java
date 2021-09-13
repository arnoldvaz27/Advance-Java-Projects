package com.niit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.dao.ProductDao;
import com.niit.dao.impl.ProductDaoImpl;
import com.niit.model.Product;
import com.niit.service.ProductService;
import com.niit.service.impl.ProductServiceImpl;

@WebServlet("/addproduct")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    public AddProductServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productService = new ProductServiceImpl();
		String name;
		int id,qty;
		double price;
		id = Integer.parseInt(request.getParameter("productID"));
		name = request.getParameter("productName");
		price= Double.parseDouble(request.getParameter("price"));
		qty = Integer.parseInt(request.getParameter("quantity"));
		Product prod = new Product();
		prod.setProductId(id);
		prod.setProductName(name);
		prod.setPrice(price);
		prod.setQuantity(qty);
		boolean result = productService.addProduct(prod);
		if(result)
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
				
	}

}
