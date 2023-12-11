package com.g.l.mvc.dto;

public class BlueprintDTO {

    private String type;
    private String location;

    public BlueprintDTO(){}

    public BlueprintDTO(String type, String location) {
        this.type = type;
        this.location = location;
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
}
