package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SYS_LOGIN")
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

    public Utilisateur() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Integer getIdPdv() {
        return idPdv;
    }

    public void setIdPdv(Integer idPdv) {
        this.idPdv = idPdv;
    }
}
