package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {

    @Mapping(source = "nomPrenom",target = "nomComplet")
    EmployeeDto toEmployeeDto(Employee employee);

    @Mapping(source = "nomComplet",target = "nomPrenom")
    Employee toEmployee(EmployeeDto employeeDto);
}
