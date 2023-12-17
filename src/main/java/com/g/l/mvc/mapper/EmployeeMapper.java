package com.g.l.mvc.mapper;


import com.g.l.mvc.dto.request.RequestEmployeeDTO;
import com.g.l.mvc.dto.response.ResponseEmployeeDTO;
import com.g.l.mvc.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = EmployeeMapper.class)
@Component
public interface EmployeeMapper {


    @Mappings({
            @Mapping(source = "dni", target = "dni"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "cuil", target = "cuil"),
            @Mapping(source = "salary", target = "salary"),
            @Mapping(source = "position", target = "position"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "direction", target = "direction"),
            @Mapping(source = "projects", target = "projects")
    })
    Employee requestEmployeeDtoToEmployee(RequestEmployeeDTO request);

    @Mappings({
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "cuil", target = "cuil"),
            @Mapping(source = "salary", target = "salary"),
            @Mapping(source = "position", target = "position"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "direction", target = "direction"),
            @Mapping(source = "projects", target = "projects")
    })
    ResponseEmployeeDTO employeeToResponseEmployeeDto(Employee response);


}
