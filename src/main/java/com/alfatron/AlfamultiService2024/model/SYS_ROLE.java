package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SYS_ROLE")
@Transactional
public class SYS_ROLE {

    @Id
    @Column(name = "ROLE",length = 50)
    String role;

    @Column(name = "LIBELLE",length = 100)
    String libelle;

    @OneToMany(mappedBy = "sysRole")
    List<SYS_LOGIN_PROFIL> sys_login_profils = new ArrayList<>();

    public SYS_ROLE() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<SYS_LOGIN_PROFIL> getUtilisateurs() {
        return sys_login_profils;
    }

    public void setUtilisateurs(List<SYS_LOGIN_PROFIL> sys_login_profils) {
        this.sys_login_profils = sys_login_profils;
    }
}
