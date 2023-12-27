package com.alfatron.AlfamultiService2024.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ACH_FOURNISSEUR")
public class ACH_FOURNISSEUR {

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
    List<RH_ODM> ordresDeMissions = new ArrayList<>();

    public ACH_FOURNISSEUR() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getCompteAux() {
        return compteAux;
    }

    public void setCompteAux(String compteAux) {
        this.compteAux = compteAux;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAUX_COMPLET() {
        return AUX_COMPLET;
    }

    public void setAUX_COMPLET(String AUX_COMPLET) {
        this.AUX_COMPLET = AUX_COMPLET;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Integer getVille() {
        return ville;
    }

    public void setVille(Integer ville) {
        this.ville = ville;
    }

    public Integer getPays() {
        return pays;
    }

    public void setPays(Integer pays) {
        this.pays = pays;
    }

    public String getId_fiscale() {
        return id_fiscale;
    }

    public void setId_fiscale(String id_fiscale) {
        this.id_fiscale = id_fiscale;
    }

    public String getRegistreDeCommerce() {
        return registreDeCommerce;
    }

    public void setRegistreDeCommerce(String registreDeCommerce) {
        this.registreDeCommerce = registreDeCommerce;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public Integer getEcheance() {
        return echeance;
    }

    public void setEcheance(Integer echeance) {
        this.echeance = echeance;
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public Boolean getExonere() {
        return exonere;
    }

    public void setExonere(Boolean exonere) {
        this.exonere = exonere;
    }

    public String getEtatFournisseur() {
        return etatFournisseur;
    }

    public void setEtatFournisseur(String etatFournisseur) {
        this.etatFournisseur = etatFournisseur;
    }

    public String getContactPricipale() {
        return contactPricipale;
    }

    public void setContactPricipale(String contactPricipale) {
        this.contactPricipale = contactPricipale;
    }

    public String getEmailprincipale() {
        return emailprincipale;
    }

    public void setEmailprincipale(String emailprincipale) {
        this.emailprincipale = emailprincipale;
    }

    public String getAutresContacts() {
        return AutresContacts;
    }

    public void setAutresContacts(String autresContacts) {
        AutresContacts = autresContacts;
    }

    public String getTelephonePrincipale() {
        return telephonePrincipale;
    }

    public void setTelephonePrincipale(String telephonePrincipale) {
        this.telephonePrincipale = telephonePrincipale;
    }

    public String getAutresTel() {
        return autresTel;
    }

    public void setAutresTel(String autresTel) {
        this.autresTel = autresTel;
    }

    public String getProdutisFournisseurs() {
        return produtisFournisseurs;
    }

    public void setProdutisFournisseurs(String produtisFournisseurs) {
        this.produtisFournisseurs = produtisFournisseurs;
    }

    public String getProduitsRetenus() {
        return produitsRetenus;
    }

    public void setProduitsRetenus(String produitsRetenus) {
        this.produitsRetenus = produitsRetenus;
    }

    public String getTypeFournisseurs() {
        return typeFournisseurs;
    }

    public void setTypeFournisseurs(String typeFournisseurs) {
        this.typeFournisseurs = typeFournisseurs;
    }

    public Integer getFamilleFournisseur() {
        return familleFournisseur;
    }

    public void setFamilleFournisseur(Integer familleFournisseur) {
        this.familleFournisseur = familleFournisseur;
    }

    public String getContactFonction() {
        return contactFonction;
    }

    public void setContactFonction(String contactFonction) {
        this.contactFonction = contactFonction;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public String getREF_COMPLET() {
        return REF_COMPLET;
    }

    public void setREF_COMPLET(String REF_COMPLET) {
        this.REF_COMPLET = REF_COMPLET;
    }

    public String getNumeroIdentificationSociale() {
        return numeroIdentificationSociale;
    }

    public void setNumeroIdentificationSociale(String numeroIdentificationSociale) {
        this.numeroIdentificationSociale = numeroIdentificationSociale;
    }

    public List<RH_ODM> getOrdresDeMissions() {
        return ordresDeMissions;
    }

    public void setOrdresDeMissions(List<RH_ODM> ordresDeMissions) {
        this.ordresDeMissions = ordresDeMissions;
    }


 }
