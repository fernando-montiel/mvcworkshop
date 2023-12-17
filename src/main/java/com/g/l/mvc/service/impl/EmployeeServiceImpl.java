package com.g.l.mvc.service.impl;

import com.g.l.mvc.dto.request.RequestEmployeeDTO;
import com.g.l.mvc.dto.response.ResponseEmployeeDTO;
import com.g.l.mvc.mapper.EmployeeMapper;
import com.g.l.mvc.model.Employee;
import com.g.l.mvc.repository.EmployeeRepository;
import com.g.l.mvc.service.CRUDService;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements CRUDService<ResponseEmployeeDTO, RequestEmployeeDTO> {

    private final EmployeeRepository repository;

    private final EmployeeMapper mapper;

    public EmployeeServiceImpl(EmployeeRepository repository, EmployeeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public ResponseEmployeeDTO create(RequestEmployeeDTO object) {
        Employee employee = mapper.requestEmployeeDtoToEmployee(object);
        repository.save(employee);
        return mapper.employeeToResponseEmployeeDto(employee);
    }
}
