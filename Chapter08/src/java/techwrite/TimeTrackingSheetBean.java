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
public class TimeTrackingSheetBean extends org.apache.struts.action.ActionForm {
    
    private String projectCode;
    private String numHrs;
   private String tasksPerformed;

  
    public TimeTrackingSheetBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the projectCode
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * @param projectCode the projectCode to set
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    /**
     * @return the numHrs
     */
    public String getNumHrs() {
        return numHrs;
    }

    /**
     * @param numHrs the numHrs to set
     */
    public void setNumHrs(String numHrs) {
        this.numHrs = numHrs;
    }

    /**
     * @return the tasksPerformed
     */
    public String getTasksPerformed() {
        return tasksPerformed;
    }

    /**
     * @param tasksPerformed the tasksPerformed to set
     */
    public void setTasksPerformed(String tasksPerformed) {
        this.tasksPerformed = tasksPerformed;
    }

 
}
