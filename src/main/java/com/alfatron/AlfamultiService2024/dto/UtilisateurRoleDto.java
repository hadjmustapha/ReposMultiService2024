package com.alfatron.AlfamultiService2024.dto;

public class UtilisateurRoleDto {

    Integer idUtilisateurRole;

    RoleDto roleDto;

    UtilisateurDto utilisateurDto;

    public Integer getIdUtilisateurRole() {
        return idUtilisateurRole;
    }

    public void setIdUtilisateurRole(Integer idUtilisateurRole) {
        this.idUtilisateurRole = idUtilisateurRole;
    }

    public RoleDto getRoleDto() {
        return roleDto;
    }

    public void setRoleDto(RoleDto roleDto) {
        this.roleDto = roleDto;
    }

    public UtilisateurDto getUtilisateurDto() {
        return utilisateurDto;
    }

    public void setUtilisateurDto(UtilisateurDto utilisateurDto) {
        this.utilisateurDto = utilisateurDto;
    }

}
