package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.VehiculeDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.VehiculeMapper;
import com.alfatron.AlfamultiService2024.repository.VehiculeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class VehiculeService {

    private VehiculeRepository vehiculeRepository;
    private VehiculeMapper vehiculeMapper;

    public List<VehiculeDto> findAllVehicules(){
        return vehiculeRepository.findAll().
                stream().map(vehiculeMapper::toVehiculeDto).collect(Collectors.toList());
    }

    public VehiculeDto findVehiculeById(Integer id) {
        if (id == null) {
            log.error("Vehicule ID is null");
            return null;
        }
        return vehiculeRepository.findById(id)
                .map(vehiculeMapper::toVehiculeDto)
                .orElseThrow(()->new Custom_EntityNotFoundException("Impossible de trouvé un vehicule avec id : "+id, ErrorCodes.VEHICULE_NOT_FOUND));
    }

}
