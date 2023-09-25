package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.NatureMission_Api;
import com.alfatron.AlfamultiService2024.model.NatureMission;
import com.alfatron.AlfamultiService2024.controller.service.NatureMissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/NatureDeMission")
@AllArgsConstructor
public class NatureMissionController implements NatureMission_Api {

    private NatureMissionService natureMissionService;

    public List<NatureMission> findAll(){
        return natureMissionService.findAll();
    }

    public Optional<NatureMission> findNatureMissionById(int id) {
        return natureMissionService.findNatureMissionById(id);
    }

    /*
    public void deleteNature(int id) {
        natureMissionService.deleteById(id);
    }
    */

}
