package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.dto.RoleDto;
import com.alfatron.AlfamultiService2024.dto.UtilisateurDto;
import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.mapper.RoleMapper;
import com.alfatron.AlfamultiService2024.model.Role;
import com.alfatron.AlfamultiService2024.model.UtilisateurRole;
import com.alfatron.AlfamultiService2024.repository.RoleRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        Role roleModel = roleRepository.filtreParRole(role, sort)
                .orElseThrow(() -> new Custom_EntityNotFoundException("Aucun role trouvé avec id : " + role, ErrorCodes.ROLE_NOT_FOUND));

        RoleDto roleDto = listUsers_toListUsersDto(roleModel);

        return roleDto;
    }

    public RoleDto listUsers_toListUsersDto(Role role) {

        RoleDto roleDto = roleMapper.toRoleDto(role);

        for (UtilisateurRole utilisateurRole : role.getUtilisateurs()) {
            if (role.getUtilisateurs() != null) {
                roleDto.getUserDtos().add(utilisateurRole.getUtilisateur().getUsername());
            }

        }
        return roleDto;
    }


}
