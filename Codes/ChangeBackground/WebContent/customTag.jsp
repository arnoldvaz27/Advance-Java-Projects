<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- Providing the location of the Mytaglib directive --%>
<%@ taglib uri="/Mytaglib.tld" prefix="first" %>
<HTML>
<HEAD>
<TITLE>Customized Tag</TITLE>
</HEAD>
<%
	/* Setting the color parameter selected by the user */
	String str = request.getParameter("r1");
	/* Comparing the color and then invoking the custom tag with attribute color and body */
	if(str.compareTo("G")==0) /* is similar to str.equals("G") */
	{
%>	
		<first:xyz color="LIGHTGREEN">
			<%=request.getParameter("uname")%>
		</first:xyz>
<%		
	}	
	if(str.compareTo("R")==0)
	{
%>
		<first:xyz color="RED">
			<%=request.getParameter("uname")%>
		</first:xyz>

<%
	}
	if(str.compareTo("Y")==0)
	{
%>
		<first:xyz color="LIGHTYELLOW">
			<%=request.getParameter("uname")%>
		</first:xyz>
<%	
	}
	if(str.compareTo("B")==0)
	{
%>
		<first:xyz color="LIGHTBLUE">
			<%=request.getParameter("uname")%>
		</first:xyz>
<%	
	}
%>
<BR>
<B>
</BODY>
</HTML>
