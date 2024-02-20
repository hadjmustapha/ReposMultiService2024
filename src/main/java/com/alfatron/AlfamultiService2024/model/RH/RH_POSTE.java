package com.alfatron.AlfamultiService2024.model.RH;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RH_POSTE")
public class RH_POSTE {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="INTITULE")
    String intitule;

    @Column(name="DESCRIPTION")
    String description;

    @Column(name="ID_METIER")
    Integer idMetier;

    @Column(name="ID_POSTE_N1")
    Integer idPosteSuperieur;

    @Column(name="ID_STRUCTURE")
    Integer idStructure;

    @OneToMany(mappedBy ="posteEmployee")
    @JsonIgnore
    private List<ORG_EMPLOYEE> ORGEMPLOYEES = new ArrayList<>();

    public RH_POSTE() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdMetier() {
        return idMetier;
    }

    public void setIdMetier(Integer idMetier) {
        this.idMetier = idMetier;
    }

    public Integer getIdPosteSuperieur() {
        return idPosteSuperieur;
    }

    public void setIdPosteSuperieur(Integer idPosteSuperieur) {
        this.idPosteSuperieur = idPosteSuperieur;
    }

    public Integer getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(Integer idStructure) {
        this.idStructure = idStructure;
    }

    public List<ORG_EMPLOYEE> getEmployees() {
        return ORGEMPLOYEES;
    }

    public void setEmployees(List<ORG_EMPLOYEE> ORGEMPLOYEES) {
        this.ORGEMPLOYEES = ORGEMPLOYEES;
    }
}
