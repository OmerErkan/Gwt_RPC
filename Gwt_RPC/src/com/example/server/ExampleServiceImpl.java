package com.example.server;

import java.sql.*;

import com.connection.MySqlConnection;
import com.example.client.gui.Person;
import com.example.client.server.ExampleService;
import com.example.client.server.ExampleServiceClientInt;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ExampleServiceImpl  extends RemoteServiceServlet implements ExampleService{

	//private Connection con=null;
		private String status;
	    private String url="jdbc:mysql://localhost:3306/test";
		private String user="test";
		private String pass = "123456";
		private  Person people;
	    private ResultSet resultSet=null;
	    private Statement stm=null;
		private Connection con=null;
		
		private Statement stm2=null;
		private Connection conn2=null;
		 private ResultSet resultSet2=null;
		private MySqlConnection conn=new MySqlConnection();


	@Override
	public Person getPerson(String name,String surname,int password) {
		Person personinfo=new Person();
		personinfo.setName(name);
		personinfo.setSurname(surname);
		personinfo.setPassword(password);

		ResultSet resultSet=null;
		Statement stm=null;
		Connection con=null;
		 MySqlConnection conn=new MySqlConnection();	 
		  con = conn.getConnection();
		 try {
			stm = ((Connection) con).createStatement();
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		 String sorgu = "SELECT * FROM person";
	      try {
			resultSet = stm.executeQuery(sorgu);
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	   while(true){
	     String sql = "INSERT INTO person " +
	               "VALUES ("+ password +", '" + name+ "','" + surname + "')";
	             
	     try {
			stm.executeUpdate(sql);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	     
	 	 try {
			((Connection) con).setAutoCommit(false);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 	
	     try {
			((Connection) con).commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     try {
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		return personinfo;
	   }
	}
	@Override
	public String sayHello(String name) {
		
		String greeting="" + name;
	ResultSet resultSet=null;
	Statement stm=null;
	Connection con=null;
	 MySqlConnection conn=new MySqlConnection();	 
	  con = conn.getConnection();
	 try {
		stm = ((Connection) con).createStatement();
	} catch (SQLException e3) {
		// TODO Auto-generated catch block
		e3.printStackTrace();
	}
	 String sorgu = "SELECT * FROM mysqlconn";
      try {
		resultSet = stm.executeQuery(sorgu);
	} catch (SQLException e3) {
		// TODO Auto-generated catch block
		e3.printStackTrace();
	}
     String sql = "INSERT INTO mysqlconn " +
               "VALUES (20, 'Anuskha')";
         sql = "INSERT INTO mysqlconn " +
             "VALUES (23, 'Pretiy Zinta')";
         sql = "INSERT INTO mysqlconn " +
                 "VALUES (25, 'Depika')";
         sql = "INSERT INTO mysqlconn " +
                 "VALUES (23, 'Priyanka')";
         
         
         try {
			stm.executeUpdate(sql);
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
         try {
			stm.executeUpdate(sql);
		} catch (SQLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
         try {
 			stm.executeUpdate(sql);
 		} catch (SQLException e3) {
 			// TODO Auto-generated catch block
 			e3.printStackTrace();
 		}
     try {
		stm.executeUpdate(sql);
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
 	 try {
		((Connection) con).setAutoCommit(false);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
     try {
		((Connection) con).commit();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     try {
		stm.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   

		return greeting;
	}


}
