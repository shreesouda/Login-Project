package com.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/log")
public class Login extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		LoginDao ld = new LoginDao();
	
		//try {
		//if (request.getParameter("uname").equals("shreenidhi") && request.getParameter("pwd").equals("shree123")) {
		
		try {
			if (ld.isValid(uname, pwd)) {
				HttpSession session = request.getSession();
				session.setAttribute("label", request.getParameter("uname"));
				response.sendRedirect("Welcome.jsp");
			}
			else
				response.sendRedirect("Login.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
