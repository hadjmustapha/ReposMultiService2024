package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.Utilisateur;
import com.alfatron.AlfamultiService2024.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    private UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public List<Utilisateur> findAllUtilisateurs(){
        return utilisateurRepository.findAll();
    }
}
