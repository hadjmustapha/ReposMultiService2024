package com.alfatron.AlfamultiService2024.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "ACH_FOURNISSEUR")
@Getter
@Setter
@NoArgsConstructor
public class Fournisseur {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//ID	int

    @Column(name="REFERENCE",length = 50)
    private String references;

    @Column(name="DATE_CREATION")
    private Date dateCreation;

    @Column(name="COMPTE_AUX",length = 50,nullable = false)
    private String compteAux;

    @Column(name="RAISON_SOCIALE",length = 100)
    private String raisonSociale;

    @Column(name="AUX_COMPLET")
    @Transient
    private String AUX_COMPLET;

    @Column(name="ADRESSE")
    private String adresse;

    @Column(name="CP",length = 50)
    private String cp;

    @Column(name="VILLE")
    private int ville ;

    @Column(name="PAYS")
    private int pays;

    @Column(name="ID_FISCALE",length = 50)
    private String id_fiscale;

    @Column(name="RC",length = 50)
    private String registreDeCommerce;

    @Column(name="MODE_REGLEMENT",length = 50)
    private String modeReglement;

    @Column(name="ECHEANCE")
    private int echeance;

    @Column(name="CREDIT")
    private float credit;

    @Column(name="BANQUE",length = 50)
    private String banque;

    @Column(name="EXO")
    private boolean exonere;

    @Column(name="ETAT_FRS",length = 50)
    private String etatFournisseur;

    @Column(name="CONTACT_PRINCIPALE",length = 100)
    private String contactPricipale;

    @Column(name="EMAIL_PRINCIPALE",length = 100)
    private String emailprincipale;

    @Column(name="CONTACT_AUTRES")
    private String AutresContacts;

    @Column(name="TEL_PRINCIPALE",length = 50)
    private String telephonePrincipale;

    @Column(name="TEL_AUTRES")
    private String autresTel;

    @Column(name="PRODUITS_FRS")
    private String produtisFournisseurs;

    @Column(name="PRODUITS_RETENUS")
    private String produitsRetenus;

    @Column(name="TYPE_FRS",length = 10)
    private String typeFournisseurs;

    @Column(name="FAMILLE",nullable = false)
    private int familleFournisseur;

    @Column(name="CONTACT_FONCTION",length = 100)
    private String contactFonction;

    @Column(name="FAX",length = 100)
    private String fax;

    @Column(name="NOTE")
    private String note;

    @Column(name="WEB",length = 100)
    private String web;

    @Column(name="ETAT")
    private int etat;

    @Transient
    @Column(name="REF_COMPLET")
    private String REF_COMPLET;

    @Column(name="NIS",length = 100)
    private String numeroIdentificationSociale;

    @OneToMany(mappedBy = "fournisseur")
    @JsonIgnore
    private ArrayList<OrdreDeMission> ordresDeMissions = new ArrayList<>();

    @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setFournisseur(this);
    }
    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setFournisseur(null);
        ordresDeMissions.remove(odm);
    }
 }
