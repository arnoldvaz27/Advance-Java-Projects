/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Karuna.Sadh
 */
public class SubmitAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
   private static final String Welcome = "welcome";
private static final String Error = "error";


    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HomePageBean hb=(HomePageBean)form;
        String userid=hb.getLoginid();
        String password=hb.getPassword();
        Boolean active = Boolean.valueOf(request.getParameter("c1"));
boolean activated = active.booleanValue();
        if(activated)
        {
             System.out.print("Cookie is not set");

        }
 else {
System.out.print("Cookie is set");
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
return mapping.findForward(Welcome);

        }
        return mapping.findForward(Error);
    }
}
