package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.Role_Api;
import com.alfatron.AlfamultiService2024.dto.RoleDto;
import com.alfatron.AlfamultiService2024.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Role")
public class RoleController implements Role_Api {

    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    public List<RoleDto> findAllRoles() {
        return roleService.findAllRoles();
    }

    public RoleDto findRoleById(String id) {
        return roleService.findRoleById(id);
    }

    public RoleDto findUsersByRole(String role){
        return roleService.findUsersByRole(role);
    }
}
