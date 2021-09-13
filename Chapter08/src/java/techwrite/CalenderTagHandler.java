/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author karuna.sadh
 */
public class CalenderTagHandler extends SimpleTagSupport {

   public final static String[] monthcalender = {
  "January", "February", "March", "April", "May", "June", "July",
  "August", "September", "October", "November", "December"};

  public final static int daysinmonths[] = {31, 28, 31, 30, 31,
     30, 31, 31, 30, 31, 30, 31 };

   
    @Override
    public void doTag() throws JspException
    {
                try {
             Calendar todaycldr = Calendar.getInstance();
           displayMonth(todaycldr.get(Calendar.MONTH), todaycldr.get(Calendar.YEAR));
System.out.print("within the dotag");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in CalenderTagHandler tag", ex);
        }
    }

  public void displayMonth(int month, int year) throws IOException, JspException {
System.out.print("within the displaymethod");
   // The number of days to leave blank at
  // the start of this month.
JspWriter out = getJspContext().getOut();
 PageContext context = (PageContext)getJspContext();

  System.out.print("after the response writer");
      int blankdays = 0;
      out.println("<br>");
      out.println("<center>");
  out.println("<font color='darkblue' size='+2'> Mark Attendance for the Current Month:" + monthcalender[month] + " " + year);
  out.println("</font>");
  if (month < 0 || month > 11) {
  throw new IllegalArgumentException("Month " + month + " is not valid and must lie in between 0 and 11");
  }
  GregorianCalendar cldr = new GregorianCalendar(year, month, 1);
  out.println("<table>");
  out.println("");
  out.println("<tr><td bgcolor='maroon'><font color='white'>Sunday<td bgcolor='maroon'><font color='white'>Monday<td bgcolor='maroon'><font color='white'>Tuesday<td bgcolor='maroon'><font color='white'>Wednesday<td bgcolor='maroon'><font color='white'>Thursday<td bgcolor='maroon'><font color='white'>Friday<td bgcolor='maroon'><font color='white'>Saturday</td></tr>");
  out.println("</font>");
  // Compute how much to leave before before the first day of the month.
  // getDay() returns 0 for Sunday.
  blankdays = cldr.get(Calendar.DAY_OF_WEEK)-1;
  int daysInMonth = daysinmonths[month];
  if (cldr.isLeapYear(cldr.get(Calendar.YEAR))
&& month == 1)
  {
  ++daysInMonth;
  }

  // Blank out the labels before 1st day of the month
  for (int i = 0; i < blankdays; i++) {
  out.print(" ");
  }
 out.print("<tr>");
  for (int i = 1; i <= daysInMonth; i++) {

  // This "if" statement is simpler than messing with NumberFormat
  if (i<=9) {
  out.print(" ");
  }
  ServletRequest req=context.getRequest();

  String d=req.getParameter("name");
  System.out.print(d);
  d.trim();
  String s = "<td><a href='"+d+"?param="+i+"' name='a1'>"+i+"</a></td>";
  out.println(s);

  if ((blankdays + i) % 7 == 0) { // Wrap if EOL
  out.println("<br><tr>");
  }
  else {
  out.print("");
  }
  }
    }
    }

