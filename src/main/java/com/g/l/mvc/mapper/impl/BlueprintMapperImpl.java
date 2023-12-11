package com.g.l.mvc.mapper.impl;

import com.g.l.mvc.dto.BlueprintDTO;
import com.g.l.mvc.mapper.BlueprintMapper;
import com.g.l.mvc.model.Blueprint;
import org.springframework.stereotype.Service;

@Service
public class BlueprintMapperImpl implements BlueprintMapper {
    @Override
    public BlueprintDTO blueprintToBlueprintDto(Blueprint blueprint) {
        if ( blueprint == null ) {
            return null;
        }
        BlueprintDTO blueprintDTO = new BlueprintDTO();
        blueprintDTO.setLocation(blueprint.getType());
        blueprintDTO.setType(blueprint.getType());
        return blueprintDTO;
    }

    @Override
    public Blueprint blueprintDtoToBlueprint(BlueprintDTO blueprintDTO) {
        if ( blueprintDTO == null ) {
            return null;
        }
        Blueprint blueprint = new Blueprint();
        blueprint.setLocation(blueprintDTO.getLocation());
        blueprint.setType(blueprintDTO.getType());
        return blueprint;
    }
}
