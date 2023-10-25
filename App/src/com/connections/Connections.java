package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {

	 

	public Connection getConsql() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String username="root";
		String password="Shruti@123";
	Connection	con=DriverManager.getConnection(url,username,password);
	System.out.println("hi");
		return con;
		
	}

}
