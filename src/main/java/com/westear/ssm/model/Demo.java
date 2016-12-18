package com.westear.ssm.model;

import java.util.Date;

public class Demo {
    private String id;

    private String teamNameEn;

    private String teamNameZh;

    private Short teamRank;

    private Date teamCreatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTeamNameEn() {
        return teamNameEn;
    }

    public void setTeamNameEn(String teamNameEn) {
        this.teamNameEn = teamNameEn == null ? null : teamNameEn.trim();
    }

    public String getTeamNameZh() {
        return teamNameZh;
    }

    public void setTeamNameZh(String teamNameZh) {
        this.teamNameZh = teamNameZh == null ? null : teamNameZh.trim();
    }

    public Short getTeamRank() {
        return teamRank;
    }

    public void setTeamRank(Short teamRank) {
        this.teamRank = teamRank;
    }

    public Date getTeamCreatetime() {
        return teamCreatetime;
    }

    public void setTeamCreatetime(Date teamCreatetime) {
        this.teamCreatetime = teamCreatetime;
    }
}