<%-- 
    Document   : ResultPage
    Created on : Jul 23, 2012, 6:00:22 PM
    Author     : Karuna.Sadh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <BODY>
<%
    String suggetsword=request.getParameter("suggestword").toLowerCase();

String[] mySuggests=new String[]{"P001:GNIIT Classic","P002:Developing Web Applications Using Java","P003:Developing Web Applications Using PHP","P004:Developing Console Based Applications Using C#","P005:Networking Essentials","P006:Cloud Computing Development","P007:Programing Using C++"
       };

out.println("<table width='100%' border='0' cellpadding='0' cellspacing='0'>");

   for(int i=0;i<mySuggests.length;i++)
   {
      if(mySuggests[i].toLowerCase().startsWith((suggetsword)))
      {
        out.print("<tr><td>"+mySuggests[i]+"</td></tr>");


        }
   }
    out.println("</table>");
%>

</html>
