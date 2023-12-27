package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.model.SYS_LOGIN;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {RoleMapper.class})
public interface UtilisateurMapper {

     @Mapping(source = "username",target = "username")
     @Mapping(source = "password",target = "password")
     SYS_LOGIN toUtilisateur(UtilisateurDto utilisateurDto);

     @Mapping(source = "username",target = "username")
     @Mapping(source = "password",target = "password")
     UtilisateurDto toUtilisateurDto(SYS_LOGIN utilisateur);

}
