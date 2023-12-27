package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.VehiculeDto;
import com.alfatron.AlfamultiService2024.model.MG_INSTALLATIONS;
import org.mapstruct.Mapper;

@Mapper
public interface VehiculeMapper {

    VehiculeDto toVehiculeDto(MG_INSTALLATIONS vehicule);

    MG_INSTALLATIONS toVehicule(VehiculeDto vehiculeDto);

}
