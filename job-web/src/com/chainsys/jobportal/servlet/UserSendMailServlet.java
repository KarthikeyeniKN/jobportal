package com.chainsys.jobportal.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.UserSendMail;

/**
 * Servlet implementation class UserSendMail
 */
@WebServlet("/UserSendMailServlet")
public class UserSendMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSendMailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subject= "Job applied conformation mail";
		String content="<html><head></head><body>Click the link for email verification:<a href='http://localhost:8082/Bug/team.jsp'>Link</a></body></html>";
			
		UserSendMail.sendHtmlMail(subject, content);
		RequestDispatcher rd = request.getRequestDispatcher("JobServlet");
		rd.forward(request, response);
		
	}

	

}
