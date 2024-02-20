package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.RH_ODM_TRANSPORT_Api;
import com.alfatron.AlfamultiService2024.dto.TypeDeTransportDto;
import com.alfatron.AlfamultiService2024.service.RH_ODM_TRANSPORT_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/TypeDeTransport")
@CrossOrigin
public class RH_ODM_TRANSPORT_Controller implements RH_ODM_TRANSPORT_Api {

    private RH_ODM_TRANSPORT_Service typeDeTransportService;

    public RH_ODM_TRANSPORT_Controller(RH_ODM_TRANSPORT_Service typeDeTransportService) {
        this.typeDeTransportService = typeDeTransportService;
    }

    public List<TypeDeTransportDto> findAllTypeDeTransports() {
        return typeDeTransportService.findAllTypeDeTransports();
    }

    public TypeDeTransportDto findTypeDeTransportById(Integer id) {
        return typeDeTransportService.findTypeDeTransportById(id);
    }
}
