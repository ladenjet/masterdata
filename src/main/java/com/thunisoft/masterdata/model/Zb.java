package com.thunisoft.masterdata.model;

import java.util.Date;

public class Zb {
    private String cId;

    private String cJbfy;

    private String cCbts;

    private String cWd;

    private String cZbfl;

    private String cZbnr;

    private Integer nZbs;

    private Date dtUpdate;

    private Short nPxh;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcJbfy() {
        return cJbfy;
    }

    public void setcJbfy(String cJbfy) {
        this.cJbfy = cJbfy == null ? null : cJbfy.trim();
    }

    public String getcCbts() {
        return cCbts;
    }

    public void setcCbts(String cCbts) {
        this.cCbts = cCbts == null ? null : cCbts.trim();
    }

    public String getcWd() {
        return cWd;
    }

    public void setcWd(String cWd) {
        this.cWd = cWd == null ? null : cWd.trim();
    }

    public String getcZbfl() {
        return cZbfl;
    }

    public void setcZbfl(String cZbfl) {
        this.cZbfl = cZbfl == null ? null : cZbfl.trim();
    }

    public String getcZbnr() {
        return cZbnr;
    }

    public void setcZbnr(String cZbnr) {
        this.cZbnr = cZbnr == null ? null : cZbnr.trim();
    }

    public Integer getnZbs() {
        return nZbs;
    }

    public void setnZbs(Integer nZbs) {
        this.nZbs = nZbs;
    }

    public Date getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(Date dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public Short getnPxh() {
        return nPxh;
    }

    public void setnPxh(Short nPxh) {
        this.nPxh = nPxh;
    }
}