package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.model.RH_NATURE_ODM;
import org.mapstruct.Mapper;

@Mapper
public interface NatureMissionMapper {

    NatureMissionDto toNatureMissionDto(RH_NATURE_ODM natureMission);

    RH_NATURE_ODM toNatureMission(NatureMissionDto natureMissionDto);


}
