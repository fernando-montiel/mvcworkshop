package com.g.l.mvc.mapper;


import com.g.l.mvc.dto.request.RequestSpecialtyDTO;
import com.g.l.mvc.dto.response.ResponseSpecialtyDTO;
import com.g.l.mvc.model.Specialty;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {SpecialtyMapper.class})
@Component
public interface SpecialtyMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "blueprint", target = "blueprint"),
            @Mapping(source = "subcontractors", target = "subcontractors")
    })
    Specialty requestSpecialtyDtoToSpecialty(RequestSpecialtyDTO request);

    @Mappings({
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "blueprint", target = "blueprint"),
            @Mapping(source = "subcontractors", target = "subcontractors")
    })
    ResponseSpecialtyDTO specialtyToResponseSpecialtyDto(Specialty response);


}
