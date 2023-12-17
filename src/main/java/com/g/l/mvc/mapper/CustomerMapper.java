package com.g.l.mvc.mapper;


import com.g.l.mvc.dto.request.RequestBlueprintDTO;
import com.g.l.mvc.dto.response.ResponseCustomerDTO;
import com.g.l.mvc.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {CustomerMapper.class})
@Component
public interface CustomerMapper {


    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "direction", target = "direction"),
            @Mapping(source = "cuil", target = "cuil"),
            @Mapping(source = "dni", target = "dni"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "businessNmae", target = "businessName"),
            @Mapping(source = "projects", target = "projects")
    })
    Customer requestCustomerDtoToCustomer(RequestBlueprintDTO request);

    @Mappings({
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "direction", target = "direction"),
            @Mapping(source = "cuil", target = "cuil"),
            @Mapping(source = "dni", target = "dni"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "businessNmae", target = "businessName"),
            @Mapping(source = "projects", target = "projects")
    })
    ResponseCustomerDTO requestCustomerDtoToCustomer(Customer response);



}
