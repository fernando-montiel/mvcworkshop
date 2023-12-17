package com.g.l.mvc.mapper;


import com.g.l.mvc.dto.BlueprintDTO;
import com.g.l.mvc.model.Blueprint;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BlueprintMapper {

    BlueprintDTO blueprintToBlueprintDto(Blueprint blueprint);
    Blueprint blueprintDtoToBlueprint(BlueprintDTO blueprintDTO);
}
