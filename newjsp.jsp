<%-- 
    Document   : newjsp
    Created on : Nov 25, 2018, 6:37:10 PM
    Author     : Chiggy
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! 
        int price;
        int quantity ;
        %>
        <%
            String name = request.getParameter("name");
            price = Integer.parseInt(request.getParameter("price"));
            quantity = Integer.parseInt(request.getParameter("quantity"));
            float amount = price * quantity;
            
            %>
            <label>the total amount is : <%=amount%></label><br>
            <label value=" <%=amount%>"></label>
    </body>
</html>
