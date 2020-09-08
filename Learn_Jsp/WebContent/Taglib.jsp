<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taglib--></title>
</head>
<body>
      <br>
      <c:set var="name" value="SAURAV KUMAR"></c:set><br>
      <c:out value="${name}"></c:out>
      <c:if test="${6>5}">
         <h1>True statement....</h1>
      </c:if>
        </body>
</html>