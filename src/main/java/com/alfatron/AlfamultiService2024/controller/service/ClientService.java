package com.alfatron.AlfamultiService2024.controller.service;

import com.alfatron.AlfamultiService2024.model.Client;
import com.alfatron.AlfamultiService2024.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {

    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Optional<Client> findById(int id) {
        //---- must return client Dto
        return clientRepository.findById(id);
    }


}
