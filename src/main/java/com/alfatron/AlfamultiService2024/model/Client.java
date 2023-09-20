package com.alfatron.AlfamultiService2024.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COM_CLIENT")
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="REFERENCE",length = 50)
    String references;

    @Column(name="RAISON_SOCIALE",length = 300)
    String raisonSociale;

    @Column(name="FAMILLE")
    int famille;

    @Column(name="NOM_CONTACT",length = 50)
    String nomContact;

    @Column(name="FONCTION_CONTACT",length = 100)
    String fonctionContact;

    @Column(name="EMAIL",length = 50)
    String email;

    @Column(name="MOBILE",length = 50)
    String mobile;

    @Column(name="TELEPHONE",length = 50)
    String telephone;

    @Column(name="FAX",length = 50)
    String fax;

    @Column(name="ADRESSE_1",length = 200)
    String adresse1;

    @Column(name="ADRESSE_2",length = 200)
    String adresse2;

    @Column(name="CP",length = 50)
    String codePostale;

    @Column(name="VILLE")
    int ville;

    @Column(name="PAYS")
    int pays;

    @Column(name="COMPTE",length = 50)
    String compte;

    @Column(name="COMPTE_4",length = 50)
    String compte4;

    @Column(name="LIV_ADRESSE_1",length = 200)
    String livraisonAdresse1;

    @Column(name="LIV_ADRESSE_2",length = 200)
    String livraisonAdresse2;

    @Column(name="LIV_CP",length = 50)
    String livraisonCodepostale;

    @Column(name="LIV_VILLE")
    int livraisonVille;

    @Column(name="LIV_PAYS")
    int livraisonPays;

    @Column(name="LIVRAISON_IDENTIQUE")
    boolean livraisonIdentique;

    @Column(name="LIMITE_CREDIT")
    boolean limiteCredit;

    @Column(name="MT_CREDIT")
    float mtCredit;

    @Column(name="MODALITE_CREDIT")
    boolean modaliteCredit;

    @Column(name="CREDIT_JRS")
    int creditJours;

    @Column(name="COMPTE_BANQUE",length = 50)
    String compteBanque;

    @Column(name="TARIF")
    int tarif;

    @Column(name="NOTES")
    String notes;

    @Column(name="CONDITIONS_CREDIT")
    String conditionCredit;

    @Column(name="COMPTE_AUX")
    @Transient
    String compteAux;

    @Column(name="AUX_COMPLET")
    @Transient
    String auxComplet;

    @Column(name="RC",length = 100)
    String registreDeCommerce;

    @Column(name="IDF",length = 100)
    String identifiantFiscale;

    @Column(name="AIMPO",length = 100)
    String aimpo;

    @Column(name="NIS",length = 100)
    String numeroIdentifiantSociale;

    @Column(name="REGION",length = 50)
    String region;

    @Column(name="EXONERE")
    boolean exonere;

    @Column(name="SITE_WEB",length = 100)
    String siteWeb;

    @Column(name="BLOQUER")
    boolean bloquer;

    @Column(name="DATE_CREATION")
    Date dateCreation;

    @Column(name="REF_COMPLET")
    @Transient
    String refComplet;

    @Column(name="PROSPECT")
    boolean prospect;

    @Column(name="ID_USER")
    int idUser;

    @Column(name="ID_PDV_C")
    int idPdvClient;

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<OrdreDeMission> ordresDeMissions = new ArrayList<>();

    @Transactional
    public void addOrdreDeMission(OrdreDeMission odm){
        ordresDeMissions.add(odm);
        odm.setClient(this);
    }
    @Transactional
    public void deleteOrdreDeMission(OrdreDeMission odm){
        odm.setClient(null);
        ordresDeMissions.remove(odm);
    }
    }
