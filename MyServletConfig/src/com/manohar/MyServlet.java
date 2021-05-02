package com.manohar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("hii ");
		
		//Servletconfig Code
		ServletConfig con = getServletConfig();
		String str = con.getInitParameter("name");
		out.println(str);
		
		
		//ServletContext code
//		ServletContext ctx =getServletContext();
//		String str=ctx.getInitParameter("name");
//		out.println(str);
//		
		
	}

}
