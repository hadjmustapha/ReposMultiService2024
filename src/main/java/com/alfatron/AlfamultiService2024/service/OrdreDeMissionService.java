package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import com.alfatron.AlfamultiService2024.exception.EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.OrdreDeMissionMapper;
import com.alfatron.AlfamultiService2024.model.OrdreDeMission;
import com.alfatron.AlfamultiService2024.repository.OrdreDeMissionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Optional.of;

@Service
@AllArgsConstructor
@Slf4j
public class OrdreDeMissionService {

    private OrdreDeMissionRepository ordreDeMissionRepository;
    private OrdreDeMissionMapper ordreDeMissionMapper;
    private EmployeeService employeeService;

    public List<OrdreDeMissionDto> findAll(){
        return ordreDeMissionRepository.findAll().stream()
                .map(ordreDeMissionMapper::toOrdreDeMissionDto)
                .collect(Collectors.toList());
    }

    public OrdreDeMissionDto findById(int id){
          return ordreDeMissionRepository.findById(id).
                  map(ordreDeMissionMapper::toOrdreDeMissionDto)
                  .orElseThrow(()->new EntityNotFoundException("Impossible de trouvé un ordre de mission avec id : "+id, ErrorCodes.ORDRE_DE_MISSION_NOT_FOUND));
    }

    public OrdreDeMissionDto save(OrdreDeMissionDto ordreDeMissionDto){
        //validation des données en input
        if (ordreDeMissionDto.getId() == null) {
            ordreDeMissionDto.setId(0);
        }
        //conversion dto en entité  --> puis reconversion à nouveau entity en dto
        return ordreDeMissionMapper.toOrdreDeMissionDto(ordreDeMissionRepository.save(ordreDeMissionMapper.toOrdreDeMission(ordreDeMissionDto)));
    };




}
