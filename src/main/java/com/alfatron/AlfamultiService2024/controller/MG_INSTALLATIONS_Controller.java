package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.MG_INSTALLATIONS_Api;
import com.alfatron.AlfamultiService2024.dto.VehiculeDto;
import com.alfatron.AlfamultiService2024.service.MG_INSTALLATIONS_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Vehicule")
@CrossOrigin
public class MG_INSTALLATIONS_Controller implements MG_INSTALLATIONS_Api {

    private MG_INSTALLATIONS_Service vehiculeService;

    public MG_INSTALLATIONS_Controller(MG_INSTALLATIONS_Service vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    public List<VehiculeDto> findAllVehicules() {
        return vehiculeService.findAllVehicules();
    }

    public VehiculeDto findVehiculeById(Integer id) {
        return vehiculeService.findVehiculeById(id);
    }

}
