package com.alfatron.AlfamultiService2024.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SYS_ROLE")
public class Role {

    @Id
    @Column(name = "ROLE",length = 50)
    String role;

    @Column(name = "LIBELLE",length = 100)
    String libelle;

    @OneToMany(mappedBy = "role")
    List<UtilisateurRole> utilisateurs = new ArrayList<>();

    public Role() {
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

    public List<UtilisateurRole> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<UtilisateurRole> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
