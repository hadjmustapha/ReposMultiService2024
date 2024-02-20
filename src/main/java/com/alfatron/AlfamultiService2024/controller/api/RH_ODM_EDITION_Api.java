package com.alfatron.AlfamultiService2024.controller.api;

import com.alfatron.AlfamultiService2024.dto.RH_ODM_EDITION;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RH_ODM_EDITION_Api {

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des ordres de missions",
            responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                    @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public List<RH_ODM_EDITION> findAllOrdreDeMissionsEdition();

    //--------------------------------------------------------------------------------------------------------------
    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    //origins = "http://localhost:4200", allowedHeaders = "*"

    public RH_ODM_EDITION findOrdreDeMissionEditionById(@PathVariable Integer id);

    //--------------------------------------------------------------------------------------------------------------
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enregistrement d'un ordre de mission ",
            responses={@ApiResponse(responseCode="200",description ="save ordre de mission avec succés ! "),
                    @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public RH_ODM_EDITION saveOrdreDeMission(@RequestBody RH_ODM_EDITION ordreDeMissionEdition);
//--------------------------------------------------------------------------------------------------------------
}
