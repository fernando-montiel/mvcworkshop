package com.g.l.mvc.service.impl;


import com.g.l.mvc.dto.request.RequestSpecialtyDTO;
import com.g.l.mvc.dto.response.ResponseSpecialtyDTO;
import com.g.l.mvc.mapper.SpecialtyMapper;
import com.g.l.mvc.model.Specialty;
import com.g.l.mvc.repository.SpecialtyRepository;
import com.g.l.mvc.service.CRUDService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyServiceImpl implements CRUDService<ResponseSpecialtyDTO, RequestSpecialtyDTO> {

    private final SpecialtyRepository repository;

    private final SpecialtyMapper mapper;

    public SpecialtyServiceImpl(SpecialtyRepository repository, SpecialtyMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ResponseSpecialtyDTO create(RequestSpecialtyDTO object) {
        Specialty specialty = mapper.requestSpecialtyDtoToSpecialty(object);
        repository.save(specialty);
        return mapper.specialtyToResponseSpecialtyDto(specialty);
    }
}
