package vip.qiao.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Meeting implements Serializable {
    private Integer mid;

    private String mname;

    private String maddress;

    private Boolean mstate;

    private Boolean time1;

    private Boolean time2;

    private Boolean time3;

    private Boolean time4;

    private Date muotime;

    private List<Uuser> uusers;

    public Meeting() {
    }

    public Meeting(String mname) {
        this.mname = mname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        return this.getMname().equals(((Meeting) obj).getMname());
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", maddress='" + maddress + '\'' +
                ", mstate=" + mstate +
                ", time1=" + time1 +
                ", time2=" + time2 +
                ", time3=" + time3 +
                ", time4=" + time4 +
                ", muotime=" + muotime +
                ", uusers=" + uusers +
                '}';
    }

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

    public Boolean getTime1() {
        return time1;
    }

    public void setTime1(Boolean time1) {
        this.time1 = time1;
    }

    public Boolean getTime2() {
        return time2;
    }

    public void setTime2(Boolean time2) {
        this.time2 = time2;
    }

    public Boolean getTime3() {
        return time3;
    }

    public void setTime3(Boolean time3) {
        this.time3 = time3;
    }

    public Boolean getTime4() {
        return time4;
    }

    public void setTime4(Boolean time4) {
        this.time4 = time4;
    }

    public Date getMuotime() {
        return muotime;
    }

    public void setMuotime(Date muotime) {
        this.muotime = muotime;
    }
}