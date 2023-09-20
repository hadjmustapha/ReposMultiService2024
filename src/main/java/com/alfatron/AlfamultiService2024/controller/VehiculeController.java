package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Vehicule_Api;
import com.alfatron.AlfamultiService2024.model.Vehicule;
import com.alfatron.AlfamultiService2024.service.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Vehicule")
@AllArgsConstructor
public class VehiculeController implements Vehicule_Api {

    private VehiculeService vehiculeService;

    public List<Vehicule> findAll() {
        return vehiculeService.findAll();
    }

    public Optional<Vehicule> findById(int id) {
        return vehiculeService.findById(id);
    }

}
