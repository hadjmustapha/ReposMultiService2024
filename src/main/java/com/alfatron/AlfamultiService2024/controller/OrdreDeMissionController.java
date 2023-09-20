package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.OrdreDeMission_Api;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
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

    @Override
    public List<OrdreDeMission> findAll() {
        return null;
    }

    @Override
    public Optional<OrdreDeMission> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<OrdreDeMission> save() {
        return Optional.empty();
    }
}
