package com.alfatron.AlfamultiService2024.controller.api;

import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_RUB;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RH_ODM_RUB_Api {

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des rubriques de frais de mission",
            responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                    @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public List<RH_ODM_RUB> findAllRubriques();

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public RH_ODM_RUB findRubriqueById(@PathVariable Integer id);

    @GetMapping(value="/toto",produces= MediaType.APPLICATION_JSON_VALUE)
    public String getToto();
}
