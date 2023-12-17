package com.g.l.mvc.controller;


import com.g.l.mvc.dto.request.RequestCustomerDTO;
import com.g.l.mvc.dto.response.ResponseCustomerDTO;
import com.g.l.mvc.service.CRUDService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CustomerController {

    private final CRUDService<ResponseCustomerDTO, RequestCustomerDTO> crud;

    public CustomerController(CRUDService<ResponseCustomerDTO, RequestCustomerDTO> crud) {
        this.crud = crud;
    }

    @PostMapping("/customer/create")
    public ResponseEntity<ResponseCustomerDTO> create(){
        return null;
    }
}
