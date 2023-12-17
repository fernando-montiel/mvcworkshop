package com.g.l.mvc.service.impl;


import com.g.l.mvc.dto.request.RequestLendingDTO;
import com.g.l.mvc.dto.response.ResponseLendingDTO;
import com.g.l.mvc.mapper.LendingMapper;
import com.g.l.mvc.model.Lending;
import com.g.l.mvc.repository.LendingRepository;
import com.g.l.mvc.service.CRUDService;
import org.springframework.stereotype.Service;

@Service
public class LendingServiceImpl implements CRUDService<ResponseLendingDTO, RequestLendingDTO> {

    private final LendingRepository repository;

    private final LendingMapper mapper;

    public LendingServiceImpl(LendingRepository repository, LendingMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ResponseLendingDTO create(RequestLendingDTO object) {
        Lending leding = mapper.requestLendingDtoToLending(object);
        repository.save(leding);
        return mapper.lendingToResponseLendingDto(leding);
    }
}
