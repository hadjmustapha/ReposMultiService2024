package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Fournisseur_Api;
import com.alfatron.AlfamultiService2024.model.Fournisseur;
import com.alfatron.AlfamultiService2024.service.FournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Fournisseur")
@AllArgsConstructor
public class FournisseurController implements Fournisseur_Api {

    private FournisseurService fournisseurService;

    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }

    public Optional<Fournisseur> findById(int id) {
        return fournisseurService.findById(id);
    }
}
