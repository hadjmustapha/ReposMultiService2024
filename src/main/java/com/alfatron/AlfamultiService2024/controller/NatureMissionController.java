package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.NatureMission_Api;
import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.exception.EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorDto;
import com.alfatron.AlfamultiService2024.model.NatureMission;
import com.alfatron.AlfamultiService2024.service.NatureMissionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
@RequestMapping(APP_ROOT+"/NatureDeMission")
@AllArgsConstructor
public class NatureMissionController implements NatureMission_Api {

    private NatureMissionService natureMissionService;

    public List<NatureMissionDto> findAll(){
        return natureMissionService.findAll();
    }

    public NatureMissionDto findNatureMissionById(Integer id) {
        return natureMissionService.findNatureMissionById(id);
    }



}
