package com.g.l.mvc.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String type;
    private String direction;
    private Integer stagesNumber;
    private Double cost;
    private Date startDate;
    private Date endDate;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "project_employee",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private List<Employee> employees = new ArrayList<>();
    @OneToMany(mappedBy = "project",cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Blueprint> blueprints = new ArrayList<>();

    @OneToMany(mappedBy = "project", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Lending> lendingList = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "project_customer",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id")
    )
    private List<Customer> customers = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "project_subcontractor",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "subcontractor_id", referencedColumnName = "id")
    )
    private List<Subcontractor> subcontractors = new ArrayList<>();

    public Project(Integer id, String type, String direction, Integer stagesNumber, Double cost, Date startDate, Date endDate, List<Employee> employees, List<Blueprint> blueprints, List<Lending> lendingList, List<Customer> customers) {
        this.id = id;
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
    }

    public Project() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Blueprint> getBlueprint() {
        return blueprints;
    }

    public void setBlueprint(List<Blueprint> blueprints) {
        this.blueprints = blueprints;
    }

    public List<Lending> getLending() {
        return lendingList;
    }

    public void setLending(List<Lending> lendingList) {
        this.lendingList = lendingList;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
