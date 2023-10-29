package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.model.Client;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ClientMapper.class,EmployeeMapper.class,NatureMissionMapper.class,
StructureMapper.class,VehiculeMapper.class,FournisseurMapper.class, TypeDeTransportMapper.class
})
public interface OrdreDeMissionMapper {

    @Mapping(source = "typeDeTransport",target = "typeDeTransportDto")
    @Mapping(source = "fournisseur",target = "fournisseurDto")
    @Mapping(source = "vehicule",target = "vehiculeDto")
    @Mapping(source = "structure",target = "structureDto")
    @Mapping(source = "natureMission",target = "natureMissionDto")
    @Mapping(source = "employee",target = "employeeDto")
    @Mapping(source = "references",target = "objetDeMission")
    @Mapping(source = "client",target = "clientDto")
    @Mapping(source = "remarques",target = "remarquesDto")
    OrdreDeMissionDto toOrdreDeMissionDto(OrdreDeMission ordreDeMission);

    @Mapping(source = "typeDeTransportDto",target = "typeDeTransport")
    @Mapping(source = "fournisseurDto",target = "fournisseur")
    @Mapping(source = "vehiculeDto",target = "vehicule")
    @Mapping(source = "structureDto",target = "structure")
    @Mapping(source = "natureMissionDto",target = "natureMission")
    @Mapping(source = "employeeDto",target = "employee")
    @Mapping(source = "objetDeMission",target = "references")
    @Mapping(source = "clientDto",target = "client")
    @Mapping(source = "remarquesDto",target = "remarques")
    OrdreDeMission toOrdreDeMission(OrdreDeMissionDto ordreDeMissionDto);


}
