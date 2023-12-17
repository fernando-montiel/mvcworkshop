package com.g.l.mvc.mapper;


import com.g.l.mvc.dto.request.RequestSubcontractorDTO;
import com.g.l.mvc.dto.response.ResponseSubcontractorDTO;
import com.g.l.mvc.model.Subcontractor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {SubcontractorMapper.class})
@Component
public interface SubcontractorMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "dni", target = "dni"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "businessName", target = "businessName"),
            @Mapping(source = "projects", target = "projects"),
            @Mapping(source = "cuil", target = "cuil"),
            @Mapping(source = "specialties", target = "specialties"),
    })
    Subcontractor requestSubcontractorDtoToSubcontractor(RequestSubcontractorDTO request);

    @Mappings({
            @Mapping(source = "dni", target = "dni"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "businessName", target = "businessName"),
            @Mapping(source = "projects", target = "projects"),
            @Mapping(source = "cuil", target = "cuil"),
            @Mapping(source = "specialties", target = "specialties"),
    })
    ResponseSubcontractorDTO subcontractorToResponseSubcontractorDto(Subcontractor response);


}
