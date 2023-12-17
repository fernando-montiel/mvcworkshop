package com.g.l.mvc.service.impl;

import com.g.l.mvc.dto.request.RequestCustomerDTO;
import com.g.l.mvc.dto.response.ResponseCustomerDTO;
import com.g.l.mvc.mapper.CustomerMapper;
import com.g.l.mvc.model.Customer;
import com.g.l.mvc.repository.CustomerRepository;
import com.g.l.mvc.service.CRUDService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CRUDService<ResponseCustomerDTO, RequestCustomerDTO> {

    private final CustomerRepository repository;

    private final CustomerMapper mapper;

    public CustomerServiceImpl(CustomerRepository repository, CustomerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ResponseCustomerDTO create(RequestCustomerDTO object) {
        Customer customer = mapper.requestCustomerDtoToCustomer(object);
        repository.save(customer);
        return mapper.customerToResponseCustomerDto(customer);
    }
}
