package com.alfatron.AlfamultiService2024.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class NatureMissionDto {

    Integer id;

    String libelle;

    public NatureMissionDto(Integer id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public NatureMissionDto() {
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

}
