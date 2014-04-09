package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class MySqlConnection extends RemoteServiceServlet {
	private static final long serialVersionUID = 1L;
	
	public static Connection con;
	  
	public static Connection getConnection()
	  {
	    try
	    {            
	      if(con==null)
	      {
	        Class.forName("com.mysql.jdbc.Driver");  
	        String url = "jdbc:mysql://localhost:3306/mysqlconn?user=root&password=123456";
	        con= DriverManager.getConnection(url);
	      }
	    }
	    catch (Exception ex)
	    {
	        ex.printStackTrace();
	    }        
	    return con;
	  }

	  public static void CloseConnection()
	  {
	    try
	    {
	       con.close();
	       con = null;
	    }
	    catch (SQLException e)
	    {
	       e.printStackTrace();
	    } 
	  }
	}

