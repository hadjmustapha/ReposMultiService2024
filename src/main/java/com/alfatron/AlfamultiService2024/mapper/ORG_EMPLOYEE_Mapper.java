package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.EmployeeDto;
import com.alfatron.AlfamultiService2024.model.RH.ORG_EMPLOYEE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {RH_POSTE_Mapper.class})
public interface ORG_EMPLOYEE_Mapper {

    @Mapping(source = "nomPrenom",target = "nomComplet")
    @Mapping(source = "matricule",target = "matricule")
    @Mapping(source = "posteEmployee",target = "posteDto")
    EmployeeDto toEmployeeDto(ORG_EMPLOYEE ORGEMPLOYEE);

    @Mapping(source = "nomComplet",target = "nomPrenom")
    @Mapping(source = "matricule",target = "matricule")
    @Mapping(source = "posteDto",target = "posteEmployee")
    ORG_EMPLOYEE toEmployee(EmployeeDto employeeDto);
}
