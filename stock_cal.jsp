
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <% 
            String username = request.getParameter("name_id");
            String userquan = request.getParameter("name_q");
            String userprice = request.getParameter("name_price");
            int cal = Integer.parseInt(userquan)* Integer.parseInt(userprice);
            //out.println("the final amount is : "+cal);
          %> 
         
          <fieldset>
              <legend>
                  amount to be paid
              </legend>
              <input type="text" value="<%=cal%>" readonly="True">
          </fieldset>
    </body>
    
</html>
        
