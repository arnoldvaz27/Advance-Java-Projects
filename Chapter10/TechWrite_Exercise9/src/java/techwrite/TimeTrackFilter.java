/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author karuna.sadh
 */
@WebFilter(filterName="TimeTrackFilter", urlPatterns={"/TimeeeTrackingSheet.jsp"})
public class TimeTrackFilter implements Filter {

    @Override
  public void init(FilterConfig config)
    throws ServletException
    {
    }

    @Override
  public void doFilter(ServletRequest request,
    ServletResponse response, FilterChain chain)
    throws ServletException, IOException {
HttpServletRequest req = (HttpServletRequest)request;
       String requestURL = req.getRequestURL().toString();
       String userid=req.getParameter("uid");
       Date d=new Date();
       int x=d.getHours()-8;
       if(x<=8)
       {
        RequestDispatcher rd=request.getRequestDispatcher("TimeError.jsp");
        rd.forward(request,response);
       }
 else
       {
            RequestDispatcher rd=request.getRequestDispatcher("TimeTrackingSheet.jsp");
        rd.forward(request,response);
        }
       chain.doFilter(request, response);
}
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
