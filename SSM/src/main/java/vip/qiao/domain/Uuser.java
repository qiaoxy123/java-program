package vip.qiao.domain;

import java.util.Date;

public class Uuser {
    private Integer uid;

    private String uname;

    private Boolean ulimit;

    private Date uuptime;

    private Integer udid;

    private String password;

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