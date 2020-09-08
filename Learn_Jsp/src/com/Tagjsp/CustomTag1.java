package com.Tagjsp;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class CustomTag1 extends TagSupport
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public int doStartTag() throws JspException
  {
	  try {
		  
		  JspWriter out=pageContext.getOut();
		  out.println("<h1>Welcome to CustomTag...</h1>");
		  out.println("<p>Custom Paragraph..</p>");
		  out.println(new Date().toString());
	  }
	  catch(Exception e)
	  {
		 e.printStackTrace(); 
	  }
	  return SKIP_BODY;
  }
}
