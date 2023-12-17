package com.g.l.mvc.mapper;

import com.g.l.mvc.dto.request.RequestBlueprintDTO;
import com.g.l.mvc.dto.response.ResponseBlueprintDTO;
import com.g.l.mvc.model.Blueprint;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {BlueprintMapper.class})
@Component
public interface BlueprintMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "location", target = "location")
    })
    Blueprint requestBlueprintDtoToBlueprint(RequestBlueprintDTO blueprint);

    @Mappings({
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "location", target = "location")
    })
    ResponseBlueprintDTO blueprintToResponseBlueprintDto(Blueprint blueprint);
}