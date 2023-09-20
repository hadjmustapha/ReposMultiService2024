package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.repository.OrdreDeMissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrdreDeMissionService {

    private OrdreDeMissionRepository ordreDeMissionRepository;

    public List<OrdreDeMission> findAll(){
        return ordreDeMissionRepository.findAll();
    }
}
