<%--
    Document   : MarkAttendance
    Created on : Jul 19, 2012, 3:17:57 PM
    Author     : karuna.sadh
--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Attendance Status Page</title>
</head>
<body>
    <% String d=request.getParameter("param");%>
<jsp:include page="Template.jsp"></jsp:include>
<td valign="top" rowspan="200"colspan="80">
        <table>
            <tr>
<html:form method='Post' action='SubmitAttendanceAction'>
<table cellspacing='10' align='center'>
<tr>
<td><font color='darkblue' size='+2'>Attendance Details
</tr>
</td>
</table>
<table cellspacing='10' align='center'border='2' bordercolor='black'>
<tr><td bordercolor="white">Date:
<td bordercolor="white"><html:text property="date" value="<%= d %>"/>
  
<tr><td bordercolor="white">Attendance Status:</td>
<td bordercolor="white"><html:radio value="fullday" property="r3"/>Full day</td>
<td bordercolor="white"><html:radio value="halfday" property="r3"/>Half day</td>
<td bordercolor="white"><html:radio value="leave" property="r3"/>Leave</td>
<td bordercolor="white"><html:errors property="radio"/></td>
<tr><td bordercolor="white"><input type="Submit" value="Mark Attendance">
<td bordercolor="white"><input type="RESET"text="Reset">

</table>
</html:form>
        </body>
</html>

