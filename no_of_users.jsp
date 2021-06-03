<%-- 
    Document   : index
    Created on : Nov 25, 2018, 9:27:02 PM
    Author     : Chiggy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
  int count = 0;
  void increment()
  {
   count++;   
  }  
    %>
    <%  increment();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>first</title>
    </head>
    <body>
    <center><h1> this site is visited <%=count%></h1></center>
    </body>
</html>
