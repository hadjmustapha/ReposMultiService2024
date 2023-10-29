package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {PosteMapper.class})
public interface EmployeeMapper {

    @Mapping(source = "nomPrenom",target = "nomComplet")
    @Mapping(source = "matricule",target = "matricule")
    @Mapping(source = "posteEmployee",target = "posteDto")
    EmployeeDto toEmployeeDto(Employee employee);

    @Mapping(source = "nomComplet",target = "nomPrenom")
    @Mapping(source = "matricule",target = "matricule")
    @Mapping(source = "posteDto",target = "posteEmployee")
    Employee toEmployee(EmployeeDto employeeDto);
}
