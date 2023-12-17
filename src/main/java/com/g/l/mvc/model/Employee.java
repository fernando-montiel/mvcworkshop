package com.g.l.mvc.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer dni;
    private String name;
    private String cuil;
    private Double salary;
    private String position;
    private String phoneNumber;
    private String direction;
    @ManyToMany(mappedBy = "employees")
    private List<Project> projects = new ArrayList<>();


    public Employee() {}

    public Employee(Integer id, Integer dni, String name, String cuil, Double salary, String position, String phoneNumber, String direction, List<Project> projects) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.cuil = cuil;
        this.salary = salary;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.direction = direction;
        this.projects = projects;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
