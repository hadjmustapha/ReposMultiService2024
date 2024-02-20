package com.alfatron.AlfamultiService2024.controller.api;

import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.model.ADMIN.SYS_LOGIN;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface SYS_LOGIN_Api {

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des utilisateurs",
            responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                    @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public List<UtilisateurDto> findAllUsers();

    //@GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    //public UtilisateurDto findUserById(@PathVariable Integer id);

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public SYS_LOGIN findUserById(@PathVariable Integer id);

    @GetMapping(value="/findByUsername",produces= MediaType.APPLICATION_JSON_VALUE)
    public UtilisateurDto filtreRolesParUsername(@RequestParam String username);

    @GetMapping(value="/findByUsername2",produces= MediaType.APPLICATION_JSON_VALUE)
    public SYS_LOGIN filtreRolesParUsername2(@RequestParam String username);

    /*
     @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enregistrement d'un ordre de mission ",
            responses={@ApiResponse(responseCode="200",description ="save ordre de mission avec succés ! "),
                       @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public OrdreDeMissionDto saveOrdreDeMission(@RequestBody OrdreDeMissionDto ordreDeMissionDto);
     */

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enregistrement d'un utilisateur ",
            responses={@ApiResponse(responseCode="200",description ="save utilisateur avec succés ! "),
                    @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public SYS_LOGIN saveUtilisateur(@RequestBody SYS_LOGIN utilisateur);
}
