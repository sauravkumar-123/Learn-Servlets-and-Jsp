<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
        <div style="background-color:blue";>
             <h1 style="color:white">Date and Time :
                 <%=
                     new Date().toString()
                 %>
             </h1>
        </div>
</body>
</html>