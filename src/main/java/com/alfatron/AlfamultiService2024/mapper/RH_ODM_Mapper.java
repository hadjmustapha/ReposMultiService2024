package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {COM_CLIENT_Mapper.class, ORG_EMPLOYEE_Mapper.class,RH_NATURE_ODM_Mapper.class, /* RH_NATURE_CUSTOM_MAPPER.class, */
ORG_STRUCTURE_Mapper.class, MG_INSTALLATIONS_Mapper.class, ACH_FOURNISSEUR_Mapper.class, RH_ODM_TRANSPORT_Mapper.class
})
public interface RH_ODM_Mapper {

    @Mapping(source = "typeDeTransport",target = "typeDeTransportDto")
    @Mapping(source = "fournisseur",target = "fournisseurDto")
    @Mapping(source = "vehicule",target = "vehiculeDto")
    @Mapping(source = "structure",target = "structureDto")
    @Mapping(source = "natureMission",target = "natureMissionDto")
    //@Mapping(source = "natureMission",target = "natureDto")
    @Mapping(source = "employee",target = "employeeDto")
    @Mapping(source = "references",target = "objetDeMission")
    @Mapping(source = "client",target = "clientDto")
    @Mapping(source = "remarques",target = "remarquesDto")
    OrdreDeMissionDto toOrdreDeMissionDto(RH_ODM ordreDeMission);

    @Mapping(source = "typeDeTransportDto",target = "typeDeTransport")
    @Mapping(source = "fournisseurDto",target = "fournisseur")
    @Mapping(source = "vehiculeDto",target = "vehicule")
    @Mapping(source = "structureDto",target = "structure")
    @Mapping(source = "natureMissionDto",target = "natureMission")
    //@Mapping(source = "natureDto",target = "natureMission")
    @Mapping(source = "employeeDto",target = "employee")
    @Mapping(source = "objetDeMission",target = "references")
    @Mapping(source = "clientDto",target = "client")
    @Mapping(source = "remarquesDto",target = "remarques")
    RH_ODM toOrdreDeMission(OrdreDeMissionDto ordreDeMissionDto);

}
