package vip.qiao.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Department implements Serializable {
    private Integer did;
    private String dname;
    private Date duptime;
    private List<Uuser> uusers;

    public Department() {
    }

    public Department(String dname) {
        this.dname = dname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        return this.getDname().equals(((Department) obj).getDname());
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", duptime=" + duptime +
                ", uusers=" + uusers +
                '}';
    }

    public List<Uuser> getUusers() {
        return uusers;
    }

    public void setUusers(List<Uuser> uusers) {
        this.uusers = uusers;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getDuptime() {
        return duptime;
    }

    public void setDuptime(Date duptime) {
        this.duptime = duptime;
    }
}