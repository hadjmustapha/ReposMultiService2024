package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.Fournisseur;
import com.alfatron.AlfamultiService2024.repository.FournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FournisseurService {

    private FournisseurRepository fournisseurRepository;

    public List<Fournisseur> findAll(){
        return fournisseurRepository.findAll();
    }

    public Optional<Fournisseur> findById(int id){
        return fournisseurRepository.findById(id);
    }
}
