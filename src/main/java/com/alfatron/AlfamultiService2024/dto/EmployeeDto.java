package com.alfatron.AlfamultiService2024.dto;

import lombok.Getter;
import lombok.Setter;


public class EmployeeDto {

    Integer id;

    String nomComplet;

    Integer matricule;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Integer getMatricule() {
        return matricule;
    }

    public void setMatricule(Integer matricule) {
        this.matricule = matricule;
    }
}
