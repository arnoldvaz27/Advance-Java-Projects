package com.soccer;

import java.io.Serializable;

public class Leagues implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int LeagueYear;
	private String LeagueName;
	
	public Leagues() {
		
	}
	
	public int getLeagueYear() {
		return LeagueYear;
	}
	
	public void setLeagueYear(int leagueYear) {
		LeagueYear = leagueYear;
	}
	
	public String getLeagueName() {
		return LeagueName;
	}
	


	public void setLeagueName(String leagueName) {
		LeagueName = leagueName;
	}
	
	
}
