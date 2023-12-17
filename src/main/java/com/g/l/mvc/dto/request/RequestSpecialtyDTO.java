package com.g.l.mvc.dto.request;

import com.g.l.mvc.model.Blueprint;
import com.g.l.mvc.model.Subcontractor;


import java.util.ArrayList;
import java.util.List;

public class RequestSpecialtyDTO {

    private String id;
    private String type;
    private String name;
    private List<Blueprint> blueprint = new ArrayList<>();
    private List<Subcontractor> subcontractors = new ArrayList<>();

    public RequestSpecialtyDTO(String id, String type, String name, List<Blueprint> blueprint, List<Subcontractor> subcontractors) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.blueprint = blueprint;
        this.subcontractors = subcontractors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blueprint> getBlueprint() {
        return blueprint;
    }

    public void setBlueprint(List<Blueprint> blueprint) {
        this.blueprint = blueprint;
    }

    public List<Subcontractor> getSubcontractors() {
        return subcontractors;
    }

    public void setSubcontractors(List<Subcontractor> subcontractors) {
        this.subcontractors = subcontractors;
    }
}
