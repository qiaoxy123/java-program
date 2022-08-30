package org.whr.domain;

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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
                ", meeting_rooms=" + meeting_rooms +
                '}';
    }

    public Uuser() {
    }

    public Uuser(String uname, Boolean ulimit, String password) {
        this.uname = uname;
        this.ulimit = ulimit;
        this.password = password;
    }

    //多对多 的  持有对象的表现方式
    private List<Meeting_room> meeting_rooms;

    public List<Meeting_room> getMeeting_rooms() {
        return meeting_rooms;
    }

    public void setMeeting_rooms(List<Meeting_room> meeting_rooms) {
        this.meeting_rooms = meeting_rooms;
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