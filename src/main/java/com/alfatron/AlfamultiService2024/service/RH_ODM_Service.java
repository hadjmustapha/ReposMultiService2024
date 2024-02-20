package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.Custom_InvalidEntityException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RH_ODM_EDITION_Mapper;
import com.alfatron.AlfamultiService2024.mapper.RH_ODM_Mapper;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM;
import com.alfatron.AlfamultiService2024.repository.RH_ODM_Repository;
import com.alfatron.AlfamultiService2024.validator.RH_ODM_Validator;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RH_ODM_Service {

    private RH_ODM_Repository ordreDeMissionRepository;
    private RH_ODM_Mapper ordreDeMissionMapper;
    private RH_ODM_EDITION_Mapper rh_odm_edition_mapper;
    private ORG_EMPLOYEE_Service employeeService;
    private RH_ODM_Validator ordreDeMissionValidator;

    public RH_ODM_Service(RH_ODM_Repository ordreDeMissionRepository, RH_ODM_Mapper ordreDeMissionMapper, ORG_EMPLOYEE_Service employeeService, RH_ODM_Validator ordreDeMissionValidator , RH_ODM_EDITION_Mapper rh_odm_edition_mapper) {
        this.ordreDeMissionRepository = ordreDeMissionRepository;
        this.ordreDeMissionMapper = ordreDeMissionMapper;
        this.employeeService = employeeService;
        this.ordreDeMissionValidator = ordreDeMissionValidator;
        this.rh_odm_edition_mapper = rh_odm_edition_mapper;
    }

    public List<OrdreDeMissionDto> findAllOrdreDeMission(){
        return ordreDeMissionRepository.findAll().stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());
    }

    public OrdreDeMissionDto findOrdreDeMissionById(Integer id){

        if (id == null) {
            //log.error("Ordre de mission ID is null");
            return null;
        }

        OrdreDeMissionDto rh_odm_dto = ordreDeMissionRepository.findById(id).
                map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .orElseThrow(()->new Custom_EntityNotFoundException("Impossible de trouvé un ordre de mission avec id : "+id, ErrorCodes.ORDRE_DE_MISSION_NOT_FOUND));
        //rh_odm_dto.setNature(1);
        RH_ODM rh_odm = new RH_ODM();

          return rh_odm_dto;
    }

    /*
    public RH_ODM findOrdreDeMissionById(Integer id){

        if (id == null) {
            //log.error("Ordre de mission ID is null");
            return null;
        }
        RH_ODM rh_odm = ordreDeMissionRepository.findById(id).get();//.
                //map(ordreDeMissionMapper::toOrdreDeMissionDto)
                //.orElseThrow(()->new Custom_EntityNotFoundException("Impossible de trouvé un ordre de mission avec id : "+id, ErrorCodes.ORDRE_DE_MISSION_NOT_FOUND));
        //rh_odm_dto.setNature(1);
        //RH_ODM rh_odm = new RH_ODM();

        return rh_odm;
    }

     */

    public OrdreDeMissionDto saveOrdreDeMission(OrdreDeMissionDto ordreDeMissionDto){
        //validation des données en input
        if (ordreDeMissionDto.getId() == null) {
            ordreDeMissionDto.setId(0);
        }
        List<String> errors = ordreDeMissionValidator.validateOrdreDeMission(ordreDeMissionDto);
        if (!errors.isEmpty()) {
            //log.error("ODM is not valid ", ordreDeMissionDto);
            throw new Custom_InvalidEntityException("ODM is not valid",ErrorCodes.ORDRE_DE_MISSION_NOT_VALID,errors);
        }
        //conversion dto en entité  --> puis reconversion à nouveau entity en dto
        return ordreDeMissionMapper.toOrdreDeMissionDto(ordreDeMissionRepository.save(ordreDeMissionMapper.toOrdreDeMission(ordreDeMissionDto)));
    };



    public List<OrdreDeMissionDto> filtreParNomEmployee(String nom){

        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto= ordreDeMissionRepository.filtreParNomEmployee(nom,sort).stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());

        return listeOrdreDeMissionDto;
    }
    public List<OrdreDeMissionDto> filtreParDestination(String destination){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto= ordreDeMissionRepository.filtreParDestination(destination,sort).stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());

        return listeOrdreDeMissionDto;
    }
    public List<OrdreDeMissionDto> filtreParObjetDeMission(String objet){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto= ordreDeMissionRepository.filtreParObjetDeMission(objet,sort).stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());

        return listeOrdreDeMissionDto;
    }
    public List<OrdreDeMissionDto> filtreParStructure(String structure){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto= ordreDeMissionRepository.filtreParStructure(structure,sort).stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());

        return listeOrdreDeMissionDto;
    }
    public List<OrdreDeMissionDto> filtreParDateOrdreDeMission(Date date){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto = ordreDeMissionRepository.filtreParDateOrdreDeMission(date,sort).stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());

        return listeOrdreDeMissionDto;
    }
    public List<OrdreDeMissionDto> filtreParDateOrdreDeMission(String dateOrdreDeMission){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto = ordreDeMissionRepository.filtreParDateOrdreDeMission(dateOrdreDeMission,sort).stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());

        return listeOrdreDeMissionDto;
    }
    public List<OrdreDeMissionDto> filtreParRaisonSocialeClient(String raisonSociale){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto = ordreDeMissionRepository.filtreParRaisonSocialeClient(raisonSociale,sort).stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());

        return listeOrdreDeMissionDto;
    }
    public List<OrdreDeMissionDto> filtreParRaisonSocialeFournisseur(String raisonSociale){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto = ordreDeMissionRepository.filtreParRaisonSocialeFournisseur(raisonSociale,sort).stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());

        return listeOrdreDeMissionDto;
    }

}
