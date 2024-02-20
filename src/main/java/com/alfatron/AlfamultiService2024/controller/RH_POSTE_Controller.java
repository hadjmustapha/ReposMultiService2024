package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.RH_POSTE_Api;
import com.alfatron.AlfamultiService2024.dto.PosteDto;
import com.alfatron.AlfamultiService2024.service.RH_POSTE_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Poste")
@CrossOrigin
public class RH_POSTE_Controller implements RH_POSTE_Api {

    private RH_POSTE_Service posteService;

    public RH_POSTE_Controller(RH_POSTE_Service posteService) {
        this.posteService = posteService;
    }

    public List<PosteDto> findAllPostes() {
        return posteService.findAllPostes();
    }

    public PosteDto findPosteById(Integer id) {
        return posteService.findPosteById(id);
    }

}
