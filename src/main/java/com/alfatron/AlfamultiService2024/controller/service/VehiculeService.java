package com.alfatron.AlfamultiService2024.controller.service;

import com.alfatron.AlfamultiService2024.model.Vehicule;
import com.alfatron.AlfamultiService2024.repository.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VehiculeService {

    private VehiculeRepository vehiculeRepository;

    public List<Vehicule> findAll(){
        return vehiculeRepository.findAll();
    }

    public Optional<Vehicule> findById(int id) {
        return vehiculeRepository.findById(id);
    }
}
