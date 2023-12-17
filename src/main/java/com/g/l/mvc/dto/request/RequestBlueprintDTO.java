package com.g.l.mvc.dto.request;

public class RequestBlueprintDTO {

    private Integer id;
    private String type;
    private String location;

    public RequestBlueprintDTO(){}

    public RequestBlueprintDTO(Integer id, String type, String location) {
        this.id = id;
        this.type = type;
        this.location = location;

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
}
