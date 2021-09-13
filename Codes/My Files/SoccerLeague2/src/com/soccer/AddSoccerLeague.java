package com.soccer;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/soccerlist")
public class AddSoccerLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddSoccerLeague() {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	List<Leagues> addingLeagues = new ArrayList<>();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String leagueName;
		int leagueYear;
		
		try
		{
			leagueName = request.getParameter("leagueName");
			leagueYear = Integer.parseInt(request.getParameter("leagueYear"));
		
			Leagues league = new Leagues();
			league.setLeagueName(leagueName);
			league.setLeagueYear(leagueYear);
			
			addingLeagues.add(league);
			
			HttpSession session = request.getSession();
			session.setAttribute("addingLeagues", addingLeagues);
			
			RequestDispatcher rd = request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("error.html");
			rd.forward(request, response);
			
		}

	}

}
