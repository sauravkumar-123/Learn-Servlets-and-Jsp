package com.server;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet2 extends HttpServlet
{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	     int a=Integer.parseInt(req.getParameter("num1"));
	     int b=Integer.parseInt(req.getParameter("num2"));
	     int c=a*b;
	     
	    PrintWriter out= res.getWriter();
	    out.println("output is "+c+" "+"SUCCESS!!!");
	}
	
	/*public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
	}
	*/
	
	/*protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
	}
	*/
	
}