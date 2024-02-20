package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.ACH_FOURNISSEUR_Api;
import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.service.ACH_FOURNISSEUR_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Fournisseur")
@CrossOrigin
public class ACH_FOURNISSEUR_Controller implements ACH_FOURNISSEUR_Api {

    private ACH_FOURNISSEUR_Service fournisseurService;

    public ACH_FOURNISSEUR_Controller(ACH_FOURNISSEUR_Service fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    public List<FournisseurDto> findAllFournisseurs() {
        return fournisseurService.findAllFournisseurs();
    }

    public FournisseurDto findFournisseurById(Integer id) {
        return fournisseurService.findFournisseurById(id);
    }
}
