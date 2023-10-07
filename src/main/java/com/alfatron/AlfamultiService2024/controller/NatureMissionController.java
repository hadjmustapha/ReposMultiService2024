package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.NatureMission_Api;
import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.service.NatureMissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/NatureDeMission")
@AllArgsConstructor
public class NatureMissionController implements NatureMission_Api {

    private NatureMissionService natureMissionService;

    public List<NatureMissionDto> findAllNatureDeMissions(){
        return natureMissionService.findAllNatureDeMissions();
    }

    public NatureMissionDto findNatureMissionById(Integer id) {
        return natureMissionService.findNatureMissionById(id);
    }



}
