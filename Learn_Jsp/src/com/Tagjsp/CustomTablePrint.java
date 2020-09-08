package com.Tagjsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTablePrint extends TagSupport 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   public int number;
   public String str;
   public String color;
   
   public void setNumber(int number)
   {
	   this.number=number;
   }
   
   public void setStr(String str)
   {
	   this.str=str;
   }
   
   public void setColor(String color)
   {
	   this.color=color;
   }
	@Override
	
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		 // Table print
		try {
		   JspWriter out=pageContext.getOut();
		   out.println("<div style='color:"+color+"'>");
		   out.println("<h1>Table of any number: </h1>");
		   for(int i=1;i<=10;i++)
		   {
			   out.println(number+"*"+i+"="+number*i);
			   out.println("<br>");
		   }
		   out.println("</div>");
		   // String reverse at same place
	out.println("<div style='color:"+color+"'>");
	 out.println("<h1>reverse is :</h1>"+"<br>");
		  String ar[]=str.split(" ");
		   for(int i=0;i<=ar.length-1;i++)
		   {
			  char x[]=ar[i].toCharArray(); 
			  char y[]=new char[x.length];
			  for(int j=0;j<=y.length-1;j++)
			  {
				y[j]=x[x.length-1-i];  
			  }
			 
			  out.println(y+" ");
		   }
    out.println("</div>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	

}
