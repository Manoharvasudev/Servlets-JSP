package com.manu;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	 //     int k=(int) req.getAttribute("k");
	//	int k = Integer.parseInt(req.getParameter("k")); // session calling
		
		// HttpSession
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");	
		
		// Fetch Cookie code:
		
		int k=0;
		Cookie cookies[]=req.getCookies();   //taking cookie in array of elements
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		  
		
	    k = k*k;
		res.getWriter().println("Square Of two numbers  "+k);
		
		System.out.println("Square of a number "+k);
		
	}
	

}
