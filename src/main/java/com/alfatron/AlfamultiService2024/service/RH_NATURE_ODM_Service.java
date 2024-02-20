package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RH_NATURE_ODM_Mapper;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import com.alfatron.AlfamultiService2024.repository.RH_NATURE_ODM_Repository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RH_NATURE_ODM_Service {

    RH_NATURE_ODM_Repository natureMissionRepository;
    private RH_NATURE_ODM_Mapper NatureMissionmapper;

    public RH_NATURE_ODM_Service(RH_NATURE_ODM_Repository natureMissionRepository, RH_NATURE_ODM_Mapper natureMissionmapper) {
        this.natureMissionRepository = natureMissionRepository;
        NatureMissionmapper = natureMissionmapper;
    }

    public List<NatureMissionDto> findAllNatureDeMissions(){
        return natureMissionRepository.findAll().stream()
                .map(NatureMissionmapper::toNatureMissionDto)
                .collect(Collectors.toList());
    }

    public NatureMissionDto findNatureMissionById(Integer id)
    {
        if (id == null) {
            //log.error("Nature ID is null");
            return null;
        }
        return natureMissionRepository.findById(id).
               map(NatureMissionmapper::toNatureMissionDto).orElseThrow(()->
             new Custom_EntityNotFoundException("Aucune donnée trouvé avec cet identifiant : "+id, ErrorCodes.NATURE_DE_MISSION_NOT_FOUND) );
    }

    @Transactional
    public void addOrdreDeMission(RH_ODM odm){
       // ordresDeMissions.add(odm);
       // odm.setNatureMission(this);
    }

    @Transactional
    public void deleteOrdreDeMission(RH_ODM odm){
       // ordresDeMissions.remove(odm);
       // odm.setNatureMission(null);
    }

}
