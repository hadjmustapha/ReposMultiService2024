package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.RoleDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RoleMapper;
import com.alfatron.AlfamultiService2024.model.SYS_ROLE;
import com.alfatron.AlfamultiService2024.model.SYS_LOGIN_PROFIL;
import com.alfatron.AlfamultiService2024.repository.RoleRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {

    private RoleRepository roleRepository;
    private RoleMapper roleMapper;

    public RoleService(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    public List<RoleDto> findAllRoles() {
        return roleRepository.findAll()
                .stream()
                .map(roleMapper::toRoleDto)
                .collect(Collectors.toList());
    }

    public RoleDto findRoleById(String id) {
        return roleRepository.findById(id)
                .map(roleMapper::toRoleDto)
                .orElseThrow(() -> new Custom_EntityNotFoundException("Aucun role trouvé avec id : " + id, ErrorCodes.ROLE_NOT_FOUND));
    }

    public RoleDto findUsersByRole(String role) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        SYS_ROLE alfaRoleModel = roleRepository.filtreParRole(role, sort)
                .orElseThrow(() -> new Custom_EntityNotFoundException("Aucun role trouvé avec id : " + role, ErrorCodes.ROLE_NOT_FOUND));

        RoleDto roleDto = listUsers_toListUsersDto(alfaRoleModel);

        return roleDto;
    }

    public RoleDto listUsers_toListUsersDto(SYS_ROLE alfaRole) {

        RoleDto roleDto = roleMapper.toRoleDto(alfaRole);

        for (SYS_LOGIN_PROFIL utilisateurRole : alfaRole.getUtilisateurs()) {
            if (alfaRole.getUtilisateurs() != null) {
                roleDto.getUserDtos().add(utilisateurRole.getUtilisateur().getUsername());
            }

        }
        return roleDto;
    }


}
