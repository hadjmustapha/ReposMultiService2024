package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.StructureDto;
import com.alfatron.AlfamultiService2024.model.Structure;
import org.mapstruct.Mapper;

@Mapper
public interface StructureMapper {

    StructureDto toStructureDto(Structure structure);

    Structure toStructure(StructureDto structureDto);
}
