package com.g.l.mvc.dto.request;

import com.g.l.mvc.model.Project;


import java.util.Date;

public class RequestLendingDTO {

    private Integer id;
    private Double quotaAmount;
    private Date period;
    private String entity;
    private Project project;

    public RequestLendingDTO(Integer id, Double quotaAmount, Date period, String entity, Project project) {
        this.id = id;
        this.quotaAmount = quotaAmount;
        this.period = period;
        this.entity = entity;
        this.project = project;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getQuotaAmount() {
        return quotaAmount;
    }

    public void setQuotaAmount(Double quotaAmount) {
        this.quotaAmount = quotaAmount;
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
