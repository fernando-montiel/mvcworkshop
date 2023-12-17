package com.g.l.mvc.controller;


import com.g.l.mvc.dto.request.RequestEmployeeDTO;
import com.g.l.mvc.dto.response.ResponseEmployeeDTO;
import com.g.l.mvc.service.CRUDService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EmployeeController {

    private final CRUDService<ResponseEmployeeDTO, RequestEmployeeDTO> crud;

    public EmployeeController(CRUDService<ResponseEmployeeDTO, RequestEmployeeDTO> crud) {
        this.crud = crud;
    }

    @PostMapping("employee/create")
    public ResponseEntity<ResponseEmployeeDTO> create (@RequestBody RequestEmployeeDTO request){
        return new ResponseEntity<>(crud.create(request), HttpStatus.CREATED);
    }

}
