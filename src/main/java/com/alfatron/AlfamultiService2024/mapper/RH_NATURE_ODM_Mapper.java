package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.model.RH.RH_NATURE_ODM;
import org.mapstruct.Mapper;

@Mapper
public interface RH_NATURE_ODM_Mapper {

    //@Mapping(source = "id",target = "nature")
    NatureMissionDto toNatureMissionDto(RH_NATURE_ODM natureMission);

    //@Mapping(source = "nature",target = "id")
    RH_NATURE_ODM toNatureMission(NatureMissionDto natureMissionDto);

}
