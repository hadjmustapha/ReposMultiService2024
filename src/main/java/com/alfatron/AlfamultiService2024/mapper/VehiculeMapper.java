package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.VehiculeDto;
import com.alfatron.AlfamultiService2024.model.Vehicule;
import org.mapstruct.Mapper;

@Mapper
public interface VehiculeMapper {

    VehiculeDto toVehiculeDto(Vehicule vehicule);

    Vehicule toVehicule(VehiculeDto vehiculeDto);

}
