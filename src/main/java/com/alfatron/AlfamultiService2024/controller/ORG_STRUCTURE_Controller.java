package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.ORG_STRUCTURE_Api;
import com.alfatron.AlfamultiService2024.dto.StructureDto;
import com.alfatron.AlfamultiService2024.service.ORG_STRUCTURE_Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Structure")
@CrossOrigin
public class ORG_STRUCTURE_Controller implements ORG_STRUCTURE_Api {

    private ORG_STRUCTURE_Service structureService;

    public ORG_STRUCTURE_Controller(ORG_STRUCTURE_Service structureService) {
        this.structureService = structureService;
    }

    public List<StructureDto> findAllStructures() {
        return structureService.findAllStructures();
    }

    public StructureDto findStructureById(Integer id) {
        return structureService.findStructureById(id);
    }
}
