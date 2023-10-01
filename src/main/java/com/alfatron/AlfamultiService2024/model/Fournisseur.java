package com.alfatron.AlfamultiService2024.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ACH_FOURNISSEUR")
@Getter
@Setter
@NoArgsConstructor
@DynamicUpdate
public class Fournisseur {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="REFERENCE",length = 50)
    String references;

    @Column(name="DATE_CREATION")
    Date dateCreation;

    @Column(name="COMPTE_AUX",length = 50,nullable = false)
    String compteAux;

    @Column(name="RAISON_SOCIALE",length = 100)
    String raisonSociale;

    @Column(name="AUX_COMPLET")
    String AUX_COMPLET;

    @Column(name="ADRESSE")
    String adresse;

    @Column(name="CP",length = 50)
    String cp;

    @Column(name="VILLE")
    Integer ville ;

    @Column(name="PAYS")
    Integer pays;

    @Column(name="ID_FISCALE",length = 50)
    String id_fiscale;

    @Column(name="RC",length = 50)
    String registreDeCommerce;

    @Column(name="MODE_REGLEMENT",length = 50)
    String modeReglement;

    @Column(name="ECHEANCE")
    Integer echeance;

    @Column(name="CREDIT")
    Float credit;

    @Column(name="BANQUE",length = 50)
    String banque;

    @Column(name="EXO")
    Boolean exonere;

    @Column(name="ETAT_FRS",length = 50)
    String etatFournisseur;

    @Column(name="CONTACT_PRINCIPALE",length = 100)
    String contactPricipale;

    @Column(name="EMAIL_PRINCIPALE",length = 100)
    String emailprincipale;

    @Column(name="CONTACT_AUTRES")
    String AutresContacts;

    @Column(name="TEL_PRINCIPALE",length = 50)
    String telephonePrincipale;

    @Column(name="TEL_AUTRES")
    String autresTel;

    @Column(name="PRODUITS_FRS")
    String produtisFournisseurs;

    @Column(name="PRODUITS_RETENUS")
    String produitsRetenus;

    @Column(name="TYPE_FRS",length = 10)
    String typeFournisseurs;

    @Column(name="FAMILLE",nullable = false)
    Integer familleFournisseur;

    @Column(name="CONTACT_FONCTION",length = 100)
    String contactFonction;

    @Column(name="FAX",length = 100)
    String fax;

    @Column(name="NOTE")
    String note;

    @Column(name="WEB",length = 100)
    String web;

    @Column(name="ETAT")
    Integer etat;

    @Column(name="REF_COMPLET")
    String REF_COMPLET;

    @Column(name="NIS",length = 100)
    String numeroIdentificationSociale;

    @OneToMany(mappedBy = "fournisseur")
    @JsonIgnore
    List<OrdreDeMission> ordresDeMissions = new ArrayList<>();

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
