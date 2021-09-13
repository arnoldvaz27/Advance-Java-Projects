/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package techwrite;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Karuna.Sadh
 */
@Entity
@Table(name = "TIMETRACKSHEET")
@NamedQueries({
    @NamedQuery(name = "TimetracksheetEntity.findAll", query = "SELECT t FROM TimetracksheetEntity t"),
    @NamedQuery(name = "TimetracksheetEntity.findByTimetracksheetid", query = "SELECT t FROM TimetracksheetEntity t WHERE t.timetracksheetid = :timetracksheetid"),
    @NamedQuery(name = "TimetracksheetEntity.findByLoginid", query = "SELECT t FROM TimetracksheetEntity t WHERE t.loginid = :loginid"),
    @NamedQuery(name = "TimetracksheetEntity.findByProjectcode", query = "SELECT t FROM TimetracksheetEntity t WHERE t.projectcode = :projectcode"),
    @NamedQuery(name = "TimetracksheetEntity.findByNumhrs", query = "SELECT t FROM TimetracksheetEntity t WHERE t.numhrs = :numhrs"),
    @NamedQuery(name = "TimetracksheetEntity.findByTaskperformed", query = "SELECT t FROM TimetracksheetEntity t WHERE t.taskperformed = :taskperformed")})
public class TimetracksheetEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIMETRACKSHEETID")
    private Long timetracksheetid;
    @Column(name = "LOGINID")
    private String loginid;
    @Column(name = "PROJECTCODE")
    private String projectcode;
    @Column(name = "NUMHRS")
    private String numhrs;
    @Column(name = "TASKPERFORMED")
    private String taskperformed;

    public TimetracksheetEntity() {
    }

    public TimetracksheetEntity(Long timetracksheetid) {
        this.timetracksheetid = timetracksheetid;
    }

    public Long getTimetracksheetid() {
        return timetracksheetid;
    }

    public void setTimetracksheetid(Long timetracksheetid) {
        this.timetracksheetid = timetracksheetid;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    public String getNumhrs() {
        return numhrs;
    }

    public void setNumhrs(String numhrs) {
        this.numhrs = numhrs;
    }

    public String getTaskperformed() {
        return taskperformed;
    }

    public void setTaskperformed(String taskperformed) {
        this.taskperformed = taskperformed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timetracksheetid != null ? timetracksheetid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimetracksheetEntity)) {
            return false;
        }
        TimetracksheetEntity other = (TimetracksheetEntity) object;
        if ((this.timetracksheetid == null && other.timetracksheetid != null) || (this.timetracksheetid != null && !this.timetracksheetid.equals(other.timetracksheetid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.myapp.struts.TimetracksheetEntity[timetracksheetid=" + timetracksheetid + "]";
    }

}
