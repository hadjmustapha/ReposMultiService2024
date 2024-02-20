package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.RH_ODM_EDITION_Api;
import com.alfatron.AlfamultiService2024.dto.RH_ODM_EDITION;
import com.alfatron.AlfamultiService2024.service.RH_ODM_EDITION_Service;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/OrdreDeMissionEdition")
@CrossOrigin
public class RH_ODM_EDITION_Controller implements RH_ODM_EDITION_Api {

    private RH_ODM_EDITION_Service rh_odm_edition_service;

    public RH_ODM_EDITION_Controller(RH_ODM_EDITION_Service rh_odm_edition_service) {
        this.rh_odm_edition_service = rh_odm_edition_service;
    }

    @Override
    public List<RH_ODM_EDITION> findAllOrdreDeMissionsEdition() {
        return rh_odm_edition_service.findAllOrdreDeMissionEdition();
    }

    @Override
    public RH_ODM_EDITION findOrdreDeMissionEditionById(Integer id) {
        return rh_odm_edition_service.findOrdreDeMissionEditionById(id);
    }

    @Transactional
    public RH_ODM_EDITION saveOrdreDeMission(RH_ODM_EDITION ordreDeMissionEdition) {
        return rh_odm_edition_service.saveOrdreDeMission(ordreDeMissionEdition);
    }
}
