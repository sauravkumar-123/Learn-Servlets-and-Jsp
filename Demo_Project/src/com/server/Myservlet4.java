package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet4 extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	res.setContentType("text/html");
	
	PrintWriter out=res.getWriter();
	String s1=req.getParameter("num1");
	String s2=req.getParameter("num2");
	
	int n1=Integer.parseInt(s1);
	int n2=Integer.parseInt(s2);
	
	int sum=n1+n2;
	
	req.setAttribute("sum",sum);
	RequestDispatcher rqd=req.getRequestDispatcher("/web6"); //url pattern.
    rqd.forward(req, res);
}
}
