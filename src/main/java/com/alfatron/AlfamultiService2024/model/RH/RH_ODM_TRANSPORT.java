package com.alfatron.AlfamultiService2024.model.RH;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RH_ODM_TRANSPORT")
public class RH_ODM_TRANSPORT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "LIBELLE",length = 100)
    String libelle	;

    @OneToMany(mappedBy = "typeDeTransport")
    @JsonIgnore
    private List<RH_ODM> ordresDeMissions = new ArrayList<>();

    public RH_ODM_TRANSPORT() {
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

    public List<RH_ODM> getOrdresDeMissions() {
        return ordresDeMissions;
    }

    public void setOrdresDeMissions(List<RH_ODM> ordresDeMissions) {
        this.ordresDeMissions = ordresDeMissions;
    }




}
