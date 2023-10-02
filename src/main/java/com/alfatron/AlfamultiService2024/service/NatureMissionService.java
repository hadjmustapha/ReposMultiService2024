package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.exception.EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.NatureMissionMapper;
import com.alfatron.AlfamultiService2024.model.NatureMission;
import com.alfatron.AlfamultiService2024.repository.NatureMissionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class NatureMissionService {

    NatureMissionRepository natureMissionRepository;
    private NatureMissionMapper NatureMissionmapper;

    public List<NatureMissionDto> findAllNatureDeMissions(){
        return natureMissionRepository.findAll().stream()
                .map(NatureMissionmapper::toNatureMissionDto)
                .collect(Collectors.toList());
    }

    public NatureMissionDto findNatureMissionById(Integer id)
    {
        if (id == null) {
            log.error("Nature ID is null");
            return null;
        }
        return natureMissionRepository.findById(id).
               map(NatureMissionmapper::toNatureMissionDto).orElseThrow(()->
             new EntityNotFoundException("Aucune donnée trouvé avec cet identifiant : "+id, ErrorCodes.NATURE_DE_MISSION_NOT_FOUND) );
    }


}
