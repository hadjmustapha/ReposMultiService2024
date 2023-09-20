package com.alfatron.AlfamultiService2024.service;


import com.alfatron.AlfamultiService2024.model.UtilisateurRole;
import com.alfatron.AlfamultiService2024.repository.UtilisateurRoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurRoleService {

    private UtilisateurRoleRepository utilisateurRoleRepository;

    public List<UtilisateurRole> findAll(){
        return utilisateurRoleRepository.findAll();
    }
}
