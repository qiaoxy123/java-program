package vip.qiao.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Uuser implements Serializable {
    private Integer uid;

    private String uname;

    private Boolean ulimit;

    private Date uuptime;

    private Integer udid;

    private String password;

    private List<Meeting> meetings;

    public Uuser(String uname) {
        this.uname = uname;
    }

    public Uuser() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        return this.getUname().equals(((Uuser) obj).getUname());
    }

    @Override
    public String toString() {
        return "Uuser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", ulimit=" + ulimit +
                ", uuptime=" + uuptime +
                ", udid=" + udid +
                ", password='" + password + '\'' +
                ", meetings=" + meetings +
                '}';
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Boolean getUlimit() {
        return ulimit;
    }

    public void setUlimit(Boolean ulimit) {
        this.ulimit = ulimit;
    }

    public Date getUuptime() {
        return uuptime;
    }

    public void setUuptime(Date uuptime) {
        this.uuptime = uuptime;
    }

    public Integer getUdid() {
        return udid;
    }

    public void setUdid(Integer udid) {
        this.udid = udid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}