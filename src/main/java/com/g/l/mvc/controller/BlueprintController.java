package com.g.l.mvc.controller;


import com.g.l.mvc.dto.request.RequestBlueprintDTO;
import com.g.l.mvc.dto.response.ResponseBlueprintDTO;
import com.g.l.mvc.service.impl.BlueprintServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class BlueprintController {

    private final BlueprintServiceImpl service;


    public BlueprintController(BlueprintServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/blueprint/create")
    public ResponseEntity<ResponseBlueprintDTO> create(@RequestBody RequestBlueprintDTO blueprintDTO){
        return new ResponseEntity<>(service.create(blueprintDTO), HttpStatus.CREATED);
    }
}
