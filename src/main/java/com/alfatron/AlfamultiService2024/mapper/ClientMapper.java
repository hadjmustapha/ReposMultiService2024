package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientDto toClientDto(Client client);

    Client toClient(ClientDto clientDto);
}
