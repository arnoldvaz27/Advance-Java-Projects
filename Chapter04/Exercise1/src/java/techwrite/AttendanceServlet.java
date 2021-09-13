/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author karuna.sadh
 */
@WebServlet(name="AttendanceServlet", urlPatterns={"/AttendanceServlet"})
public class AttendanceServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String d=request.getParameter("param");
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
         out.println("<form method='Post' action='SubmitAttendance'>");
                     out.println("<table cellspacing='10' align='center'>");
               out.println("<tr>");
              out.println("<td><font color='darkblue' size='+2'>Attendance Details");
              out.println("</tr>");
                out.println("</td>");
                  out.println("</table>");
                    out.println("<table cellspacing='10' align='center'border='2' bordercolor='black'>");
              out.println("<tr><td bordercolor='white'>Date:"); out.println("<td bordercolor='white'><input type='text' value='"+d+"'>");
             out.println("<tr><td bordercolor='white'>Attendance Status:");
                    out.println("<td bordercolor='white'><input type='Radio' value='fullday' name='r3' CHECKED>Full day");
     out.println("<td bordercolor='white'><input type='Radio'value='halfday' name='r3'>Half day");
out.println("<td bordercolor='white'><input type='Radio'value='leave' name='r3'>Leave");
  
     out.println("<tr><td bordercolor='white'><input type='Submit'value='Mark Attendance'>");
     out.println("<td bordercolor='white'><input type='RESET'text='Reset'>");

                out.println("</table>");
                   out.println("</form>");
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
