package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.Utilisateur;
import com.alfatron.AlfamultiService2024.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurService {

    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> findAll(){
        return utilisateurRepository.findAll();
    }
}
