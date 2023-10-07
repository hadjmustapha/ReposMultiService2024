package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.TypeDeTransportDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.TypeDeTransportMapper;
import com.alfatron.AlfamultiService2024.repository.TypeDeTransportRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class TypeDeTransportService {

    private TypeDeTransportRepository typeDeTransportRepository;
    private TypeDeTransportMapper typeDeTransportMapper;

    public List<TypeDeTransportDto> findAllTypeDeTransports(){
        return typeDeTransportRepository.findAll().stream()
                .map(typeDeTransportMapper::toTypeDeTransportDto)
                .collect(Collectors.toList());
    }

    public TypeDeTransportDto findTypeDeTransportById(Integer id) {
        if (id == null) {
            log.error("Type de transport ID is null");
            return null;
        }
       return typeDeTransportRepository.findById(id)
               .map(typeDeTransportMapper::toTypeDeTransportDto)
               .orElseThrow(()->new Custom_EntityNotFoundException("Impossible de trouvé un type de transport avec id : "+id, ErrorCodes.TYPE_DE_TRANSPORT_NOT_FOUND));
    }

}
