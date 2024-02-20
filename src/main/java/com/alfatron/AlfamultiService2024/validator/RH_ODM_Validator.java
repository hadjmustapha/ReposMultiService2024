package com.alfatron.AlfamultiService2024.validator;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.service.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class RH_ODM_Validator {

    ORG_EMPLOYEE_Service employeeService;
    RH_NATURE_ODM_Service natureMissionService;
    RH_ODM_TRANSPORT_Service typeDeTransportService;
    COM_CLIENT_Service clientService;
    ACH_FOURNISSEUR_Service fournisseurService;
    MG_INSTALLATIONS_Service vehiculeService;
    ORG_STRUCTURE_Service structureService;
    List<String> erreurs;

    public RH_ODM_Validator(ORG_EMPLOYEE_Service employeeService, RH_NATURE_ODM_Service natureMissionService, RH_ODM_TRANSPORT_Service typeDeTransportService, COM_CLIENT_Service clientService, ACH_FOURNISSEUR_Service fournisseurService, MG_INSTALLATIONS_Service vehiculeService, ORG_STRUCTURE_Service structureService) {
        this.employeeService = employeeService;
        this.natureMissionService = natureMissionService;
        this.typeDeTransportService = typeDeTransportService;
        this.clientService = clientService;
        this.fournisseurService = fournisseurService;
        this.vehiculeService = vehiculeService;
        this.structureService = structureService;
    }

    public List<String> validateOrdreDeMission(OrdreDeMissionDto ordreDeMissionDto){

         erreurs= new ArrayList<>();

         verificationChampsObligatoire(ordreDeMissionDto);

         validationClient(ordreDeMissionDto);
         validationEmployee(ordreDeMissionDto);
         validationNatureDeMission(ordreDeMissionDto);
         validationStructure(ordreDeMissionDto);
         validationVehicule(ordreDeMissionDto);
         validationFournisseur(ordreDeMissionDto);
         validationTypeDeTransport(ordreDeMissionDto);

        return erreurs;
    }

    public void verificationChampsObligatoire(OrdreDeMissionDto ordreDeMissionDto){

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

        if(ordreDeMissionDto.getNatureMissionDto()==null){
            erreurs.add("Veuillez saisir la nature de mission");
        }

        /*
                if(ordreDeMissionDto.getNatureMissionDto()== null){
                    erreurs.add("Veuillez saisir la nature de mission");
                }
        */

    }
    public void validationClient(OrdreDeMissionDto ordreDeMissionDto){
         if(ordreDeMissionDto.getClientDto() != null){
            if(ordreDeMissionDto.getClientDto() == null){
                erreurs.add("Saisi du client non valide");
            }
            if(clientService.findClientById(ordreDeMissionDto.getClientDto().getId()) == null){
                erreurs.add("incohérence de donnée : Client saisi non valide");
            }
        }
    }
    public void validationEmployee(OrdreDeMissionDto ordreDeMissionDto){
       if(ordreDeMissionDto.getEmployeeDto() != null){
            if(ordreDeMissionDto.getEmployeeDto().getId() == null){
                erreurs.add("Saisi de employée non valide");
            }
            if(employeeService.findEmployeeById(ordreDeMissionDto.getEmployeeDto().getId()) == null){
                erreurs.add("incohérence de donnée : Employée saisi non valide");
            }
        }
    }
    public void validationNatureDeMission(OrdreDeMissionDto ordreDeMissionDto) {

        if (ordreDeMissionDto.getNatureMissionDto() != null) {
            if (ordreDeMissionDto.getNatureMissionDto().getId() == null) {
                erreurs.add("Saisi Nature de mission non valide");
            }
            if (natureMissionService.findNatureMissionById(ordreDeMissionDto.getNatureMissionDto().getId()) == null) {
                erreurs.add("incohérence de donnée : Nature de mission saisi non valide");
            }
        }
    }
    public void validationStructure(OrdreDeMissionDto ordreDeMissionDto){
        if(ordreDeMissionDto.getStructureDto() != null){
            if(ordreDeMissionDto.getStructureDto().getId() == null){
                erreurs.add("Saisi de la structure non valide");
            }
            if(structureService.findStructureById(ordreDeMissionDto.getStructureDto().getId()) == null){
                erreurs.add("incohérence de donnée : Structure saisi non valide");
            }
        }
    }
    public void validationVehicule(OrdreDeMissionDto ordreDeMissionDto) {
        if (ordreDeMissionDto.getVehiculeDto() != null) {
            if (ordreDeMissionDto.getVehiculeDto().getId() == null) {
                erreurs.add("Saisi du vehicule non valide");
            }
            if (vehiculeService.findVehiculeById(ordreDeMissionDto.getVehiculeDto().getId()) == null) {
                erreurs.add("incohérence de donnée : Vehicule saisi non valide");
            }
        }
    }
    public void validationFournisseur(OrdreDeMissionDto ordreDeMissionDto){
        if(ordreDeMissionDto.getFournisseurDto() != null){
            if(ordreDeMissionDto.getFournisseurDto().getId() == null){
                erreurs.add("Saisi du fournisseur non valide");
            }
            if(fournisseurService.findFournisseurById(ordreDeMissionDto.getFournisseurDto().getId()) == null){
                erreurs.add("incohérence de donnée : Fournisseur saisi non valide");
            }
        }
    }
    public void validationTypeDeTransport(OrdreDeMissionDto ordreDeMissionDto) {
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
    }

    }



