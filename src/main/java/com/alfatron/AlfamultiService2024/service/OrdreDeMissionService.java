package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.Custom_InvalidEntityException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.OrdreDeMissionMapper;
import com.alfatron.AlfamultiService2024.repository.OrdreDeMissionRepository;
import com.alfatron.AlfamultiService2024.validator.OrdreDeMissionValidator;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdreDeMissionService {

    private OrdreDeMissionRepository ordreDeMissionRepository;
    private OrdreDeMissionMapper ordreDeMissionMapper;
    private EmployeeService employeeService;
    private OrdreDeMissionValidator ordreDeMissionValidator;

    public OrdreDeMissionService(OrdreDeMissionRepository ordreDeMissionRepository, OrdreDeMissionMapper ordreDeMissionMapper, EmployeeService employeeService, OrdreDeMissionValidator ordreDeMissionValidator) {
        this.ordreDeMissionRepository = ordreDeMissionRepository;
        this.ordreDeMissionMapper = ordreDeMissionMapper;
        this.employeeService = employeeService;
        this.ordreDeMissionValidator = ordreDeMissionValidator;
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
          return ordreDeMissionRepository.findById(id).
                  map(ordreDeMissionMapper::toOrdreDeMissionDto)
                  .orElseThrow(()->new Custom_EntityNotFoundException("Impossible de trouvé un ordre de mission avec id : "+id, ErrorCodes.ORDRE_DE_MISSION_NOT_FOUND));
    }

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
    public List<OrdreDeMissionDto> RechercheParDateOrdreDeMission(String dateOrdreDeMission){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");

        List<OrdreDeMissionDto> listeOrdreDeMissionDto = ordreDeMissionRepository.RechercheParDateOrdreDeMission(dateOrdreDeMission,sort).stream()
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
