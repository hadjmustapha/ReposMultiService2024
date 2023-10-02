package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.Role;
import com.alfatron.AlfamultiService2024.repository.RoleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class RoleService {

    private RoleRepository roleRepository;

    public List<Role> findAllRoles(){
        return roleRepository.findAll();
    }
}
