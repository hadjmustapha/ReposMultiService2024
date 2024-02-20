package com.alfatron.AlfamultiService2024.controller.api;


import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface RH_NATURE_ODM_Api {

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des natures de missions",
               responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                          @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
                         })
    public List<NatureMissionDto> findAllNatureDeMissions();

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public NatureMissionDto findNatureMissionById(@PathVariable Integer id);

    //@DeleteMapping(value = "/{id}")
    //public void deleteNature(@PathVariable int id);
}