package com.niit.controller;

import java.io.IOException;
import java.util.List;

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

@WebServlet("/searchByName")
public class SearchByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SearchByNameServlet() {
        super(); 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productService = new ProductServiceImpl();
		String name = request.getParameter("pName");
		List<Product> allProducts=productService.getProductByName(name);
		if(!(allProducts.isEmpty()) && allProducts!=null)
		{
			RequestDispatcher rd= request.getRequestDispatcher("searchByName.jsp");
			request.setAttribute("allProducts", allProducts);
			rd.include(request, response);
		}
		else
		{
			System.out.println("No Product with the Name : "+name+" found in database");
			RequestDispatcher rd= request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}

}
