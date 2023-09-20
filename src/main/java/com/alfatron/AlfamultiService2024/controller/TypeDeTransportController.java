package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.TypeDeTransport_Api;
import com.alfatron.AlfamultiService2024.model.TypeDeTransport;
import com.alfatron.AlfamultiService2024.service.TypeDeTransportService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/TypeDeTransport")
@AllArgsConstructor
public class TypeDeTransportController implements TypeDeTransport_Api {

    private TypeDeTransportService typeDeTransportService;

    public List<TypeDeTransport> findAll() {
        return typeDeTransportService.findAll();
    }

    public Optional<TypeDeTransport> findById(int id) {
        return typeDeTransportService.findById(id);
    }
}
