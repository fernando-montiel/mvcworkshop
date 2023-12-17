package com.g.l.mvc.mapper;


import com.g.l.mvc.dto.request.RequestProjectDTO;
import com.g.l.mvc.dto.response.ResponseProjectDTO;
import com.g.l.mvc.model.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {ProjectMapper.class})
@Component
public interface ProjectMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "direction", target = "direction"),
            @Mapping(source = "stagesNumber", target = "stagesNumber"),
            @Mapping(source = "cost", target = "cost"),
            @Mapping(source = "startDate", target = "startDate"),
            @Mapping(source = "endDate", target = "endDate"),
            @Mapping(source = "employees", target = "employees"),
            @Mapping(source = "blueprints", target = "blueprints"),
            @Mapping(source = "lendingList", target = "lendingList"),
            @Mapping(source = "customers", target = "customers"),
            @Mapping(source = "subcontractors", target = "subcontractors")
    })
    Project requestProjectDtoToProject(RequestProjectDTO request);

    @Mappings({
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "direction", target = "direction"),
            @Mapping(source = "stagesNumber", target = "stagesNumber"),
            @Mapping(source = "cost", target = "cost"),
            @Mapping(source = "startDate", target = "startDate"),
            @Mapping(source = "endDate", target = "endDate"),
            @Mapping(source = "employees", target = "employees"),
            @Mapping(source = "blueprints", target = "blueprints"),
            @Mapping(source = "lendingList", target = "lendingList"),
            @Mapping(source = "customers", target = "customers"),
            @Mapping(source = "subcontractors", target = "subcontractors")
    })
    ResponseProjectDTO projectToResponseProjectDto(Project response);

}
