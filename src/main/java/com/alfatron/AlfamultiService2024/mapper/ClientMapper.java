package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    //map from entity to dto
    @Mapping(source = "raisonSociale",target = "raisonSociale")
    ClientDto toClientDto(Client client);

    //map from dto to entity
    @Mapping(source = "raisonSociale",target = "raisonSociale")
    Client toClient(ClientDto clientDto);

}
