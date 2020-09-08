package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet5 extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
{
   	res.setContentType("text/html");
    PrintWriter out=res.getWriter();
	
    String s1=req.getParameter("num1");
    String s2=req.getParameter("num2");
    
    int n1=Integer.parseInt(s1);
    int n2=Integer.parseInt(s2);
    
    out.println("<h1>");
    out.println("product= "+n1*n2);
    out.println("</h1>");
    
    int sum=(int)req.getAttribute("sum");
    out.println("<h1>");
    out.println("sum= "+sum);
    out.println("</h1>");
}
}
