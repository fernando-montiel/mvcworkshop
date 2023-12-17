package com.g.l.mvc.dto.response;

import com.g.l.mvc.model.Project;


import java.util.List;

public class ResponseCustomerDTO {


    private String phoneNumber;
    private String direction;
    private String cuil;
    private String dni;
    private String name;
    private String businessName;
    private List<Project> projects;

    public ResponseCustomerDTO(String phoneNumber, String direction, String cuil, String dni, String name, String businessName, List<Project> projects) {
        this.phoneNumber = phoneNumber;
        this.direction = direction;
        this.cuil = cuil;
        this.dni = dni;
        this.name = name;
        this.businessName = businessName;
        this.projects = projects;
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

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
