package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.RH_ODM_EDITION;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RH_ODM_EDITION_Mapper;
import com.alfatron.AlfamultiService2024.mapper.RH_ODM_Mapper;
import com.alfatron.AlfamultiService2024.repository.RH_ODM_Repository;
import com.alfatron.AlfamultiService2024.validator.RH_ODM_Validator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RH_ODM_EDITION_Service {

    private RH_ODM_Repository ordreDeMissionRepository;
    private RH_ODM_Mapper ordreDeMissionMapper;
    private RH_ODM_EDITION_Mapper rh_odm_edition_mapper;
    private ORG_EMPLOYEE_Service employeeService;
    private RH_ODM_Validator ordreDeMissionValidator;

    public RH_ODM_EDITION_Service(RH_ODM_Repository ordreDeMissionRepository, RH_ODM_Mapper ordreDeMissionMapper, RH_ODM_EDITION_Mapper rh_odm_edition_mapper, ORG_EMPLOYEE_Service employeeService, RH_ODM_Validator ordreDeMissionValidator) {
        this.ordreDeMissionRepository = ordreDeMissionRepository;
        this.ordreDeMissionMapper     = ordreDeMissionMapper;
        this.rh_odm_edition_mapper    = rh_odm_edition_mapper;
        this.employeeService          = employeeService;
        this.ordreDeMissionValidator  = ordreDeMissionValidator;
    }

    public RH_ODM_EDITION findOrdreDeMissionEditionById(Integer id){

        if (id == null) {
            //log.error("Ordre de mission ID is null");
            return null;
        }

        RH_ODM_EDITION ordreDeMissionEdition = ordreDeMissionRepository.findById(id).
                map(rh_odm_edition_mapper::toOrdreDeMissionEdition)
                .orElseThrow(()->new Custom_EntityNotFoundException("Impossible de trouvé un ordre de mission avec id : "+id, ErrorCodes.ORDRE_DE_MISSION_NOT_FOUND));
        //rh_odm_dto.setNature(1);
        //RH_ODM rh_odm = new RH_ODM();

        return ordreDeMissionEdition;
    }

    public RH_ODM_EDITION saveOrdreDeMission(RH_ODM_EDITION ordreDeMissionEdition){
        //validation des données en input
        if (ordreDeMissionEdition.getId() == null) {
            ordreDeMissionEdition.setId(0);
        }
        //List<String> errors = ordreDeMissionValidator.validateOrdreDeMission(ordreDeMissionEdition);
        //if (!errors.isEmpty()) {
        //log.error("ODM is not valid ", ordreDeMissionDto);
        //  throw new Custom_InvalidEntityException("ODM is not valid",ErrorCodes.ORDRE_DE_MISSION_NOT_VALID,errors);
        //}
        //conversion dto en entité  --> puis reconversion à nouveau entity en dto


        // noublie pas la validation des lignes
        return rh_odm_edition_mapper.toOrdreDeMissionEdition(ordreDeMissionRepository.save(rh_odm_edition_mapper.toOrdreDeMission(ordreDeMissionEdition)));
    };

    public List<RH_ODM_EDITION> findAllOrdreDeMissionEdition(){
        return ordreDeMissionRepository.findAll().stream()
                .map(rh_odm_edition_mapper::toOrdreDeMissionEdition)
                .collect(Collectors.toList());
    }
}
