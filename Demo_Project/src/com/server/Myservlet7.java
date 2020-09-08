package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;

public class Myservlet7 extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	   	res.setContentType("text/html");
	    PrintWriter out=res.getWriter();
	    
	    //geeting all Cookie.
	    Cookie[] ck=req.getCookies();
	    
	    boolean b=false;
	    String name="";
	    
	    if(ck==null)
	    {
	    	out.println("<h1>You are new user go to home page and Regestier first...!!</h1>");
	    }
	    else
	    {
	    	for(Cookie cok:ck)
	    	{
	    		String tname=cok.getName();
	    		  if(tname.equals("user_name"))
	    		  {
	    			  b=true;
	    			  name=cok.getValue();
	    		  }
	    	}
	    }
	   //String name= req.getParameter("name");
	    if(b)
	    {
	out.println("<h1>Hello "+name+" Welcome Back to my website.....</h1>");
	out.println("<h1>Thanks for visit......</h1>");
	}
	    else
	    {
	    	out.println("<h1>You are new user go to home page and Regestier first...!!</h1>");
	    }
	}
}
