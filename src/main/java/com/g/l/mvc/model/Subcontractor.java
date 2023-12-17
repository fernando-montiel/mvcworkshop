package com.g.l.mvc.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Subcontractor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String dni;
    private String name;
    private String businessName;
    private String cuil;
    @ManyToMany
    private List<Project> projects = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "subcontractor_specialty",
            joinColumns = @JoinColumn(name = "subcontractor_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id")
    )
    private List<Specialty> specialties = new ArrayList<>();

    public Subcontractor(){}

    public Subcontractor(Integer id, String dni, String name, String businessName, String cuil, List<Project> projects, List<Specialty> specialties) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.businessName = businessName;
        this.cuil = cuil;
        this.projects = projects;
        this.specialties = specialties;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Specialty> getspecialties() {
        return specialties;
    }

    public void setspecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }
}
