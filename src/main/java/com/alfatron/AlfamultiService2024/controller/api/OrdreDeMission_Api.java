package com.alfatron.AlfamultiService2024.controller.api;

import com.alfatron.AlfamultiService2024.model.OrdreDeMission;

import java.util.List;
import java.util.Optional;

public interface OrdreDeMission_Api {

    public List<OrdreDeMission> findAll();

    public Optional<OrdreDeMission> findById(int id);

    public Optional<OrdreDeMission> save();
}
