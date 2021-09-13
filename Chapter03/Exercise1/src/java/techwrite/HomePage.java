/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author karuna.sadh
 */
@WebServlet(name="HomePage", urlPatterns={"/HomePage"})
public class HomePage extends HttpServlet {
   
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
        try {
 out.println("<html>");
            out.println("<head>");
            out.println("<title>Home Page</title>");
            out.println("</head>");
            out.println("<body>");
           out.println("<table border='0' bgcolor='maroon' align='top' width='100%' style='height:100px'>");
           out.println("<tr>");
           out.println("<td bgcolor='maroon' align='center'>");
           out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>TechWrtite Inc.</font>");
            out.println("</td>");
                out.println("<td bgcolor='maroon' align='left' width='150'>");
                out.println("<img src='Images/Logo.jpg' width='200' height='120' align='right'/>");
             out.println("</td>");
           out.println("</tr>");
           out.println("</table>");
            out.println("<br/>");
            out.println("<img src='Images/Background.png' width='900' height='400'/>");
            out.println("<br/>");
            out.println("<form method='Post' action='SubmitServlet'>");
            out.println("<table cellspacing='10' align='center'border='2' bordercolor='black'>");
            out.println("<tr><td bordercolor='white'>Login Id:<input type='text' name='lid'>");
     out.println("<td bordercolor='white'>Password:<input type='password' name='pwd'>");
     out.println("<td bordercolor='white'><input type='Submit'value='GO'>");
   
            out.println("</table>");
                out.println("<br/>");
                    out.println("<br/>");
     out.println("<table border='0' cellspacing='0' cellpadding='0' style='background-color:maroon' height='5%'>");
	out.println("<tr>");
        out.println("<td align='center'><font color='white'>Copyright © 2002 - 2012 TechWrite Inc. All trademarks acknowledged. Please send site feedback to admin@techwrite.com| Best viewed with a screen resolution of 1024*768                          </font></td>");
	out.println("</tr>");
		out.println("</table>");

            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
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
