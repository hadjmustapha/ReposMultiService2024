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
    Integer id;

    @Column(name = "USERNAME", length = 100)
    String username;

    @Column(name = "PASSWORD", length = 100)
    String password;

    @Column(name = "ID_EMPLOYEE")
    Integer idEmployee;

    @Column(name = "ID_PDV")
    Integer idPdv;


}
