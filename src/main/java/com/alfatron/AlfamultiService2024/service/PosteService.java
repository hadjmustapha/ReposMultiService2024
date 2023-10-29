package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.PosteDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.PosteMapper;
import com.alfatron.AlfamultiService2024.repository.PosteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PosteService {

    private PosteRepository posteRepository;
    private PosteMapper posteMapper;

    public PosteService(PosteRepository posteRepository, PosteMapper posteMapper) {
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
