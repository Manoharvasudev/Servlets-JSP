package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		
   		String name = request.getParameter("uname");
   		String pwd = request.getParameter("pass");
   		
   		if(name.equals("admin") && pwd.equals("password") )
   		{
   			HttpSession session = request.getS	ession();
   			session.setAttribute("username", name);
   			response.sendRedirect("Welcome.jsp");
   		}
   		else
   		{
   			response.sendRedirect("login.jsp");
   		}
	}

	

}
