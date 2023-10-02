package com.alfatron.AlfamultiService2024.controller.api;


import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.model.NatureMission;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;


public interface NatureMission_Api {

    @GetMapping(value="/RecupAll",produces= MediaType.APPLICATION_JSON_VALUE)
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
