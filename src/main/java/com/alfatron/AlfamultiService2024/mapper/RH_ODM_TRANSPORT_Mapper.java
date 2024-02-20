package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.TypeDeTransportDto;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_TRANSPORT;
import org.mapstruct.Mapper;

@Mapper
public interface RH_ODM_TRANSPORT_Mapper {

    TypeDeTransportDto toTypeDeTransportDto(RH_ODM_TRANSPORT typeDeTransport);

    RH_ODM_TRANSPORT toTypeDeTransport(TypeDeTransportDto typeDeTransportDto);
}
