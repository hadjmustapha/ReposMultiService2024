package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.TypeDeTransportDto;
import com.alfatron.AlfamultiService2024.model.RH_ODM_TRANSPORT;
import org.mapstruct.Mapper;

@Mapper
public interface TypeDeTransportMapper {

    TypeDeTransportDto toTypeDeTransportDto(RH_ODM_TRANSPORT typeDeTransport);

    RH_ODM_TRANSPORT toTypeDeTransport(TypeDeTransportDto typeDeTransportDto);
}
