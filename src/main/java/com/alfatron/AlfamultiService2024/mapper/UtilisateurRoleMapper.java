package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.UtilisateurRoleDto;
import com.alfatron.AlfamultiService2024.model.SYS_LOGIN_PROFIL;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UtilisateurRoleMapper {

    @Mapping(source = "idUtilisateurRole",target = "id")
    @Mapping(source = "utilisateurDto",target = "utilisateur")
    @Mapping(source = "roleDto",target = "alfaRole")
    SYS_LOGIN_PROFIL toUtilisateurRole(UtilisateurRoleDto utilisateurRoleDto);

    @Mapping(source = "id",target = "idUtilisateurRole")
    @Mapping(source = "utilisateur",target = "utilisateurDto")
    @Mapping(source = "alfaRole",target = "roleDto")
    UtilisateurRoleDto toUtilisateurRoleDto(SYS_LOGIN_PROFIL utilisateurRole);

}
