package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SYS_LOGIN_PROFIL")
@Getter
@Setter
@NoArgsConstructor
public class UtilisateurRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "ID_LOGIN")
    int idLogin;

    @Column(name = "PROFIL",length = 10)
    String profil;

    @Column(name = "MODULE",length = 10)
    String moducle;

    @Column(name = "ROLE",length = 50)
    String role;

    public UtilisateurRole(int idLogin, String profil, String moducle, String role) {
        this.idLogin = idLogin;
        this.profil = profil;
        this.moducle = moducle;
        this.role = role;
    }
}
