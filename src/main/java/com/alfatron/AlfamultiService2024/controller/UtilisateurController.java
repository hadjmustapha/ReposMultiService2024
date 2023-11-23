package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Utilisateur_Api;
import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.model.Utilisateur;
import com.alfatron.AlfamultiService2024.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Utilisateur")
@CrossOrigin
public class UtilisateurController implements Utilisateur_Api {

   private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    public List<UtilisateurDto> findAllUsers() {
        return utilisateurService.findAllUtilisateurs();
    }

    public UtilisateurDto findUserById(Integer id) {
        return utilisateurService.findUtilisateur_withRoles_ById(id);
    }

    public UtilisateurDto filtreRolesParUsername(String username) {
        return utilisateurService.filtreRolesParUsername(username);
    }
}
