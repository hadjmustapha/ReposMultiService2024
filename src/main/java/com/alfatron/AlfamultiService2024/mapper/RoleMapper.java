package com.alfatron.AlfamultiService2024.mapper;

import com.alfatron.AlfamultiService2024.dto.RoleDto;
import com.alfatron.AlfamultiService2024.model.SYS_ROLE;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {

     SYS_ROLE toRole(RoleDto roleDto);

     RoleDto toRoleDto(SYS_ROLE alfaRole);
}
