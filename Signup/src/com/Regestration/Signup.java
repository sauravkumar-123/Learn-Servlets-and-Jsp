package com.Regestration;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Servlet implementation class Signup
 */
@WebServlet(description = "Regestration page", urlPatterns = { "/Signup" })
@MultipartConfig(maxFileSize = 16177215)
public class Signup extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		//res.getWriter().append("Served at: ").append(req.getContextPath());
		//res.setContentType("text/html");
		
		
	    PrintWriter out=res.getWriter();
	    
	   // out.println("<h1>Welcome</h1>"+" "+"<h1>TIME and DATE: </h1>"+" "+new Date().toString());
	    // geeting all data
	    
	   String username= req.getParameter("username");
	   String email= req.getParameter("email");
	   String password= req.getParameter("password");
	   
	   //get Image
	 Part prt=req.getPart("image");
	 String fname=prt.getSubmittedFileName();
	   
	 //out.println(username+"   "+email+"   "+password+" "+fname);
	   
	   //JDBC
	   
	   String oracle="oracle.jdbc.driver.OracleDriver";
	   String url="jdbc:oracle:thin:@localhost:1521:xe";
	   String usr="SYSTEM";
	   String pass="system";
	   String qry="INSERT INTO USER_DETAIL VALUES (?,?,?,?)";
	   
	   try {
		Thread.sleep(3000,100);
		Class.forName(oracle);
		Connection con=DriverManager.getConnection(url,usr,pass);
		PreparedStatement ps=con.prepareStatement(qry);
		
		ps.setString(1,username);
		ps.setString(2,email);
		ps.setString(3,password);
		ps.setString(4,fname);
		ps.executeUpdate();
		
		//File uploading.......
		  InputStream is=prt.getInputStream();
		  byte[] data=new byte[is.available()];
		  is.read();
		 
		String path=req.getRealPath("/")+"img"+File.separator+fname;
		//System.out.println(path);
		FileOutputStream fos=new FileOutputStream(path);
		  fos.write(data);
		   out.println("Done");
		
		con.close();
		ps.close();
	} catch (ClassNotFoundException|SQLException|InterruptedException e)
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
		out.println(e.getMessage()+" "+"something goes wrong");
	
	}
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	   {
		// TODO Auto-generated method stub
		doGet(req, res);
		
		}
}

