package com.chainsys.jobportal.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cs.auth.Authentication;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println(userName+" "+password);
		//		Authentication authentication=new Authentication();
		boolean success;
		try {
			success = Authentication.isLogin(userName,password);
			if(success)
			{
				RequestDispatcher rs=request.getRequestDispatcher("home.jsp");
				rs.forward(request, response);
			}else
			{
				RequestDispatcher rs=request.getRequestDispatcher("Failure.html");
				rs.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
