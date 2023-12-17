package com.g.l.mvc.model;


import jakarta.persistence.*;


@Entity
public class Blueprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String location;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;
    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;

    public Blueprint(){}

    public Blueprint(Integer id, String type, String location, Project project, Specialty specialty) {
        this.id = id;
        this.type = type;
        this.location = location;
        this.project = project;
        this.specialty = specialty;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Project getProject() {
        return project;
    }

    public void setProjects(Project project) {
        this.project = project;
    }

    public Specialty getspecialty() {
        return specialty;
    }

    public void setspecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
