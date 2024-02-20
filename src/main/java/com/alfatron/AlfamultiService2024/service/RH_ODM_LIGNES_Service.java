package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_LIGNES;
import com.alfatron.AlfamultiService2024.repository.RH_ODM_LIGNES_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RH_ODM_LIGNES_Service {

    RH_ODM_LIGNES_Repository rh_odm_lignes_repository;

    public RH_ODM_LIGNES_Service(RH_ODM_LIGNES_Repository rh_odm_lignes_repository) {
        this.rh_odm_lignes_repository = rh_odm_lignes_repository;
    }

    public List<RH_ODM_LIGNES> findAll_RH_ODM_LIGNES() {
        return rh_odm_lignes_repository.findAll();
    }

    public Optional<RH_ODM_LIGNES> find_RH_ODM_LIGNES_ById(Integer id) {
        return rh_odm_lignes_repository.findById(id);
    }



}
