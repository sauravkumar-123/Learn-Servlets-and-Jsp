package com.server;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormRegestration extends HttpServlet
{
 
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  out.println("<h1>Welcome</h1>"+" "+"<h1>TIME and DATE: </h1>"+" "+new Date().toString());
	  String name=req.getParameter("usrname");
	  String email=req.getParameter("e-mail");
	  String pass=req.getParameter("pwd");
	  String gender=req.getParameter("gender");
	  String dob=req.getParameter("dob");
	  String course=req.getParameter("course");
	  String chk=req.getParameter("condition");
	  
	//JDBC part  
/*	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String ousr="SYSTEM";
	String opass="system";
	String qry="INSERT INTO REGS VALUES (?,?,?,?,?,?,?)";
	  try
	  {
	  Class.forName("oracle.jdbc.OracleDriver");
	  Connection con=DriverManager.getConnection(url,ousr,opass);
	  PreparedStatement ps=con.prepareStatement(qry);
	  ps.setString(1,name);
	  ps.setString(2,email);
	  ps.setString(3,pass);
	  ps.setString(4,gender);
	  ps.setString(5,dob);
	  ps.setString(6,course);
	  ps.setString(7,chk);
	  
	  int count=ps.executeUpdate();
	  out.println(count+"data saved!!!!");
	 Statement st=con.createStatement();
	  ResultSet rs=st.executeQuery("SELECT * FROM REGS");
	  
	  while(rs.next()==true)
	  {
		  out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
	  }
	  con.close();
	  ps.close();
	  st.close();
	  }
	  catch(SQLException|ClassNotFoundException e)
	  {
		 
		  out.println("Oracle driver not loaded"+e.getMessage());
	  }
	  */
	  
	  try
	  {
		  if(chk.equals("check"))
		  {
			  out.println("<h2>Thanks for Regestration</h2>");
			  out.println("Mydetails--->"+name+" "+email+" "+pass+" "+gender+" "+dob+" "+course);  
			 
			  RequestDispatcher rqd=req.getRequestDispatcher("/success");//url pattern.
			  rqd.forward(req, res);
		  }  
	  }
	  catch(NullPointerException ne)
	  {
		  out.println("<h2>Please accept term and condition</h2>"); 
	  }
		  
	
		 /* else
		  {
			  out.println("<h2>Please accept term and condition</h2>"); 
		  }*/
	  
	  // include other response on same page.
	  
	  RequestDispatcher rq=req.getRequestDispatcher("index3.html");
	  rq.include(req,res);
	  
  }
}
