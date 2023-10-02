package com.alfatron.AlfamultiService2024.service;


import com.alfatron.AlfamultiService2024.model.UtilisateurRole;
import com.alfatron.AlfamultiService2024.repository.UtilisateurRoleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UtilisateurRoleService {

    private UtilisateurRoleRepository utilisateurRoleRepository;

    public List<UtilisateurRole> findAllUtilisateursRoles(){
        return utilisateurRoleRepository.findAll();
    }
}
