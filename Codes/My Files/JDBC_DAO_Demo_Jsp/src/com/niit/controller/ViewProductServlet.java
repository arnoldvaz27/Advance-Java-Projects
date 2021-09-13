package com.niit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.dao.ProductDao;
import com.niit.dao.impl.ProductDaoImpl;
import com.niit.model.Product;
import com.niit.service.ProductService;
import com.niit.service.impl.ProductServiceImpl;


@WebServlet("/viewProduct")
public class ViewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ViewProductServlet() {
        super();
       
    }
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productService = new ProductServiceImpl();
		//HttpSession session = request.getSession();
		List<Product> allProducts;
		allProducts = productService.getAllProducts();
		if(allProducts!=null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("viewProduct.jsp");
			request.setAttribute("allProducts", allProducts);
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}

}
