<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page2 Here....</title>
</head>
<body style="background:green">
     <h1>This is Page2..</h1>
     <a href="PageRedrict3.jsp">Click here</a>
     
     <%
      out.println("<h1>Redricting Please Wait.....</h1>");
      //response.sendRedirect("PageRedrict3.jsp");
      response.sendRedirect("https://www.facebook.com/");
     %>
</body>
</html>