package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.TypeDeTransportDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RH_ODM_TRANSPORT_Mapper;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import com.alfatron.AlfamultiService2024.repository.RH_ODM_TRANSPORT_Repository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RH_ODM_TRANSPORT_Service {

    private RH_ODM_TRANSPORT_Repository typeDeTransportRepository;
    private RH_ODM_TRANSPORT_Mapper typeDeTransportMapper;

    public RH_ODM_TRANSPORT_Service(RH_ODM_TRANSPORT_Repository typeDeTransportRepository, RH_ODM_TRANSPORT_Mapper typeDeTransportMapper) {
        this.typeDeTransportRepository = typeDeTransportRepository;
        this.typeDeTransportMapper = typeDeTransportMapper;
    }

    public List<TypeDeTransportDto> findAllTypeDeTransports(){
        return typeDeTransportRepository.findAll().stream()
                .map(typeDeTransportMapper::toTypeDeTransportDto)
                .collect(Collectors.toList());
    }

    public TypeDeTransportDto findTypeDeTransportById(Integer id) {
        if (id == null) {
            //log.error("Type de transport ID is null");
            return null;
        }
       return typeDeTransportRepository.findById(id)
               .map(typeDeTransportMapper::toTypeDeTransportDto)
               .orElseThrow(()->new Custom_EntityNotFoundException("Impossible de trouvé un type de transport avec id : "+id, ErrorCodes.TYPE_DE_TRANSPORT_NOT_FOUND));
    }

    @Transactional
    public void addOrdreDeMission(RH_ODM odm){
        //ordresDeMissions.add(odm);
        //odm.setTypeDeTransport(this);
    }

    @Transactional
    public void deleteOrdreDeMission(RH_ODM odm){
       // odm.setTypeDeTransport(null);
       // ordresDeMissions.remove(odm);
    }
}
