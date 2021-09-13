package com.sessionData;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/store")
public class SaveData extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       

    public SaveData() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("name");
		HttpSession session = request.getSession();
		session.setAttribute("name", username);
		session.setMaxInactiveInterval(10);
		RequestDispatcher rd = request.getRequestDispatcher("view.html");
		rd.include(request,response);
	}

}
