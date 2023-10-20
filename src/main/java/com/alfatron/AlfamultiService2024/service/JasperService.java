package com.alfatron.AlfamultiService2024.service;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class JasperService {

    NatureMissionService natureMissionService;
    OrdreDeMissionService ordreDeMissionService;

    public JasperService(NatureMissionService natureMissionService,OrdreDeMissionService ordreDeMissionService) {
        this.natureMissionService = natureMissionService;
        this.ordreDeMissionService = ordreDeMissionService;
    }

    public ResponseEntity<byte[]> reporting(Integer id) throws JRException, IOException {
/*
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(

                new NatureMissionDto(1,"Keyboard"),
                new NatureMissionDto(2,"fff")

        ), false);
*/
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(ordreDeMissionService.findAllOrdreDeMission(), false);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("total", id);

        JasperReport compileReport = JasperCompileManager
               .compileReport(new FileInputStream("src/main/resources/test2024_2.jrxml"));
        //JasperReport compileReport = JasperCompileManager
          //      .compileReport(new FileInputStream("src/main/resources/Blank_A4.jrxml"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, parameters, beanCollectionDataSource);


        byte data[] = JasperExportManager.exportReportToPdf(jasperPrint);

        //System.err.println(data);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");


        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
    }

}
