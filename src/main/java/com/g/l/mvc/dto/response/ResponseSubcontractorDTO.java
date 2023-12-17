package com.g.l.mvc.dto.response;

import com.g.l.mvc.model.Project;
import com.g.l.mvc.model.Specialty;


import java.util.ArrayList;
import java.util.List;

public class ResponseSubcontractorDTO {


    private String dni;
    private String name;
    private String businessName;
    private String cuil;
    private List<Project> projects = new ArrayList<>();
    private List<Specialty> specialties = new ArrayList<>();

    public ResponseSubcontractorDTO(String dni, String name, String businessName, String cuil, List<Project> projects, List<Specialty> specialties) {
        this.dni = dni;
        this.name = name;
        this.businessName = businessName;
        this.cuil = cuil;
        this.projects = projects;
        this.specialties = specialties;
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

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }
}
