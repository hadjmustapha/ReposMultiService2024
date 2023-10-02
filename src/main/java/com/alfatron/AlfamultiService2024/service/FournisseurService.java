package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.exception.EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.FournisseurMapper;
import com.alfatron.AlfamultiService2024.model.Client;
import com.alfatron.AlfamultiService2024.model.Fournisseur;
import com.alfatron.AlfamultiService2024.repository.FournisseurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class FournisseurService {

    private FournisseurRepository fournisseurRepository;
    private FournisseurMapper fournisseurMapper;

    public List<FournisseurDto> findAllFournisseurs(){
        return fournisseurRepository.findAll().stream()
                .map(fournisseurMapper::toFournisseurDto)
                .collect(Collectors.toList());
    }

    public FournisseurDto findFournisseurById(Integer id){
        if (id == null) {
            log.error("Fournisseur ID is null");
            return null;
        }

        return fournisseurRepository.findById(id).map(fournisseurMapper::toFournisseurDto).orElseThrow(()->
            new EntityNotFoundException("Impssible de trouvé un fournisseur avec id : "+id, ErrorCodes.FOURNISSEUR_NOT_FOUND)
        );
    }


}
