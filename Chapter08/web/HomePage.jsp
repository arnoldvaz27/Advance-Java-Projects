<%--
    Document   : HomePage
    Created on : Jul 19, 2012, 3:16:48 PM
    Author     : karuna.sadh
--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Home Page</title>
</head>
<body>
    <%!
     String Password="";
     String Userid="";
    %>
    <%

        Cookie ck[] = request.getCookies();
	if (ck!=null)
		{

			for (int i=0; i<ck.length; i++)
			{
				if (ck[i].getName().equals("password"))
                                {
			/*  Retrieve password from the cookie. */

                                  Password = ck[i].getValue();
                                  System.out.println("Hi"+Password);
                            }
                                if(ck[i].getName().equals("userid"))
                                {
                                      Userid = ck[i].getValue();
                                         System.out.println(Userid);
                                }
			}
		}
    %>
<table border='0' bgcolor='maroon' align='top' width='100%' style='height:100px'>
<tr>
<td bgcolor='maroon' align='center'>
<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>TechWrite Inc.</font>
</td>
<td bgcolor='maroon' align='left' width='150'>
<img src='Images/Logo.jpg' width='200' height='120' align='right'/>
</td>
</tr>
</table>
<br/>
<img src='Images/Background.png' width='900' height='400'/>
<br/>
 <html:form method='Post' action='SubmitAction'>
<table cellspacing='10' align='center'border='2' bordercolor='black'>
<tr><td bordercolor='white'>Login Id:<html:text property="loginid" value="loginid" value='<%=Userid%>' />
<td bordercolor='white'>Password:<html:password property="password" name='pwd'value='<%=Password%>'/>
<td bordercolor='white'><input type='Submit'value='GO'>
<td bordercolor='white'><input type='checkbox' name='c1' value='checked'/>Remember Me
</table>
<br/>
<br/>
<table border='0' cellspacing='0' cellpadding='0' style='background-color:maroon' height='5%'>
<tr>
<td align='center'><font color='white'>Copyright © 2002 - 2012 TechWrite Inc. All trademarks acknowledged. Please send site feedback to admin@techwrite.com| Best viewed with a screen resolution of 1024*768                          </font></td>
</tr>
</table>
</html:form>
</body>
</html>

