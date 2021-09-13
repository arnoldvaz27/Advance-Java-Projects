<%--
    Document   : MarkAttendance
    Created on : Jul 19, 2012, 3:17:57 PM
    Author     : karuna.sadh
--%>

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

<form method='Post' action='SubmitAttendance.jsp'>
<table cellspacing='10' align='center'>
<tr>
<td><font color='darkblue' size='+2'>Attendance Details
</tr>
</td>
</table>
<table cellspacing='10' align='center'border='2' bordercolor='black'>
<tr><td bordercolor='white'>Date:
<td bordercolor='white'><input type='text' value='<% out.print(d); %>' width="5">
<tr><td bordercolor='white'>Attendance Status:</td>
<td bordercolor='white'><input type='Radio' value='fullday' name='r3' CHECKED>Full day</td>
<td bordercolor='white'><input type='Radio'value='halfday' name='r3'>Half day</td>
<td bordercolor='white'><input type='Radio'value='leave' name='r3'>Leave</td>
<tr><td bordercolor='white'><input type='Submit'value='Mark Attendance'>
<td bordercolor='white'><input type='RESET'text='Reset'>
</table>
</form>

