package com.server;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Myservlet1 implements Servlet
{
	 //Lifecycle method
	ServletConfig conf;
	public void init(ServletConfig conf)
	{
		this.conf=conf;
		System.out.println("ServletConfig object created");
	}

	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		 //System.out.println("Service success");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>output on browser</h1>");
		out.println("<h2>Today date and time:"+ new Date().toString()+"</h2>");
	}


	public void destroy()
	{
		System.out.println("going to destroy");
	}
	
	//Non-Lifecycle method.
	
	public ServletConfig getServletConfig()
	{
	     return	this.conf;
	}
	
	public String getServletInfo()
	{
		return "Created by me";
	}
	
}
