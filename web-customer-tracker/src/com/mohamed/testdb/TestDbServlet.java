package com.mohamed.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// set Connection variabe 
		String jdbcUrl="jdbc:mysql://localhost/web_customer_tracker";
		String user = "root";
		String password="";
		String driver="com.mysql.cj.jdbc.Driver";
		
		// get  Connection to database
		try {
			PrintWriter out = response.getWriter();
			out.println("Connection to dataBase"+jdbcUrl);
			Class.forName(driver);
			Connection cnx = DriverManager.getConnection(jdbcUrl,user,password);
			out.println("Succes!!!!!");
			cnx.close();
			
		} 
		catch (Exception ex) {
			ex.getStackTrace();
			throw new ServletException(ex);
		}
	}

}
