package com.alfatron.AlfamultiService2024.controller.api;


import com.alfatron.AlfamultiService2024.model.NatureMission;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


public interface NatureMission_Api {


    @GetMapping(value="/NatureDeMission",produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des natures de missions",
               responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                          @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
                         })
    public List<NatureMission> findAll();
}
