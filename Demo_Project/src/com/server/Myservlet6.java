package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet6 extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	   	res.setContentType("text/html");
	    PrintWriter out=res.getWriter();
	   String name= req.getParameter("name");
	out.println("<h1>Hello "+name+" Welcome to my website.....</h1>");
	out.println("<h1><a href='web8'>Go to Servlet2...</a></h1>");
	
	//Cookie concept
	Cookie c=new Cookie("user_name",name);
	res.addCookie(c);
	}
	
}
