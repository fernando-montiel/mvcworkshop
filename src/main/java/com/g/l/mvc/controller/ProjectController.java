package com.g.l.mvc.controller;


import com.g.l.mvc.dto.request.RequestProjectDTO;
import com.g.l.mvc.dto.response.ResponseProjectDTO;
import com.g.l.mvc.service.CRUDService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ProjectController {

    private final CRUDService<ResponseProjectDTO, RequestProjectDTO> crud;

    public ProjectController(CRUDService<ResponseProjectDTO, RequestProjectDTO> crud) {
        this.crud = crud;
    }

    @PostMapping("project/create")
    public ResponseEntity<ResponseProjectDTO> create(@RequestBody RequestProjectDTO request){
        return new ResponseEntity<>(crud.create(request), HttpStatus.CREATED);
    }
}
