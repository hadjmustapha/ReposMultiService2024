package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.OrdreDeMission_Api;
import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.service.OrdreDeMissionService;
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

    public List<OrdreDeMissionDto> findAll() {
        return ordreDeMissionService.findAll();
    }

    public OrdreDeMissionDto findById(Integer id) {
        return ordreDeMissionService.findById(id);
    }

    @Transactional
    public OrdreDeMissionDto save(OrdreDeMissionDto ordreDeMissionDto) {
        return ordreDeMissionService.save(ordreDeMissionDto);
    }


}
