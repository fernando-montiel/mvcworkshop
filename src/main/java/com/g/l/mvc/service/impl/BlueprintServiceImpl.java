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
public class BlueprintServiceImpl implements CRUDService {

    private final BlueprintRepository blueprintRepository;

    private final BlueprintMapper mapper;

    public BlueprintServiceImpl(BlueprintRepository blueprintRepository, @Qualifier("blueprintMapperImpl") BlueprintMapper mapper) {
        this.blueprintRepository = blueprintRepository;
        this.mapper = mapper;
    }

    public ResponseBlueprintDTO create(RequestBlueprintDTO requestBlueprintDTO){
        Blueprint blueprint = mapper.requestBlueprintDtoToBlueprint(requestBlueprintDTO);
        blueprintRepository.save(blueprint);
        return mapper.blueprintToResponseBlueprintDto(blueprint);
    }
}
