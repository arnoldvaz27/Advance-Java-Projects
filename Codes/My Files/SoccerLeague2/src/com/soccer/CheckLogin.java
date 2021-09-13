package com.soccer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/soccerplayer")
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
    public CheckLogin() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		String loginType = request.getParameter("logintype");
		HttpSession session = request.getSession();
		session.setAttribute("name", username);
		session.setMaxInactiveInterval(20);
		
		
		if(username.equals("player") && password.equals("123456") && loginType.equals("player"))
		{
			response.setContentType("text/html");
			out.println("<h1>Duke's Soccer League:Player Page</h1>");
			out.println("<a href='ViewSoccerList'> View League</a>");
			
		}
		else if(username.equals("admin") && password.equals("123456") && loginType.equals("admin") )
		{
			response.setContentType("text/html");
//			response.sendRedirect("addingLeagues.html");	
			out.println("<h1>Duke's Soccer League:Admin Page</h1>");
			out.println("<a href='addingLeagues.html'> Click Here Add New Leagues</a><br><br>");
			out.println("<a href='ViewSoccerList'> View League</a>");
			
		}
		else
		{
			out.println("You Are Not An Authorized User");
		}
	}

}
