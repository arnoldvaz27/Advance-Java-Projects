/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Karuna.Sadh
 */
public class SubmitAttendanceAction extends org.apache.struts.action.Action {
    
    private static final String SUCCESS = "success";

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
        Date d=new Date();
Calendar todaycldr = Calendar.getInstance();
todaycldr.get(Calendar.YEAR);
HttpSession session=request.getSession(false);
Connector cn = new Connector();
Connection con = cn.createConnection();
Statement stmt=con.createStatement();
AttendanceStatusBean ab=(AttendanceStatusBean)form;
String date=ab.getDate();
String status=ab.getR3();
             String lid=session.getAttribute("Userid").toString();
String insertQuery = "INSERT INTO Attendance VALUES ('"+lid+"' ,'"+date+"-"+d.getMonth()+"-"+todaycldr.get(Calendar.YEAR)+"', '"+status+"')";
    System.out.println(insertQuery);
 stmt.executeUpdate(insertQuery);
        return mapping.findForward(SUCCESS);
        

    }
}
