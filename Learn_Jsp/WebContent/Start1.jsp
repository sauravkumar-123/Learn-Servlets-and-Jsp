<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.util.Random,java.util.ArrayList"%>  <!-- Pagedrictive Tag -->
  <%@ include file="Start2.jsp" %>
  <%@ page errorPage="ErrorHandling.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Learn here...</title>
<style>
   *{
     margin:0px;
     padding:0px;
   }
</style>
</head>
<body style="background-color:silver";>
   <h1>Learn JSP...</h1>
    <%!                                       // Deceleration Tag
         int a=20;
         float b=50.25f;
         
         String str=new String("MyIndia");
         public float dosum()
         {
        	float sum=a+b;
        	return sum;
         }
         
         public char[] doreverse()
         {
        	char x[]=str.toCharArray();
        	char y[]=new char[x.length];
        	int size=x.length;
        	for(int i=0;i<size;i++)
        	{
        		y[size-1-i]=x[i];
        	}
        	return y;
         }
         
         public ArrayList<Object> add()
         {
        	 ArrayList<Object>a=new ArrayList<Object>();
        	 a.add(23);
        	 a.add("saurav");
        	 a.add(5500.25);
        	 a.add(null);
        	 return a;
         }
         
         public int ex()
         {
        	 int x=56;
             int y=2;
             int z=x/y;
             return z;
         }
        %>
        
          <%                                                        //Scriptlet Tag
             out.println(a+"======>"+b+"=====>"+dosum());
             out.println("<br>");
                      char s[]=doreverse();
                      out.println(s);
          %>
          
        <h1 style="color:green">Sum is : <%=                       //Expression Tag
              dosum()
        %></h1>
        
        <h1 style="color:brown">ArrayList Element:
             <%=
                add()
             %>
        </h1>
        
         <h2 style="color:red">Reverse is: <%=
              doreverse()
        %></h2>
        
       
          
        <h2 style="color:black">Exception :<%=
             ex()
          %>
          </h2>
        
        
</body>
</html>