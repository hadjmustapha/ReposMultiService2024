package com.alfatron.AlfamultiService2024.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UtilisateurDto {

    String username;

    Set<String> roleDtos = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<String> getRoleDtos() {
        return roleDtos;
    }

    public void setRoleDtos(Set<String> roleDtos) {
        this.roleDtos = roleDtos;
    }
}
