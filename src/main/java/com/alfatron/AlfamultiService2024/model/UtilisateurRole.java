package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SYS_LOGIN_PROFIL")
public class UtilisateurRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "ID_LOGIN")
    Integer idLogin;

    @Column(name = "PROFIL",length = 10)
    String profil;

    @Column(name = "MODULE",length = 10)
    String moducle;

    @Column(name = "ROLE",length = 50)
    String role;

    public UtilisateurRole() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getModucle() {
        return moducle;
    }

    public void setModucle(String moducle) {
        this.moducle = moducle;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
