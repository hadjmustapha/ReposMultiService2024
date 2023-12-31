package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.FournisseurMapper;
import com.alfatron.AlfamultiService2024.repository.FournisseurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FournisseurService {

    private FournisseurRepository fournisseurRepository;
    private FournisseurMapper fournisseurMapper;

    public FournisseurService(FournisseurRepository fournisseurRepository, FournisseurMapper fournisseurMapper) {
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
