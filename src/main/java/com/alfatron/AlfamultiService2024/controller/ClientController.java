package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Client_Api;
import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.mapper.ClientMapper;
import com.alfatron.AlfamultiService2024.model.Client;
import com.alfatron.AlfamultiService2024.controller.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Client")
@AllArgsConstructor
public class ClientController implements Client_Api {

    private ClientService clientService;
    private ClientMapper clientMapper;

    public ResponseEntity<?> findAll() {
        //return clientService.findAll();
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<?> findById(int id) {
          Optional<Client> clientOptional = clientService.findById(id);
          ClientDto clientDto = clientMapper.toClientDto(clientOptional.get());
          return ResponseEntity.ok(clientDto);
    }
}
