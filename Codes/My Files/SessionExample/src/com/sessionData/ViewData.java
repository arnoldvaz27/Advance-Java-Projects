package com.sessionData;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/view")
public class ViewData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ViewData() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		int time = session.getMaxInactiveInterval();
		if(time == 0)
		{
			session.invalidate();
		}
		String name= (String)session.getAttribute("name");
		if(name!=null)
		{
			out.println("<h2>Value Rerteived is "+name+"</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("view.html");
			rd.include(request,response);
		}
		else
		{
			out.println("<h2>Session Expired Please Login Again !!!");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
