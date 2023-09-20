package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.NatureMission;
import com.alfatron.AlfamultiService2024.repository.NatureMissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NatureMissionService {

    NatureMissionRepository natureMissionRepository;

    public NatureMissionService(NatureMissionRepository natureMissionRepository){
        this.natureMissionRepository=natureMissionRepository;
    }

    public String sayHello() {
        return "hello multiService 2024";
    }

    public List<NatureMission> findAll(){
        return natureMissionRepository.findAll();
    }
}
