package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.RH_NATURE_ODM_Api;
import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.service.RH_NATURE_ODM_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/NatureDeMission")
@CrossOrigin
public class RH_NATURE_ODM_Controller implements RH_NATURE_ODM_Api {

    private RH_NATURE_ODM_Service natureMissionService;

    public RH_NATURE_ODM_Controller(RH_NATURE_ODM_Service natureMissionService) {
        this.natureMissionService = natureMissionService;
    }

    public List<NatureMissionDto> findAllNatureDeMissions(){
        return natureMissionService.findAllNatureDeMissions();
    }

    public NatureMissionDto findNatureMissionById(Integer id) {
        return natureMissionService.findNatureMissionById(id);
    }



}
