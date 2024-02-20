package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.VehiculeDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.MG_INSTALLATIONS_Mapper;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import com.alfatron.AlfamultiService2024.repository.MG_INSTALLATIONS_Repository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MG_INSTALLATIONS_Service {

    private MG_INSTALLATIONS_Repository vehiculeRepository;
    private MG_INSTALLATIONS_Mapper vehiculeMapper;

    public MG_INSTALLATIONS_Service(MG_INSTALLATIONS_Repository vehiculeRepository, MG_INSTALLATIONS_Mapper vehiculeMapper) {
        this.vehiculeRepository = vehiculeRepository;
        this.vehiculeMapper = vehiculeMapper;
    }

    public List<VehiculeDto> findAllVehicules(){
        return vehiculeRepository.findAll().
                stream().map(vehiculeMapper::toVehiculeDto).collect(Collectors.toList());
    }

    public VehiculeDto findVehiculeById(Integer id) {
        if (id == null) {
            //log.error("Vehicule ID is null");
            return null;
        }
        return vehiculeRepository.findById(id)
                .map(vehiculeMapper::toVehiculeDto)
                .orElseThrow(()->new Custom_EntityNotFoundException("Impossible de trouvé un vehicule avec id : "+id, ErrorCodes.VEHICULE_NOT_FOUND));
    }

    @Transactional
    public void addOrdreDeMission(RH_ODM odm){
      //  ordresDeMissions.add(odm);
       // odm.setVehicule(this);
    }
    @Transactional
    public void deleteOrdreDeMission(RH_ODM odm){
        //odm.setVehicule(null);
        //ordresDeMissions.remove(odm);
    }
}
