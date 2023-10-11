package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.OrdreDeMission_Api;
import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.service.OrdreDeMissionService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/OrdreDeMission")
@CrossOrigin
public class OrdreDeMissionController implements OrdreDeMission_Api {

    private OrdreDeMissionService ordreDeMissionService;

    public OrdreDeMissionController(OrdreDeMissionService ordreDeMissionService) {
        this.ordreDeMissionService = ordreDeMissionService;
    }

    public List<OrdreDeMissionDto> findAllOrdreDeMissions() {
        return ordreDeMissionService.findAllOrdreDeMission();
    }

    public OrdreDeMissionDto findOrdreDeMissionById(Integer id) {
        return ordreDeMissionService.findOrdreDeMissionById(id);
    }

    @Transactional
    public OrdreDeMissionDto saveOrdreDeMission(OrdreDeMissionDto ordreDeMissionDto) {
        return ordreDeMissionService.saveOrdreDeMission(ordreDeMissionDto);
    }


}
