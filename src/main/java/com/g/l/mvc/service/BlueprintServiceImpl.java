package com.g.l.mvc.service;


import com.g.l.mvc.dto.BlueprintDTO;
import com.g.l.mvc.mapper.BlueprintMapper;
import com.g.l.mvc.model.Blueprint;
import com.g.l.mvc.repository.BlueprintRepository;
import org.springframework.stereotype.Service;

@Service
public class BlueprintServiceImpl {

    private final BlueprintRepository blueprintRepository;
    private final BlueprintMapper mapper;

    public BlueprintServiceImpl(BlueprintRepository blueprintRepository, BlueprintMapper mapper) {
        this.blueprintRepository = blueprintRepository;
        this.mapper = mapper;
    }

    public BlueprintDTO create(BlueprintDTO blueprintDTO){
        Blueprint blueprint = mapper.blueprintDtoToBlueprint(blueprintDTO);
        blueprintRepository.save(blueprint);
        return mapper.blueprintToBlueprintDto(blueprint);
    }


}
