<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL library...</title>
</head>
<body>
      <h1>JSTL Example...</h1>
      <!--Core tags:-   out,set,remove,if -->
      <c:set var="i" value="71" scope="application"></c:set>
     <h1><c:out value="${i}"></c:out> </h1>
      
     <h2><c:out value="${i}">Default remove...</c:out></h2>
    
    <hr>
     <c:if test="${i>=55}">
          <h1>Contition is true..</h1>
          <p1>Write some code..</p1>
     </c:if>
     <!-- choose,when,otherwise   : JAVA switch -->
     <c:choose>
       <c:when test="${i>0}">
           <h1>This is case first..</h1>
           <h2>+ve number..</h2>
       </c:when>
       
       <c:when test="${i<0}">
         <h1>This is case second...</h1>
         <h2>-ve number...</h2>
       </c:when>
       
       <c:otherwise>
          <h1>This is Default case ...</h1>
         <h2>Whole number..with zero</h2>
       </c:otherwise>
     </c:choose>
     
     <!-- Foreach tag.... -->
     <c:forEach var="j" begin="1" end="20">
       <h1 style="color:red">value of J:<c:out value="${j}"></c:out></h1>
     </c:forEach>
     
     <!-- url,param.redrict -->
     <c:url var="myurl" value="https://www.google.co.in/search">
       <c:param name="qry" value="servlet and jsp"></c:param>
       </c:url>
       <h1 style="color:blue"> <c:out value="${myurl}"></c:out> </h1>
    <c:redirect url="${myurl}"></c:redirect> 
    
</body>
</html>
