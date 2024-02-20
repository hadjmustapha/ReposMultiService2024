package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.COM_CLIENT_Mapper;
import com.alfatron.AlfamultiService2024.repository.COM_CLIENT_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class COM_CLIENT_Service {

    private COM_CLIENT_Repository clientRepository;
    //private COM_CLIENT_Mapper clientMapper;

    public COM_CLIENT_Service(COM_CLIENT_Repository clientRepository/*, COM_CLIENT_Mapper clientMapper*/) {
        this.clientRepository = clientRepository;
        //this.clientMapper = clientMapper;
    }

    public List<ClientDto> findAllClients(){
        return null;/*clientRepository.findAll().stream()
                .map(clientMapper::toClientDto)
                .collect(Collectors.toList());*/
    }

    public ClientDto findClientById(Integer id) {
        //---- must return client Dto
        if (id == null) {
            return null;
        }
       return null;
               /*clientRepository.findById(id)
               .map(clientMapper::toClientDto)
               .orElseThrow(()-> new Custom_EntityNotFoundException("Aucun client trouvé avec id : "+id ,ErrorCodes.CLIENT_NOT_FOUND));

                */
    }

    /*
    @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setClient(this);
    }
    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setClient(null);
        ordresDeMissions.remove(odm);
    }
    */



}
