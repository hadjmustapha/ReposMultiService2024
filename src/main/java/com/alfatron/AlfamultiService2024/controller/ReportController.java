package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.service.JasperService;
import com.alfatron.AlfamultiService2024.service.NatureMissionService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/pdf")
@CrossOrigin
public class ReportController {

    NatureMissionService natureMissionService;
    JasperService jasperService;
    public ReportController(NatureMissionService natureMissionService,JasperService jasperService) {
        this.natureMissionService = natureMissionService;
        this.jasperService = jasperService;
    }

    @GetMapping(value ="/{id}",produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> reporting(@PathVariable Integer id) throws JRException, IOException {
        return jasperService.reporting(id);
    }


}
