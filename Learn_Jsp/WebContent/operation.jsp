<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page errorPage="errorexep.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To Do Operation....</title>
</head>
<body>
      <%
         int num1= Integer.parseInt(request.getParameter("n1"));
         int num2= Integer.parseInt(request.getParameter("n2")); 
         
         double result=num1/num2;
      %>
      
      <h1>Division result :
           <%=
              result
           %>
      </h1>
</body>
</html>