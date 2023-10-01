package com.alfatron.AlfamultiService2024.service;

import com.alfatron.AlfamultiService2024.model.Role;
import com.alfatron.AlfamultiService2024.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleService {

    private RoleRepository roleRepository;

    public List<Role> findAll(){
        return roleRepository.findAll();
    }
}
