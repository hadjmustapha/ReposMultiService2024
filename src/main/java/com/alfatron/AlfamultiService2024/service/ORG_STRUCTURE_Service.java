package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.StructureDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.ORG_STRUCTURE_Mapper;
import com.alfatron.AlfamultiService2024.repository.ORG_STRUCTURE_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ORG_STRUCTURE_Service {

    private ORG_STRUCTURE_Repository structureRepository;
    private ORG_STRUCTURE_Mapper structureMapper;

    public ORG_STRUCTURE_Service(ORG_STRUCTURE_Repository structureRepository, ORG_STRUCTURE_Mapper structureMapper) {
        this.structureRepository = structureRepository;
        this.structureMapper = structureMapper;
    }

    public List<StructureDto> findAllStructures(){
        return structureRepository.findAll().stream().map(structureMapper::toStructureDto).collect(Collectors.toList());
    }

    public StructureDto findStructureById(Integer id){
        if (id == null) {
            return null;
        }
        return structureRepository.findById(id).
                map(structureMapper::toStructureDto).
                orElseThrow(()-> new Custom_EntityNotFoundException("Impossible de trouvé un structure avec id : "+id, ErrorCodes.STRUCTURE_NOT_FOUND));
    }

    /*
   @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setStructure(this);
    }

    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setStructure(null);
        ordresDeMissions.remove(odm);
    }
     */


}
