package com.alfatron.AlfamultiService2024.dto;

import lombok.Getter;
import lombok.Setter;


public class VehiculeDto {

    Integer id;

    String libelle;

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
}
