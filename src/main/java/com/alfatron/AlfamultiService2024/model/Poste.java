package com.alfatron.AlfamultiService2024.model;

import com.alfatron.AlfamultiService2024.model.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RH_POSTE")
public class Poste {

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
    private List<Employee> employees = new ArrayList<>();

    public Poste() {
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
