package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.RH_ODM_LIGNES_Api;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_LIGNES;
import com.alfatron.AlfamultiService2024.service.RH_ODM_LIGNES_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/OdmDetail")
@CrossOrigin
public class RH_ODM_LIGNES_Controller implements RH_ODM_LIGNES_Api {

    RH_ODM_LIGNES_Service rh_odm_lignes_service;

    public RH_ODM_LIGNES_Controller(RH_ODM_LIGNES_Service rh_odm_lignes_service) {
        this.rh_odm_lignes_service = rh_odm_lignes_service;
    }

    public List<RH_ODM_LIGNES> findAll_RH_ODM_LIGNES() {
        return rh_odm_lignes_service.findAll_RH_ODM_LIGNES();
    }

    public RH_ODM_LIGNES find_RH_ODM_LIGNES_ById(Integer id) {
        System.out.println("getId() "+rh_odm_lignes_service.find_RH_ODM_LIGNES_ById(id).get().getId());
        System.out.println("getMontantUnitaire() "+rh_odm_lignes_service.find_RH_ODM_LIGNES_ById(id).get().getMontantUnitaire());
        System.out.println("getOdm().getId() "+rh_odm_lignes_service.find_RH_ODM_LIGNES_ById(id).get().getOdm().getId());
        return null;//rh_odm_lignes_service.find_RH_ODM_LIGNES_ById(id).get();
    }
}
