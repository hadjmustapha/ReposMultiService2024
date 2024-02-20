package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.model.COM.COM_CLIENT;
import org.mapstruct.Mapper;

@Mapper
public interface COM_CLIENT_Mapper {

    ClientDto toClientDto(COM_CLIENT comClient);

    COM_CLIENT toCom_Client(ClientDto clientDto);
}
