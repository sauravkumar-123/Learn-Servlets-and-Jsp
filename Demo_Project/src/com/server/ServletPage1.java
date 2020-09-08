package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPage1
 */
@WebServlet(description = "UrlRewritting", urlPatterns = { "/ServletPage1" })
public class ServletPage1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPage1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		out.println("<h1>Welcome : "+name+"</h1>");
		out.println("<a href='ServletPage2?user="+name+"'>Go to second servlet </a>");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		out.println("<h1>Welcome : "+name+"</h1>");
		//out.println("<a href='ServletPage2?user="+name+"'>Go to second servlet </a>");
		
		//Hidden form field
		
		out.println(""
				+"<form action='ServletPage2'>"
				+"<input type='hidden' name='username' value='"+name+"'/>"
				+"<button type='submit'>Go to second servlet</button>"
				+"</form>");
	}

}
