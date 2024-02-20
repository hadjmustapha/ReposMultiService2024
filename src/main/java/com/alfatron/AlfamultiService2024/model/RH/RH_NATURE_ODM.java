package com.alfatron.AlfamultiService2024.model.RH;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RH_NATURE_ODM")
public class RH_NATURE_ODM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "LIBELLE", length = 100)
    String libelle;

    @Column(name = "COMPTE_6")
    Integer compte6;

    @OneToMany(mappedBy = "natureMission")
    @JsonIgnore
    private List<RH_ODM> ordresDeMissions= new ArrayList<>();

    public RH_NATURE_ODM() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getCompte6() {
        return compte6;
    }

    public void setCompte6(Integer compte6) {
        this.compte6 = compte6;
    }

    public List<RH_ODM> getOrdresDeMissions() {
        return ordresDeMissions;
    }

    public void setOrdresDeMissions(List<RH_ODM> ordresDeMissions) {
        this.ordresDeMissions = ordresDeMissions;
    }



}
