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
import java.sql.ResultSet;
import java.sql.Connection;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Karuna.Sadh
 */
public class SubmitTimeTrackSheetAction extends org.apache.struts.action.Action {
    
  private static final String SUCCESS = "success";
     private static final String ERROR = "error";
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
        HttpSession session=request.getSession(false);
        Connector cn = new Connector();
Connection con = cn.createConnection();
Statement stmt=con.createStatement();
        TimeTrackingSheetBean tb=(TimeTrackingSheetBean)form;
         
        String pc=tb.getProjectCode();
String NumHrs=tb.getNumHrs();
    String TaskPerformed=tb.getTasksPerformed();
    String lid=session.getAttribute("Userid").toString();
    if( pc.equals("")||NumHrs.equals("")||TaskPerformed.equals(""))
     {
               return mapping.findForward(ERROR);
    }
        String insertQuery = "INSERT INTO TimeTrackSheet VALUES ('"+lid+"' ,'"+pc+"', '"+NumHrs+"' , '"+TaskPerformed+"')";
    System.out.println(insertQuery);
 stmt.executeUpdate(insertQuery);

        return mapping.findForward(SUCCESS);
    }
}
