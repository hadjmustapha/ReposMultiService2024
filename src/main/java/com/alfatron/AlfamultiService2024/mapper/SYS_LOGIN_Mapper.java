package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.model.ADMIN.SYS_LOGIN;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {SYS_ROLE_Mapper.class})
public interface SYS_LOGIN_Mapper {

     @Mapping(source = "username",target = "username")
     @Mapping(source = "password",target = "password")
     SYS_LOGIN toUtilisateur(UtilisateurDto utilisateurDto);

     @Mapping(source = "username",target = "username")
     @Mapping(source = "password",target = "password")
     UtilisateurDto toUtilisateurDto(SYS_LOGIN utilisateur);

}
