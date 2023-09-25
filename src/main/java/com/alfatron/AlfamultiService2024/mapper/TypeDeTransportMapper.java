package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.TypeDeTransportDto;
import com.alfatron.AlfamultiService2024.model.TypeDeTransport;
import org.mapstruct.Mapper;

@Mapper
public interface TypeDeTransportMapper {

    TypeDeTransportDto toTypeDeTransportDto(TypeDeTransport typeDeTransport);

    TypeDeTransport toTypeDeTransport(TypeDeTransportDto typeDeTransportDto);
}
