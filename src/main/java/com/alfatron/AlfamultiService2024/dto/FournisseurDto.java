package com.alfatron.AlfamultiService2024.dto;

import lombok.Getter;
import lombok.Setter;


public class FournisseurDto {

    Integer id;

    String raisonSociale;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }
}
