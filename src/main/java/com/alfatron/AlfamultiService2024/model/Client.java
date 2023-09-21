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
@Table(name = "COM_CLIENT")
@Getter
@Setter
@NoArgsConstructor
@DynamicUpdate
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
    Integer famille;

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
    Integer ville;

    @Column(name="PAYS")
    Integer pays;

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
    Integer livraisonVille;

    @Column(name="LIV_PAYS")
    Integer livraisonPays;

    @Column(name="LIVRAISON_IDENTIQUE")
    Boolean livraisonIdentique;

    @Column(name="LIMITE_CREDIT")
    Boolean limiteCredit;

    @Column(name="MT_CREDIT")
    Float mtCredit;

    @Column(name="MODALITE_CREDIT")
    Boolean modaliteCredit;

    @Column(name="CREDIT_JRS")
    Integer creditJours;

    @Column(name="COMPTE_BANQUE",length = 50)
    String compteBanque;

    @Column(name="TARIF")
    Integer tarif;

    @Column(name="NOTES")
    String notes;

    @Column(name="CONDITIONS_CREDIT")
    String conditionCredit;

    @Column(name="COMPTE_AUX")
    String compteAux;

    @Column(name="AUX_COMPLET")
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
    Boolean exonere;

    @Column(name="SITE_WEB",length = 100)
    String siteWeb;

    @Column(name="BLOQUER")
    Boolean bloquer;

    @Column(name="DATE_CREATION")
    Date dateCreation;

    @Column(name="REF_COMPLET")
    String refComplet;

    @Column(name="PROSPECT")
    Boolean prospect;

    @Column(name="ID_USER")
    Integer idUser;

    @Column(name="ID_PDV_C")
    Integer idPdvClient;

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

    public Client(String references, String raisonSociale, int famille, String nomContact, String fonctionContact, String email, String mobile, String telephone, String fax, String adresse1, String adresse2, String codePostale, int ville, int pays, String compte, String compte4, String livraisonAdresse1, String livraisonAdresse2, String livraisonCodepostale, int livraisonVille, int livraisonPays, boolean livraisonIdentique, boolean limiteCredit, float mtCredit, boolean modaliteCredit, int creditJours, String compteBanque, int tarif, String notes, String conditionCredit, String compteAux, String auxComplet, String registreDeCommerce, String identifiantFiscale, String aimpo, String numeroIdentifiantSociale, String region, boolean exonere, String siteWeb, boolean bloquer, Date dateCreation, String refComplet, boolean prospect, int idUser, int idPdvClient, List<OrdreDeMission> ordresDeMissions) {
        this.references = references;
        this.raisonSociale = raisonSociale;
        this.famille = famille;
        this.nomContact = nomContact;
        this.fonctionContact = fonctionContact;
        this.email = email;
        this.mobile = mobile;
        this.telephone = telephone;
        this.fax = fax;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.codePostale = codePostale;
        this.ville = ville;
        this.pays = pays;
        this.compte = compte;
        this.compte4 = compte4;
        this.livraisonAdresse1 = livraisonAdresse1;
        this.livraisonAdresse2 = livraisonAdresse2;
        this.livraisonCodepostale = livraisonCodepostale;
        this.livraisonVille = livraisonVille;
        this.livraisonPays = livraisonPays;
        this.livraisonIdentique = livraisonIdentique;
        this.limiteCredit = limiteCredit;
        this.mtCredit = mtCredit;
        this.modaliteCredit = modaliteCredit;
        this.creditJours = creditJours;
        this.compteBanque = compteBanque;
        this.tarif = tarif;
        this.notes = notes;
        this.conditionCredit = conditionCredit;
        this.compteAux = compteAux;
        this.auxComplet = auxComplet;
        this.registreDeCommerce = registreDeCommerce;
        this.identifiantFiscale = identifiantFiscale;
        this.aimpo = aimpo;
        this.numeroIdentifiantSociale = numeroIdentifiantSociale;
        this.region = region;
        this.exonere = exonere;
        this.siteWeb = siteWeb;
        this.bloquer = bloquer;
        this.dateCreation = dateCreation;
        this.refComplet = refComplet;
        this.prospect = prospect;
        this.idUser = idUser;
        this.idPdvClient = idPdvClient;
        this.ordresDeMissions = ordresDeMissions;
    }
}
