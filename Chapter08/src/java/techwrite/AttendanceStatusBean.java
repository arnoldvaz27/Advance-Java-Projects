/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Karuna.Sadh
 */
public class AttendanceStatusBean extends org.apache.struts.action.ActionForm {
    
  private String date;
    private String r3;

   
    public AttendanceStatusBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
   

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the r3
     */
    public String getR3() {
        return r3;
    }

    /**
     * @param r3 the r3 to set
     */
    public void setR3(String r3) {
        this.r3 = r3;
    }
     public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getR3() == null || getR3().length() < 1) {
            errors.add("radio", new ActionMessage("error.value.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
   
}
