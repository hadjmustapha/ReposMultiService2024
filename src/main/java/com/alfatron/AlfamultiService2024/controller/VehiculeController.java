package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Vehicule_Api;
import com.alfatron.AlfamultiService2024.dto.VehiculeDto;
import com.alfatron.AlfamultiService2024.model.Vehicule;
import com.alfatron.AlfamultiService2024.service.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Vehicule")
@CrossOrigin
public class VehiculeController implements Vehicule_Api {

    private VehiculeService vehiculeService;

    public VehiculeController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    public List<VehiculeDto> findAllVehicules() {
        return vehiculeService.findAllVehicules();
    }

    public VehiculeDto findVehiculeById(Integer id) {
        return vehiculeService.findVehiculeById(id);
    }

}
