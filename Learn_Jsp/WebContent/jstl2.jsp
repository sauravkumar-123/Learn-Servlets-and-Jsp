<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sq"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>JSTL function tags....</title>
</head>
<body>
     <h2>This is all about function tag:--></h2>
     <c:set var="name" value="Techsoft India"></c:set>
     <h1>
      <c:out value="${name}"></c:out>
     </h1>
     <h2>
        length of string=
       <c:out value="${f:length(name)}"></c:out>
     </h2>
     
     <h2>
        string=
       <c:out value="${f:toLowerCase(name)}"></c:out>
     </h2>
     
     <h2>
        contain=
       <c:out value="${f:contains(name,'India')}"></c:out>
     </h2>
     
     <h1>All data of staff:</h1>
     <sq:setDataSource driver="oracle.jdbc.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe" user="SYSTEM" password="system" var="ds"></sq:setDataSource>
     <sq:query dataSource="${ds}" var="rs">SELECT * FROM STAFF</sq:query>
     <div class="container">
     <table class="table">
       <tr>
           <td>EMP_ID   &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
           <td>FIRST_NAME  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
           <td>LAST_NAME    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
           <td>EMAIL   &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
           <td>MOB_NO   &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
           <td>JOB_ID    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
       </tr>
       
       <c:forEach items="${rs.rows}" var="row">
          <tr>
            <td> <c:out value="${row.EMP_ID}"></c:out> </td>
             <td><c:out value="${row.FIRST_NAME}"></c:out></td>
            <td> <c:out value="${row.LAST_NAME}"></c:out></td>
          <td>   <c:out value="${row.EMAIL}"></c:out> </td>
            <td> <c:out value="${row.MOBNO}"></c:out> </td>
           <td>  <c:out value="${row.JOB_ID}"></c:out> </td>
          </tr>
       
       </c:forEach>
     </table>
     </div> 
</body>
</html>