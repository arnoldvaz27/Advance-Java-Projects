<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="cal" uri="/WEB-INF/tlds/CalenderTLD.tld" %>
<html>
<head>
<title>MarkAttendance Page</title>
</head>
<body>

<jsp:include page="Template.jsp"></jsp:include>
<td valign="top" rowspan="200"colspan="80">
<table>
<tr>
    <td>
<table>
    <tr>
    <td>
<cal:CalenderTagHandler/>
</table>
</body>
</html>
