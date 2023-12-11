package com.g.l.mvc.controller;


import com.g.l.mvc.dto.BlueprintDTO;
import com.g.l.mvc.service.BlueprintServiceImpl;
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
    public ResponseEntity<BlueprintDTO> create(@RequestBody BlueprintDTO blueprintDTO){
        return new ResponseEntity<>(service.create(blueprintDTO), HttpStatus.CREATED);
    }
}
