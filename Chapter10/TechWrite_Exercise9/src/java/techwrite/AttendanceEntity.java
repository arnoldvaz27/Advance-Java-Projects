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
@Table(name = "ATTENDANCE")
@NamedQueries({
    @NamedQuery(name = "AttendanceEntity.findAll", query = "SELECT a FROM AttendanceEntity a"),
    @NamedQuery(name = "AttendanceEntity.findByAttendanceid", query = "SELECT a FROM AttendanceEntity a WHERE a.attendanceid = :attendanceid"),
    @NamedQuery(name = "AttendanceEntity.findByLoginid", query = "SELECT a FROM AttendanceEntity a WHERE a.loginid = :loginid"),
    @NamedQuery(name = "AttendanceEntity.findByDate", query = "SELECT a FROM AttendanceEntity a WHERE a.date = :date"),
    @NamedQuery(name = "AttendanceEntity.findByStatus", query = "SELECT a FROM AttendanceEntity a WHERE a.status = :status")})
public class AttendanceEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ATTENDANCEID")
    private Long attendanceid;
    @Column(name = "LOGINID")
    private String loginid;
    @Column(name = "DATE")
    private String date;
    @Column(name = "STATUS")
    private String status;

    public AttendanceEntity() {
    }

    public AttendanceEntity(Long attendanceid) {
        this.attendanceid = attendanceid;
    }

    public Long getAttendanceid() {
        return attendanceid;
    }

    public void setAttendanceid(Long attendanceid) {
        this.attendanceid = attendanceid;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (attendanceid != null ? attendanceid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AttendanceEntity)) {
            return false;
        }
        AttendanceEntity other = (AttendanceEntity) object;
        if ((this.attendanceid == null && other.attendanceid != null) || (this.attendanceid != null && !this.attendanceid.equals(other.attendanceid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.myapp.struts.AttendanceEntity[attendanceid=" + attendanceid + "]";
    }

}
