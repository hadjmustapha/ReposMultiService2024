package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.PosteDto;
import com.alfatron.AlfamultiService2024.model.Poste;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PosteMapper {

    @Mapping(source = "idPoste",target = "id")
    @Mapping(source = "intitulePoste",target = "intitule")
    Poste toPoste(PosteDto posteDto);

    @Mapping(source = "id",target = "idPoste")
    @Mapping(source = "intitule",target = "intitulePoste")
    PosteDto toPosteDto(Poste poste);

}
