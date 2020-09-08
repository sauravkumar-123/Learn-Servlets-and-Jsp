<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ErrorHandling Page...</title>
    <style>
        *{
            padding:0px;
            margin: 0px;
        }
    </style>
</head>
<body style="background-color:azure">
       <div style="background-color:darkslategray;padding:20px;margin:20px;color:red">
    
         <h1>Something Wrong.....</h1>
           <p1>
              <%=
               exception
              %>
           </p1>
    </div>
</body>
</html>