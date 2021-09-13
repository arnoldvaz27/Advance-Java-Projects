<%-- 
    Document   : TimeTrackingSheet
    Created on : Jul 19, 2012, 3:17:36 PM
    Author     : karuna.sadh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Time Tracking Sheet Page</title>
</head>
<body>
<jsp:include page="Template.jsp"></jsp:include>
<td valign="top" rowspan="200"colspan="80">
        <table>
            <tr>

<form method='Post' action='SubmitTimeTrackSheet.jsp'>
<table cellspacing='10' align='center'>
<tr>
<td><font color='darkblue' size='+2'>Time Tracking Sheet
</tr>
</td>
</table>
<table cellspacing='10' align='center'border='2' bordercolor='black'>
<tr><td bordercolor='white'>Project Code:<td COLSPAN='2'bordercolor='white'><input type='text' name='tt1'>
<tr><td bordercolor='white'>Number of Hours:<td COLSPAN='2'bordercolor='white'>
<input type='text' name='tt2'>
</tr>
<tr><td bordercolor='white'>Tasks Performed:<td COLSPAN='2'bordercolor='white'>
<input type='text' name='tt3'>
</tr>
<tr><td bordercolor='white'></br>
<tr><td bordercolor='white'><input type='Submit'value='Submit'>
<td bordercolor='white'><input type='RESET'text='Reset'>
</table>
</form>
</body>
</html>
