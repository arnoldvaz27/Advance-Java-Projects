package com.niit.helper;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	private Connection connection;
	public Connection getConnectionMySql()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","india");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return connection;
	}

}
