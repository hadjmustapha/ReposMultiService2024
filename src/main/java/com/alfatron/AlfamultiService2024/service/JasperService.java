package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class JasperService {

    RH_NATURE_ODM_Service natureMissionService;
    RH_ODM_Service ordreDeMissionService;

    public JasperService(RH_NATURE_ODM_Service natureMissionService, RH_ODM_Service ordreDeMissionService) {
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
        //JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(ordreDeMissionService.findOrdreDeMissionById(id), false);
        //new JRBeanArrayDataSource(new YourBean[]{yourBean}));
        OrdreDeMissionDto OrdreDeMissionDto = ordreDeMissionService.findOrdreDeMissionById(id);
        JRBeanArrayDataSource jrBeanArrayDataSource = new JRBeanArrayDataSource(new OrdreDeMissionDto[]{OrdreDeMissionDto});
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("total", id);


       // JasperReport compileReport = JasperCompileManager
         //      .compileReport(new FileInputStream("src/main/resources/test2024_2.jrxml"));
        InputStream compileReport2 = new FileInputStream("src/main/resources/test2024_2.jasper");
       // Path path = Paths.get("D:\\WorkSpace Eclipse\\AlfamultiService2024\\src\\main\\resources\\test2024_2.jasper");
       // System.out.println(path);

       // D:\WorkSpace Eclipse\AlfamultiService2024\src\main\resources\test2024_2.jasper

        //InputStream compileReport2 = this.getClass().getResourceAsStream("/src/main/resources/test2024_2.jasper");

        JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport2, parameters, jrBeanArrayDataSource);


        byte data[] = JasperExportManager.exportReportToPdf(jasperPrint);

        //System.err.println(data);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");


        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
    }

}
