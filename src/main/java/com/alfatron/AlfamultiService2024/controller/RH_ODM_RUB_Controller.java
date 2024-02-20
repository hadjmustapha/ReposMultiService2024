package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.RH_ODM_RUB_Api;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_RUB;
import com.alfatron.AlfamultiService2024.service.RH_ODM_RUB_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Rubrique")
@CrossOrigin
public class RH_ODM_RUB_Controller implements RH_ODM_RUB_Api {

    RH_ODM_RUB_Service rh_odm_rub_service;

    public RH_ODM_RUB_Controller(RH_ODM_RUB_Service rh_odm_rub_service) {
        this.rh_odm_rub_service = rh_odm_rub_service;
    }

    public List<RH_ODM_RUB> findAllRubriques() {
        return rh_odm_rub_service.findAllRubrique().stream().collect(Collectors.toList());
    }

    public RH_ODM_RUB findRubriqueById(Integer id) {
        return rh_odm_rub_service.findById(id).get();
    }

    public String getToto() {
        return "toto";
    }
}
