package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.TypeDeTransport_Api;
import com.alfatron.AlfamultiService2024.dto.TypeDeTransportDto;
import com.alfatron.AlfamultiService2024.model.TypeDeTransport;
import com.alfatron.AlfamultiService2024.service.TypeDeTransportService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/TypeDeTransport")
@CrossOrigin
public class TypeDeTransportController implements TypeDeTransport_Api {

    private TypeDeTransportService typeDeTransportService;

    public TypeDeTransportController(TypeDeTransportService typeDeTransportService) {
        this.typeDeTransportService = typeDeTransportService;
    }

    public List<TypeDeTransportDto> findAllTypeDeTransports() {
        return typeDeTransportService.findAllTypeDeTransports();
    }

    public TypeDeTransportDto findTypeDeTransportById(Integer id) {
        return typeDeTransportService.findTypeDeTransportById(id);
    }
}
