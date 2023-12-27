package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SYS_LOGIN_PROFIL")
public class SYS_LOGIN_PROFIL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @ManyToOne()
    @JoinColumn(name="ID_LOGIN")
    SYS_LOGIN utilisateur;

    @Column(name = "PROFIL",length = 10)
    String profil;

    @Column(name = "MODULE",length = 10)
    String module;

    @ManyToOne()
    @JoinColumn(name="ROLE")
    SYS_ROLE sysRole;

    public SYS_LOGIN_PROFIL() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SYS_LOGIN getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(SYS_LOGIN utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public SYS_ROLE getAlfaRole() {
        return sysRole;
    }

    public void setAlfaRole(SYS_ROLE sysRole) {
        this.sysRole = sysRole;
    }
}
