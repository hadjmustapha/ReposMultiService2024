package com.alfatron.AlfamultiService2024.validator;

import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.service.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrdreDeMissionValidator {

    EmployeeService employeeService;
    NatureMissionService natureMissionService;
    TypeDeTransportService typeDeTransportService;
    ClientService clientService;
    FournisseurService fournisseurService;
    VehiculeService vehiculeService;
    StructureService structureService;

    public OrdreDeMissionValidator(EmployeeService employeeService, NatureMissionService natureMissionService, TypeDeTransportService typeDeTransportService, ClientService clientService, FournisseurService fournisseurService, VehiculeService vehiculeService, StructureService structureService) {
        this.employeeService = employeeService;
        this.natureMissionService = natureMissionService;
        this.typeDeTransportService = typeDeTransportService;
        this.clientService = clientService;
        this.fournisseurService = fournisseurService;
        this.vehiculeService = vehiculeService;
        this.structureService = structureService;
    }

    public List<String> validateOrdreDeMission(OrdreDeMissionDto ordreDeMissionDto){
         List<String> erreurs = new ArrayList<>();

         erreurs.addAll(verificationChampsObligatoire(ordreDeMissionDto));

         erreurs.addAll(validationClient(ordreDeMissionDto));
         erreurs.addAll(validationEmployee(ordreDeMissionDto));
         erreurs.addAll(validationNatureDeMission(ordreDeMissionDto));
         erreurs.addAll(validationStructure(ordreDeMissionDto));
         erreurs.addAll(validationVehicule(ordreDeMissionDto));
         erreurs.addAll(validationFournisseur(ordreDeMissionDto));
         erreurs.addAll(validationTypeDeTransport(ordreDeMissionDto));

        return erreurs;
    }
    public List<String> verificationChampsObligatoire(OrdreDeMissionDto ordreDeMissionDto){
        List<String> erreurs = new ArrayList<>();

        if(ordreDeMissionDto == null){
            erreurs.add("Saisie invalide de l'ordre de mission !");
        }
        if(ordreDeMissionDto.getDateOrdreDeMission() == null){
            erreurs.add("Date de l'ordre de mission non valide");
        }
        if(ordreDeMissionDto.getDateDebut() == null){
            erreurs.add("Date debut de l'ordre de mission non valide");
        }
        if(ordreDeMissionDto.getDateFin() == null){
            erreurs.add("Date Fin de l'ordre de mission non valide");
        }
        if(ordreDeMissionDto.getDestination() == null || !(StringUtils.hasLength(ordreDeMissionDto.getDestination()))){
            erreurs.add("destination de l'ordre de mission non valide");
        }
        if(ordreDeMissionDto.getObjetDeMission()==null ||  !(StringUtils.hasLength(ordreDeMissionDto.getObjetDeMission()))){
            erreurs.add("Objet de mission non valide");
        }
        if(ordreDeMissionDto.getEmployeeDto() == null){
            erreurs.add("Veuillez saisir employe dto ");
        }
        if(ordreDeMissionDto.getNatureMissionDto()== null){
            erreurs.add("Veuillez saisir la nature de mission");
        }

        return erreurs;
    }
    public List<String> validationClient(OrdreDeMissionDto ordreDeMissionDto){

        List<String> erreurs = new ArrayList<>();

        if(ordreDeMissionDto.getClientDto() != null){
            if(ordreDeMissionDto.getClientDto().getId() == null){
                erreurs.add("Saisi du client non valide");
            }
            if(clientService.findClientById(ordreDeMissionDto.getClientDto().getId()) == null){
                erreurs.add("incohérence de donnée : Client saisi non valide");
            }
        }
        return erreurs;
    }
    public List<String> validationEmployee(OrdreDeMissionDto ordreDeMissionDto){
        List<String> erreurs = new ArrayList<>();
        if(ordreDeMissionDto.getEmployeeDto() != null){
            if(ordreDeMissionDto.getEmployeeDto().getId() == null){
                erreurs.add("Saisi de employée non valide");
            }
            if(employeeService.findEmployeeById(ordreDeMissionDto.getEmployeeDto().getId()) == null){
                erreurs.add("incohérence de donnée : Employée saisi non valide");
            }
        }
        return erreurs;
    }
    public List<String> validationNatureDeMission(OrdreDeMissionDto ordreDeMissionDto) {
        List<String> erreurs = new ArrayList<>();
        if (ordreDeMissionDto.getNatureMissionDto() != null) {
            if (ordreDeMissionDto.getNatureMissionDto().getId() == null) {
                erreurs.add("Saisi Nature de mission non valide");
            }
            if (natureMissionService.findNatureMissionById(ordreDeMissionDto.getNatureMissionDto().getId()) == null) {
                erreurs.add("incohérence de donnée : Nature de mission saisi non valide");
            }
        }
        return erreurs;
    }
    public List<String> validationStructure(OrdreDeMissionDto ordreDeMissionDto){
        List<String> erreurs = new ArrayList<>();

        if(ordreDeMissionDto.getStructureDto() != null){
            if(ordreDeMissionDto.getStructureDto().getId() == null){
                erreurs.add("Saisi de la structure non valide");
            }
            if(structureService.findStructureById(ordreDeMissionDto.getStructureDto().getId()) == null){
                erreurs.add("incohérence de donnée : Structure saisi non valide");
            }
        }
        return erreurs;
    }
    public List<String> validationVehicule(OrdreDeMissionDto ordreDeMissionDto) {
        List<String> erreurs = new ArrayList<>();

        if (ordreDeMissionDto.getVehiculeDto() != null) {
            if (ordreDeMissionDto.getVehiculeDto().getId() == null) {
                erreurs.add("Saisi du vehicule non valide");
            }
            if (vehiculeService.findVehiculeById(ordreDeMissionDto.getVehiculeDto().getId()) == null) {
                erreurs.add("incohérence de donnée : Vehicule saisi non valide");
            }
        }
        return erreurs;
    }
    public List<String> validationFournisseur(OrdreDeMissionDto ordreDeMissionDto){
        List<String> erreurs = new ArrayList<>();
        if(ordreDeMissionDto.getFournisseurDto() != null){
            if(ordreDeMissionDto.getFournisseurDto().getId() == null){
                erreurs.add("Saisi du fournisseur non valide");
            }
            if(fournisseurService.findFournisseurById(ordreDeMissionDto.getFournisseurDto().getId()) == null){
                erreurs.add("incohérence de donnée : Fournisseur saisi non valide");
            }
        }
        return erreurs;
    }
    public List<String> validationTypeDeTransport(OrdreDeMissionDto ordreDeMissionDto) {
        List<String> erreurs = new ArrayList<>();

        if (ordreDeMissionDto.getTypeDeTransportDto() == null) {
            erreurs.add("Veuillez saisir Type de transport ");
        }
        if (ordreDeMissionDto.getTypeDeTransportDto() != null) {
            if (ordreDeMissionDto.getTypeDeTransportDto().getId() == null) {
                erreurs.add("Saisi du type de transport non valide");
            }
            if (typeDeTransportService.findTypeDeTransportById(ordreDeMissionDto.getTypeDeTransportDto().getId()) == null) {
                erreurs.add("incohérence de donnée : Type de transport saisi non valide");
            }

        }
        return erreurs;
    }

    }
    //---------------------Vérification si Type de transport est bien saisi -------------------------




