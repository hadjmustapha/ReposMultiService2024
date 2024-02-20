package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.COM_CLIENT_Api;
import com.alfatron.AlfamultiService2024.dto.ClientDto;
import com.alfatron.AlfamultiService2024.mapper.COM_CLIENT_Mapper;
import com.alfatron.AlfamultiService2024.service.COM_CLIENT_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Client")
@CrossOrigin
public class COM_CLIENT_Controller implements COM_CLIENT_Api {

    private COM_CLIENT_Service clientService;

    public COM_CLIENT_Controller(COM_CLIENT_Service clientService/*, COM_CLIENT_Mapper clientMapper*/) {
        this.clientService = clientService;
    }

    public List<ClientDto> findAllClients() {
        return clientService.findAllClients();
    }


    public ClientDto findClientById(Integer id) {
        return clientService.findClientById(id);
    }


}
