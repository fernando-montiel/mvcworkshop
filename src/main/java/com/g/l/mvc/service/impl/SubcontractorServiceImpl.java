package com.g.l.mvc.service.impl;


import com.g.l.mvc.dto.request.RequestProjectDTO;
import com.g.l.mvc.dto.request.RequestSubcontractorDTO;
import com.g.l.mvc.dto.response.ResponseProjectDTO;
import com.g.l.mvc.dto.response.ResponseSubcontractorDTO;
import com.g.l.mvc.mapper.SubcontractorMapper;
import com.g.l.mvc.model.Subcontractor;
import com.g.l.mvc.repository.SubcontractorRepository;
import com.g.l.mvc.service.CRUDService;
import org.springframework.stereotype.Service;

@Service
public class SubcontractorServiceImpl implements CRUDService<ResponseSubcontractorDTO, RequestSubcontractorDTO> {

    private final SubcontractorRepository repository;

    private final SubcontractorMapper mapper;

    public SubcontractorServiceImpl(SubcontractorRepository repository, SubcontractorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ResponseSubcontractorDTO create(RequestSubcontractorDTO object) {
        Subcontractor subcontractor = mapper.requestSubcontractorDtoToSubcontractor(object);
        repository.save(subcontractor);
        return mapper.subcontractorToResponseSubcontractorDto(subcontractor);
    }
}
