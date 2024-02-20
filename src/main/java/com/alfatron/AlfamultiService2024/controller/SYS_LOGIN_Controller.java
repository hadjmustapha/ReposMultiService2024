package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.SYS_LOGIN_Api;
import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.model.ADMIN.SYS_LOGIN;
import com.alfatron.AlfamultiService2024.service.SYS_LOGIN_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Utilisateur")
@CrossOrigin
public class SYS_LOGIN_Controller implements SYS_LOGIN_Api {

   private SYS_LOGIN_Service utilisateurService;

    public SYS_LOGIN_Controller(SYS_LOGIN_Service utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    public List<UtilisateurDto> findAllUsers() {
        return utilisateurService.findAllUtilisateurs();
    }
/*
    public UtilisateurDto findUserById(Integer id) {
        return utilisateurService.findUtilisateur_withRoles_ById(id);
    }
*/
    public SYS_LOGIN findUserById(Integer id) {
        return utilisateurService.findUtilisateurById(id);
    }

    public UtilisateurDto filtreRolesParUsername(String username) {
        return utilisateurService.filtreRolesParUsername(username);
    }

    public SYS_LOGIN filtreRolesParUsername2(String username) {
        return utilisateurService.filtreRolesParUsername2(username);
    }

    public SYS_LOGIN saveUtilisateur(SYS_LOGIN utilisateur) {
        return utilisateurService.saveUtilisateur(utilisateur);
    }
}
