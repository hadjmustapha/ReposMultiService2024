package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.PosteDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RH_POSTE_Mapper;
import com.alfatron.AlfamultiService2024.repository.RH_POSTE_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RH_POSTE_Service {

    private RH_POSTE_Repository posteRepository;
    private RH_POSTE_Mapper posteMapper;

    public RH_POSTE_Service(RH_POSTE_Repository posteRepository, RH_POSTE_Mapper posteMapper) {
        this.posteRepository = posteRepository;
        this.posteMapper = posteMapper;
    }

    public  List<PosteDto> findAllPostes() {
        return posteRepository.findAll()
                .stream()
                .map(posteMapper::toPosteDto)
                .collect(Collectors.toList());
    }

    public  PosteDto findPosteById(Integer id) {

        if (id == null) {
            return null;
        }
        return posteRepository.findById(id)
                .map(posteMapper::toPosteDto)
                .orElseThrow(()-> new Custom_EntityNotFoundException("Aucun Poste trouvé avec id : "+id , ErrorCodes.POSTE_NOT_FOUND));
    }
}
