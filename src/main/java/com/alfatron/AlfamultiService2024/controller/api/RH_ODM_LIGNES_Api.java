package com.alfatron.AlfamultiService2024.controller.api;

import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_LIGNES;
import com.alfatron.AlfamultiService2024.model.RH.RH_ODM_RUB;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RH_ODM_LIGNES_Api {

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des ligne odm ",
            responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                    @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public List<RH_ODM_LIGNES> findAll_RH_ODM_LIGNES();

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public RH_ODM_LIGNES find_RH_ODM_LIGNES_ById(@PathVariable Integer id);

}
