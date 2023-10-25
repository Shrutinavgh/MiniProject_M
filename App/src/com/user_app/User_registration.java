package com.user_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.connections.Connections;




public class User_registration {
	
	Connection con;
	Scanner sc;
	Connections obj= new Connections();
	
	
		public String userRegistration()  {
			
			try {
			 con=obj.getConsql();
			
			 sc = new Scanner(System.in);
			System.out.println("Enter First name");
			String fName= sc.next();
			System.out.println("Enter Last Name:");
			String lName= sc.next();
			System.out.println("Enter username:");
			String username= sc.next();
			System.out.println("Enter password:");
			String password= sc.next();
			System.out.println("Enter city:");
			String city= sc.next();
			System.out.println("Enter mailId:");
			String mailId= sc.next();
			System.out.println("Enter Mobile Number:");
			String mobile= sc.next();
			String query="Insert into user (firstName,lastName,username,password,city,mailId,mobileNumber)values (?,?,?,?,?,?,?)";	
		    PreparedStatement ps= con.prepareStatement(query);
			    ps.setString(1,fName);
			    ps.setString(2,lName);
			    ps.setString(3,username);
			    ps.setString(4,password);
			    ps.setString(5,city);
			    ps.setString(6,mailId);
			    ps.setString(7,mobile);
		        
			    ps.executeUpdate();
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		    finally {
		    	try {
		        con.close();
		        sc.close();
		    	}
		    	catch(SQLException e) {
		    		e.printStackTrace();
		    	}
		    }
				
			return "Registered Successfully";
		}
		
	}


