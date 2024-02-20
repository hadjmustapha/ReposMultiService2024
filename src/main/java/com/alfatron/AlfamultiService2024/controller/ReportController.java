package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.service.JasperService;
import com.alfatron.AlfamultiService2024.service.RH_NATURE_ODM_Service;
import net.sf.jasperreports.engine.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/pdf")
@CrossOrigin
public class ReportController {

    RH_NATURE_ODM_Service natureMissionService;
    JasperService jasperService;
    public ReportController(RH_NATURE_ODM_Service natureMissionService, JasperService jasperService) {
        this.natureMissionService = natureMissionService;
        this.jasperService = jasperService;
    }

    @GetMapping(value ="/{id}",produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> reporting(@PathVariable Integer id) throws JRException, IOException {
        System.out.println("-----------------------------------ReportController----------------------");
        return jasperService.reporting(id);
    }


}
