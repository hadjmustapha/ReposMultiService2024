package com.alfatron.AlfamultiService2024.controller.api;

import com.alfatron.AlfamultiService2024.dto.PosteDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

public interface RH_POSTE_Api {

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des Postes",
            responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                    @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public List<PosteDto> findAllPostes();


    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public PosteDto findPosteById(@PathVariable Integer id);
}
