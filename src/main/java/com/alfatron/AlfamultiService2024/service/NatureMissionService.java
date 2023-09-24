package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.NatureMission;
import com.alfatron.AlfamultiService2024.repository.NatureMissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NatureMissionService {

    NatureMissionRepository natureMissionRepository;

    public List<NatureMission> findAll(){
        return natureMissionRepository.findAll();
    }

    public Optional<NatureMission> findNatureMissionById(int id){ return natureMissionRepository.findById(id);}

    public void deleteById(int id){
        natureMissionRepository.deleteById(id);
    }
}
