package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.StructureDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.StructureMapper;
import com.alfatron.AlfamultiService2024.repository.StructureRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class StructureService {

    private StructureRepository structureRepository;
    private StructureMapper structureMapper;

    public List<StructureDto> findAllStructures(){
        return structureRepository.findAll().stream().map(structureMapper::toStructureDto).collect(Collectors.toList());
    }

    public StructureDto findStructureById(Integer id){
        if (id == null) {
            log.error("Structure ID is null");
            return null;
        }
        return structureRepository.findById(id).
                map(structureMapper::toStructureDto).
                orElseThrow(()-> new Custom_EntityNotFoundException("Impossible de trouvé un structure avec id : "+id, ErrorCodes.STRUCTURE_NOT_FOUND));
    }


}
