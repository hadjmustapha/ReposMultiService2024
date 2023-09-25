package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.OrdreDeMission_Api;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.controller.service.OrdreDeMissionService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/OrdreDeMission")
@AllArgsConstructor
public class OrdreDeMissionController implements OrdreDeMission_Api {

    private OrdreDeMissionService ordreDeMissionService;

    public List<OrdreDeMission> findAll() {
        return ordreDeMissionService.findAll();
    }

    public Optional<OrdreDeMission> findById( int id) {
        return ordreDeMissionService.findById(id);
    }

    @Transactional
    public OrdreDeMission save(OrdreDeMission ordreDeMission) {
        return ordreDeMissionService.save(ordreDeMission);
    }


    /*
     @Transactional
    public void deleteOrdreDeMissionById(int id) {
        ordreDeMissionService.delete(id);
    }
     */

}
