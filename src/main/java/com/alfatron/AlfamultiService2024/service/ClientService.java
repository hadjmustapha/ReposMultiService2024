package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.exception.EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.ClientMapper;
import com.alfatron.AlfamultiService2024.repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class ClientService {

    private ClientRepository clientRepository;
    private ClientMapper clientMapper;

    public List<ClientDto> findAllClients(){
        return clientRepository.findAll().stream()
                .map(clientMapper::toClientDto)
                .collect(Collectors.toList());
    }



    public ClientDto findClientById(Integer id) {
        //---- must return client Dto
        if (id == null) {
            log.error("Client ID is null");
            return null;
        }
       return clientRepository.findById(id)
               .map(clientMapper::toClientDto)
               .orElseThrow(()-> new EntityNotFoundException("Aucun client trouvé avec id : "+id ,ErrorCodes.CLIENT_NOT_FOUND));

    }


}
