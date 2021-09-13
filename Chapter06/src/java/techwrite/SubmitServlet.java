/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="SubmitServlet", urlPatterns={"/SubmitServlet"})
public class SubmitServlet extends HttpServlet
{

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
        boolean set=false;
        String userid=request.getParameter("lid");
        String password=request.getParameter("pwd");
        System.out.println(password);
      Boolean active = Boolean.valueOf(request.getParameter("c1"));
boolean activated = active.booleanValue();
        if(!activated)
        {
             System.out.print("Cookie is not set");
                           
        }
 else {
   
               Cookie ck1=new Cookie("password",password);
               Cookie ck2=new Cookie("userid",userid);
              int age=60*60*24*30;
		ck1.setMaxAge(age);
ck2.setMaxAge(age);
               response.addCookie(ck1);
              response.addCookie(ck2);
 }
       if (userid.equals("21062") && password.equals("password@123"))
        {
           HttpSession session = request.getSession();
            session.setAttribute("Userid", userid);

          //  RequestDispatcher dispatch = request.getRequestDispatcher("WelcomeEmployee.jsp");
 RequestDispatcher dispatch = request.getRequestDispatcher("WelcomeEmployee.jsp");
	     dispatch.forward(request, response);

        }
 else {

            // RequestDispatcher dispatch = request.getRequestDispatcher("ErrorPage.jsp");
RequestDispatcher dispatch = request.getRequestDispatcher("ErrorPage.jsp");
	     dispatch.forward(request, response);
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
