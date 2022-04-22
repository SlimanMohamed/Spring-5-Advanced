package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbc="jdbc:mysql://localhost/hb-03-one-to-many";
		String user="root";
		String password="";
		
		try {
			
			Connection cnx = DriverManager.getConnection(jdbc,user,password);
			System.out.println("connection worked !!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
