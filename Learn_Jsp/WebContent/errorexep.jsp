<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Sorry!Something went wrong..</title>
</head>
<body>
    <div class="container p-3 text-center">
    <img src="img/error.jpg" class="img-fluid"/>
    <h1 class="display-3">Sorry! Something Wrong...</h1>
    
    <p1><%=exception %></p1>
    <a class="btn btn-outlinr-primary" href="Errorfind.html">Home</a>
    </div>
</body>
</html>