package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.NatureMissionDto;
import com.alfatron.AlfamultiService2024.model.NatureMission;
import org.mapstruct.Mapper;

@Mapper
public interface NatureMissionMapper {

    NatureMissionDto toNatureMissionDto(NatureMission natureMission);

    NatureMission toNatureMission(NatureMissionDto natureMissionDto);


}
