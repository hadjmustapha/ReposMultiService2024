package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.ClientMapper;
import com.alfatron.AlfamultiService2024.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private ClientRepository clientRepository;
    private ClientMapper clientMapper;

    public ClientService(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    public List<ClientDto> findAllClients(){
        return clientRepository.findAll().stream()
                .map(clientMapper::toClientDto)
                .collect(Collectors.toList());
    }

    public ClientDto findClientById(Integer id) {
        //---- must return client Dto
        if (id == null) {
            return null;
        }
       return clientRepository.findById(id)
               .map(clientMapper::toClientDto)
               .orElseThrow(()-> new Custom_EntityNotFoundException("Aucun client trouvé avec id : "+id ,ErrorCodes.CLIENT_NOT_FOUND));
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
