package com.alfatron.AlfamultiService2024.controller.api;

import com.alfatron.AlfamultiService2024.dto.OrdreDeMissionDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface RH_ODM_Api {

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des ordres de missions",
            responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                      @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public List<OrdreDeMissionDto> findAllOrdreDeMissions();

//--------------------------------------------------------------------------------------------------------------
    //@GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    //origins = "http://localhost:4200", allowedHeaders = "*"

    //public OrdreDeMissionDto findOrdreDeMissionById(@PathVariable Integer id);
//--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    //origins = "http://localhost:4200", allowedHeaders = "*"

    public OrdreDeMissionDto findOrdreDeMissionById(@PathVariable Integer id);

//--------------------------------------------------------------------------------------------------------------

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  @Operation(summary = "Enregistrement d'un ordre de mission ",
  responses={@ApiResponse(responseCode="200",description ="save ordre de mission avec succés ! "),
               @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
      })
  public OrdreDeMissionDto saveOrdreDeMission(@RequestBody OrdreDeMissionDto ordreDeMissionDto) ;

//--------------------------------------------------------------------------------------------------------------  RH_ODM
    /*
    @DeleteMapping(value = "/{id}")
    @Operation(summary = "Suppression d'un ordre de mission ",
            responses = {
            @ApiResponse(responseCode="200",description="success delete !!! "),
            @ApiResponse(responseCode="400",description="Mauvaise requete de suppression "),
            @ApiResponse(responseCode="500",description="Erreur serveur impossible de traiter ce genre de req ! "),


    })
    public void deleteOrdreDeMissionById(@PathVariable int id);
   */



}
