package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.StructureDto;
import com.alfatron.AlfamultiService2024.model.Structure;
import com.alfatron.AlfamultiService2024.repository.StructureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StructureService {

    private StructureRepository structureRepository;
/*
    public List<StructureDto> findAll(){
        return structureRepository.findAll();
    }

    public StructureDto findById(Integer id){
        return structureRepository.findById(id);
    }

 */
}
