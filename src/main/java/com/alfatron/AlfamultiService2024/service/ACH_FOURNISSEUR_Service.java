package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.ACH_FOURNISSEUR_Mapper;
import com.alfatron.AlfamultiService2024.repository.ACH_FOURNISSEUR_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ACH_FOURNISSEUR_Service {

    private ACH_FOURNISSEUR_Repository fournisseurRepository;
    private ACH_FOURNISSEUR_Mapper fournisseurMapper;

    public ACH_FOURNISSEUR_Service(ACH_FOURNISSEUR_Repository fournisseurRepository, ACH_FOURNISSEUR_Mapper fournisseurMapper) {
        this.fournisseurRepository = fournisseurRepository;
        this.fournisseurMapper = fournisseurMapper;
    }

    public List<FournisseurDto> findAllFournisseurs(){
        return fournisseurRepository.findAll().stream()
                .map(fournisseurMapper::toFournisseurDto)
                .collect(Collectors.toList());
    }

    public FournisseurDto findFournisseurById(Integer id){
        if (id == null) {
           // log.error("Fournisseur ID is null");
            return null;
        }

        return fournisseurRepository.findById(id).map(fournisseurMapper::toFournisseurDto).orElseThrow(()->
            new Custom_EntityNotFoundException("Impssible de trouvé un fournisseur avec id : "+id, ErrorCodes.FOURNISSEUR_NOT_FOUND)
        );
    }

    /*
     @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setFournisseur(this);
    }
    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setFournisseur(null);
        ordresDeMissions.remove(odm);
    }
     */


}
