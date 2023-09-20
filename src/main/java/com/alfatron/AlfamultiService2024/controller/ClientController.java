package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Client_Api;
import com.alfatron.AlfamultiService2024.model.Client;
import com.alfatron.AlfamultiService2024.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Client")
@AllArgsConstructor
public class ClientController implements Client_Api {

    private ClientService clientService;

    public List<Client> findAll() {
        return clientService.findAll();
    }

    public Optional<Client> findById(int id) {
        return clientService.findById(id);
    }
}
