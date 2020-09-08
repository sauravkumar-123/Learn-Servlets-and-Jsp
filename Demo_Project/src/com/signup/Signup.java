package com.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet 
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException , ServletException
   {
	res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    out.println("<h1>Welcome</h1>"+" "+"<h1>TIME and DATE: </h1>"+" "+new Date().toString());
    // geeting all data
   String username= req.getParameter("username");
   String email= req.getParameter("email");
   String password= req.getParameter("password");
   
   out.println(username+"   "+email+"   "+password);
   
   //JDBC
   String url="jdbc:oracle:thin:@localhost:1521:xe";
   String usr="SYSTEM";
   String pass="system";
   String qry="INSERT INTO USER_DETAIL VALUES (?,?,?)";
   
   try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection(url,usr,pass);
	PreparedStatement ps=con.prepareStatement(qry);
	
	ps.setString(1,username);
	ps.setString(2,email);
	ps.setString(3,password);
	int count=ps.executeUpdate();
	out.println(count+"<h2>Data updated....</h2>");
	
	con.close();
	ps.close();
} catch (ClassNotFoundException|SQLException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	out.println(e.getMessage()+" "+"something goes wrong....");
}
   
   }
}
