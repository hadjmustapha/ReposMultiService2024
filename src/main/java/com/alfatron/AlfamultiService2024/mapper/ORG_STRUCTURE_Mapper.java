package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.StructureDto;
import com.alfatron.AlfamultiService2024.model.RH.ORG_STRUCTURE;
import org.mapstruct.Mapper;

@Mapper
public interface ORG_STRUCTURE_Mapper {

    StructureDto toStructureDto(ORG_STRUCTURE structure);

    ORG_STRUCTURE toStructure(StructureDto structureDto);
}
