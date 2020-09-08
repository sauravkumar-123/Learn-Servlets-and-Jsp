<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/WEB-INF/tlds/Custom" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customize Tag jsp file...</title>
</head>
<body>
      <h1>Welcome to Custom Tag jsp file..</h1>
      <t:mytag></t:mytag>
      <t:tableprint number="52" str="My India is a great Country" color="red"></t:tableprint>
     <t:tableprint number="32" color="blue"></t:tableprint>
</body>
</html>