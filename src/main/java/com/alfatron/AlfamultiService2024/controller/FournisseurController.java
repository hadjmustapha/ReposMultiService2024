package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Fournisseur_Api;
import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.service.FournisseurService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Fournisseur")
@CrossOrigin
public class FournisseurController implements Fournisseur_Api {

    private FournisseurService fournisseurService;

    public FournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    public List<FournisseurDto> findAllFournisseurs() {
        return fournisseurService.findAllFournisseurs();
    }

    public FournisseurDto findFournisseurById(Integer id) {
        return fournisseurService.findFournisseurById(id);
    }
}
