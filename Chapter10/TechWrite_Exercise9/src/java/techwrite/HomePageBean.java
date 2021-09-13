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
public class HomePageBean extends org.apache.struts.action.ActionForm {
    
    private String loginid;
    private String password;

    

    /**
     *
     */
    public HomePageBean() {
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
     * @return the loginid
     */
    public String getLoginid() {
        return loginid;
    }

    /**
     * @param loginid the loginid to set
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
