package com.g.l.mvc.dto.response;

public class ResponseBlueprintDTO {

    private String type;
    private String location;

    public ResponseBlueprintDTO(String type, String location) {
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
