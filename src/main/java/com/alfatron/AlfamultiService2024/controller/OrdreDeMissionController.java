package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.OrdreDeMission_Api;
import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.service.OrdreDeMissionService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
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

    @GetMapping(value = "/Recherche_ODM_ParDateOrdreDeMission")
    public List<OrdreDeMissionDto> RechercheParDateOrdreDeMission(@RequestParam String dateOrdreDeMission){
        return ordreDeMissionService.RechercheParDateOrdreDeMission(dateOrdreDeMission);
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
