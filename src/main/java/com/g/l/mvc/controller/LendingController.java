package com.g.l.mvc.controller;


import com.g.l.mvc.dto.request.RequestBlueprintDTO;
import com.g.l.mvc.dto.request.RequestLendingDTO;
import com.g.l.mvc.dto.response.ResponseBlueprintDTO;
import com.g.l.mvc.dto.response.ResponseLendingDTO;
import com.g.l.mvc.service.CRUDService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class LendingController {

    private final CRUDService<ResponseLendingDTO, RequestLendingDTO> crud;

    public LendingController(CRUDService<ResponseLendingDTO, RequestLendingDTO> crud) {
        this.crud = crud;
    }

    @PostMapping("/project/create")
    public ResponseEntity<ResponseLendingDTO> create(@RequestBody RequestLendingDTO request){
        return new ResponseEntity<>(crud.create(request),HttpStatus.CREATED);
    }
}
