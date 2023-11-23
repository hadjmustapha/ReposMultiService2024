package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.UtilisateurRoleDto;
import com.alfatron.AlfamultiService2024.model.UtilisateurRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UtilisateurRoleMapper {

    @Mapping(source = "idUtilisateurRole",target = "id")
    @Mapping(source = "utilisateurDto",target = "utilisateur")
    @Mapping(source = "roleDto",target = "role")
    UtilisateurRole toUtilisateurRole(UtilisateurRoleDto utilisateurRoleDto);

    @Mapping(source = "id",target = "idUtilisateurRole")
    @Mapping(source = "utilisateur",target = "utilisateurDto")
    @Mapping(source = "role",target = "roleDto")
    UtilisateurRoleDto toUtilisateurRoleDto(UtilisateurRole utilisateurRole);

}
