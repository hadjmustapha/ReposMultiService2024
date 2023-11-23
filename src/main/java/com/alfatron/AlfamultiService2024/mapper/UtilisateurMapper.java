package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.model.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {RoleMapper.class})
public interface UtilisateurMapper {

     @Mapping(source = "username",target = "username")
     Utilisateur toUtilisateur(UtilisateurDto utilisateurDto);

     @Mapping(source = "username",target = "username")
     UtilisateurDto toUtilisateurDto(Utilisateur utilisateur);

}
