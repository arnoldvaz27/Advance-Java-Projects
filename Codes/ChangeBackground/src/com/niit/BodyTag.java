package com.niit;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.GregorianCalendar;

public class BodyTag extends BodyTagSupport{

	 String color;
		/* Declaring the constructor for the class */
		public BodyTag()
		{
			super();
		}
		/* Initializing the name */
		public void setName(String name)
		{
		}
		/* Initializing the color */
		public void setColor(String color)
		{
			this.color = color;
		}
		public int doAfterBody() throws JspException
		{
			try
			{
				/* Creating an instance of the BodyContent class */
				BodyContent bc = getBodyContent();// Get the bodycontent as string
			    String body = bc.getString();    // GetJspWriter to output content
				/* Creating an instance of the JspWriter class */
				JspWriter out = bc.getEnclosingWriter();
				String dt;//Declaring the variable for system date
				/* Creating an instance of the GregorianCalendar class */
				GregorianCalendar now = new GregorianCalendar();
				/* Invoking the getTime() method */
				dt = now.getTime().toString();
				/* Finding the substring of the date type variable dt */
				String dt1 = dt.substring(11,16);
				/* Setting the color as selected by the user */
				out.print("<body bgcolor="+color+">");
				/* Displaying the custom message to the user according to the system time */
				if(body != null)
					out.print("<CENTER>Hi"+body+"! </CENTER>");
				if(dt1.compareTo("12.00")<0)
					out.print("<CENTER>Good Morning to You.</CENTER>");
				if((dt1.compareTo("12.00")>0) && (dt1.compareTo("16.00")<0))
					out.print("<CENTER>Good Afternoon to You.</CENTER>");
				if((dt1.compareTo("16.00")>0) && (dt1.compareTo("24.00")<0))
					out.print("<CENTER>Good Evening to You.</CENTER>");
				out.print("<BR>");
				out.print("<CENTER>Welcome to NIIT.</CENTER>");
				out.print("<BR>");
				out.print("<CENTER>The current time: "+dt1+"</CENTER>");
				out.print("</body>");
			}
			catch(IOException ioe)
			{
			         throw new JspException("Error:"+ioe.getMessage());
			}
			return SKIP_BODY;
		}
}
