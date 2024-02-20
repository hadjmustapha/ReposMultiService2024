package com.alfatron.AlfamultiService2024.model.RH;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "RH_ODM_RUB")
public class RH_ODM_RUB {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="LIBELLE")
    String libelle;

    @Column(name="MTU")
    String montantUnitaire;

    @Column(name="COMPTE_6")
    Integer compte6;

    public RH_ODM_RUB() {
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

    public String getMontantUnitaire() {
        return montantUnitaire;
    }

    public void setMontantUnitaire(String montantUnitaire) {
        this.montantUnitaire = montantUnitaire;
    }

    public Integer getCompte6() {
        return compte6;
    }

    public void setCompte6(Integer compte6) {
        this.compte6 = compte6;
    }
}
