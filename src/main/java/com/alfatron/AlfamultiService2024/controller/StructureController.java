package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Structure_Api;
import com.alfatron.AlfamultiService2024.dto.StructureDto;
import com.alfatron.AlfamultiService2024.model.Structure;
import com.alfatron.AlfamultiService2024.service.StructureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Structure")
@AllArgsConstructor
public class StructureController implements Structure_Api {

    private StructureService structureService;

    public List<StructureDto> findAll() {
        return null;//structureService.findAll();
    }

    public StructureDto findById(Integer id) {
        return null;//structureService.findById(id);
    }
}
