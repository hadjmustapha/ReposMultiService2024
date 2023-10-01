package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.FournisseurDto;
import com.alfatron.AlfamultiService2024.exception.EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.FournisseurMapper;
import com.alfatron.AlfamultiService2024.model.Client;
import com.alfatron.AlfamultiService2024.model.Fournisseur;
import com.alfatron.AlfamultiService2024.repository.FournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FournisseurService {

    private FournisseurRepository fournisseurRepository;
    private FournisseurMapper fournisseurMapper;

    public List<FournisseurDto> findAll(){
        return fournisseurRepository.findAll().stream()
                .map(fournisseurMapper::toFournisseurDto)
                .collect(Collectors.toList());
    }

    public FournisseurDto findById(Integer id){
        return fournisseurRepository.findById(id).map(fournisseurMapper::toFournisseurDto).orElseThrow(()->
            new EntityNotFoundException("Impssible de trouvé un fournisseur avec id : "+id, ErrorCodes.FOURNISSEUR_NOT_FOUND)
        );
    }


}
