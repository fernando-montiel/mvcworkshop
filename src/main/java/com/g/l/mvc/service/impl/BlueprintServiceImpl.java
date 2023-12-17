package com.g.l.mvc.service.impl;

import com.g.l.mvc.dto.request.RequestBlueprintDTO;
import com.g.l.mvc.dto.response.ResponseBlueprintDTO;
import com.g.l.mvc.mapper.BlueprintMapper;
import com.g.l.mvc.model.Blueprint;
import com.g.l.mvc.repository.BlueprintRepository;
import com.g.l.mvc.service.CRUDService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BlueprintServiceImpl implements CRUDService<ResponseBlueprintDTO, RequestBlueprintDTO> {

    private final BlueprintRepository repository;

    private final BlueprintMapper mapper;

    public BlueprintServiceImpl(BlueprintRepository blueprintRepository, @Qualifier("blueprintMapperImpl") BlueprintMapper mapper) {
        this.repository = blueprintRepository;
        this.mapper = mapper;
    }

    @Override
    public ResponseBlueprintDTO create(RequestBlueprintDTO object) {
        Blueprint blueprint = mapper.requestBlueprintDtoToBlueprint(object);
        repository.save(blueprint);
        return mapper.blueprintToResponseBlueprintDto(blueprint);
    }
}
