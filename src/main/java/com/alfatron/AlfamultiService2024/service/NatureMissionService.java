package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.NatureMissionMapper;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.repository.NatureMissionRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NatureMissionService {

    NatureMissionRepository natureMissionRepository;
    private NatureMissionMapper NatureMissionmapper;

    public NatureMissionService(NatureMissionRepository natureMissionRepository, NatureMissionMapper natureMissionmapper) {
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
    public void addOrdreDeMission(OrdreDeMission odm){
       // ordresDeMissions.add(odm);
       // odm.setNatureMission(this);
    }

    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
       // ordresDeMissions.remove(odm);
       // odm.setNatureMission(null);
    }

}
