/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author karuna.sadh
 */
@WebServlet(name="MarkAttendance", urlPatterns={"/MarkAttendance"})
public class MarkAttendance extends HttpServlet {
   
    public final static String[] monthcalender = {
  "January", "February", "March", "April", "May", "June", "July",
  "August", "September", "October", "November", "December"};

  public final static int daysinmonths[] = {31, 28, 31, 30, 31,
     30, 31, 31, 30, 31, 30, 31 };

  public void displayMonth(int month, int year, HttpServletRequest request, HttpServletResponse response) throws IOException {

  // The number of days to leave blank at
  // the start of this month.
  PrintWriter out = response.getWriter();
      int blankdays = 0;
      out.println("<br>");
      out.println("<center>");
  out.println("<font color='darkblue' size='+2'> Mark Attendance for the Current Month:" + monthcalender[month] + " " + year);
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
  request.setAttribute("day",i);
  out.print("<td><a href='AttendanceServlet?param="+i+"' name='a1'>"+i+"</a></td>");

  if ((blankdays + i) % 7 == 0) { // Wrap if EOL
  out.println("<br><tr>");
  }
  else {
  out.print("");
  }
  }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
       
        response.setContentType("text/html;charset=UTF-8");
    
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MarkAttendance Page</title>");
            out.println("</head>");
            out.println("<body>");
           out.println("<table border='0' bgcolor='maroon' align='top' width='100%' style='height:100px'>");
           out.println("<tr>");
           out.println("<td bgcolor='maroon' align='center'>");
           out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>TechWrite Inc.</font>");
            out.println("</td>");
                out.println("<td bgcolor='maroon' align='left' width='180'>");
                out.println("<img src='Images/Logo.jpg' width='180' height='120' align='right'/>");
             out.println("</td>");
               out.println("</tr>");
               out.println("</table>");
Calendar todaycldr = Calendar.getInstance();
 displayMonth(todaycldr.get(Calendar.MONTH), todaycldr.get(Calendar.YEAR), request, response);

               
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

