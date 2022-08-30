package vip.qiao.domain;

import java.util.Date;
import java.util.List;

public class Department {
    private Integer did;

    private String dname;

    private Date duptime;

    private List<Uuser> uusers;

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