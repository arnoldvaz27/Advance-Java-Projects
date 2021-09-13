package com.soccer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ViewSoccerList")
public class ViewSoccerleague extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewSoccerleague() {
        super();
    }

	List<Leagues> addingLeagues;
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		addingLeagues = (List<Leagues>) session.getAttribute("addingLeagues");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>LIST OF SOCCER LEAGUE</h2>");
		out.println("<ul>");
		out.println("<li>Soccer League&nbsp;2002</li>");
		if(addingLeagues.isEmpty())
		{

			out.println("</ul>");
			out.println("</body>");
			out.println("</html>");
		}
		else
		{
			for(Leagues l : addingLeagues)
			{
				out.println("<li>"+l.getLeagueName()+"&nbsp;"+l.getLeagueYear()+"</li>");
			}
			
		}
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
