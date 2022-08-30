package org.whr.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Meeting_room implements Serializable {
    private Integer mid;

    private String mname;

    private String maddress;

    private Boolean mstate;

    private Boolean mtime1;

    private Boolean mtime2;

    private Boolean mtime3;

    private Boolean mtime4;

    private Date muptime;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Meeting_room{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", maddress='" + maddress + '\'' +
                ", mstate=" + mstate +
                ", mtime1=" + mtime1 +
                ", mtime2=" + mtime2 +
                ", mtime3=" + mtime3 +
                ", mtime4=" + mtime4 +
                ", muptime=" + muptime +
                ", uusers=" + uusers +
                '}';
    }

    public Meeting_room() {
    }

    public Meeting_room(String mname, String maddress, Boolean mstate, Boolean mtime1, Boolean mtime2, Boolean mtime3, Boolean mtime4) {
        this.mname = mname;
        this.maddress = maddress;
        this.mstate = mstate;
        this.mtime1 = mtime1;
        this.mtime2 = mtime2;
        this.mtime3 = mtime3;
        this.mtime4 = mtime4;
    }

    //多对多 的  持有对象的表现方式
    private List<Uuser> uusers;

    public List<Uuser> getUusers() {
        return uusers;
    }

    public void setUusers(List<Uuser> uusers) {
        this.uusers = uusers;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    public Boolean getMstate() {
        return mstate;
    }

    public void setMstate(Boolean mstate) {
        this.mstate = mstate;
    }

    public Boolean getMtime1() {
        return mtime1;
    }

    public void setMtime1(Boolean mtime1) {
        this.mtime1 = mtime1;
    }

    public Boolean getMtime2() {
        return mtime2;
    }

    public void setMtime2(Boolean mtime2) {
        this.mtime2 = mtime2;
    }

    public Boolean getMtime3() {
        return mtime3;
    }

    public void setMtime3(Boolean mtime3) {
        this.mtime3 = mtime3;
    }

    public Boolean getMtime4() {
        return mtime4;
    }

    public void setMtime4(Boolean mtime4) {
        this.mtime4 = mtime4;
    }

    public Date getMuptime() {
        return muptime;
    }

    public void setMuptime(Date muptime) {
        this.muptime = muptime;
    }
}