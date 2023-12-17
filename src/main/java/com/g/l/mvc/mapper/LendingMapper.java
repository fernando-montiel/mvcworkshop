package com.g.l.mvc.mapper;


import com.g.l.mvc.dto.request.RequestLendingDTO;
import com.g.l.mvc.dto.response.ResponseLendingDTO;
import com.g.l.mvc.model.Lending;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {LendingMapper.class})
@Component
public interface LendingMapper {


    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "quotaAmount", target = "quotaAmount"),
            @Mapping(source = "period", target = "period"),
            @Mapping(source = "entity", target = "entity"),
            @Mapping(source = "project", target = "project"),
    })
    Lending requestLendingDtoToLending(RequestLendingDTO request);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "quotaAmount", target = "quotaAmount"),
            @Mapping(source = "period", target = "period"),
            @Mapping(source = "entity", target = "entity"),
            @Mapping(source = "project", target = "project"),
    })
    ResponseLendingDTO lendingToResponseLendingDto(Lending response);

}
