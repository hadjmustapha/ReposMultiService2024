package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.RH_ODM_Api;
import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.service.RH_ODM_Service;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/OrdreDeMission")
@CrossOrigin
public class RH_ODM_Controller implements RH_ODM_Api {

    private RH_ODM_Service ordreDeMissionService;

    public RH_ODM_Controller(RH_ODM_Service ordreDeMissionService) {
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

    @GetMapping(value = "/Filtre_ODM_ParNomEmployee")
    public List<OrdreDeMissionDto> filtreParNomEmployee(@RequestParam String nom){
        return ordreDeMissionService.filtreParNomEmployee(nom);
    }

    @GetMapping(value = "/Filtre_ODM_ParDestination")
    public List<OrdreDeMissionDto> filtreParDestination(@RequestParam String destination){
        return ordreDeMissionService.filtreParDestination(destination);
    }

    @GetMapping(value = "/Filtre_ODM_ParObjetDeMission")
    public List<OrdreDeMissionDto> filtreParObjetDeMission(@RequestParam String objet){
        return ordreDeMissionService.filtreParObjetDeMission(objet);
    }

    @GetMapping(value = "/Filtre_ODM_ParStructure")
    public List<OrdreDeMissionDto> filtreParStrcuture(@RequestParam String structure){
        return ordreDeMissionService.filtreParStructure(structure);
    }

    @GetMapping(value = "/Filtre_ODM_ParDateOrdreDeMission")
    public List<OrdreDeMissionDto> filtreParDateOrdreDeMission(@RequestParam Date dateOrdreDeMission){
        return ordreDeMissionService.filtreParDateOrdreDeMission(dateOrdreDeMission);
    }

    @GetMapping(value = "/Filtre_ODM_ParRaisonSocialeClient")
    public List<OrdreDeMissionDto> filtreParRaisonSocialeClient(@RequestParam String raisonSociale){
        return ordreDeMissionService.filtreParRaisonSocialeClient(raisonSociale);
    }

    @GetMapping(value = "/Filtre_ODM_ParRaisonSocialeFournisseur")
    public List<OrdreDeMissionDto> filtreParRaisonSocialeFournisseur(@RequestParam String raisonSociale){
        return ordreDeMissionService.filtreParRaisonSocialeFournisseur(raisonSociale);
    }

}
