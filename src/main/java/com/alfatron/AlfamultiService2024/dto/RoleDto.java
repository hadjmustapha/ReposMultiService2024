package com.alfatron.AlfamultiService2024.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoleDto {

    String role;

    Set userDtos = new HashSet();

    public Set getUserDtos() {
        return userDtos;
    }

    public void setUserDtos(Set userDtos) {
        this.userDtos = userDtos;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
