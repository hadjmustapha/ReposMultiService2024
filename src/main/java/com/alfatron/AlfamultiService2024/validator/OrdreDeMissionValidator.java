package com.alfatron.AlfamultiService2024.validator;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.service.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class OrdreDeMissionValidator {

    EmployeeService employeeService;
    NatureMissionService natureMissionService;
    TypeDeTransportService typeDeTransportService;
    ClientService clientService;
    FournisseurService fournisseurService;
    VehiculeService vehiculeService;
    StructureService structureService;

    public List<String> validateOrdreDeMission(OrdreDeMissionDto ordreDeMissionDto){

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


        //-------------------Verification si le client est bien saisi -------------------
        if(ordreDeMissionDto.getClientDto() != null){
            if(ordreDeMissionDto.getClientDto().getId() == null){
                erreurs.add("Saisi du client non valide");
            }
            if(clientService.findClientById(ordreDeMissionDto.getClientDto().getId()) == null){
                erreurs.add("incohérence de donnée : Client saisi non valide");
            }
        }

        //------------------Verification si Employee dto est bien saisi -----------------
               if(ordreDeMissionDto.getEmployeeDto() == null){
                   erreurs.add("Veuillez saisir employe dto ");
              }
              if(ordreDeMissionDto.getEmployeeDto() != null){
                  if(ordreDeMissionDto.getEmployeeDto().getId() == null){
                       erreurs.add("Saisi de employée non valide");
                    }
                   if(employeeService.findEmployeeById(ordreDeMissionDto.getEmployeeDto().getId()) == null){
                       erreurs.add("incohérence de donnée : Employée saisi non valide");
                  }
              }
        //-----------------Verification si nature de mission est bien saisi---------
        if(ordreDeMissionDto.getNatureMissionDto()== null){
            erreurs.add("Veuillez saisir la nature de mission");
        }
        if(ordreDeMissionDto.getNatureMissionDto()!= null){
            if(ordreDeMissionDto.getNatureMissionDto().getId()== null){
                erreurs.add("Saisi Nature de mission non valide");
            }
            if(natureMissionService.findNatureMissionById(ordreDeMissionDto.getNatureMissionDto().getId())==null){
                erreurs.add("incohérence de donnée : Nature de mission saisi non valide");
            }
        }
        //--------------Verification si la structure est bien saisi   --------
        if(ordreDeMissionDto.getStructureDto() != null){
            if(ordreDeMissionDto.getStructureDto().getId() == null){
                erreurs.add("Saisi de la structure non valide");
            }
            if(structureService.findStructureById(ordreDeMissionDto.getStructureDto().getId()) == null){
                erreurs.add("incohérence de donnée : Structure saisi non valide");
            }
        }
        //--------------Verification si le vehicule est bien saisi    ---------
        if(ordreDeMissionDto.getVehiculeDto() != null){
            if(ordreDeMissionDto.getVehiculeDto().getId() == null){
                erreurs.add("Saisi du vehicule non valide");
            }
            if(vehiculeService.findVehiculeById(ordreDeMissionDto.getVehiculeDto().getId()) == null){
                erreurs.add("incohérence de donnée : Vehicule saisi non valide");
            }
        }
        //--------------Verification si le fournisseur est bien saisi ------------
        if(ordreDeMissionDto.getFournisseurDto() != null){
            if(ordreDeMissionDto.getFournisseurDto().getId() == null){
                erreurs.add("Saisi du fournisseur non valide");
            }
            if(fournisseurService.findFournisseurById(ordreDeMissionDto.getFournisseurDto().getId()) == null){
                erreurs.add("incohérence de donnée : Fournisseur saisi non valide");
            }
        }
        //---------------------Vérification si Type de transport est bien saisi -------------------------
        if(ordreDeMissionDto.getTypeDeTransportDto()==null){
            erreurs.add("Veuillez saisir Type de transport ");
        }
        if(ordreDeMissionDto.getTypeDeTransportDto()!=null){
             if(ordreDeMissionDto.getTypeDeTransportDto().getId()==null){
                 erreurs.add("Saisi du type de transport non valide");
             }
            if(typeDeTransportService.findTypeDeTransportById(ordreDeMissionDto.getTypeDeTransportDto().getId())==null){
                erreurs.add("incohérence de donnée : Type de transport saisi non valide");
            }

        }




        return erreurs;
    }
}
