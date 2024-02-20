package com.alfatron.AlfamultiService2024.controller;

import com.alfatron.AlfamultiService2024.controller.api.SYS_ROLE_Api;
import com.alfatron.AlfamultiService2024.dto.RoleDto;
import com.alfatron.AlfamultiService2024.service.SYS_ROLE_Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alfatron.AlfamultiService2024.utils.Constant.APP_ROOT;

@RestController
@RequestMapping(APP_ROOT+"/Role")
public class SYS_ROLE_Controller implements SYS_ROLE_Api {

    private SYS_ROLE_Service roleService;

    public SYS_ROLE_Controller(SYS_ROLE_Service roleService) {
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
