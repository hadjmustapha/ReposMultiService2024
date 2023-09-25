package com.alfatron.AlfamultiService2024.controller.service;

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

    public List<Structure> findAll(){
        return structureRepository.findAll();
    }

    public Optional<Structure> findById(int id){
        return structureRepository.findById(id);
    }
}
