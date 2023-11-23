package com.alfatron.AlfamultiService2024.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne()
    @JoinColumn(name="ID_EMPLOYEE")
    @JsonIgnore
    Employee employee;

    @Column(name = "ID_PDV")
    @Transient
    @JsonIgnore
    Integer idPdv;

    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnore
    private List<UtilisateurRole> roles = new ArrayList<>();

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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getIdPdv() {
        return idPdv;
    }

    public void setIdPdv(Integer idPdv) {
        this.idPdv = idPdv;
    }

    public List<UtilisateurRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UtilisateurRole> roles) {
        this.roles = roles;
    }
}
