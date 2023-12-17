package com.g.l.mvc.dto.response;

import com.g.l.mvc.model.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResponseProjectDTO {

    private String type;
    private String direction;
    private Integer stagesNumber;
    private Double cost;
    private Date startDate;
    private Date endDate;
    private List<Employee> employees = new ArrayList<>();
    private List<Blueprint> blueprints = new ArrayList<>();
    private List<Lending> lendingList = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Subcontractor> subcontractors = new ArrayList<>();

    public ResponseProjectDTO(String type, String direction, Integer stagesNumber, Double cost, Date startDate, Date endDate, List<Employee> employees, List<Blueprint> blueprints, List<Lending> lendingList, List<Customer> customers, List<Subcontractor> subcontractors) {
        this.type = type;
        this.direction = direction;
        this.stagesNumber = stagesNumber;
        this.cost = cost;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employees = employees;
        this.blueprints = blueprints;
        this.lendingList = lendingList;
        this.customers = customers;
        this.subcontractors = subcontractors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getStagesNumber() {
        return stagesNumber;
    }

    public void setStagesNumber(Integer stagesNumber) {
        this.stagesNumber = stagesNumber;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Blueprint> getBlueprints() {
        return blueprints;
    }

    public void setBlueprints(List<Blueprint> blueprints) {
        this.blueprints = blueprints;
    }

    public List<Lending> getLendingList() {
        return lendingList;
    }

    public void setLendingList(List<Lending> lendingList) {
        this.lendingList = lendingList;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Subcontractor> getSubcontractors() {
        return subcontractors;
    }

    public void setSubcontractors(List<Subcontractor> subcontractors) {
        this.subcontractors = subcontractors;
    }
}
