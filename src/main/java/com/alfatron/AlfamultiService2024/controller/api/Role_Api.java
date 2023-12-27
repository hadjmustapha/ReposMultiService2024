package com.alfatron.AlfamultiService2024.controller.api;

import com.alfatron.AlfamultiService2024.dto.RoleDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface Role_Api {

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupération des roles",
            responses={@ApiResponse(responseCode="200",description ="récupération Data avec succés ! "),
                    @ApiResponse (responseCode="400",description="Mauvaise requête  ! ")
            })
    public List<RoleDto> findAllRoles();

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public RoleDto findRoleById(@PathVariable String id);

    @GetMapping(value="/findUsersByRole",produces= MediaType.APPLICATION_JSON_VALUE)
    public RoleDto findUsersByRole(@RequestParam String role);
}
