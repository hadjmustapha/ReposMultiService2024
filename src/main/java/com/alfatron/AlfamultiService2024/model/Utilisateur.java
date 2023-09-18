package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SYS_LOGIN")
@Getter
@Setter
@NoArgsConstructor
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;

    @Column(name = "USERNAME", length = 100)
    String username;

    @Column(name = "PASSWORD", length = 100)
    String password;

    @Column(name = "ID_EMPLOYEE")
    int idEmployee;

    @Column(name = "ID_PDV")
    int idPdv;

    public Utilisateur(String username, String password, int idEmployee, int idPdv) {
        this.username = username;
        this.password = password;
        this.idEmployee = idEmployee;
        this.idPdv = idPdv;
    }
}
